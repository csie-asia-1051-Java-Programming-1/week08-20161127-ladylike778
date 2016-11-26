package ex;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021037 林建宏
 */
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt(); 
		System.out.println(fun(n));

	}
	public static String fun(int v1){
		if(v1/2==0)
			return Integer.toString(v1%2);
		return fun(v1/2)+(v1%2);
		
	}
	
	
	

}
