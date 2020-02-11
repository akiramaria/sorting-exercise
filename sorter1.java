package sorter1;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class sorter1 {

		public static void main(String[] args) {
			//initialization
			File namelist = new File("G:\\Eclipse\\sorter1\\src\\sorter1\\unsorted-names-list.txt" );
			ArrayList<String> nameList = new ArrayList<String>(12);
			ArrayList<String> sortedList = new ArrayList<String>(12);
			
			try {
				Scanner sc = new Scanner(namelist);
				
				while(sc.hasNextLine()) {
					String inputNames = sc.nextLine();
					
					String s[] = inputNames.split(" "); 
			        String ans = ""; 
			        for (int i = s.length - 1; i >= 0; i--) { 
			            ans += s[i] + " "; 
			            
			        }
			        nameList.add(ans);
			        nameList.sort(Comparator.naturalOrder());
			        
				}
	
				
				//reverse back to first names basis
				for (String k : nameList){
					String t[] = k.split(" "); 
			        String ans1 = ""; 
					for (int j = t.length - 1; j >= 0; j--) { 
			            ans1 += t[j] + " "; 
			        }
					
					sortedList.add(ans1);
					
				}
				System.out.println(sortedList);
		        
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//now add list to an external file
			try {
				FileWriter output = new FileWriter("G:\\Eclipse\\sorter1\\src\\sorter1\\sorted-names-list.txt");
				PrintWriter printWriter = new PrintWriter(output);
				
				for (String k : sortedList) {
					printWriter.println(k);
				}
		        
		        printWriter.close();
		        
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
			
		}
}
