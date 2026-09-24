import java.util.Scanner;
class Calculator2{
    void PrimeCheck(int n){
        boolean prime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
    if(prime==true) System.out.println("Prime number");
    else System.out.println("Not Prime number");
    }
}
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        Calculator2 c = new Calculator2();
        System.out.println("Enter the number to check prime or not:");
        int num = data.nextInt();
        c.PrimeCheck(num);
    }
}
