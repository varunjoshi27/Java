import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input;
        do{
        System.out.println("Enter the marks");
            int marks=sc.nextInt();
             if (marks>=90 && marks<=100) {
                System.out.println("This is Good");
             }else if(marks>=60 && marks<=89){
                System.out.println("This is also good");
            
             } else if( marks>=0 && marks<=59){
                System.out.println("This is good as well");
             }
             else{
                System.out.println("Invalid");
             }


             System.out.println("Do you want to continue ? 1- yes 0- no");
             input=sc.nextInt();
        }while(input==1);
        sc.close();
    }
}