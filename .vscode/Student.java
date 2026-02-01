import java.util.Scanner;
public class Student {

    String name ;
    int rollNo;
    int age ;
     float marks;
    
        void inputdata() {
            Scanner sc =new Scanner(System.in);
            System.out.print("enter the student name:");
            name = sc.nextLine();
            System.out.print("enter the rollNo");
            rollNo = sc.nextInt();
            System.out.print("enter the marks");
            marks = sc.nextFloat();
            sc.close(); //RESOURCE PROPERTY CLOSED
        }
            //method to display data 

       void displayData(){
    
        System.out.println("rollNo :"+rollNo );
        System.out.println("marks:"+marks);
        //calculate grate

        if (marks>=90){

        System.out.println("Grate:A+");
        }
        else if(marks>=75){

        System.out.println("Grate : A");
        }
        else if(marks>=60)
        {
        System.out.println("Grate : B");
        }
        else if (marks>=40)
        {
        System.out.println("Grate : C");
        }
else
System.out.println("Grate : fail");
    
}
public static void main(String[] args)
{
Student s = new Student();
s.inputdata();
s.displayData();
}
}