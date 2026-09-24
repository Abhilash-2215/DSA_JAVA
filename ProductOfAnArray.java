import java.util.Scanner;

public class ProductOfAnArray {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = data.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i] = data.nextInt();
        }int product=1;
        for(int i=0;i<size;i++){
        product *=arr[i];
        }
        System.out.println(product);
    }
}
