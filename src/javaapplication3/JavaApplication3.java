/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;
import java.util.Scanner;

/**
 *
 * @author ITUNU
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("simple arithmetic code");
        Scanner input=new Scanner(System.in);
        System.out.println("please supply a digit between 1 and 4");
        int option=input.nextInt();
        System.out.println();
        int a;
        int b;
        int c;
        switch (option){
        case 1: 
        System.out.println("this will perform an addition operation");
        System.out.println("values please");
        b=input.nextInt();
        c=input.nextInt();
        a=b+c;
        System.out.println("the sum is " + a);
        break;
        case 2:
        System.out.println("this will perform a multiplication operation");
        System.out.println("your values please");
        b=input.nextInt();
        c=input.nextInt();
        a=b*c;
        System.out.println("the multiple is " + a);
        break;
        case 3: 
        System.out.println("this will perform a positive subtraction operation");
        System.out.println("values please");
        b=input.nextInt();
        c=input.nextInt();
        if (b>c){
        a=b-c;
        System.out.println("the difference is " + a);
        }else{
            a = c-b;
            System.out.println("the difference is " + a);
        }break;
        case 4:  
        System.out.println("this will perform a positive division operation");
        System.out.println("your values please");
        b=input.nextInt();
        c=input.nextInt();
        if (b>c){
        a=b/c;
        System.out.println("the difference is " + a);
        }else{
            a = c/b;
            System.out.println("the difference is " + a);
        }break;
        default:
        System.out.println("an invalid selection");
        System.out.println("written: ITUNUOLUWA, VERSION 1.1, DATE: 03-12-2014");
        // TODO code application logic here
    }
    }
}
