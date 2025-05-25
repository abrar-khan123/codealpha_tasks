import java.util.ArrayList;
import java.util.*;
class Student
{
	String name;
    int score;
	Student(String name,int score) 
	{
		this.name=name;
		this.score=score;
	}
}
public class StudentGradeTracker
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		ArrayList<Student> students=new ArrayList<>();
		System.out.println("Welcome to Student Grade Tracker");
		System.out.print("Enter number of students: ");
		int count=scanner.nextInt();
		scanner.nextLine(); 
		for(int i=0;i<count;i++)
		{
			System.out.print("Enter name of student "+(i+1)+": ");
			String name = scanner.nextLine();
			System.out.print("Enter score for "+name+": ");
			int score=scanner.nextInt();
			scanner.nextLine();
			students.add(new Student(name,score));
		}
		int total=0;
		int highest=Integer.MIN_VALUE;
		int lowest=Integer.MAX_VALUE;
		String topStudent="",bottomStudent="";
		for (int i=0;i<students.size();i++)
		{
			Student s=students.get(i);
			total+=s.score;
			if(s.score>highest)
			{
				highest=s.score;
				topStudent=s.name;
			}
			if(s.score<lowest)
			{
				lowest=s.score;
				bottomStudent=s.name;
			}
		}	
		double average=(double)total/count;
		System.out.println("\nStudent Grade Summary Report:");
		System.out.printf("Average Score: %.2f\n", average);
		System.out.println("Highest Score: "+highest+" by "+topStudent);
		System.out.println("Lowest Score : "+lowest+" by "+bottomStudent);
		System.out.println("\n All Students:");
		for(int i=0;i<students.size();i++)//print output
		{
			Student s=students.get(i);
			System.out.println(s.name+" - "+s.score);
		}
		scanner.close();
	}
}
