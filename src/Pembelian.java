/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhandy
 */
public class Pembelian {
    public SepedaMotor beliMotor;
    public Pembeli orang;

    void pembelian(Pembeli beli, SepedaMotor motor) {
        orang = beli;
        beliMotor = motor;
    }

   
   void dataPembelian(){
       System.out.println("Data Pembelian Sepeda Motor");
       System.out.println("Nama : "+orang.getNama());
       System.out.println("Alamat : "+orang.getAlamat());
       System.out.println("Beli Sepeda Motor : "+beliMotor.getMerk());
       System.out.println("Dengan Transmisi : "+beliMotor.getJenis());
   }
}
