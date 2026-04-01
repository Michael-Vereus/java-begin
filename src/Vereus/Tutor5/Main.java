package Vereus.Tutor5;

import Vereus.Tutor5.Controller.ContractController;
import Vereus.Tutor5.Controller.TestController;

public class Main {
    static void main(String[] args) {
        // this is an interface call
        // simpelnya interface itu ibarat ya class itu mempunyai tipe yang sama seperti class interface yang diimplementasikan
        ContractController ct = new TestController();
        ct.contractTest();
        TestController tc = new TestController();
        tc.test();
    }
}
