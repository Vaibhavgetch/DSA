package com.learn.code;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt() ;
		    int m = sc.nextInt() ;

		    int[][] arr = new int[n][m] ;
		    for (int i = 0 ; i < n ; i++) {
		      for (int j = 0 ; j < m ; j++) {
		        arr[i][j] = sc.nextInt() ;
		      }
		    }
		        int frow =0 , fcol=0 , lrow=n-1 , lcol=m-1 ;
		        int count = 0 ;
		        int tn = m*n ;
		        
		     while(count < tn){
		         
		         for(int j = fcol ; j <=lcol && count<tn; j++){
		             int i = frow ;
		             System.out.print(arr[i][j]+" ");
		                 count++ ;
		         }
		         frow++ ;
		         
		         for(int i = frow ; i <=lrow && count<tn; i++){
		             int j = lcol ;
		             System.out.print(arr[i][j]+" ");
		                 count++ ;
		         }
		         lcol-- ;
		         
		         for(int j = lcol ; j >=fcol && count<tn; j--){
		             int i = lrow ;
		             System.out.print(arr[i][j]+" ");
		                 count++ ;
		         }
		         lrow-- ;
		         
		         for(int i = lrow ; i >=frow && count<tn; i--){
		             int j = fcol ;
		             System.out.print(arr[i][j]+" ");
		                 count++ ;
		         }
		         fcol++ ;
		     } 
		     
		     System.out.println();
		      frow=0 ;fcol=0 ; lcol=m-1;lrow=n-1 ;
		      count = 0 ;
		     
		     while(count < tn){
		         
		         for(int i = frow ; i <=lrow && count<tn;i++){
		            int j=fcol ;
		             System.out.print(arr[i][j]+" ") ; 
		             count++ ;
		         }
		         fcol++;
		         for(int i = fcol ; i <=lcol && count<tn;i++){
		             int j=lrow ;
		             System.out.print(arr[j][i]+" ") ;
		             count++ ;
		             
		         }
		         lrow--;
		         for(int i = lrow ; i >=frow && count<tn ;i--){
		             int j=lcol ;
		             System.out.print(arr[i][j]+" ") ;
		             count++ ;
		         }
		         lcol--;
		          for(int i = lcol ; i >=fcol && count<tn;i--){
		             int j=frow ;
		             System.out.print(arr[j][i]+" ") ;
		             count++ ;
		         }
		         frow++ ;
		         
		         
		     }
		     

	}

}
