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
public class Customer {
    
    private String CusID;
    private String CusName;
    private String CusAddress;
    private String CusNumber;
    
    public String getCusID(){
        return CusID;
    }
    
    public void setCusID(String cusID){
        CusID = cusID;
    }
    
        public String getCusName(){
        return CusName;
    }
    
    public void setCusName(String cusName){
        CusName = cusName;
    }
    
        public String getCusAddress(){
        return CusAddress;
    }
    
    public void setCusAddress(String cusAddress){
        CusAddress = cusAddress;
    }
    
        public String getCusNumber(){
        return CusNumber;
    }
    
    public void setCusNumber(String cusNumber){
        CusNumber = cusNumber;
    }
}
