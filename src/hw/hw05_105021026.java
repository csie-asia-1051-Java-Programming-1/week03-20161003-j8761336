package hw;
import java.util.Scanner;
public class hw05_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入一正數:");
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		int b =0;
		for(int c=a;c>0;c--){
			b = b + (c*(c+1));
		}
		System.out.print(b);
	}

}
