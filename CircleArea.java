import java.util.Scanner ;
class CircleArea {
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print ("enter radius of circle");
    double redius = sc.nextDouble();
    double area = 3.14259*redius*redius;
    System.out.println("Area of circle" +area);
    sc.close();
}
}
    