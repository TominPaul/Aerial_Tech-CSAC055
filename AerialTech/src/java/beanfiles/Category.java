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
public class Category {
    String c_id,c_name;
    DbConnection1 con;

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
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
            str="insert into category (c_id,c_name,uname) "
                    + "values('"+getC_id()+"','"+getC_name()+"',admin)";
            return  str;
        }else if(opt==2){  
            str="select * from category ";
            return  str;
        }
        return "";
    }
}
