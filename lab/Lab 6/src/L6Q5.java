/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IVORY LIONG JIN EARN
 */
import java.util.Scanner;
import java.util.Random;
public class L6Q5 {
    public static boolean results(int n1, int n2, int n3){
        return(n1*n2==n3);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int num3;
        int score=0;
        do{
        System.out.println("Enter negative number to quit.");
        int num1= ran.nextInt(13);
        int num2= ran.nextInt(13);
        System.out.print(num1+" x "+num2+" = ");
        num3= sc.nextInt();
        if(results(num1,num2,num3)==true){
            score++;
        }
        }while(num3>=0);
        System.out.println("Your score is "+score);
    }
}