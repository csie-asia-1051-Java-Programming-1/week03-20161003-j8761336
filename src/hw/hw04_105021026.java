package hw;
import java.util.Scanner;
public class hw04_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入一正數:");
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		int c = 1;
		while(a>0){
			c = c*a;
			a--;
		}
		System.out.print(c);
	}
	

}
