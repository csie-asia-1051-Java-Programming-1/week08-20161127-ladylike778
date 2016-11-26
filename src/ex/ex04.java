package ex;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 10502137 林建宏
 */
import java.util.*;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		cal cal=new cal();
		float a =scn.nextFloat();
		char c =scn.next().charAt(0);
		float b = 0;
		if(c=='+'|| c=='-'||c=='*'||c=='/'){
			b =scn.nextFloat();	
		}
		System.out.println(cal.cal(a,b,c));
		
	}
}
class cal {
	


	public static float cal(float a,float b,char c) {
		// TODO Auto-generated method stub
		float sum=0;
		switch(c){
		
		case '+':
			sum=a+b;
			break;
		case '-':
			sum=a-b;
			break;
		case '*':
			sum=a*b;
			break;
		case '/':
			sum=a/b;
			break;
		case '^':
			sum=(float)Math.pow(a,2);
			break;
		case '3':
			sum=(float)Math.pow(a,3);
			break;
		case 'l':
			sum=(float)Math.sqrt(a);
			break;
		default:
			System.out.println("wrong");
			break;
		}
		
		
		return sum;
	}



	}


