/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing_global;

/**
 *
 * @author  Sri Utami Ningsih
 * Nama  : Sri Utami Ningsih
 * Kelas : PBO-2
 * Nim   : 10116378
 */
public class Kambing_Global {
int jumlahKambing = 88;
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }    
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    PBOIF2_10116378_LATIHAN5 KambingGlobal = new PBOIF2_10116378_LATIHAN5();
        
        kambingGlobal.getJumlahKambing();
        
        kambingGlobal.tambahKambing();
        
        kambingGlobal.getJumlahKambing();
    }
    
}
