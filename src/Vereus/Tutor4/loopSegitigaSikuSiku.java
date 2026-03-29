package Vereus.Tutor4;

import java.util.Scanner;

public class loopSegitigaSikuSiku {
    static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {
        String star = "* ";
        int length = inputPanjangUkuranSegitiga();
        int width = length;
        outputSegitigaSiku(star,length,width);
        outputSegitigaSikuVer2(star,length);
        outputSegitigaTerbalik(star,length,width);
    }
    public static void outputSegitigaSiku(String string,int length, int width){
        for (int i = 0; i < length; i++) {
            int row = width;
            width = width - i;
            row = row - width;
            for (int j = 0; j <= row; j++) {
                System.out.print(string);
            }
            System.out.println();
        }
        System.out.println("Ini adalah Segitiga Siku Siku Terbalik");
    }
    public static void outputSegitigaSikuVer2(String string,int length){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(string);
            }
            System.out.println();
        }
        System.out.println("Ini adalah Segitiga Siku Siku Terbalik Versi ke Dua");
    }
    public static void outputSegitigaTerbalik(String string,int length, int width){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(string);
            }
            System.out.println();
            width -= 1;
        }
        System.out.println("Ini adalah Segitiga Siku Siku Terbalik");
    }
    public static int inputPanjangUkuranSegitiga(){
        System.out.print("Ketik Panjang Segitiga yang kamu mau : ");
        return sc.nextInt();
    }
}
