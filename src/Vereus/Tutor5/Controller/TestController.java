package Vereus.Tutor5.Controller;

public class TestController extends Controller implements ContractController {
    @Override
    public void contractTest(){
        System.out.println("Hello This is a test function from interface");
    }
}
