package hw;
/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 105021037 林建宏
 */
import java.util.*;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt(); 
		int a=0;
		String k=fun(n);
		System.out.println(k);
		for(int i=0;i<k.length();i++){
			if(k.substring(i, i+1).equals("1")){
				a+=1;
			}
		}System.out.println(a);
		

	}
	public static String fun(int v1){
		if(v1/2==0)
			return Integer.toString(v1%2);
		return fun(v1/2)+(v1%2);
		
		
	}
	

	

	}
