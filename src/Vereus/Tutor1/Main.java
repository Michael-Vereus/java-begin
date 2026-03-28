// simpelnya package ini melambangkan file path / folder path file java ini di dalam folder root.
// yang dalam kasus ini folder rootnya = src (dilambangkan dengan folder warna biru --> ini kalo kalian pake intellij )

package Vereus.Tutor1;

// ini artinya kalian import folder util atau kotak tools untuk menjalankan program ini
// biasanya orang cuma ambil satu tools kayak scanner atau arraylist
// cuma aku perfer ambil semua, kenapa? karena uda kebiasaan dari dulu bebas kok kalo ini. Sesuaikan aja sama kebutuhan
import java.util.*;

// nama class (Nama file Java)
// INGAT! Java itu bahasa yang Object Oriented.
// Yang berarti setiap File java adalah class nya.
// Simpelnya file Main.java = class Main{}
// untuk awal" kalian bakal cuma pakai satu file java alias satu class nanti kalo udah mulai bisa
// bisa pake beberapa file java / class
// Kenapa harus pakai beberapa class / file ? karena bisa nanti code nya lebih mudah kebacar tapi itu perkara nanti
// Untuk sekarang tinggal ikutin aja.
class Main{
    // ini untuk declare variable sc secara static / global biar bisa dipake sama semua fungsi static yang berada di dalam class ini.
    static Scanner sc = new Scanner(System.in);
    // ini adalah entry point untuk program java bisa jalan
    // simpelnya kalo kalian pengen program kalian jalan harus ada ini main di awalannya.
    static void main(String[] args) { // gausa dihafalin pake shortcut aja ketik psvm terus pencet tab
        System.out.println("Hello Michael"); // ini juga gausa dihafalin tinggal ketik sout terus pencet tab
        boolean status = true;
        while (status){
            // untuk ambil input dari fungsi statis user.
            int option = menu();
            // kemudian dicekkan di fungsi statis
            status = checkOption(option);
        }
    }

    // penulisan fungsi harus diawali dengan jenis fungsi private / protected / public
    // kemudian lanjut dengan jenis functionnya static atau non static. Simpelnya fungsi non static berarti
    // fungsi yang setara dengan class dan cara menggilnya engga harus new {class} dulu tinggal className.namafungsi nya.
    // tapi untuk sekarang pake static dulu aja gapapa
    // kemudian jangan lupa harus return type nya apa, void, int, float, String etc.
    // kemudian terakhit baru nama fungsi
    // nah fungsi bisa menerima parameter untuk mendeclare parameter itu sendiri tinggal tuliskan
    // tipe data variable diikuti dengan nama variable
    // terus tinggal isi deh isi functionnya.
    // Oh ya bagi kalian yang masi bingung beda nya prosedur dan fungsi simpelnya gini.
    // Prosedur = fungsi yang return type void alias gak return apa"
    // function = fungsi yang return type nya int, String, float, dll alias akan mereturn suatu nilai.

    public static int menu(){
        System.out.println("1. Loop Again.");
        System.out.println("0. Exit.");
        System.out.print("Enter 1 or 0 : ");
        return sc.nextInt(); // untuk ambil input user bisa pakai cari ini atau simpal di variable dulu baru di return
    }

    public static boolean checkOption(int option){
        // disarankan selalu declare sebuah variable sebelum ifelse / switch case
        // karena kalo semisal variable itu kamu declare di dalam ifelse / switch case
        // maka variable itu hanya bisa dipanggil didalam ifelse / switch case tsb.
        boolean returnStatus ;
        switch (option){
            case 0 :
                returnStatus = false;
                break;
            default:
                returnStatus = true;
                break;
        }
        return returnStatus;
    }
}
