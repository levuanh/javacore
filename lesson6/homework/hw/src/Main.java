import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Coder> coderList = new ArrayList<>();

        int coderNum = 1;
        for (int i = 0; i < coderNum; i++) {
            Coder coder = new Coder();
            coder.input();
            coderList.add(coder);
        }
       
	   List<Tester> testerList = new ArrayList<>();

        int testerNum = 1;
        for (int i = 0; i < testerNum; i++) {
            Tester tester = new Tester();
            tester.input();
            testerList.add(tester);
        }

        for (Coder coder : coderList) {
            System.out.println(dev);
        }
        for (Tester tester : testerList) {
            System.out.println(ver);
        }
    }
}

