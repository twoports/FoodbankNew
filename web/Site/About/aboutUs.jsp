<%-- 
    Document   : index
    Created on : 12-Jan-2014, 10:20:08
    Author     : MacBootCamp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>FoodBankClub Contact Us</title>
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
                    <h1 class="muted">Food Bank Club: Contact Us</h1>
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
                             <a href="stockShowAllItems.jsp">Our Products</a>
                        </li>
                      
                    </ul>
                </div>
            </div>
        </div>
      </div>
    </div>
  </div>
       
 <div class="container">
	<form class="well span8">
        <div class="row">
            <div class="span3">
                <label>First Name</label> <input class="span3" placeholder=
                "Your First Name" type="text"> <label>Last Name</label>
                <input class="span3" placeholder="Your Last Name" type="text">
                <label>Email Address</label> <input class="span3" placeholder=
                "Your email address" type="text"> <label>Subject</label>
                <select class="span3" id="subject" name="subject">
                    <option selected value="na">
                        Choose One:
                    </option>
    
                    <option value="service">
                        General Customer Service
                    </option>
    
                    <option value="suggestions">
                        Suggestions
                    </option>
    
                    <option value="product">
                        Product Support
                    </option>
                </select>
            </div>
    
            <div class="span5">
                <label>Message</label> 
                <textarea class="input-xlarge span5" id="message" name="message"
                rows="10">
    </textarea>
            </div><button class="btn btn-primary pull-right" type=
            "submit">Send</button>
        </div>
    </form>
</div>  
           
            

<div class="hero-unit">     
  <div class="row">
    <div class="col-lg-4">
      <div class="col-md-3">
          Please contact us to start a club, join a club, supply a club or donate to a club.<br>
          We also welcome all your ideas and feedback, please get in touch.<br>
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
