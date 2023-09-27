package marklist;
import java.util.Scanner;


public class listmarks {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalMarks1 = 0; int totalMarks2 = 0; int totalMarks3 = 0; int total = 0; int studTotal = 0;
		double average = 0;
		String grade; String result;
		int[] rollNo = new int[4]; int[] mark1 = new int[4]; int [] mark2 = new int[4]; int[] mark3 = new int[4];
		String[] studname = new String[4];
		Scanner scanner = new Scanner(System.in);
		

		for(int i = 0; i<=3; i++) {
			System.out.println("Enter the roll no for student " +(i+1) + ":");
			rollNo[i] = scanner.nextInt();
			System.out.println("Enter student name");
			studname[i] = scanner.next();
			System.out.println("Enter Mark1");
			mark1[i]=scanner.nextInt();
			System.out.println("Enter Mark2");
			mark2[i]=scanner.nextInt();
			System.out.println("Enter Mark3");
			mark3[i]=scanner.nextInt();
			totalMarks1 += mark1[i];
			totalMarks2 += mark2[i];
			totalMarks3 += mark3[i];
			studTotal = mark1[i] + mark2[i] + mark3[i];
			total = totalMarks1 + totalMarks2 + totalMarks3;
			average = studTotal/3;
		
		}
		if (average > 79) {
			grade = "A";
		} else if(average > 74) {
			grade = "B+";
		} else if(average > 64) {
			grade = "B";
		} else if(average > 54) {
			grade = "C+";
		} else if(average > 49) {
			grade = "C";
		} else if(average > 39) {
			grade = "D";
		} else {
			grade = "F";
		}
		if (average > 39) {
			result = "P";
		} else {
			result = "F";
		}
		
		
				
		System.out.println("******************************************************************************************************");
		System.out.println("\t\t\t\t STUDENT MARKLIST");
		System.out.println("******************************************************************************************************");
		System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");
		for(int i = 0; i<=3; i++) {
			System.out.println(rollNo[i]+ "\t" + studname[i] +"\t" + mark1[i] +"\t" + mark2[i] +"\t" + mark3[i] +"\t" + studTotal +"\t" + result +"\t" + average +"\t" + grade);
		}
		
		
		
		
		
		
		scanner.close();
		
		

	}

}
