/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author Novriyan09
 */
public class dslogin {
    private ArrayList<String> username;
    private ArrayList<String> password;
    
    public dslogin(){
        username = new ArrayList<>();
        password = new ArrayList<>();
    }
    
    public void insertUsername(String isi){
        this.username.add(isi);
    }
    
    public ArrayList<String> getRecordUsername(){
        return this.username;
    }
    
    public void insertPassword(String isi){
        this.password.add(isi);
    }
    
    public ArrayList<String> getRecordPassword(){
        return this.password;
    }
}
