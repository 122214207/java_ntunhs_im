package Hw2;

import java.util.Scanner;
import java.util.Random;

public class Hw2_2 {
	public static void main(String args[]) {
		Random rand = new Random();
		int ans=rand.nextInt(100);
		int guess=0;
		int Max=100;
		int Min=1;
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("請輸入一個數字");
			guess=sc.nextInt();
			
			int validate_num=ans-guess;
			if(validate_num>0) {
				System.out.println("在"+guess+"到"+Max+"間");
				Min=guess;
				
			}else if(validate_num<0){
				System.out.println("在"+Min+"到"+guess+"間");
				Max=guess;
			}else{
				System.out.println("你猜對了!");
				break;
			}
		}

	}

}
