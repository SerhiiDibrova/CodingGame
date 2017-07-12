package MimeType;

import java.util.*;
import java.util.Scanner;

public class Solution {
	 public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int N = in.nextInt(); // Number of elements which make up the association table.
	        int Q = in.nextInt(); // Number Q of file names to be analyzed.
	        Map<String, String> mimeType = new HashMap<String, String>();
	        List<String> files = new ArrayList<String>();
	        for (int i = 0; i < N; i++) {
	            String EXT = in.next(); // file extension
	            String MT = in.next(); // MIME type.
	            mimeType.put(EXT.toLowerCase(), MT);
	            
	        }
	        in.nextLine();
	        for (int i = 0; i < Q; i++) {
	            String FNAME = in.nextLine(); // One file name per line.
	            files.add(FNAME.toLowerCase());
	        }
for(String file:files){
	int point = file.lastIndexOf(".");
	String ext = file.substring(point+1);
	//System.out.println(ext);
	 if( point == -1 || !ext.matches("\\w+") ) {
         System.out.println("UNKNOWN"); 
     }
     else { 
        if (mimeType.keySet().contains(ext)) {
             System.out.println(mimeType.get(ext));
         }
         else {
            System.out.println("UNKNOWN"); 
         }    
     }
}
            
}
}
