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
public class dssewa {
    private ArrayList<String> id_sewa;
    private ArrayList<String> id_mbl;
    private ArrayList<String> lama;
    private ArrayList<Integer> bayar;
    private ArrayList<Integer> kembalian;
    
    public dssewa(){
    id_sewa = new ArrayList<>();
    id_mbl = new ArrayList<>();
    lama = new ArrayList<>();
    bayar = new ArrayList<>();
    kembalian = new ArrayList<>();
}
    public void addId_sewa(String value){
        this.id_sewa.add(value);
    }
    
    public ArrayList<String> getDataId_sewa(){
        return this.id_sewa;
    }
    public void addId_mbl(String value){
        this.id_mbl.add(value);
    }
    
    public ArrayList<String> getId_mbl(){
        return this.id_mbl;
    }
    public void addLama(String value){
        this.lama.add(value);
    }
    
    public ArrayList<String> getDataLama(){
        return this.lama;
    }    
    public void addBayar(int value){
        this.bayar.add(value);
    }
    
    public ArrayList<Integer> getDataBayar(){
        return this.bayar;
    } 
    public void addKembalian(int value){
        this.kembalian.add(value);
    }
    
    public ArrayList<Integer> getDataKembalian(){
        return this.kembalian;
    }     
}

