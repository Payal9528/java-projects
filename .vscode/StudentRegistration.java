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
        System.out.println("enter age");
      age = sc.nextInt();
      if(age>17){
        System.out.println("Age not avalible");
       age +=17;
      }
    
    else if(age<=18){
      System.out.println("age is avalible for registration");
age +=35;
 System.out.println("enter phone number");
     phone = sc.nextLine();
    System.out.println("enter e-mail");
     email = sc.nextLine();
    System.out.println("enter branch");
    branch = sc.nextLine();
}
else{
  System.out.println(" student not avalible");
}
    sc.close();
     }
  
 void DisplayData(){
  System.out.println("fill registretion");
   System.out.println("enter name" +name);
   System.out.println("enter e-imail" +email);
   System.out.println("enter phone number" +phone);
   System.out.println("enter branch" +branch);
 }
  
   public static void main (String [] args){
   StudentRegistration s1 = new StudentRegistration();
   s1.inputData();
   s1.DisplayData();
   }
}
