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
    public Pembeli pembeli;

    void Pembelian(Pembeli orang, SepedaMotor motor) {
        pembeli = orang;
        beliMotor = motor;
    }

   
   void dataPembelian(){
       System.out.println("Data Pembelian Sepeda Motor");
       System.out.println("Nama : "+pembeli.getNama());
       System.out.println("Alamat : "+pembeli.getAlamat());
       System.out.println("Beli Sepeda Motor : "+beliMotor.Merk);
       System.out.println("Dengan Transmisi : "+beliMotor.jenis);
   }
}
