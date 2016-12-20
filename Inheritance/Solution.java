import java.util.*;

class Person {                        // class Person - base class
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson(){                         // Printing all details
		 System.out.println(
				"Name: " + lastName + ", " + firstName
			+ 	"\nID: " + idNumber);
	}
}

class Student extends Person{       // class Student - derived class
	private int[] testScores;
  int avg,count=0,sum = 0;

  //Constructor
  Student(String firstName, String lastName, int idNumber, int[] testScores){
    super(firstName,lastName,idNumber);
    this.testScores = testScores;
  }

  // calculate method
  char calculate(){                 // calculate method - calculating average and grade
    for(int i=0;i<testScores.length;i++){
      sum=sum+testScores[i];
      count++;
    }

    avg = sum/count;

    // Calculating Grade
    if(avg<=100 && avg>=90)
      return 'O';
    else if(avg<=90 && avg>=80)
      return 'E';
    else if(avg<=80 && avg>=70)
      return 'A';
    else if(avg<=70 && avg>=55)
      return 'P';
    else if(avg<=55 && avg>=40)
      return 'D';
    else
      return 'T';

  }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
