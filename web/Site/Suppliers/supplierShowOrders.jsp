<%-- 
    Document   : index
    Created on : 12-Jan-2014, 10:20:08
    Author     : MacBootCamp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>FoodBankClub Suppliers</title>
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
                    <h1 class="muted">Food Bank Club Suppliers: Show Orders</h1>
                </div>

                <div class="span4 offset2" style="margin-top:15px;">
                <div id="browse_app">  
                    <a class="btn pull-right"href="../loginJoinup.jsp">Logout</a>
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
                            <a href="supplierShowDetail.jsp">Show Details</a>
                        </li>
                        
                        <li>
                            <a href="supplierShowStock.jsp">Show Stock</a>
                        </li>
                         <li>
                            <a href="supplierEditStockQty.jsp">Edit Stock Qty</a>
                        </li>
                        
                    </ul>
                </div>
            </div>
        </div>
      </div>
    </div>
  </div>
     <div class="container">
	<div class="row">
        <div class="span12">
    		<table class="table table-condensed table-hover">
    			<thead>
    				<tr>
    					<th> </th>
    					<th>Fluid 512</th>
    					<th>Fluid 1024</th>
    					<th>Fluid 2048</th>
    					<th>Fluid 4096</th>
    				</tr>
    			</thead>
    			<tbody>
    				<tr>
    					<td>Ram</td>
    					<td>512MB</td>
    					<td>1024MB</td>
    					<td>2048MB</td>
    					<td>4096MB</td>
    				</tr>
    				<tr>
    					<td>Disk Space</td>
    					<td>25GB</td>
    					<td>50GB</td>
    					<td>100GB</td>
    					<td>200GB</td>
    				</tr>
    				<tr>
    					<td>CPU Cores</td>
    					<td>1</td>
    					<td>2</td>
    					<td>4</td>
    					<td>6</td>
    				</tr>
    				<tr>
    					<td>Swap</td>
    					<td>512MB</td>
    					<td>1024MB</td>
    					<td>1024MB</td>
    					<td>2048MB</td>
    				</tr>
    				<tr>
    					<td>Bandwidth</td>
    					<td>200GB</td>
    					<td>400GB</td>
    					<td>800GB</td>
    					<td>1600GB</td>
    				</tr>
    				<tr>
    					<td> </td>
    					<td> </td>
    					<td> </td>
    					<td> </td>
    					<td> </td>
    				</tr>
    				<tr>
    					<td>Monthly</td>
    					<td>$16.95/month</td>
    					<td>$32.95/month</td>
    					<td>$64.95/month</td>
    					<td>$128.95/month</td>
    				</tr>
    				<tr>
    					<td>Quarterly</td>
    					<td>$16.44/month</td>
    					<td>$31.96/month</td>
    					<td>$63.00/month</td>
    					<td>$125.08/month</td>
    				</tr>
    				<tr>
    					<td>Yearly</td>
    					<td>$15.26/month</td>
    					<td>$29.66/month</td>
    					<td>$58.46/month</td>
    					<td>$116.06/month</td>
    				</tr>
    				<tr>
    					<td> </td>
    					<td><a class="btn btn-success" href="#"><i class="icon-shopping-cart icon-white"></i> Order »</a></td>
    					<td><a class="btn btn-success" href="#"><i class="icon-shopping-cart icon-white"></i> Order »</a></td>
    					<td><a class="btn btn-success" href="#"><i class="icon-shopping-cart icon-white"></i> Order »</a></td>
    					<td><a class="btn btn-success" href="#"><i class="icon-shopping-cart icon-white"></i> Order »</a></td>
    				</tr>
    			</tbody>
    		</table>
    	</div>
	</div>
</div>       
         
        
<div class="hero-unit">     
  <div class="row">
    <div class="col-lg-4">
      <div class="col-md-3">
       
        <a href="../../welcomeJSF.jsp" class="btn btn-medium btn-warning">Home</a>  
       
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
