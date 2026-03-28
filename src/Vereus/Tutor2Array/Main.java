package Vereus.Tutor2Array;


import java.lang.reflect.Array;

public class Main {
    static void main(String[] args) {
        test();
        // set ukuran awal dari arrat
        int[] num = new int[3]; // --> array 1 Dimensi
        String[] name = new String[3]; // array di java bersifat statis alias engga bisa berubah ukurannya.
        // 10 disini maksudnya array ini memiliki 10 slot kosong yang bisa diisi 10 variable bertipe data string
        name[0] = "Vereus";
        name[1] = "Farrel";
        num[0] = 1;
        num[1] = 67;
        // ini buat nge supress warning dari intellij karena secara teknis ada cara yang lebih baik buat ngeloop array ini
        // tapi biar muda dipahami pakai cara ini dulu
        for (int i = 0; i < name.length; i++) {
            System.out.print("Nama : ");
            System.out.println(name[i]);
            System.out.print("Nomor : ");
            System.out.println(num[i]);
        }
        System.out.println("jadi di dalam array java itu ukurannya sudah ditentukan dari awal ");
        System.out.println("dan default valuenya itu null atau nol tergantung tipe data");

    }
    public  static  void test(){
        System.out.println("hello");
    }
}
