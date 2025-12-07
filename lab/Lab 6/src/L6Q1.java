/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IVORY LIONG JIN EARN
 */
public class L6Q1 {
    public static void main(String[] args) {
        TriangularNumbers();
    }
    public static void TriangularNumbers(){
        int i=0;
        int sum=0;
        do{
           i++;
           sum+=i;
           System.out.println(sum);
        }while(i<=20);
    }
}
