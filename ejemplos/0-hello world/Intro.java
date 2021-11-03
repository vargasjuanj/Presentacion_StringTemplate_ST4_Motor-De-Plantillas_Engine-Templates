
import org.stringtemplate.v4.*;

public class Intro {
	public static void main (String [] args){

ST st = new ST("Hola, <nombre>");

st.add("nombre","juan");
		
		System.out.println(st.render());
	}
	
}