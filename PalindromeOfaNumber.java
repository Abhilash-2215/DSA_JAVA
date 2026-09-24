import java.util.Scanner;
class Calculator1{
    public void palindrome(int n){
        int temp = n;
        int lastdigit;
        int reverse=0;
        while(n!=0) {
            lastdigit = n % 10;
            reverse=reverse*10+lastdigit;
            n=n/10;
        }
        if(temp==reverse) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
public class PalindromeOfaNumber {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        Calculator1 c = new Calculator1();
        System.out.println("Enter a number to check palindrome or not:");
        int num = data.nextInt();
        c.palindrome(num);
    }
}




