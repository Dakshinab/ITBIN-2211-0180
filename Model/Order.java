/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Dakshina Dissanayake
 */
public class Order {
    private String DrinkName;
    private String Quantity;
    private String CusID;
    private String TorD;
    
    public String getDrinkName(){
        return DrinkName;
    }
    
    public void setDrinkName(String drinkName){
        DrinkName = drinkName;
    }
    
        public String getQuantity(){
        return Quantity;
    }
    
    public void setQuantity(String quantity){
        Quantity = quantity;
    }
    
        public String getCusID(){
        return CusID;
    }
    
    public void setCusID(String cusID){
        CusID = cusID;
    }
    
        public String getTorD(){
        return TorD;
    }
    
    public void setTorD(String torD){
        TorD = torD;
    }
}
