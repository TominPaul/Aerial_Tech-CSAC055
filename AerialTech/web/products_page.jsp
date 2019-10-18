<%-- 
    Document   : Category_List
    Created on : Oct 7, 2019, 8:35:55 AM
    Author     : TOMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Vector"%>
<%@page import="java.util.Iterator"%>

<%@page import="DBConnection.DBConnection"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>

     
	<jsp:useBean id="con" class="beanfiles.Product"/>
	

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">        
        <meta http-equiv="X-UA-Compatible" content="ie=edge">       
        <title>Products_Page</title>    
        
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
            <h2 class="form-title" align="left"><b>Product List</b></h2>
            <a href="products_add.jsp"><button type="button" class="btn btn-info add-new"><i class="fa fa-plus"></i> Add Product</button></a>
            </br>                                   
            <div class="container">
                <div class="table-wrapper">
                    <table class="table table-bordered">
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
                        <%	
                            Vector v=null;
                            Iterator it=con.getData(2).iterator();
                            while(it.hasNext()){
                                v=(Vector)it.next();
                        %>
                        <%
                            DBConnection ob = new DBConnection();
                            ResultSet rs = ob.select("SELECT c_name FROM category,product WHERE category.c_id=product.c_id");
                            System.out.print(rs);
                            if (rs.next()) {
                        %>
                        <tbody>
                            <tr>
                                <td id="P_id"><%out.print(v.get(0)); %> </td>
                                <td id="category"><%=rs.getString(1)%></td>
                                <td id="p_name"><%out.print(v.get(1)); %></td>
                                <td id="price"><%out.print(v.get(2)); %></td>                                                
                                <td id="quantity"><%out.print(v.get(2)); %></td>                                                                 
                                <td>
                                    <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>                            
                                </td>
                                <td>
                                    <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                </td>
                            </tr>                            
                        </tbody>
                        <%}%>
                        <%}%>
                    </table>                    
                </div>
            </div>
        </div>
    </body>
</html>
</html>                            