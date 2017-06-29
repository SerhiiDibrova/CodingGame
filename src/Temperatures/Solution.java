package Temperatures;
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
        int n = in.nextInt(); // the number of temperatures to analyse
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        // the n temperatures expressed as integers ranging from -273 to 5526

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        if(n>0){
        	
        	int nearest = Integer.MAX_VALUE;
        	for (int i = 0 ; i < n ; i++) {
    			int a= in.nextInt();
    			nearest = (Math.abs(a) < Math.abs(nearest) || a == Math.abs(nearest)) ? a : nearest;
    		}
        	
        	System.out.println(nearest);
        }else{
        	System.out.println(0);
        }
    }
}