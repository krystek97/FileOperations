package file.sportcode.pl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("file.txt") ;
		Scanner in = new Scanner(file) ;
		
		String sentence = in.nextLine() ;
		System.out.println(sentence);
	}
}
