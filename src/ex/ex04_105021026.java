package ex;

import java.util.Scanner;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 105021026 周永振老師
 */

public class ex04_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入一連串數字:");
		Scanner scn = new Scanner(System.in);
		String a = scn.nextLine();
		int b = a.length();
		int c = Integer.parseInt(a);
		int sum = 0;
		for (int u = 0; u < (b+1); u++) {
			sum =(c%10) + sum;
			c=c/10;
		}
		System.out.print(sum);
	}

}
