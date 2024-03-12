/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Hw3_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx=0;
		int num=30;
		int arr[]= new int[30];
		
		for (int i=0; i<num; i++) {
			arr[i]=sc.nextInt();
		}
		idx = num -1;
		
		while(idx>=0){
		    System.out.printf("arr[%d]:%d\n", idx , arr[idx]);
		    idx=idx-1;
		}
	}
}
