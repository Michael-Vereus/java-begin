package Vereus.Tutor7Loop.POSMiniMarket;

import java.lang.reflect.Array;
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

            sc.nextLine();
            switch (option){
                case 0 :
                    status = false;
                    break;
                case 1 :
                    System.out.print("Atas nama siapa transaksi ini ? : ");
                    String person = sc.nextLine();
                    System.out.print("Input berapa banyak barang yang diinginkan dalam transaksi ini :");
                    int loopFor = sc.nextInt();
                    sc.nextLine();

                    String[] name = new String[loopFor];
                    int[] quantity = new int[loopFor];
                    int[] price = new int[loopFor];
                    int total = 0;

                    // loop input
                    for (int i = 0; i < loopFor; i++) {
                        System.out.println("Barang ke - " + (i+1));
                        System.out.print("Masukkan Nama Barang : ");
                        name[i] = sc.nextLine();
                        System.out.print("Masukkan Jumlah Barang : ");
                        quantity[i] = sc.nextInt();
                        System.out.print("Masukkan Harga Barang : "); // check ln
                        price[i] = sc.nextInt();
                        System.out.println("=======================");
                        sc.nextLine();
                    }

                    System.out.println("==== Transaksi Atas Nama " + person + " ====");
                    for (int i = 0; i < loopFor; i++) {
                        int temp = quantity[i] * price[i];
                        total = temp + total;
                        System.out.println(name[i] + " x" + quantity[i] + "  " + price[i] + " = " + temp);
                    }
                    System.out.println("Total Anda : " + total);
                    System.out.println("Thank you for shopping w us :D");

                    break;
                default: // untuk case yg tidak ada didalam switch-case
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}
