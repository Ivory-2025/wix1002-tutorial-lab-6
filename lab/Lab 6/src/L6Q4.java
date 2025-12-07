/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IVORY LIONG JIN EARN
 */
public class L6Q4 {
    public static void main(String[] args) {
        int gcd1 = GCD(24, 8);
        int gcd2 = GCD(200, 625);
        System.out.println("GCD of (24, 8) = " + gcd1);
        System.out.println("GCD of (200, 625) = " + gcd2);
    }
    public static int GCD(int num1, int num2){
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num1;
    }
}
