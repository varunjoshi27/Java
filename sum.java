import java.util.Scanner;

public class sum {
  public static int prtsum(int a,int b){
    int mul=a*b;
    return mul;
  }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int mul=prtsum(a, b);
        System.out.println("The mul of 2 numbers is "+mul);
        sc.close();
    }
}
