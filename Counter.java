import java.util.*;
import java.util.function.*;


public class Counter{
    static <T> int count(Collection<T> col,Predicate<T> pre){
        int count = 0;
        for(T ele : col){
            if(pre.test(ele)){
                count+=1;
            }
        }

        return count;
    }

    static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    static boolean isOdd(int num){
        if(num%2!=0){
            return true;
        }else{
            return false;
        }
    }

    static boolean isPalindrome(String str){
        String rev = new StringBuilder(str).reverse().toString();
        return rev.equals(str);
    }

    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        for (int i = 0; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,33,4,5,5);
        List<String> str = Arrays.asList("abc","def","abcba","efgfe");

        System.out.println("even :"+ count(list, Counter::isEven));
        System.out.println("palindrome "+ count(str,n->isPalindrome(n)));

    }

}