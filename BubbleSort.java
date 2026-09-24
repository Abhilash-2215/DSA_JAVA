import java.util.*;
public class BubbleSort {
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = data.nextInt();
        int[] arr=new int[size];
        int temp;
        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i]= data.nextInt();
        }
        System.out.println("Before sorting");
        for(int nums:arr){
            System.out.print(nums+" ");
        }
        for(int j=0;j<size;j++){
            for(int i=0;i<size-1-j;i++){
                if(arr[i]>arr[i+1]) {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting");
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }
}
