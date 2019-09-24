/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan5.kambingglobal;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan mengakses variabel global
 * 
 */
public class PBO11K10118907Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    int jumlahKambing = 88;

    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: "+jumlahKambing);
    }

    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: "+jumlahKambing);
    }

    
    public static void main(String[] args) {
        PBO11K10118907Latihan5KambingGlobal kambingSusu = new PBO11K10118907Latihan5KambingGlobal();

        kambingSusu.getJumlahKambing();;

        kambingSusu.tambahKambing();

        kambingSusu.getJumlahKambing();
    }
    
}
