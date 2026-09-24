import java.util.Scanner;
public class FactorialOfaNumber {
    int fact(int num){
        if(num == 0 || num == 1){
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
}
class Demo {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int number = data.nextInt();
        FactorialOfaNumber obj = new FactorialOfaNumber();
        System.out.println("Factorial of " + number + " is: " + obj.fact(number));
    }
}
