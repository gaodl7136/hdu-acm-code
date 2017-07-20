import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);  
        double a;  
        int n;  
        while (in.hasNext()){
            a=in.nextDouble();
            if (a<0) a=-a;
            System.out.println(String.format("%.2f", a));
        }
    }
}