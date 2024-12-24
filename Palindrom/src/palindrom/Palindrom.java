/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrom;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author mustafayigitguzel
 */
public class Palindrom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner fileIn = null;  // Initializes fileIn to an empty object
		try
		{
			// Attempt to open the file
			fileIn = new Scanner(
				new FileInputStream("words.txt"));
		}


		catch (FileNotFoundException e)
		{
			// If the file could not be found, this code is executed
			// and then the program exits
			System.out.println("File not found.");
			System.exit(0);
		}
		String word;
		String longest="";
             	 String shortest="";
                	 int sayac=0;
		while (fileIn.hasNext())
		{
			word = fileIn.next();
			//System.out.println(word);
			// Check if palindrome
			int start, end;
			start = 0;
			end = word.length()-1;
			boolean isPalindrome = true;
			while ((start < end) && (isPalindrome==true)) 
			{
				if (word.charAt(start)!=word.charAt(end))
					isPalindrome = false;
				start++;
				end--;
			}
			if (isPalindrome)
			{
				System.out.println(word);
	                                     sayac++;
				if (word.length() >= longest.length())
				{
					longest = word;
				} 
                                if (shortest.equals("")) shortest=word;
                                else {
                                    if (word.length() < shortest.length())
                                        shortest=word;
                                }
			}
		}
		System.out.println("En son bulunan en uzun palindrome:"+longest);
                	System.out.println("Ilk bulunan en kısa palindrome:"+shortest);
                	System.out.println("Toplam palindrome sayısı:"+sayac);

		fileIn.close();

    }
    
}
