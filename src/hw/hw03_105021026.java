package hw;
import java.util.Scanner;
public class hw03_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入一正數:");
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		int c = 1;
		for(int b=a;b>0;b--){
			c = c* b;
		}
		System.out.print(a+"!="+c);
	}

}
