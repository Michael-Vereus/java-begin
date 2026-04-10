package Vereus.Tutor7Loop.POSMiniMarket;

import java.util.Scanner;

public class MiniMarket{
    static void main(String[] args) {
        // new scanner
        Scanner sc = new Scanner(System.in);
        // set status
        boolean status = true;
        // masuk loop
        while (status){
            System.out.println("=== Selamat Datang di Program Input Penjualan Mini Market ====");
            System.out.println("1. Input Penjualan");
            System.out.println("0. Exit");
            System.out.print("Masukkan Opsi anda (angka saja) : ");
            int option = sc.nextInt();

            switch (option){
                case 0 :
                    status = false;
                    break;
                case 1 :

                    break;
                default: // untuk case yg tidak ada didalam switch-case
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}
