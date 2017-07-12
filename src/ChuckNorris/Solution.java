package ChuckNorris;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args){
		 Scanner in = new Scanner(System.in);
	        String text = in.nextLine();
	        String binaire = "";
	        for (char car : text.toCharArray()) {
	            String letterInBinary = Integer.toBinaryString(car);
	            while (letterInBinary.length() < 7) {
	                letterInBinary = "0" + letterInBinary;
	            }
	            binaire += letterInBinary;
	        }

	        char lastChar = '2';

	        for (char car : binaire.toCharArray()) {
	            if (car == lastChar) {
	                System.out.print("0");
	            } else {
	                if (lastChar != '2') {
	                    System.out.print(" ");
	                }
	                lastChar = car;
	                if (lastChar == '0') {
	                    System.out.print("0");
	                }
	                System.out.print("0 0");
	            }
	        }

	}

}
