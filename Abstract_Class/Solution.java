import java.util.*;

abstract class Book             // created abstract class
{
    String title;
    String author;
    Book(String t,String a){    // base constructor having title and author
        title=t;
        author=a;
    }
    abstract void display();   /* abstract class contain abstract methods
                                  that is without any body. */
}

class MyBook extends Book      // derived class MyBook inheriting base class
{
    int price;
    MyBook(String title,String author,int price){

      super(title,author);        // derived constructor using base
      this.price = price;         // constructor's variables

    }

    void display(){               // body of display method written
                                  // in derived class
      System.out.println("Title: "+title);
      System.out.println("Author: "+author);
      System.out.println("Price: "+price);

    }
}

public class Solution
{

   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price); // Implementing above
      new_novel.display();                           // class's method
                          
   }
}
