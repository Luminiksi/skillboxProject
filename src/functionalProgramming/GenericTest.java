package functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        /*list.add(1);
        list.add(new StringBuilder());*/
        print(list);
    }

    public static void print(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }
    }
}
