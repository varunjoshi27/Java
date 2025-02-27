import java.util.Scanner;

public class fact {

    public static void calfact(int n){
        int factorial=1;
        if (n<0) {
            System.out.println("Invalid number");
            return;
            
        }
        for(int i=n;i>=1;i--){
           factorial=factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for the factorial");
        int n=sc.nextInt();
        

        calfact(n);
        sc.close();
    }
}
