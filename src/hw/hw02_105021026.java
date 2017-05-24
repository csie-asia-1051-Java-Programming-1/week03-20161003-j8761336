package hw;
import java.util.Scanner;
public class hw02_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int positive =0;
		int negative=0;
		int ze=0;
		char checkChar;
		while(true){
			int a=scn.nextInt();
			if(a>0){
				positive++;
			}else if(a==0){
				ze++;
			}else if(a<0){
				negative++;
			}
			System.out.println("是否繼續(任意案件/N)");
			checkChar=scn.next().charAt(0);
			if(checkChar=='N'||checkChar=='n'){
				System.out.println("正數"+positive+"個");
				System.out.println("負數"+negative+"個");
				System.out.println("零有"+ze+"個");
				System.out.println("3Q");
				break;
			}
		}

	}

}
