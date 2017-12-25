/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Wei Shen
 */
public class User {
    


    private String Rname, Raddress, Rcn;

    public User(String Rname, String Raddress, String Rcn) {
        this.Rname = Rname;
        this.Raddress = Raddress;
        this.Rcn = Rcn;
        
    }

    public String getRname() {
        return Rname;
    }

    public String getRaddress() {
        return Raddress;
    }

    public String getRcn() {
        return Rcn;
    }


    public void setRname(String Rname) {
        this.Rname = Rname;
    }

    public void setRaddress(String Raddress) {
        this.Raddress = Raddress;
    }

    public void setRcn(String Rcn) {
        this.Rcn = Rcn;
    }

    @Override
    public String toString() {
        return "User{" + "Rname=" + Rname + ", Raddress=" + Raddress + ", Rcn=" + Rcn + '}';
    }


  
    
    
       

   
    }


    

