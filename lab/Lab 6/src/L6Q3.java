/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IVORY LIONG JIN EARN
 */
public class L6Q3 {
    public static void main(String[] args) {
        int[]array= {15,23,36,49,51,62,78,98,123,456};
        reverseNum(array);
    }
    public static void reverseNum(int[]Array){
        for(int i=0;i<10;i++){
            int num=Array[i];
            int rev=0;
            
            while(num!=0){
                int digit= num%10;
                rev=rev*10+digit;
                num/=10;
            }
            Array[i]=rev;
            System.out.print(Array[i]+" ");
        }
    }
}
