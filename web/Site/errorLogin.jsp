<%-- 
    Document   : index
    Created on : 12-Jan-2014, 10:20:08
    Author     : MacBootCamp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Oops Login Error -- Please try again</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="../css/bootstrap.css" type="text/css">
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
                    <h1 class="muted">Food Bank Club</h1>
                </div>

                <div class="span4 offset2" style="margin-top:15px;">
                <div id="browse_app">  
                    <a class="btn pull-right"href="loginJoinup.jsp">Sign In</a>
                </div>
                </div>
            </div>
        </div>

        <div class="navbar">
            <div class="navbar-inner">
                <div class="container">
                    <ul class="nav">
                         <li>
                            <a href="index.jsp">Home</a>
                        </li>

                        <li>
                            <a href="Members/memberFunctions.jsp">Member</a>
                        </li>

                        <li>
                            <a href="Clubs/clubFunctions.jsp">Club</a>
                        </li>

                        <li>
                            <a href="Suppliers/supplierFunctions.jsp">Supplier</a>
                        </li>
                        
                        <li>
                            <a href="Clubs/orderAdd.jsp">Order</a>
                        </li>
                        
                        <li>
                             <a href="Suppliers/stockAddEditDelete.jsp">Stock</a>
                        </li>
                        
                        <li>
                             <a href="aboutUs.jsp">Contact Us</a>
                        </li>
                        
                        <li>
                             <a href="aboutDonors.jsp">Donate</a>
                        </li>
                        
                        
                      
                    </ul>
                </div>
            </div>
        </div>
      </div>
    </div>
  </div>
       
            <div class="hero-unit">     
  <div class="row">
    <div class="col-lg-4">
      <div class="col-md-3">
       
        
        <h1>Login Error - Please enter Username and Password again.</h1> 
        
        
        
      </div>
    </div>
  </div> 
</div> 
         
        
<div class="hero-unit">     
  <div class="row">
    <div class="col-lg-4">
      <div class="col-md-3">
       
        
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
