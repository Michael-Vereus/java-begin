package Vereus.Tutor3Array2D;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {
        int length = 3;
        int width = 2;
        // anggep kayak matriks dengan ukuran m x n
        int[][] num = new int[length][width];
        // nested loop -> loop didalam loop
        // jadi loop pertama buat nganu, looping per baris nya alias panjangnya
        // Jadikan array tsb punya panjang 3 elemen nah nanti tinggal diulang deh per barisnya
        // jadi itu fungsi loop pertama
        for (int i = 0; i < length; i++) {
            // terus loop ke dua fungsi e buat nganu, looping per kolom di baris tersebut.
            // simpel e de e ngeloop per elemen di baris tersebut.
            for (int j = 0; j < width ; j++) {
                num[i][j] = i+j; // --> ini untuk nge assign nilai ke array di elemen tsb
                System.out.print(num[i][j] + " "); // ini buat di outputkan
            }
            // ini buat "Enter"
            System.out.println();
            // ini ya buat ngasi tanda strip terus "Enter" lagi
            System.out.println("====");
        }
        // selesai deh ez kan XD
        // jadi simpel e gini nested loop itu bisa kamu anggap kek roam ada 3 lane ya.
        // nah dia ka harus roam satu" ke lane tersebut. Terus di lane A dia harus ngelewati turet 1 2 3
        // nah loop pertama itu bertindak sebagai jalan masuk ke lane atas tersebut.
        // terus loop ke dua itu sebagai penggerak roamer e biar jalan melewati turret tersebut.
        // terus lek udah roamer e bakal recall ke base
        // dan loop ke dua lanjut. dia akan lanjut ke midlane dan proses yang sama dimulai gitu
    }
}
