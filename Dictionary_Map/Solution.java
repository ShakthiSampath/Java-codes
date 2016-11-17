
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <String,Integer> phoneBook = new HashMap <String,Integer>();           // Map DataStructure used - HashMap
        for(int i = 1; i < n+1; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);                                            // name and phone used in phoneBook Dictionary
        }
        while(in.hasNext()){
            String s = in.next();
            for (int i = 0; i < phoneBook.size(); i++) {
            if(phoneBook.get(s)!=null){                                           // checking whether the value of String s in phoneBook is null or not
              System.out.println(s+"="+phoneBook.get(s));
              break;}                                                             // break statement to break the loop
            else{
              System.out.println("Not found");
              break;}
          }
        }
    in.close();
    }

}
