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
public class dsmobil {
    private ArrayList<String> id;
    private ArrayList<String> nm_mbl;
    private ArrayList<String> merek_mbl;
    private ArrayList<String> plat_mbl;
    private ArrayList<Integer> harga_sewa;
    
    public dsmobil() {
        id= new ArrayList<>();
        nm_mbl= new ArrayList<>();
        merek_mbl= new ArrayList<>();
        plat_mbl= new ArrayList<>();
        harga_sewa= new ArrayList<>();
    }
    public void addId(String value){
        this.id.add(value);
    }
    
    public ArrayList<String> getDataId(){
        return this.id;
    }
    public void addNm_mbl(String value){
        this.nm_mbl.add(value);
    }
    
    public ArrayList<String> getDataNm_mbl(){
        return this.nm_mbl;
    }
    public void addMerek_mbl(String value){
        this.merek_mbl.add(value);
    }
    
    public ArrayList<String> getDataMerek_mbl(){
        return this.merek_mbl;
    }    
    public void addPlat_mbl(String value){
        this.plat_mbl.add(value);
    }
    
    public ArrayList<String> getDataPlat_mbl(){
        return this.plat_mbl;
    } 
    public void addHarga_sewa(int value){
        this.harga_sewa.add(value);
    }
    
    public ArrayList<Integer> getDataHarga_sewa(){
        return this.harga_sewa;
    }     
}
