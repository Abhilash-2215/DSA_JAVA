import java.util.Arrays;
public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;
        while (start < end){
            if (arr[start] != arr[end]) {
                isPalindrome = false;
            }
            start++;
            end--;
        }
        if(isPalindrome) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
