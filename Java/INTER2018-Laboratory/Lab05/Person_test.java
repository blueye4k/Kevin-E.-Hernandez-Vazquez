package feb20;

import java.util.Scanner;

public class Person_test {
	
	public static String print(String string) {
		return string+"\n";
	}
	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		boolean done = false;
		
		// Student/Person #1:
		String fname1="Kevin", lname1="Hernandez",
			   address1="San Juan, PR",
			   phone1 = "(787) 435-2145";
		int age1=21;
		
		
		
		// Student/Person #2:
		String fname2="Andrea", lname2="Vazquez",
				   address2="New York, US",
				   phone2 = "(939) 567-9034";
			int age2=18; 

		Person a = new Person(fname1,lname1,address1,phone1,age1);
		Person b = new Person(fname2,lname2,address2,phone2,age2);
		
		Student c = new Student(fname1,lname1,address1,phone1,age1);
		Student d = new Student(fname2,lname2,address2,phone2,age2);
		
		while (!done) {
		a.menu();
		char option = x.next().charAt(0); 
		switch (option) {
		case 'A': case 'a':
			int[] grades = {0,0,0,0};
			System.out.print("\n---------Student Course Grades---------\n");
			for(int i=0;i<3;i++) {
				System.out.printf("Midterm #%d: ",i+1);
				grades[i]=x.nextInt();
				if (grades[i]<0 || grades[i]>50) {
					if (i==1) i=0; else i-=1;
				}
				
			}
			boolean exit=false;
			while(!exit) {
				System.out.print("Final exam: ");
				grades[3]=x.nextInt();
				if(grades[3]<0||grades[3]>100) continue;
				else exit=true;
			}
			c.setGrades(grades[0], grades[1], grades[2], grades[3]);
			String passed=""; char grade = '.';
			if(c.getGrade()<=100&&c.getGrade()>=85) {grade='A';passed="PASSED";}
				if(c.getGrade()<=85&&c.getGrade()>=78) {grade='B';passed="PASSED";}
					if(c.getGrade()<=78&&c.getGrade()>=65) {grade='C';passed="PASSED";}
						if(c.getGrade()<=65&&c.getGrade()>=40) {grade='D';passed="FAILED";}
							if(c.getGrade()<=40&&c.getGrade()>=0) {grade='F';passed="FAILED";}
			System.out.printf("\n**********************\nCOURSE GRADE: %c %2.2f\nYou (%s) the class!\n**********************\n\n",grade,c.getGrade(),passed);
			break;
		case 'B': case 'b':
			boolean exit1=false;
			int option1;
			while(!exit1) {
				System.out.printf("\n---------Personal Info---------\n1. %s\n2. %s\nChoose person: ",a.getName(),b.getName());
				option1=x.nextInt();
				switch(option1) {
				case 1:
					System.out.printf("\n\n********************\n%s\n*********************\n",a.getInfo());
					System.out.print("\nEnter 'c' to continue or 'q' to exit.");
					char answer1 = x.next().charAt(0);
					if(answer1=='q') exit1=true;
					else continue;
					break;
				case 2:
					System.out.printf("\n\n********************\n%s\n*********************\n",b.getInfo());
					System.out.print("\nEnter 'c' to continue or 'q' to exit.");
					char answer2 = x.next().charAt(0);
					if(answer2=='q') exit1=true;
					else continue;
					break;
				}
			}
			break;
		case 'C': case 'c':
			System.out.print("||Program ended||");
			done=true;
			break;
		}
		}
		
	}

}
