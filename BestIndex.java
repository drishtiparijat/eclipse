package arrays;

import java.util.*;

public class BestIndex {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        long max=Integer.MIN_VALUE;
        long sum = Long.MIN_VALUE;

        for(int i =0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0 ; i<n ; i++){
           sum = 0;
           sum= sum + a[i];
           int j =2 ;
           int p = i;
           while(j+p<n){
               for(int k=1; k<=j ;k++){
                   p=p+1;
                   sum = sum + a[p]; 
               }
               j++;
           }
           if(sum>max){
               max=sum;
           }
        }
        System.out.println(max);

      

    }
}
