/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan38;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program perhitungan lingkaran
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    
    public static Integer masukkanDiameterLingkaran() {
        Integer hasil;
        System.out.print("Masukkan nilai diameter lingkaran : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            hasil = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            System.out.println("Nilai Diameter Tidak Sesuai");
            hasil = null;
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Sistem!");
            hasil = 0;
        }
        return hasil;
    }
    
    public static void tampilHasil(Lingkaran lingkaran) {
        lingkaran.hitungLingkaran();
    }
    
    public static void main(String[] args) {
        System.out.println("======Perhitungan Lingkaran=====");
        Integer dm = masukkanDiameterLingkaran();
        while(dm==null) {
            System.out.println("");
            dm = masukkanDiameterLingkaran();
        }
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.diameter = dm;
        
        System.out.println("");
        tampilHasil(lingkaran);
    }
}
