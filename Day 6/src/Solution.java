import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] intarray = new int[n];
        String[] stringarray = new String[n];

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            intarray[i] = phone;
            stringarray[i] = name;
        }

        while(in.hasNext()){
            String s = in.next();
            int j = 0;
            boolean condition = true;
            for(String str : stringarray){
                if(s.equals(str)){
                    System.out.println(str + "=" + intarray[j]);
                    condition = false;
                    break;
                }
                j++;
            }
            if(condition)
                System.out.println("Not found");
        }

        in.close();
    }
}