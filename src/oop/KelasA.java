package oop;

import java.util.List;

public class KelasA {
    int a = 1;
    char b = 'X';
    
    public KelasA(int ax){
        this.a = ax;
    }
    
    public void print(List E){
        System.out.println(a);
        for (Object object : E) {
            System.out.println(object);
        }
    }
}
