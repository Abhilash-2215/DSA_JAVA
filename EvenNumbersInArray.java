import java.util.Scanner;
public class EvenNumbersInArray {
    public static void main(String[] args) {
        Scanner data= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size= data.nextInt();
        int[]arr=new int[size];
        System.out.println("enter the elements of the array");
        for (int i=0;i<size;i++){
            arr[i]=data.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0) System.out.println("even number:"+arr[i]);
        }
    }
}
