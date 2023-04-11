import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List <Integer> digits = new ArrayList<>();

        while(n > 0){
            digits.add(n % 2);
            n /= 2;
        }

        int max = 0;
        int con = 0;

        for(int a : digits){
            if(a == 1){
                con++;
                if (con > max)
                    max = con;
            }
            else
                con = 0;
        }

        System.out.println(max);

        bufferedReader.close();
    }
}