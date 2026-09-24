import java.util.Scanner;

public class PrimeNumbersInArray {
    public static void main(String[]args){
        Scanner data=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=data.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=data.nextInt();
        }
        for(int i=0;i<size;i++){
            int num=arr[i];
            boolean prime=true;
            if(num<=0){
                prime=false;
            }else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            if(prime==true) System.out.println("prime number:"+arr[i]);
        }
    }
}
