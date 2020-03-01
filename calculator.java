package Depot;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

                System.out.println("Please enter two numbers: ");
                Scanner get=new Scanner(System.in);
                int x=get.nextInt();
                int y=get.nextInt();
                get.nextLine();
                System.out.println("Please enter operation : ");
                char op = get.nextLine().charAt(0);
                System.out.println(add(x,y,op));
            }
            public static int add (int x,int y, char op)
            {
                if(op=='+')
                    return x+y;
                else if(op=='*')
                    return x*y;
                else if(op=='/')
                    return x/y;
                else
                    return x-y;
            }}