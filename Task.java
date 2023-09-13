package YandexHandBook;

import java.util.Scanner;

public class Task{
    public static int recursion(int n){
        if(n<0) return 0;
        if(n==1 || n==0)
            return 1;
        else
            return n*recursion(n-1);
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n);
        int k = scan.nextInt();
        System.out.println(k);
        int a = recursion(n);
        System.out.println(a);
        int b = recursion(k);
        System.out.println(b);
        int c = recursion(n-k);
        System.out.println(c);
        int result = a/b/c;
        System.out.println(result);
    }
}

