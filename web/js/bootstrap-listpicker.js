/**
 * Bootstrap list picker
 * Licensed under the MIT license.
 * 
 * Copyright (c) 2013, Christophe Cassagnabere
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy 
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights 
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
 * copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 * 
 * The Software is provided "as is", without warranty of any kind, express or 
 * implied, including but not limited to the warranties of merchantability, 
 * fitness for a particular purpose and noninfringement. In no event shall the 
 * authors or copyright holders X be liable for any claim, damages or other 
 * liability, whether in an action of contract, tort or otherwise, arising from, 
 * out of or in connection with the software or the use or other dealings in 
 * the Software.
 * 
 * Except as contained in this notice, the name of the copyright holders shall 
 * not be used in advertising or otherwise to promote the sale, use or other 
 * dealings in this Software without prior written authorization from the 
 * copyright holders.
 */
    
!function ($) {
    "use strict";

    function sortSelectbox(selectbox) {
        selectbox.append(
            $("label", selectbox).sort(function(a, b){
                return (
                    a = $(a).text(),
                    b = $(b).text(),
                    a == 'NA' ? 1 : b == 'NA' ? -1 : 0|a > b
                );
            })
        );                    
    }
    
    function performInputOnClickAction(checkbox, glasspane) {
        var dest, label = checkbox.parent(), src = checkbox.parent().parent();
        label.remove();
        checkbox.click(function () {
            performInputOnClickAction($(this), glasspane);
        });      
        if (checkbox.is(":checked")) {            
            dest = src.siblings(".target-selectbox");
            dest.append(label);
            if (src.children(":visible:not(.disabled)").size() <= 0) {
                $(".check-all", src.parent()).prop("checked", true);
            }
        } else { 
            var $value = $(".searchbox", src.parent()).val();
            var $filter = $(".filter-tabs li.active a", src.parent()).attr("href").replace('#', '');
             if (label.text().toLowerCase().indexOf($value.toLowerCase()) >= 0
                        && ($filter == "all" || label.data("filters").indexOf($filter) >= 0)) {
                 label.show();
             } else {
                 label.hide();
             }
            dest = src.siblings(".source-selectbox");           
            dest.append(label);   
            if (dest.data("sort")) {
                sortSelectbox(dest);
            }
            if (dest.children(":visible:not(.disabled)").size() > 0) {
                $(".check-all", src.parent()).prop("checked", false);
            }
        }
        if (glasspane) {
            glasspane.modal('hide');
        }
    }
    
    function performSearchAction (listpicker, value, glasspane) {        
        var $activeTab = $(".filter-tabs li.active a", listpicker).attr("href").replace('#', '');
        var $displayedInSource = 0;
        if (value.length <= 0) {
            $(".source-selectbox label", listpicker).each(function () {
                if ($activeTab == "all" || $(this).data("tabs").indexOf($activeTab) >= 0) {
                    $(this).show();
                    $displayedInSource ++;
                } else {
                    $(this).hide();
                }
            });      
        } else {
            $(".source-selectbox label", listpicker).each(function () {
                if ($(this).text().toLowerCase().indexOf(value.toLowerCase()) >= 0
                        && ($activeTab == "all" || $(this).data("tabs").indexOf($activeTab) >= 0)) {
                    $(this).show();
                    $displayedInSource ++;
                } else {
                    $(this).hide();
                }                        
            });               
        }
        $(".check-all", listpicker).prop("checked", 
            $displayedInSource == 0 && $(".target-selectbox label", listpicker).size() > 0);            
        if (glasspane) {
            glasspane.modal('hide');
        }
    }                
                
    function SearchboxOnKeyupEvent (listpicker, value, glasspane) {
        glasspane.modal("show");
        setTimeout(function(){            
            performSearchAction(listpicker, value, glasspane)
        }, 100);
    }
    
    function performCheckallOnClickAction(checkbox, glasspane) {
        var listpicker = checkbox.parent().parent();
        if (checkbox.is(":checked")) {
            $(".source-selectbox label:visible:not(.disabled) input", listpicker).each(function () {
                $(this).prop("checked", true);
                $(this).parent().remove();
                $(this).click(function () {
                    performInputOnClickAction($(this), glasspane);
                });
                $(".target-selectbox", listpicker).append($(this).parent());
            });
        } else {
            $(".target-selectbox label input", listpicker).each(function () {
                $(this).prop("checked", false);
                $(this).parent().remove();
                $(this).click(function () {
                    performInputOnClickAction($(this), glasspane);
                });
                $(".source-selectbox", listpicker).append($(this).parent());                            
                var searchString = $(".searchbox", listpicker).val();
                if ($(this).parent().text().toLowerCase().indexOf(searchString.toLowerCase()) >= 0) {
                    $(this).parent().show();
                } else {
                    $(this).parent().hide();
                }
            });
            if ($(".source-selectbox", listpicker).data("sort")) {
                sortSelectbox($(".source-selectbox", listpicker));
            }
        } 
        if (glasspane) {
            glasspane.modal('hide');
        }
    }
    
    function ListPicker(listpicker, options) {
        this.options = this.getOptions(options);
        var $select = $(listpicker);        
        var $name = $select.attr("name");
        var $container = $(this.options.listpickerContainer)
            .append('<div class="modal hide worker" data-keyboard="false" data-backdrop="static"><i class="icon-cogs"></i><p>&nbsp;Please wait...</p></div>')
            .append('<ul class="nav nav-tabs filter-tabs"><li><a href="#all" data-toggle="tab">All</a></li></ul>')
            .append('<label class="checkbox"><input class="check-all" type="checkbox">Select all</label>')        
            .append('<div class="source-selectbox" />')
            .append('<input class="searchbox input-block-level" type="text" placeholder="Search...">')
            .append('<div class="target-selectbox" />');
        $container.attr('id', $select.attr("id"));

        var $tabs = new Array();
        var $allSelected = true;
        $select.children().each($.proxy(function (index, element) {
            var label = ($(element).attr('label') !== undefined) ? $(element).attr('label') : $(element).text();
            var value = $(element).val();
            var disabled = $(element).prop('disabled');
            var selected = $(element).prop('selected');
            $allSelected = $allSelected && selected;
            if ($(element).data('tabs')) {
                $.each($(element).data('tabs').split(','), function(i, el){
                    if($.inArray(el, $tabs) === -1) $tabs.push(el);
                });            
            }
            var li = $(
                '<label class="checkbox' + (disabled ? ' disabled' : '') + '" data-tabs="' + $(element).data('tabs') + '">'
                    + '<input type="checkbox" value="' + value 
                        + '" name="' + $name +'" ' 
                        + (disabled ? 'disabled="disabled" ' : ' ')
                        + (selected ? 'checked="checked" ' : ' ')
                        + '/>' 
                    + label 
                + '</label>');  
            $((selected ? '.target-selectbox' : '.source-selectbox'), $container).append(li);                        
        }, this));
        $(".check-all", $container).prop("checked", $allSelected);
        
        $.each($tabs, function(i, el) {
            $(".filter-tabs", $container).append('<li><a href="#' + el + '" data-toggle="tab">' + el + '</a></li>');
        });
        
        if ($select.data('sort') !== undefined) {
            $(".source-selectbox", $container).data('sort', 
                $select.data('sort') != "false" && $select.data('sort') != "0");            
        } else {
            $(".source-selectbox", $container).data('sort', this.options.sort);
        }
        
        var $glasspane = $(".worker", $container);
        
        $glasspane.on('show hidden', function() {            
            $('body').toggleClass('modal-backdrop-white');
        });        

        $(".source-selectbox label input", $container).click(function(){
            performInputOnClickAction($(this), $glasspane);            
        });
        
        $(".target-selectbox label input", $container).click(function(){
            performInputOnClickAction($(this), $glasspane);            
        });

        var $delay = this.options.delay;
        $(".searchbox", $container).keyup(function() {
            var value = $(this).val();
            clearTimeout($glasspane.attr("pid"));
            $glasspane.attr("pid", setTimeout(function() {
                SearchboxOnKeyupEvent($container, value, $glasspane)
            }, $delay));
        });

        $(".searchbox", $container).on('clear', function() {
            var value = $(this).val();
            SearchboxOnKeyupEvent($container, value, $glasspane);
        });

        $(".check-all", $container).click(function() {
            var checkbox = $(this);
            $glasspane.modal("show");
            setTimeout(function(){
                performCheckallOnClickAction(checkbox, $glasspane)
            }, 100);
        });                

        if ($.fn.inputClear) {
            $(".searchbox", $container).inputClear();
        }

        $(".filter-tabs a[href='#all']", $container).tab("show");
                 
        $(".filter-tabs a", $container).click(function() {                 
            $(".searchbox", $container).trigger("clear");
        });
                 
        $select.after($container).remove();        
    }

    ListPicker.prototype = {
            defaults: {
                sort: false,
                delay: 700,
                listpickerContainer :'<div class="listpicker" />',
                sourceContainer: '<div class="source-selectbox">'
            },

            constructor: ListPicker,

            getOptions: function(options) {
                    return $.extend({}, this.defaults, options);
            }
    };

    $.fn.listpicker = function (option, parameter) {
        return this.each(function () {
            var data = $(this).data('listpicker');
            var options = typeof option == 'object' && option;
            if (!data) {
                $(this).data(
                    'listpicker', 
                    (data = new ListPicker($(this), options))
                );
            }
            if (typeof option == 'string') {
                data[option](parameter);
            }
        });
    }
}(window.jQuery);
