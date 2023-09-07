import java.io.*;
import java.util.*;

public class Main {    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());
        long[] arr = new long[num];
        int max =0,ans=0;
        for(int i=0; i< num ; i++) {
        	arr[i]= sc.nextInt();
        }
        
        for(int i=0; i<num;i++) {
        	int tmp =0 ;
        	double preSlope = 99999999999d;
        	for(int j=i-1;j>=0;j--) {
        		double tmpSlope=(double)(arr[j]-arr[i])/(double)(j-i);
        		if(preSlope>tmpSlope) {
        			tmp++;
        			preSlope = tmpSlope;
        		}
        	}
        	
        	preSlope = -99999999999d;
        	for(int j=i+1;j<num;j++) {
        		double tmpSlope=(double)(arr[j]-arr[i])/(double)(j-i);			
        		if(preSlope<tmpSlope) {
        			tmp++;
        			preSlope = tmpSlope;
        		}
        	}
        	
        	ans = Math.max(ans, tmp);
        }
       
        System.out.println(ans);
        
    }    
    
}