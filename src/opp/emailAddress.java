/* *****************************************************************************
 *  Name:    	  Bora ÇOBAN
 *  Student ID:   64160013
 *  Department:   Computer Engineering
 *
 *  Assignment ID: A3 Question 2 
 *
 *  Description:  Email crawler on the web. Printed on the .txt file.   
 *
 **************************************************************************** */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class emailAddress {
        
    public static void main(String[] args) {
    	
    		crawler("");
    		
			
    		
    }

    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add("http://www.medipol.edu.tr");
        listOfPendingURLs.add("http://www.itu.edu.tr");
        listOfPendingURLs.add("http://www.bilgi.edu.tr");
        listOfPendingURLs.add("http://www.sehir.edu.tr");
        listOfPendingURLs.add("http://www.ticaret.edu.tr");
        listOfPendingURLs.add("http://www.khas.edu.tr");
        listOfPendingURLs.add("http://www.dogus.edu.tr");
        listOfPendingURLs.add("http://www.ozyegin.edu.tr");
        listOfPendingURLs.add("http://www.sabanciuniv.edu.tr");
        listOfPendingURLs.add("http://www.yildiz.edu.tr");
        while (!listOfPendingURLs.isEmpty() &&
                listOfTraversedURLs.size() <=10000) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                

                for (String s: getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(s))
                        listOfPendingURLs.add(s);
                }
            }
        }
		
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();
       
    	try{
    		java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            
    		
            while (input.hasNext()) {
            	
                String line = input.nextLine();
               
    			if(line.contains("edu.tr")){
                	
    				 Pattern pattern = Pattern.compile("([a-z0-9_.-]+)@([a-z0-9_.-]+[a-z])");
    			        Matcher matcher = pattern.matcher(line);
    			 
    			        while(matcher.find()){
    			        	if(line.equals(matcher)){
    			        		FileAdd("");
    			        	}
    			        	FileAdd(matcher.group()+ " in page "+url);
    			            
    			        }
                	
                  
                }
       
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) { // Ensure that a correct URL is found
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    }
                    else
                        current = -1;
                }
                
                
                
            }
        }
        catch (Exception ex) {
            
        }

        return list;
    }
    private static void FileAdd(String text){
        try{
              File file = new File("EmailAddresses.txt");
              FileWriter writer = new FileWriter(file,true);
              BufferedWriter output = new BufferedWriter(writer);
              output.write(text);
              output.newLine();
              output.close();
              System.out.println("Ekleme Ýþlemi Baþarýlý");
        }
        catch (Exception hata){
              hata.printStackTrace();
        }
  }
}