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
 * Deskripsi Program : Program ini berisi class BarangAntik yang merupakan superclass
 */
public class BarangAntik {
    protected int umur;
    
    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tampilUmur() {
        System.out.println("Umur Barang Antik ini adalah : " + umur + " tahun.");
    }
}
