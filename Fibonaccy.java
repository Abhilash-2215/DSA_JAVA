import java.util.Scanner;
class fibonaccicalc{
    public void fib(int num){
        int f=1;
        int s=1;
        int t;
        System.out.println(f);
        System.out.println(s);
        for(int i=3;i<=num;i++){
           t=f+s;
            System.out.println(t);
            f=s;
            s=t;
        }
    }
}
public class Fibonaccy {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter a number to find fibonaccy: ");
        int n = data.nextInt();
        fibonaccicalc obj= new fibonaccicalc();
        obj.fib(n);
    }
}
