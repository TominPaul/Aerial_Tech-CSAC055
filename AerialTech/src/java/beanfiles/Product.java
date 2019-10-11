/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beanfiles;
import DBConnection.DbConnection1;
import java.util.Vector;
import javax.swing.JOptionPane;
/**
 *
 * @author mrvis
 */
public class Product {
      DbConnection1 con;
    String p_id,category, p_name, price,quantity;

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
     private void init(){
        try{
            if(con==null)
                con=new DbConnection1();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection error..");
        }        
    }
    
    public int putData(int opt){
        init();
        return con.putData(generateQuery(opt)); 
    }
    
    public Vector getData(int opt){
            init();
            return con.getData(generateQuery(opt));
    }
private String generateQuery(int opt){
        String str;
        if(opt==1){  
            str="insert into product (p_id,p_name,price,quantity,c_id,u_name) "
                    + "values('"+getP_id()+"','"+getP_name()+"','"+getPrice()+"','"+getQuantity()+"','"+getCategory()+"',admin)";
            return  str;
        }else if(opt==2){  
            str="select * from product ";
            return  str;
        }
        return "";
    }
}

