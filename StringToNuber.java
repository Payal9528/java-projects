import java.util.Scanner;
public class StringToNuber{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine().tolLowerCase();
        sc.close();
        StringBuilder result = new StringBuilder();
        for (int i=0;i<str.length();I++){
            char ch = str.charAt(i);
            if(ch>='a'&& ch<='z'){
                int num  = ch - 'a' + 1;
                result.append(num);
            }
      
        }
        System.out.println("output : "+result.toString());

        sc.close();
        
    }
}