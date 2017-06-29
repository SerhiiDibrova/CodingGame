package HorseRacingDuals;

import java.util.*;
import java.io.*;
import java.math.*;


/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
      
     Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            arr[i]=pi;
        }

        Arrays.sort(arr);
        int answer = Integer.MAX_VALUE;
        for( int i =0 ; i<arr.length-1;i++){
        	int current = arr[i];
        	int next = arr[i+1];
        	int sum = next - current;
        	if(sum < answer){
        		answer=sum;
        	}
        }
        System.out.println(answer);
    }
}