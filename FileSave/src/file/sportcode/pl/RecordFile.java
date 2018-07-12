package file.sportcode.pl;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class RecordFile 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		PrintWriter save = new PrintWriter("file.txt") ;
		save.println("Zapis do pliku");
		save.close();
	}
}
