/**
 * maxOutOf3Numbers
 */
import java.util.Scanner;


class maxOutOf3Numbers {
public static void main(String[] args) 
{
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter the value of a,b,c =>");
    int a =  myObj.nextInt();
    int b =  myObj.nextInt();
    int c =  myObj.nextInt();
    
    if (a>b && a>c) {
        System.out.println("a is greater");
    }
    else if (a<b && b>c) {
        System.out.println("b is greater");
    }
    else if (a==b) {
        System.out.println("a is equal to b");
    }
    else if (b==c) {
        System.out.println("b is equal to c");
    }
    else if (c==a) {
        System.out.println("a is equal to c");
    }
    else{
        System.out.println("c is greater");
    }
}
    
}