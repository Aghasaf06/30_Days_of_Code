import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int MaxSum = -9 * 7;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int sum = arr.get(i + 1).get(j + 1);
                for(int k = j; k < j + 3; k++){
                    sum += arr.get(i).get(k);
                    sum += arr.get(i + 2).get(k);
                }
                if(sum > MaxSum){
                    MaxSum = sum;
                }
            }
        }

        System.out.println(MaxSum);
    }
}