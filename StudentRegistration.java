import java.util.Scanner;
 public class StudentRegistration{
    int age;
        String name;
    String  phone;
    String  email;
    String  branch;
    void inputData(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name");
    name = sc.nextLine();
        System.out.print("enter age");
      age = sc.nextInt();
     if(agr<=18){
      System.out.println("age is avalible for registration");
age +=35;}

     System.out.println("enter phone");
     phone = sc.nextLine();
    System.out.println("enter e-mail");
     email = sc.nextLine();
    System.out.println("enter branch");
    branch = sc.nextLine();
    sc.close();
     }
  
 void DisplayData(){
  System.out.println("fill registretion");
   System.out.println("enter name" +name);
   System.out.println("enter e-imail" +email);
   System.out.println("enter phone no" +phone);
   System.out.println("enter branch" +branch);
 }
  
   public static void main (String [] args){
   StudentRegistration s1 = new StudentRegistration();
   s1.inputData();
   s1.DisplayData();
   }
}
