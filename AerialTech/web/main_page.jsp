<%-- 
    Document   : Main_Page
    Created on : Oct 2, 2019, 10:39:54 AM
    Author     : TOMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>  
        <jsp:useBean id="con" class="beanfiles.Category"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">        
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Main_Page</title>               

        <!-- Font Icon -->
        <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

        <!-- Main css -->
        <link rel="stylesheet" href="css/style_MainPage.css">
        
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>           
        <!-- Sidebar -->
        <div class="w3-sidebar w3-light-grey w3-bar-block" style="width:8%" >
            <h3 class="w3-bar-item"></h3>
            <a href="main_page.jsp" class="w3-bar-item w3-button">Home</a>
            <a href="category_page.jsp" class="w3-bar-item w3-button">Category</a>
            <a href="products_page.jsp" class="w3-bar-item w3-button">Products</a>
        </div>

        <!-- Page Content -->
        <div class="w3-container" align="center" style="padding: 2%">
            <figure>
                <img src="images/AerialTech_Logo.png" alt="Main_Logo" align="center">                      
                <a href="login.jsp" class="right-half" style="width:1%">Logout</a>
            </figure>            
            </br></br>
        </div>        

        <div align="right" class="form-group form-button" style="margin-right:5%; margin-left:12%">
            <h2 class="form-title" align="left"><b>Inventory List</b></h2>
            <a href="category_add.jsp"><button type="button" class="btn btn-info add-new"><i class="fa fa-plus"></i> Add Category</button></a>
            <a href="products_add.jsp"><button type="button" class="btn btn-info add-new"><i class="fa fa-plus"></i> Add Product</button></a>
            </br>                    
        </div>

        <div class="w3-container">
            <div class="left-half" style="width:34%">
                <div class="table-wrapper">
                    <table class="table table-bordered">
                        <caption>Category List</caption>
                        <thead>
                            <tr>
                                <th>Category ID</th>
                                <th>Category Name</th>                        
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                        </thead>                        
                    </table>                    
                </div>
            </div>
            <div class="right-half" style="width:45%">
                <div class="table-wrapper">
                    <table class="table table-bordered">
                        <caption>Product List</caption>
                        <thead>
                            <tr>
                                <th>Product ID</th>
                                <th>Category</th>
                                <th>Product Name</th>                        
                                <th>Sales Price</th>
                                <th>Available Quantity</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                        </thead>                        
                    </table>                    
                </div>
            </div>
        </div>
        
        <!-- JS -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
