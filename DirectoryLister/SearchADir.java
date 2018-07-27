package DirectoryLister;
import java.io.File;
import java.util.ArrayList;

public class SearchADir {
	
	ArrayList<String> files;
	public SearchADir () {
		 files = new ArrayList<>();
	}
	
	 void findFiles (String directory ) {
		 
		File file = new File ( directory);
		
		//System.out.println("\nwe're at " + file.getName() );
		
		if (file.isDirectory())  {	
			
			System.out.println("Directory: " + file.getName() );
			File [] newFileList = file.listFiles();
			for (File childFile : newFileList ) {
				findFiles(childFile.getPath());
			}
			
		}
		else   {
			System.out.println( "File : " + file.getName() );
			files.add(file.getPath());	
		}
	}
	
	 
	 
	 
	 
	public static void main (String ...args ) {
		String sample = "C:\\Users\\adiverma1\\eclipse-workspace\\MyFirstProject\\bin";
		SearchADir sd = new SearchADir();
		sd.findFiles(sample);
		for ( String f : sd.files ) {
			System.out.println( f);
		}
		
	}
}
