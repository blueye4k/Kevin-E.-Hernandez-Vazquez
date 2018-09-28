package feb20;

import java.util.Scanner;

public class PersonTest {
	
	static boolean done = false;
	static Scanner x = new Scanner(System.in);

	public static void main(String[] args) {
		// -----STUDENTS-----
		Student1 student1 = new Student1("Kevin",21,2018);
		Student1 student2 = new Student1("Juan", 14, 1995);
		Student1 student3 = new Student1("Alejandra",20,2008);
		Student1 student4 = new Student1("Natalia",18,2017);
		
		// -----TEACHERS-----
		Teacher teacher1 = new Teacher("David",46,"INTER Bayamon");
		Teacher teacher2 = new Teacher("Laura",35,"UPR Rio Piedras");
		
		// ----TESTS-----
		while(!done) {
			// MENU
			System.out.println("\n|*|*|*|*|MENU|*|*|*|*|");
			System.out.println("1. STUDENTS");
			System.out.println("2. TEACHERS");
			System.out.println("3. QUIT");
			System.out.print("Choose Option: ");
			
			int option = x.nextInt();
			switch(option) {
			case 1: // Students
				boolean done1 = false;
				while(!done1) {
					System.out.println("\n|*|*|*|*|STUDENTS|*|*|*|*|");
					System.out.printf("1. %s\n",student1.getName());
					System.out.printf("2. %s\n",student2.getName());
					System.out.printf("3. %s\n",student3.getName());
					System.out.printf("4. %s\n",student4.getName());
					System.out.println("5. << BACK <<");
					System.out.print("Choose Option: ");
					option = x.nextInt();
					switch(option) {
					case 1: // Student 1
						System.out.println(student1.toString());
						break;
					case 2: // Student 2
						System.out.println(student2.toString());
						break;
					case 3: // Student 3
						System.out.println(student3.toString());
						break;
					case 4: // Student 4
						System.out.println(student4.toString());
						break;
					case 5: // BACK
						done1 = true;
					}
				}
				break;
			case 2: // Teachers
				boolean done2 = false;
				while(!done2) {
					System.out.println("\n|*|*|*|*|TEACHERS|*|*|*|*|");
					System.out.printf("1. %s\n",teacher1.getName());
					System.out.printf("2. %s\n",teacher2.getName());
					System.out.println("3. << BACK <<");
					System.out.print("Choose Option: ");
					option = x.nextInt();
					switch(option) {
					case 1: // Teacher 1
						System.out.println(teacher1.toString());
						break;
					case 2: // Teacher 2
						System.out.println(teacher2.toString());
						break;
					case 3: // BACK
						done2 = true;
					}
				}
				break;
			case 3: // Quit
				System.out.println("--Program ended--");
				done = true;
			}
		}

	}

}
