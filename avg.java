import java.util.Scanner;

public class avg {
public static int calavg(int a,int b,int c){
  int avg=(a+b+c)/3;
  return avg;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third numebr");
        int c=sc.nextInt();
        int avg=calavg(a, b, c);
        System.out.println("The avg number is"+avg);
        sc.close();
    }
}