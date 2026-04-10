package Vereus.Tutor7Loop.While;

import java.util.Scanner;

public class WhileLoop {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ini adalah program while loop
        boolean checkBoolean = true;
        while (checkBoolean) {
            System.out.print("Halo apakah anda ingin lanjut ? (Y/n): ");
            String opsi = scanner.nextLine().trim();
            if (opsi.equalsIgnoreCase("Y")){
                checkBoolean = false;
            }

        }
    }
}
