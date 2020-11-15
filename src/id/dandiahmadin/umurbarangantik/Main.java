/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.umurbarangantik;

/**
 *
 * @author 
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi informasi Umur Barang Antik dengan pendekatan object oriented dan 
 * penerapan konsep pewarisan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Radio radio1 = new Radio(234);
        radio1.setName("Radio AM");
        System.out.println("Nama Barang Antik : ".concat(radio1.getName()));
        radio1.tampilUmur();
    }
    
}
