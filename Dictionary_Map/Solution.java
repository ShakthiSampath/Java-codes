
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        String name;
        int phone;
        int n = in.nextInt();
        Map <String,Integer> phoneBook = new HashMap <String,Integer>();
        for(int i = 1; i < n+1; i++){
            name = in.next();
            phone = in.nextInt();
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            for (int i = 0; i < phoneBook.size(); i++) {
            if(phoneBook.get(s)!=null){
              System.out.println(s+"="+phoneBook.get(s));
              break;}
            else{
              System.out.println("Not found");
              break;}
          }
        }
    in.close();
    }

}
