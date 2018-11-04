/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhandy
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SepedaMotor motor = new SepedaMotor();
        Pembeli beli = new Pembeli();
        Pembelian belian = new Pembelian();
        Matic m = new Matic();
        Manual l = new Manual();
       
        
        beli.setNama("Alucard Hariaydi");
        beli.setAlamat("Jln. Kingking no 72");
        
        motor.setMerk("Honda Vario 125");
        motor.setJenis("Matic");
        
        belian.pembelian(beli, motor);
        belian.dataPembelian();
    }   
    
}
