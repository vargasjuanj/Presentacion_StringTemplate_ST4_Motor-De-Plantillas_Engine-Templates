import org.stringtemplate.v4.*;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class CrearVarios {
	public static void main(String [] args){
		
		STGroup crear = new STGroupFile("crear-varios.stg");
		
		ST raiz = crear.getInstanceOf("raiz");
		raiz.add("nombre","juan");
		raiz.add("nombreArchivo","estilo");
		
		ST estilo = crear.getInstanceOf("estilo");
		estilo.add("color","red");
		
		//System.out.println(raiz.render());
		
		try{
			File file = new File("resultado.html");
			file.createNewFile();
		
			File file2 = new File("estilo.css");
			file2.createNewFile();
			
			
			
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(raiz.render());
			
			bw.close();
			
			
			FileWriter fw2 = new FileWriter(file2);
			
			BufferedWriter bw2 = new BufferedWriter(fw2);
			
			bw2.write(estilo.render());
			
			bw2.close();
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}
	
}