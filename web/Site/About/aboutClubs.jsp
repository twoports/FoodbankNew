<%-- 
    Document   : index
    Created on : 12-Jan-2014, 10:20:08
    Author     : MacBootCamp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>FoodBankClub Our Clubs</title>
        
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
                    <h1 class="muted">Food Bank Club: About Clubs</h1>
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
                            <a href="aboutSuppliers.jsp">About Suppliers</a>
                        </li>
                        
                        <li>
                            <a href="aboutOrders.jsp">About Orders</a>
                        </li>
                        
                        <li>
                             <a href="aboutStock.jsp">About Stock</a>
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
            
 <form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Our Clubs</legend>

<!-- Select Basic -->
<div class="control-group">
  <label class="control-label" for="selectbasic">Choose a Club</label>
  <div class="controls">
    <select id="selectbasic" name="selectbasic" class="input-xlarge">
      <option>Tavistock</option>
      <option>Princetown</option>
      <option>Okehampton</option>
    </select>
  </div>
</div>

<!-- Textarea -->
<div class="control-group">
  <label class="control-label" for="textarea">How To</label>
  <div class="controls">                     
    <textarea id="textarea" name="textarea">Select a club from the drop down list to display club details.</textarea>
  </div>
</div>

</fieldset>
</form>
 <%
     <a href="addMemberClubServlet">Go to the servlet </a>
     %>
            <div class="container">
	<div class="row-fluid">
        <div class="span8">
        	<iframe width="100%" height="350" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://maps.google.co.uk/maps?f=q&source=s_q&hl=en&geocode=&q=15+Springfield+Way,+Hythe,+CT21+5SH&aq=t&sll=52.8382,-2.327815&sspn=8.047465,13.666992&ie=UTF8&hq=&hnear=15+Springfield+Way,+Hythe+CT21+5SH,+United+Kingdom&t=m&z=14&ll=51.077429,1.121722&output=embed"></iframe>
    	</div>
    	
      	<div class="span4">
    		<h2>Snail mail</h2>
    		<address>
    			<strong>Hythe Window Cleaning</strong><br>
    			15 Springfield Way<br>
    			Hythe<br>
    			Kent<br>
    			United Kingdon<br>
    			CT21 5SH<br>
    			<abbr title="Phone">P:</abbr> 01234 567 890
    		</address>
    	</div>
    </div>
</div>

<div class="hero-unit">     
  <div class="row">
    <div class="col-lg-4">
      <div class="col-md-3">
       We have clubs in most towns, please contact us to enquire about joining your local club or setting one up.
        <a href="../../welcomeJSF.jsp" class="btn btn-medium btn-warning">Home</a>  
        <a href="../../loginJoinup.jsp" class="btn btn-medium btn-success">Join Us</a>         
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
