import java.util.Scanner;
public class SumOfnumbersInArray {
    public static void main(String[] args) {
        Scanner data= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size= data.nextInt();
        int[]arr=new int[size];
        System.out.println("enter the elements of the array");
        for (int i=0;i<size;i++){
            arr[i]=data.nextInt();
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of array is:"+sum);
    }
}
