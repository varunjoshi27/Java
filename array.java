import java.util.Scanner;

public class array {

    public static void searcharray(int n,int size,int number[]){
         for(int i=0;i<size;i++){
            if (number[i]==n) {
                System.out.println("Found at index"+" "+i);
                return;
            }
         }
         System.out.println("Not found");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
          
        int number[]=new int[size];
        // For array input
        System.out.println("Enter the elements of the array");
          for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
          }

      System.out.println("Enter the number you want to search in array");
      int n=sc.nextInt();
       searcharray(n, size, number);

       
        
         sc.close();
    }
}