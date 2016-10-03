package ex;
import java.util.Scanner;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021026 周永振老師
 */

public class ex05_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入一正整數:");
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		if(a%2 == 0){
			System.out.print("這是偶數");
		}
		else if (a == 0){
			System.out.print("這是偶數");
		}
		else{
			System.out.print("這是奇數");
		}
	}

}
