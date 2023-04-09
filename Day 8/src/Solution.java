import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> PhoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            PhoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(PhoneBook.containsKey(s)){
                System.out.println(s + "=" + PhoneBook.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
