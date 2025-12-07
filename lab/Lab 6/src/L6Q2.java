/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IVORY LIONG JIN EARN
 */
public class L6Q2 {
    public static void main(String[] args) {
        multiPrint(10,'*');
        System.out.println("\nTriangles");
        for(int i=1;i<=5;i++){
            multiPrint(i,'*');
            System.out.println();
        }
        System.out.println("\nDiamonds");
        int height=3;
        for (int i = 1; i <= height; i++) {
            multiPrint(height - i, ' ');      
            multiPrint(2 * i - 1, '*');       
            System.out.println();
        }
        for (int i = height - 1; i >= 1; i--) {
            multiPrint(height - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
        
    }
    public static void multiPrint(int n, char c){
        for(int i=1;i<=n;i++){
            System.out.print(c);
        }
    }
    
}
