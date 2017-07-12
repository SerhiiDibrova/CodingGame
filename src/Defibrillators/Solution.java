package Defibrillators;
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
        String LON = in.nextLine().replace(',','.');
        String LAT = in.nextLine().replace(',','.');
        int N = in.nextInt();
        double betterDistance = Float.MAX_VALUE;
        String answer=null;
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            String longDef = DEFIB.split(";")[4].replace(',', '.');
            String latDef = DEFIB.split(";")[5].replace(',', '.');
            double distance = distance(LON, LAT, longDef, latDef);
            if(distance<betterDistance){
            	  betterDistance = distance;
                  answer = DEFIB.split(";")[1];
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(answer);
    }
    public static double distance(String longA, String latA, String longB, String latB) {
        double longARad = Double.parseDouble(longA) * Math.PI / 180d;
        double latARad = Double.parseDouble(latA) * Math.PI / 180d;
        double longBRad = Double.parseDouble(longB) * Math.PI / 180d;
        double latBRad = Double.parseDouble(latB) * Math.PI / 180d;

        double x = (longBRad - longARad) * Math.cos((latARad + latBRad) / 2d);
        double y = latBRad - latARad;

        return Math.sqrt(x*x + y*y) * 6371;
    }
}