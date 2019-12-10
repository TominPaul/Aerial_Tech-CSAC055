<%-- 
    Document   : products_add
    Created on : Oct 7, 2019, 10:16:10 AM
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products_Add</title>    
	<jsp:useBean id="con" class="beanfiles.Product"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">        
        <meta http-equiv="X-UA-Compatible" content="ie=edge">       
        
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
        <form action="process/productsadd_pr.jsp" method="post">
        <div align="right" class="form-group form-button" style="margin-right:5%; margin-left:12%">
            <h2 class="form-title" align="left"><b>Add Product</b></h2>
            <div class="col-sm-12 col-md-12 text-center">
                <div class="form-inline">
                    <div class="form-group">
                        <label for="Category_Name">Category</label>
                        &nbsp;
                        <select name="category" id="category">
                                                                   
                                                                     <option value="0"><Category></option>
                                                                        <%
                                                                            try {
                                                                                DBConnection ob = new DBConnection();

                                                                                String qry = "select c_name from category";
                                                                                ResultSet rs = ob.select(qry);
                                                                                while (rs.next()) {

                                                                        %>
                                                                        <option value="<% out.print(rs.getString(1));%>"><% out.print(rs.getString(1));%></option>
                                                                        <%

                                                                                }
                                                                            } catch (Exception e) {

                                                                            }
                                                                        %>
                                                                      
                    
                    &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;
                    <div class="form-group">
                        <label for="P_name">Product Name</label>
                        &nbsp;
                        <input type="text" name="p_name" id="p_name" class="form-control" id="Product_Name">
                    </div>
                </div>
                
                </br>
                <div class="form-inline">
                    <div class="form-group">
                        <label for="Product_ID">Product ID</label>
                        &nbsp;
                        <input type="text" name="p_id" id="p_id" class="form-control" id="Product_ID">
                    </div>
                    &nbsp;
                    <div class="form-group">
                        <label for="Sales_Price">Sales Price</label>
                        &nbsp;
                        <input type="text" id="price" name="price" class="form-control" id="Sales_Price">
                    </div>
                </div>
                </br>
                <div class="form-inline">
                    &nbsp;
                    <div class="form-group">
                        <label for="Available_Quantity">Available Quantity</label>
                        &nbsp;
                        <input type="text" id="quantity" name="quantity" class="form-control" id="Available_Quantity">
                    </div>
                    </br></br>
                    <button type="submit" class="btn btn-success">ADD</button>                  
                </div>
                </br>
            </div>
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
                       
                        <tbody>
                            <tr>
                                <td id="P_id"><%out.print(v.get(0)); %> </td>
                                <td id="category"><%out.print(v.get(4)); %> </td>
                                <td id="p_name"><%out.print(v.get(1)); %></td>
                                <td id="price"><%out.print(v.get(2)); %></td>                                                
                                <td id="quantity"><%out.print(v.get(3)); %></td>                                                                 
                                <td>
                                     <a href="products_edit.jsp?&p_id=<%out.print(v.get(0)); %>&p_name=<%out.print(v.get(1));%>&category=<%out.print(v.get(4));%>&price=<%out.print(v.get(2));%>&quantity=<%out.print(v.get(3)); %>"  class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>                                                                 
                                </td>
                                <td>
                                    <a href="/process/product_delete.jsp?&p_id=<%out.print(v.get(0)); %> " class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                </td>
                            </tr>                            
                        </tbody>
                        <%}%>
                        
                    </table>             
                </div>
            </div>
        </div>
    </form>
    </body>
</html>
</html>
