package objects;

import java.util.ArrayList;
import java.util.List;
import oop.KelasA;

public class KelasB {
    
    public static void main(String[] args) {
        List X = new ArrayList();
        X.add("A");
        X.add(12.5);
        X.add(1000);
        X.add("Test List");
        int a = 12;
        
        KelasA K = new KelasA(a);
        K.print(X);
    }
}
