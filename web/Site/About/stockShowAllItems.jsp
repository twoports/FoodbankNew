<%-- 
    Document   : index
    Created on : 12-Jan-2014, 10:20:08
    Author     : MacBootCamp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>FoodBankClub Show All Stock</title>
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
                    <h1 class="muted">Food Bank Club: Our Stock</h1>
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
                             <a href="aboutStock.jsp">About Stock</a>
                        </li>
                     
                        <li>
                             <a href="aboutDonors.jsp">About Donors</a>
                        </li>
                        
                        <li>
                             <a href="aboutUs.jsp">Contact Us</a>
                        </li>
                        
                      
                    </ul>
                </div>
            </div>
        </div>
      </div>
    </div>
  </div>
       
            Stock table here with category, item and description only. 
         
        
<div class="hero-unit">     
  <div class="row">
    <div class="col-lg-4">
      <div class="col-md-3">
          To start saving on our stock, join a club, to support a club please donate.<br>
        <a href="../index.jsp" class="btn btn-medium btn-warning">Go Back</a>  
        <a href="loginJoinup.jsp" class="btn btn-medium btn-success">Join us</a>         
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
