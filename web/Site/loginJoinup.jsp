<%-- 
    Document   : index
    Created on : 12-Jan-2014, 10:20:08
    Author     : MacBootCamp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>FoodBankClub JoinUs</title>
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
                            <a href="welcomeJSF.jsp">Home</a>
                        </li>

                        <li>
                            <a href="About/aboutMembers.jsp">Member</a>
                        </li>

                        <li>
                            <a href="About/aboutClubs.jsp">Club</a>
                        </li>

                        <li>
                            <a href="About/aboutSuppliers.jsp">Supplier</a>
                        </li>
                        
                        <li>
                            <a href="About/aboutClubs.jsp">Order</a>
                        </li>
                        
                        <li>
                             <a href="About/aboutStock.jsp">Stock</a>
                        </li>
                        
                        <li>
                             <a href="About/aboutUs.jsp">Contact Us</a>
                        </li>
                        
                        <li>
                             <a href="About/aboutDonors.jsp">Donate</a>
                        </li>
                        
                    </ul>
                </div>
            </div>
        </div>
      </div>
    </div>
  </div>
        </div>
        <div class="container">
	<div class="row">
        <div class="span12">
    		<div class="" id="loginModal">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3>Have an Account?</h3>
              </div>
              <div class="modal-body">
                <div class="well">
                  <ul class="nav nav-tabs">
                    <li class="active"><a href="#login" data-toggle="tab">Login</a></li>
                    <li><a href="#create" data-toggle="tab">Create Account</a></li>
                  </ul>
                  <div id="myTabContent" class="tab-content">
                    <div class="tab-pane active in" id="login">
                      <form class="form-horizontal" action='' method="POST">
                        <fieldset>
                          <div id="legend">
                            <legend class="">Login</legend>
                          </div>    
                          <div class="control-group">
                            <!-- Username -->
                            <label class="control-label"  for="username">Username</label>
                            <div class="controls">
                              <input type="text" id="username" name="username" placeholder="" class="input-xlarge">
                            </div>
                          </div>
                          <div class="control-group">
                            <!-- Password-->
                            <label class="control-label" for="password">Password</label>
                            <div class="controls">
                              <input type="password" id="password" name="password" placeholder="" class="input-xlarge">
                            </div>
                          </div>
                          <div class="control-group">
                            <!-- Button -->
                            <div class="controls">
                              <button class="btn btn-success">Login</button>
                              <button class="btn btn-warning">Logout</button>
                            </div>
                          </div>
                        </fieldset>
                      </form>                
                    </div>
                    <div class="tab-pane fade" id="create">
                      <form id="tab">
                        <label>Username</label>
                        <input type="text" value="" class="input-xlarge">
                        <label>First Name</label>
                        <input type="text" value="" class="input-xlarge">
                        <label>Last Name</label>
                        <input type="text" value="" class="input-xlarge">
                        <label>Email</label>
                        <input type="text" value="" class="input-xlarge">
                        <label>Address</label>
                        <textarea value="Smith" rows="3" class="input-xlarge">
                        </textarea>
                        <label>Password</label>
                        <input type="text" value="" class="input-xlarge">
                        <label>Verify Password</label>
                        <input type="text" value="" class="input-xlarge">              
                        <div>
                          <button class="btn btn-primary">Create Account</button>
                        </div>
                      </form>
                    </div>
                </div>
              </div>
            </div>
        </div>
	</div>
</div>

            <div class="hero-unit">
                 
               
                
                <a href="welcomeJSF.jsp" class="btn btn-medium btn-warning">Home</a>
                
                 <a href="Site/About/aboutUs.jsp" class="btn btn-medium btn-warning">About Us</a>
                    
           </div>   
   </body>
</html>

