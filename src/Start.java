import java.util.Scanner;

import com.student.manage.Student;
import com.student.manage.StudentDAO;

public class Start {

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Student Management App");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 to ADD data");
			System.out.println("Press 2 to DELETE data");
			System.out.println("Press 3 to DISPLAY data");
			System.out.println("Press 4 to EXIT");
			
			int option = sc.nextInt();
			if(option == 1) {
				//first collect the student data	
				System.out.println("Enter the student id: ");
				int id = sc.nextInt();
				
				System.out.println("Enter the student name: ");
				String name = sc.next();
				
				System.out.println("Enter the student department: ");
				String dept = sc.next();

				System.out.println("Enter the student hometown: ");
				String city = sc.next();
				
				System.out.println("Enter the student email: ");
				String mail = sc.next();
				
				//create the student object
				Student s = new Student(id, name, dept, city, mail);
				boolean ans = StudentDAO.insertDataToDB(s);
				if(ans == true) {
					System.out.println("Data added successfully");
				}
				else {
					System.out.println("Error occured");
				}
				System.out.println(s);
			}
			
			else if(option == 2) {
				//delete data
				System.out.println("Enter the student id to delete: ");
				int id = sc.nextInt();
				
				boolean ans = StudentDAO.deleteDataToDB(id);
				if(ans == true) {
					System.out.println("Data removed successfully");
				}
				else {
					System.out.println("Error occured");
				}
				
			}
			
			else if(option == 3) {
				//display data
				StudentDAO.showDataInDB();
			}
			else if(option == 4) { 
				break;
			}
			else {
				
			}
		}
		System.out.println("Thank you for using the app");
	}
	
}
