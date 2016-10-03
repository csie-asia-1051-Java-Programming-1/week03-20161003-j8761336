package ex;
import java.util.Scanner;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 105021026 周永振老師
 */

public class ex02_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入一個字元:");
		Scanner scn =new Scanner(System.in);
		char a =scn.next().charAt(0);
		if(a>=65 && a<=90){
			System.out.print("這是大寫");
		}
		else if(a>=97 && a<=122){
			System.out.print("這是小寫");
		}
		else{
			System.out.print("這是其他字元");
		}
	}

}
