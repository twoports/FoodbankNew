<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
    <html>
    <head>
        <title>FoodBankClub.org Donate-Join-Order</title>
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
                    <h1 class="muted">Food Bank Club Home</h1>
                </div>

                <div class="span4 offset2" style="margin-top:15px;">
                <div id="browse_app">  
                    <a class="btn pull-right"href="loginJoinup.jsp">Login/Logout</a>
                </div>
                </div>
            </div>
        </div>

        <div class="navbar">
            <div class="navbar-inner">
                <div class="container">
                    <ul class="nav">
                        

                        <li>
                            <a href="Site/About/aboutMembers.jsp">Member</a>
                        </li>

                        <li>
                            <a href="Site/About/aboutClubs.jsp">Club</a>
                        </li>

                        <li>
                            <a href="Site/About/aboutSuppliers.jsp">Supplier</a>
                        </li>
                        
                        <li>
                            <a href="Site/About/aboutOrders.jsp">Order</a>
                        </li>
                        
                        <li>
                             <a href="Site/About/aboutStock.jsp">Stock</a>
                        </li>
                        
                        <li>
                             <a href="Site/About/aboutUs.jsp">Contact Us</a>
                        </li>
                        
                        <li>
                             <a href="Site/About/aboutDonors.jsp">Donate</a>
                        </li>
                        
                      
                    </ul>
                </div>
            </div>
        </div>
      </div>
    </div>
  </div>
     <div class="hero-unit"> 
                We support our clubs obtain great deals on healthy food from our suppliers for 
                their members assisted by our donors and members contributions. <br>
                All our food items are VAT FREE, we don't sell many processed foods and our packaging 
                is always minimised.<br>
                Deliveries are free of charge. This gives local producers an advantage and reduces food 
                delivery miles. It also helps keep local money in local pockets.<br>
                We think you will like our benefits please join today. Lookup up your local club 
                in the clubs page to find out more.<br>
               
                <div   
         
        
<div class="hero-unit">     
  <div class="row">
    <div class="col-lg-4">
      <div class="col-md-3">
               
        <a href="loginJoinup.jsp" class="btn btn-medium btn-success">Join Us</a> 
        
        
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


</f:view>
