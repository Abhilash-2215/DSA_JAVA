import java.util.Scanner;
class Calculator{
    int reversenum(int n){
        int lastdigit;
        int reverse=0;
        while(n!=0) {
            lastdigit = n % 10;
            reverse=reverse*10+lastdigit;
            n=n/10;
        }
        return reverse;
    }
}
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("Enter a number to find its reverse number: ");
        int num = data.nextInt();
        int result=c.reversenum(num);
        System.out.println("reverse of a number is:"+result);
    }
}
