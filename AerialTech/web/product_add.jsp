<%-- 
    Document   : category
    Created on : Oct 30, 2019, 10:35:03 AM
    Author     : TOMIN
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.Vector"%>
<%@page import="java.sql.ResultSet"%>
  <jsp:useBean id="con" class="beanfiles.Product"/> 
<%@page import="DBConnection.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add_Product</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">                
        <meta http-equiv="X-UA-Compatible" content="IE=edge">       
        
        <link rel="stylesheet" href="css/fontAwesome.css">    
        <link rel="stylesheet" href="css/style_MainPage.css">   
        <link rel="stylesheet" href="css/templatemo-main.css">
        <link rel="stylesheet" href="css/style_Heading.css">
        <link rel="stylesheet" href="css/style_Buttons.css">
        <link rel="stylesheet" href="css/style_input.css">
        
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800">    
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    </head>
    <body>        
        <nav>
            <div class="logo">
                <a href="main.jsp"><img src="img/AerialTech_Logo.png" alt="AerialTech_Logo"></a>
            </div>
            <div class="mini-logo">
                <img src="img/AerialTech_Logo_Mini.png" alt="AerialTech_Logo">
            </div>
            <ul>
                <li><a href="main.jsp"><i class="fa fa-home"></i><em>Home</em></a></li>
                <li><a href="category.jsp"><i class="fa fa-list"></i><em>Category</em></a></li>                
                <li class="wrapper"><a href="product.jsp"><i class="fa fa-product-hunt"></i><em>Products</em></a></li>                
            </ul>
        </nav>

        <div class="slides">
            <div class="slide" id="1">
                <div class="content first-content">                    
                    <div class="wrapper left-half">
                        <h3>ADD PRODUCT</h3>
                    </div>
                    <div class="outer right-half">
                        <div class="inner">
                            <p>Log Out</p>
                        </div>
                    </div>                                                                              
                    <form style="width: 100%; margin-top: 35px" class="go-right">                        
                        <div class="left-half" style="width: 25%; left: 10%">
                            <input id="p_name" name="name" type="text" required>
                            <label for="p_name">Product Name</label>
                        </div>                                                   
                        <div class="right-half" style="width: 25%; right: 10%">
                            <input id="p_id" name="name" type="text" required>
                            <label for="p_id">Product ID</label>
                        </div>                        
                        <div class="half" style="width: 25%; left: 37.5%">
                            <input id="c_name" name="name" style="align-items: center" type="text" required>
                            <label for="c_name">Category</label>
                            <select name="category" id="category">
                                <option value="0">Category</option>
                                <%
                                try 
                                {
                                    DBConnection ob = new DBConnection();
                                    String qry = "select c_name from category";
                                    ResultSet rs = ob.select(qry);
                                    while (rs.next()) {
                                    %>
                                        <option value="<% out.print(rs.getString(1));%>"><% out.print(rs.getString(1));%></option>
                                        <%
                                    }
                                } 
                                catch (Exception e) {
                                }
                                %>
                            </select>
                        </div>
                        <br><br><br>                        
                        <div class="left-half" style="width: 25%; left: 23.5%">
                            <input id="s_price" name="name" type="text" required>
                            <label for="s_price">Sales Price</label>
                        </div>  
                        <div class="right-half" style="width: 25%; right: 23.5%">
                            <input id="quantity" name="name" type="text" required>
                            <label for="quantity">Available Quantity</label>
                        </div>  
                    </form>      
                    <button style="margin-top: 63px" type="submit" class="btn btn-success">ADD</button>
                    <button style="margin-top: 63px" type="submit" class="btn btn-success">CANCEL</button>
                    <form action="post">                             
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
                                     <a href="products_edit.jsp?&p_id=<%out.print(v.get(0)); %>&p_name=<%out.print(v.get(1));%>&category=<%out.print(v.get(1));%>&price=<%out.print(v.get(2));%>&quantity=<%out.print(v.get(3)); %>"  class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>                                                                 
                                </td>
                                <td>
                                   <a href="/process/product_delete.jsp?&p_id=<%out.print(v.get(0)); %> " class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                
                                </td>
                            </tr>                            
                        </tbody>
                        <%}%>
                       
                    </table>  
                                                                                               
                    </form>                        
                </div>
            </div>
        </div>
        
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="js/main.js"></script>        
    </body>
</html>
