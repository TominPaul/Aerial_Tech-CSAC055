<%-- 
    Document   : Main_Page
    Created on : Oct 2, 2019, 10:39:54 AM
    Author     : TOMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>  
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">        
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Main_Page</title>               

        <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even){background-color: #f2f2f2}

        th {
            background-color: #4CAF50;
            color: white;
        }
        
        </style>
        <!-- Font Icon -->
        <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

        <!-- Main css -->
        <link rel="stylesheet" href="css/style_MainPage.css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>
    <body>           
        <!-- Sidebar -->
        <div class="w3-sidebar w3-light-grey w3-bar-block" style="width:10%">
            <h3 class="w3-bar-item"></h3>
            <a href="main_page.jsp" class="w3-bar-item w3-button">Home</a>
            <a href="category_page.jsp" class="w3-bar-item w3-button">Category</a>
            <a href="products_page.jsp" class="w3-bar-item w3-button">Products</a>
        </div>

        <!-- Page Content -->
        <div style="margin-left:10%">

        <div class="w3-container" align="center">
            <figure>
                <img src="images/AerialTech_Logo.png" alt="Main_Logo" align="center">                      
                <a href="logout.jsp" title="Logout" style="opacity: 0.8; -moz-opacity: 0.8;" class="fade">logout </a>
            </figure>            
            </br></br>
        </div>
            
        <div align="right" class="form-group form-button" style="margin-right:10%">
            <h2 class="form-title" align="left" style="margin-left:5%"><b>Inventory Details</b></h2>
            <input type="submit" name="Add Category" id="btn_AddCategory" class="form-submit" value="Add Category"/>
            <input type="submit" name="Add Product" id="btn_AddProduct" class="form-submit" value="Add Product"/>
            </br>
        </div>

        <div class="w3-container">
            </br></br>
            <div class="left-half">
                <table>                    
                    <tr>
                        <th>Category Name</th>
                        <th>Number of Products</th>
                    </tr>
                    <tr>
                        <td>Drones</td>
                        <td>2</td>
                    </tr>
                    <tr>
                        <td>Drone Controllers</td>
                        <td>1</td>
                    </tr>
                    <tr>
                        <td>Accessories</td>
                        <td>2</td>
                    </tr>
                </table>
            </div>
            <div class="right-half" style="width:39%">
                <table>
                    <tr>
                        <th>Category Name</th>
                        <th>Product Name</th>
                        <th>Available Quantity</th>
                    </tr>
                    <tr>
                        <td>Drones</td>
                        <td>DJI Movic Pro</td>
                        <td>10</td>
                    </tr>
                    <tr>
                        <td>Drones</td>
                        <td>Parrot Bebop</td>
                        <td>5</td>
                    </tr>
                    <tr>
                        <td>Drone Controller</td>
                        <td>Bebop Controller</td>
                        <td>15</td>
                    </tr>
                    <tr>
                        <td>Accessories</td>
                        <td>Battery Pack</td>
                        <td>10</td>
                    </tr>
                    <tr>
                        <td>Accessories</td>
                        <td>Toolkit</td>
                        <td>25</td>
                    </tr>
                </table>
            </div>
        </div>

        </div>
        
        <!-- JS -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
