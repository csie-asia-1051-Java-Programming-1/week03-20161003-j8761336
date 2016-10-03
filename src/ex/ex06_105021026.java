package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021026 周永振老師
 */

public class ex06_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入x:");
		Scanner scn =new Scanner(System.in);
		int x =scn.nextInt();
		if(x < -1){
			System.out.print("y=" + 3*x*x);
		}
		else if(-1 <= x && x <=1){
			System.out.print("y=" + (x*x*x+3*x-3));
		}
		else {
			System.out.print("y=" + (2*x+3));
		}
	}

}
