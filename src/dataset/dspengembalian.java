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
public class dspengembalian {
    private ArrayList<String> id_kembali;
    private ArrayList<String> id_sewa;
    private ArrayList<String> id_pelanggan;


    public dspengembalian() {
        id_kembali= new ArrayList<>();
        id_sewa= new ArrayList<>();
        id_pelanggan= new ArrayList<>();
    }
    public void addId_kembali(String value){
        this.id_kembali.add(value);
    }
    
    public ArrayList<String> getDataId_kembali(){
        return this.id_kembali;
    }
    public void addId_sewa(String value){
        this.id_sewa.add(value);
    }
    
    public ArrayList<String> getDataId_sewa(){
        return this.id_sewa;
    }
    public void addId_pelanggan(String value){
        this.id_pelanggan.add(value);
    }
    
    public ArrayList<String> getDataId_pelanggan(){
        return this.id_pelanggan;        
}

}