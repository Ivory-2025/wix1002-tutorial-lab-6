/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IVORY LIONG JIN EARN
 */
public class L6Q6 {
    public static boolean PalindromicPrime(int n){
            if(n<2){
                return false;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            int reversed=0;
            int digit;
            int ori=n;
            while(n>0){
                digit=n%10;
                reversed=reversed*10+digit;
                n/=10;
            }
            if(reversed!=ori){
                return false;
            }
            return true;
}
    
    public static boolean Emirp(int n){
            if(n<2){
                return false;
            }
            int reversed=0;
            int digit;
            int ori=n;
            while(n>0){
                digit=n%10;
                reversed=reversed*10+digit;
                n/=10;
            }
            if(reversed==ori){
                return false;
            }
            for(int i=2;i<=Math.sqrt(ori);i++){
                if(ori%i==0){
                    return false;
                }
            }
            for(int i=2;i<=Math.sqrt(reversed);i++){
                if(reversed%i==0){
                    return false;
                }
            }
                return true;
}
    
    public static void main(String[] args) {
        System.out.println("First 20 Palindromic Primes: ");
        int Pcount=0;
        int Ecount=0;
        int num=2;
        while(Pcount<20){
            if(PalindromicPrime(num)==true){
                System.out.print(num+" ");
                Pcount++;
            }
            num++;
        }
        System.out.println();
        
        System.out.println("First 20 Emirps: ");
        num=2;
        while(Ecount<20){
            if(Emirp(num)==true){
                System.out.print(num+" ");
                Ecount++;
            }
            num++;
        }
    }
}
