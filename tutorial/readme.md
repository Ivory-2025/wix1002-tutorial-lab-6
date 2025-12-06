# Tutorial 6 Methods
-----

1. Write statements for each of the following:  
	a. Define a static method that returns the maximum number from 3 integer parameters.  
	```
	public static int num(int num1, int num2, int num3){
		if(num1>num2){
			if(num1>num3){
				return num1;
			}else{
				return num3;
			}
		}else{
			if(num2>num3){
				return num2;
			}else{
				return num3;
			}
		}
	}
	```

	b. Define a static method that that determine whether the given integer is a square number.  
	```
	public static boolean SquareNum(int num){
		int square=(int)Math.sqrt(num);
		return((square*square)==num);
	}
	```

	c. Define a static method that use to compute combination function `C(n,k)`.  `C(n,k)` gives the number of different k-element subsets that can be found in a given set of n elements. `C(n,k) = n! / (k! (n-k)!`  
	```
	public static int CombinationFunction(int n, int k){
		int sum=1;
		for(int i=1;i<=n;i++){
			sum=sum*i; 
		}
		int sum1=1;
		for(int i=1;i<=k;i++){
            sum1=sum1*i;
		}
		int sum2=1;
		for(int i=1;i<=(n-k);i++){
			sum2=sum2*i;
		}
		int c=sum/(sum1*sum2);
        return c;
	}
	```

	d. Define a static method that used to determine whether the parameter is a pentagonal number. A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon. `Pn = ½ n(3n -1)`  
	```
	public static boolean PentagonalNum(int n, int Pn){
		int results= ((n)*((3*n)-1))/2;
		return(results==Pn);
	}
	```

	e. Define a static method that displays the number of letters and the number of digits of a String parameter.  
	```
	public static void string(String s){
		int suml=0;
		int sumd=0;
		for(int i=0;i<=s.length();i++){
			char ch= s.charAt(i);
			if((ch<='z'&&ch>='a')||(ch>='A'&&ch<='Z')){
				suml++;
			}
			if(ch>='0'&&ch<='9'){
				sumd++;
			}
		}
		System.out.println("The number of letters: "+suml);
		System.out.println("The number of digits: "+sumd);
	}
	```

	f. Define a static void method that generates 10 random numbers within 0 to 100 to the method’s parameter. The random numbers can be accessed by the main method.  
	```
	public static void ranNum(int[]list){
		Random rand= new Random();
		for(int i=0;i<10;i++){
			list[i]=rand.nextInt(101);
			System.out.print(list[i]+" ");
		}
	}
	```

	g. Define a static void method that returns the area and the circumference of a circle given the argument is radius. `Area = πr2` and `Circumference = 2 πr`.  
	```
	public static void circle(double r){
		double area=Math.PI*r*r;
		double circumference=2*Math.PI*r;
		System.out.printf("The area of a circle is %.2f\n",area);
		System.out.printf("The circumference of a circle is %.2f\n",circumference);
	}
	```
	h. Define a static method that generate random number within 0 – 10. The method will return the first random number that generate twice.  
	```
	public static int ranNum(){
		Random rand = new Random();
		boolean isDupli=false;
		int num;
		int num1;
		do{
			num=rand.nextInt(11);
			if(num==num1){
				isDupli=true;
			}else{
				num1=num;
			}
		}while(isDupli==false);
		return num1;
	}
	```

2. Write a program that consists of a method that can display three numbers in decreasing order.
```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class ThreeNumbers{
	public static void DecreasingOrder(Integer[]num){
		Arrays.sort(num, Collections.reverseOrder());
		System.out.println(Arrays.toString(num));
	}
	/* 
	public static void DecreasingOrder(int[]num){
		Arrays.sort(num);
		int temp;
		for(int i=2;i>=0;i--){
			temp=num[i];
			num[i]=num[i-1];
			num[i-1]=temp;
		}
		System.out.print(Array.toString(num));
	}
    public static void DecreasingOrder(int[]num){
		Arrays.sort(num);
		for(int i=2;i>=0;i--){
			System.out.print(num[i]+" ");
		}
	} 
	*/

public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	Integer[]number=new Integer[3];
	//int[]num=new int[3];
	System.out.println("Enter three numbers");
	for(int i=0;i<3;i++){
		number[i]=sc.nextInt();
	}
    DecreasingOrder(number);
}
}
```