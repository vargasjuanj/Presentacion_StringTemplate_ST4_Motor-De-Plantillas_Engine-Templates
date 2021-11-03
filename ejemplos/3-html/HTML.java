import org.stringtemplate.v4.*;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class HTML {
	public static void main(String [] args){
		
		STGroup html = new STGroupFile("html.stg");
		ST raiz = html.getInstanceOf("raiz");
		raiz.add("nombre","pedro");		
		
		try{
			File file = new File("resultado.html");
			file.createNewFile();
			
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(raiz.render());
			
			bw.close();
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}
	
}