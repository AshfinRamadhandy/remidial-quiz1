/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhandy
 */
public class Matic extends SepedaMotor{
    public String nama;

    public Matic(String nama) {
        this.nama = nama;
    }

    Matic() {
       
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
}
