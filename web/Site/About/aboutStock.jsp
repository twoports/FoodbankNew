<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : 12-Jan-2014, 10:20:08
    Author     : MacBootCamp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html xmlns:h="http://xmlns.jcp.org/jsf/html" xmlns:f="http://xmlns.jcp.org/jsf/core">
    <head>
        <title>FoodBankClub Our Stock</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="../../css/bootstrap.css" type="text/css">
    </head>
 <body>
        <script src="js/jquery/jquery.js"></script>
        <script src="js/bootstrap.js"></script>
        <div class="container">
  <div class="row">
    <div class="span12">
      <div class="head">
        <div class="row-fluid">
            <div class="span12">
                <div class="span6">
                    <h1 class="muted">Food Bank Club: About Stock</h1>
                </div>

                <div class="span4 offset2" style="margin-top:15px;">
                <div id="browse_app">  
                    <a class="btn pull-right"href="../loginJoinup.jsp">Sign In</a>
                </div>
               </div>
            </div>
        </div>

        <div class="navbar">
            <div class="navbar-inner">
                <div class="container">
                    <ul class="nav">
                        <li>
                            <a href="../../welcomeJSF.jsp">Home</a>
                        </li>

                        <li>
                            <a href="aboutMembers.jsp">About Members</a>
                        </li>

                        <li>
                            <a href="aboutClubs.jsp">About Clubs</a>
                        </li>

                        <li>
                            <a href="aboutSuppliers.jsp">About Suppliers</a>
                        </li>
                        
                        <li>
                            <a href="aboutOrders.jsp">About Orders</a>
                        </li>
                   
                        
                        <li>
                             <a href="aboutUs.jsp">Contact Us</a>
                        </li>
                        
                        <li>
                             <a href="aboutDonors.jsp">About Donors</a>
                        </li>
                      <li>
                             <a href="stockShowAllItems.jsp">Our Products</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
      </div>
    </div>
  </div>
        <div class="hero-unit">  
            Our stock rules are simple, if the item is food and free from VAT we sell it.<br>
            The great majority of these food items are the standard food products which 
            every healthy family needs. <br>
            All deliveries are offered free of charge. This helps to 
            promote local produce keeping money spent in your local community.<br>
            Lookout for great bulk purchase deals from your local food suppliers and some big brands too!<br>
        </div>
<div class="hero-unit">     
  <div class="row">
    <div class="col-lg-4">
      <div class="col-md-3">
          Check our in stock product with the button below, join a club and start saving.<br>
        <a href="../../welcomeJSF.jsp" class="btn btn-medium btn-warning">Home</a>  
        <a href="../../loginJoinup.jsp" class="btn btn-medium btn-success">Join Us</a>  
        <a href="stockShowAllItems.jsp" class="btn btn-medium btn-success">In Stock Now!</a>  
      </div>
    </div>
  </div> 
</div> 
    
    <div id="footer">
      <div class="navbar navbar-fixed-bottom">
        <div class="navbar-inner">
          <div class="container">
            <ul class="nav">
               <p class="muted pull-right">© 2014 FoodBankClub Registered Charity X123456. All rights reserved</p>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
   
   </body>
</html>
