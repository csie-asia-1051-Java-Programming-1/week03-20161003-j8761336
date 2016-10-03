package ex;
import java.util.Scanner;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021026 周永振老師
 */

public class ex03_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入一個字元");
		Scanner scn =new Scanner(System.in);
		char a =scn.next().charAt(0);
		if(a>=65 && a<=90){
			System.out.print((a+32));
		}
		else if(a>=97 && a<=122){
			System.out.print((a-32));
		}
		else{
			System.out.print("這不是英文字母喔");
		}
	}

}
