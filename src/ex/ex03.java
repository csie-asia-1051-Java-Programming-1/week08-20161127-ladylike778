package ex;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m2 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 105021037 林建宏
 */
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int m1=scn.nextInt();
		int n2=scn.nextInt();
		int m2=scn.nextInt();
		int A[][]=new int[n1][m1];
		int B[][]=new int [n2][m2];
		int d = B[0].length;
		for(int i=0;i<n1;i++){
			for (int j=0;j<m1;j++){
				A[i][j]=scn.nextInt();
			}}
	
		for(int i=0;i<n1;i++){
			for (int j=0;j<m1;j++){
				B[i][j]=scn.nextInt();
			}
		}
		int c[][]=new int[n1][m2];
		for(int i=0;i<n1;i++){
			for(int j=0;j<m2;j++){
				for(int k=0;k<d;k++){
				
					c[i][k]+=A[i][j]*B[j][k];//運算中
				
			}
		}
			for(int i1=0;i1<d;i1++){
				for(int j=0;j<d;j++){			
					System.out.print(c[i1][j]+" ");
				}System.out.println();
			}
	
		
		
		
		
	

	}}}
