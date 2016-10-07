package hw;
import java.util.Scanner;
public class hw02_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入要幾個 ,再依序輸入數字:");
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		int c = 0;
		int d = 0;
		int e = 0;
		for(int v=0; v<a ; v++){
		int b =scn.nextInt();
		if(b>0){
			c++;
		}
		else if(b==0){
			d++;
		}
		else{
			e++;
		}}
		System.out.print("正數"+c+"個");
		System.out.print("零"+d+"個");
		System.out.print("負數"+e+"個");
	}

}
