import java.io.*;
import java.util.*;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }

        for(int j = n - 1; 0 <= j; j--){
            System.out.print(array[j] + " ");
        }

        scan.close();
    }
}