// Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user enters
// two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2
// are not integers, the program would throw a Number Format Exception. If Num2 were zero, the
// program would throw an Arithmetic Exception. Display the exception.

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
       

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a");
            String a = sc.nextLine();
            System.out.println("enter b");
            String b = sc.nextLine();
    
            int a1 = Integer.parseInt(a);
            int b1 = Integer.parseInt(b);
            
            int ans = a1/b1;
            System.out.println("ans is :"+ans);

        //    int[] arr = {1,2,3};
        //    System.out.println(arr[4]);

        }catch(NumberFormatException e){
            System.out.println("invalid input");
        }catch(ArithmeticException e){
            System.out.println("cant divide by 0");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("accessing out of bound");
        }finally{
            System.out.println("extecuted");
        }

    }
}
