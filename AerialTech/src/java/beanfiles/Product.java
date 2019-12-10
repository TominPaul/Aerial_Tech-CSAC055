/**
 * @author mrvis
 */

package beanfiles;
import DBConnection.DbConnection1;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Product {
    DbConnection1 con;
    String p_id, category, p_name, p_price, p_quantity;

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
        return p_price;
    }

    public void setPrice(String price) {
        this.p_price = price;
    }

    public String getQuantity() {
        return p_quantity;
    }

    public void setQuantity(String quantity) {
        this.p_quantity = quantity;
    }
    
    private void init() {
        try {
            if(con == null)
                con = new DbConnection1();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Connection error..");
        }        
    }
    
    public int putData(int opt) {
        init();
        return con.putData(generateQuery(opt)); 
    }
    
    public Vector getData(int opt) {
        init();
        return con.getData(generateQuery(opt));
    }
    
    private String generateQuery(int opt) {
        String str;
        switch (opt) {
            case 1:
                str = "insert into product (p_id, p_name, p_price, p_quantity, c_id, u_name)"
                        + "values('"+getP_id()+"', '"+getP_name()+"', '"+getPrice()+"', '"+getQuantity()+"', '"+getCategory()+"', 'admin')";
                System.out.println(str);
                return  str;
            case 2:
                str = "select * from product";
                System.out.println(str);
                return  str;
            case 3:
                str = "update product set p_id = '"+getP_id()+"', p_name = '"+getP_name()+"', p_price = '"+getPrice()+"', p_quantity = '"+getQuantity()+"', c_id = '"+getCategory()+"' where p_id = '"+getP_id()+"'";
                System.out.println(str);
                return str;        
            default:
                break;
        }
        return "";
    }
}
