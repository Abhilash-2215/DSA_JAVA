import java.util.Scanner;

public class ReverseOfAnArray {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = data.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++)
        {
            arr[i] = data.nextInt();
        }
        int i=0;
        int j=arr.length-1;
        int temp=0;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
    }
}
