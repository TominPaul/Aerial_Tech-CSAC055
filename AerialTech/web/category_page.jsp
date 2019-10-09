<%-- 
    Document   : Category_List
    Created on : Oct 7, 2019, 8:35:55 AM
    Author     : TOMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>                
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <title>Category_Page</title>
        
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
    <style type="text/css">

        table {
        text-align: center;
        line-height: 40px;
        border-collapse: separate;
        border-spacing: 0;
        border: 2px solid #ed1c40;
        width: max-content;
        margin: 50px auto;
        border-radius: .25rem;
        }

        thead tr:first-child {
        background: #ed1c40;
        color: #fff;
        border: none;
        }

        th:first-child,
        td:first-child {
        padding: 0 15px 0 20px;
        }

        th {
        font-weight: 500;
        }

        thead tr:last-child th {
        border-bottom: 3px solid #ddd;
        }

        tbody tr:hover {
        background-color: #f2f2f2;
        cursor: default;
        }

        tbody td {
        border-bottom: 1px solid #ddd;
        }

        .button {
        color: #aaa;
        cursor: pointer;
        vertical-align: middle;
        margin-top: -4px;
        }

        .edit:hover {
        color: #0a79df;
        }

        .delete:hover {
        color: #dc2a2a;
        }
        
    </style>   

    <body>
        <!-- Sidebar -->
        <div class="w3-sidebar w3-light-grey w3-bar-block" style="width:10%">
            <h3 class="w3-bar-item"></h3>
            <a href="main_page.jsp" class="w3-bar-item w3-button">Home</a>
            <a href="category_page.jsp" class="w3-bar-item w3-button">Category</a>
            <a href="products_page.jsp" class="w3-bar-item w3-button">Products</a>
        </div>

        <!-- Page Content -->
        <div>
            <div class="w3-container" align="center">
                <figure>
                    <img src="images/AerialTech_Logo.png" alt="Main_Logo" align="center">                      
                    <a href="login.jsp" class="right-half" style="width:1%">Logout</a>
                </figure>            
                </br></br>
            </div>        
        </div>
        <div align="right" class="form-group form-button" style="margin-right:5%; margin-left:12%">
            <h2 class="form-title" align="left"><b>Category List</b></h2>
            <button type="button" class="btn btn-info add-new"><i class="fa fa-plus"></i> Add Category</button>
            </br>                    
            <div class="container">
                <div class="table-wrapper">
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Category ID</th>
                                <th>Category Name</th>                        
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>CTID001</td>
                                <td>Drones</td>
                                <td>
                                    <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>                            
                                </td>
                                <td>
                                    <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                </td>
                            </tr>
                            <tr>
                                <td>CTID002</td>
                                <td>Drone Controllers</td>
                                <td>
                                    <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>                            
                                </td>
                                <td>
                                    <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                </td>
                            </tr>
                            <tr>
                                <td>CTID003</td>
                                <td>Accessories</td>
                                <td>
                                    <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>                            
                                </td>
                                <td>
                                    <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                </td>
                            </tr>      
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>                            
