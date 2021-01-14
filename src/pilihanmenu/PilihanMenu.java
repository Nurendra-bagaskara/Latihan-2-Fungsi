/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilihanmenu;

import java.util.Scanner;

public class PilihanMenu {

    public static void main(String[] args) {
        // input data
        Scanner masukan = new Scanner(System.in);
        // Deklrarasi dan inisialisasi variabel
        int pilihan = 9;
        // perulangan
        do {
            // Statement
            System.out.println("\nMENU LUAS BANGUN\n");
            System.out.println("1. Menghitung Luas Persegi ");
            System.out.println("2. Menghitung Luas Persegi Panjang");
            System.out.println("3. Keluar ");
            System.out.print("Masukan Pilihan Anda : ");
            pilihan = masukan.nextInt();
            //percabangan
            switch (pilihan) {
                case 1:
                    luasPersegi();
                    break;
                case 2:
                    luasPersegiPanjang();
                    break;
            }
        } while (pilihan != 3);
    }

   //method luasPersegi
    private static void luasPersegi() {
        //input data
        Scanner masukan = new Scanner(System.in);
        //Deklarasi variabel
        float sisi, luas;
        //input data dari user dan inisialisasi variabel
        System.out.print("Masukkan Nilai Sisi : ");
        sisi = masukan.nextFloat();
        luas = sisi * sisi;
        //proses output
        System.out.println("Luas Persegi Adalah : " + luas);
    }

    //method luasPersegiPanjang
    private static void luasPersegiPanjang() {
        //input data
        Scanner masukan = new Scanner(System.in);
        //Deklarasi variabel
        float panjang, lebar, luas;
        //input data dari user dan inisialisasi variabel
        System.out.print("Masukkan Nilai panjang : ");
        panjang = masukan.nextFloat();
        System.out.print("Masukkan Nilai Lebar : ");
        lebar = masukan.nextFloat();
        luas = panjang * lebar;
        //proses output
        System.out.println("Luas Persegi Panjang Adalah : " + luas);
    }

}
