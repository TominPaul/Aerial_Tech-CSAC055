<%-- 
    Document   : category
    Created on : Oct 30, 2019, 10:35:03 AM
    Author     : TOMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Product</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">                
        <meta http-equiv="X-UA-Compatible" content="IE=edge">       
        
        <link rel="stylesheet" href="css/fontAwesome.css">    
        <link rel="stylesheet" href="css/style_MainPage.css">   
        <link rel="stylesheet" href="css/templatemo-main.css">
        <link rel="stylesheet" href="css/style_Heading.css">
        <link rel="stylesheet" href="css/style_Buttons.css">
        
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800">    
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">    
    </head>
    <body>        
        <nav>
            <div class="logo">
                <a href="index.html"><img src="img/AerialTech_Logo.png" alt="AerialTech_Logo"></a>
            </div>
            <div class="mini-logo">
                <img src="img/AerialTech_Logo_Mini.png" alt="AerialTech_Logo">
            </div>
            <ul>
                <li><a href="index.html"><i class="fa fa-home"></i><em>Home</em></a></li>
                <li><a href="category.jsp"><i class="fa fa-list"></i><em>Category</em></a></li>                
                <li class="wrapper"><a href="product.jsp"><i class="fa fa-product-hunt"></i><em>Products</em></a></li>                
            </ul>
        </nav>

        <div class="slides">
            <div class="slide" id="1">
                <div class="content first-content">                    
                    <div class="wrapper left-half">
                        <h3>PRODUCTS</h3>
                    </div>
                    <div class="outer right-half">
                        <div class="inner">
                            <p>Log Out</p>
                        </div>
                    </div>                                                          
                    <form style="margin-top: 35px" action="post">                              
                        <span class="bt more-bt">
                            <a href="product_add.jsp" style="text-decoration: none">
                                <span class="fl"></span>  
                                <span class="sfl"></span>
                                <span class="cross"></span>
                                <i></i>
                                add product
                            </a>                        
                        </span>                    
                        <p style="margin-top: 45px"></p>                         
                        <table>
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
                            <tbody>

                            </tbody>
                        </table>                                                                       
                    </form>                        
                </div>
            </div>
        </div>        
    </body>
</html>
