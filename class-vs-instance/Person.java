import java.io.*;
import java.util.*;

public class Person
{
  private int age;
    public Person (int initialAge)
    {
      if(initialAge<0)
      {
        initialAge=0;
        System.out.println("Age is not valid, setting age to 0.");
      }

      else if(initialAge>0)
      {
        age=initialAge;
      }
    }
    void yearPasses()
    {
      age++;
    }
    void amIOld()
    {

        if(age<13)
        {
            System.out.println("You are young.");
        }
        else if(age>=13 && age<18)
        {
            System.out.println("You are a teenager.");
        }
        else
        {
            System.out.println("You are old.");
        }

    }
    public static void main(String[]e)
    {
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
      int age[]=new int[T];
      int i;
      for ( i= 0; i < T; i++)
      {
        age[i] = sc.nextInt();

      }
      for(i=0;i<T;i++)
      {
          Person p = new Person(age[i]);
        p.amIOld();
        for (int j = 0; j < 3; j++)
          {
            p.yearPasses();
          }
        p.amIOld();
        System.out.println();
      }
    sc.close();
  }
}
