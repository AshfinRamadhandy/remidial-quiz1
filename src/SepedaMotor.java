/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhandy
 */
public class SepedaMotor {
    public String nama;
    public String jenis;
    public String transmisi;
    public SepedaMotor(String nama,String transmisi, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
        this.transmisi = transmisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public String gettransmisi(){
        return transmisi;
    }
    
    public void settransmisi(String transmisi){
        this.transmisi = transmisi;
    }
}
