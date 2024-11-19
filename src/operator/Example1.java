package operator;

public class Example1 {
    public static void main(String[] args) {
        boolean x;
        
        
        boolean GL1 = false && true;
        boolean GL2 = false & true;
        
        //negasi
        x = !(5/2*1+5>2);
//        System.out.println(x);
        
        if(x) {
            //System.out.println("Success");
        }else{
            //System.out.println("Fail");
        }
        
        //ternary
        String Y = x ? "Success":"Fail";
//        System.out.println(Y);
        int n = 0;
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
            }
            n += i;
            System.out.println("Loop ke-"+i+" i="+i+"\t n="+n);
        }

        


    }
    
}
