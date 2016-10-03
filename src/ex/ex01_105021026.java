package ex;
import java.util.Scanner;
/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 105021026 周永振老師
 */

public class ex01_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入一個字串:");
		Scanner scn =new Scanner(System.in);
		String a =scn.nextLine();
		String b =new StringBuilder(a).reverse().toString();
		System.out.print(b);
	}

}
