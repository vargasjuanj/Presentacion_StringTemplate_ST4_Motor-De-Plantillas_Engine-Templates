import org.stringtemplate.v4.*;
import java.util.List;
import java.util.ArrayList;
import java.time.*;
import java.time.format.*;

public class Tipo{
	public static void main (String [] args){

List<String> tipos = new ArrayList<>();
tipos.add("int");
tipos.add("double");
tipos.add("otro");

STGroup dateGroup = new STGroupFile("tipo.stg");
ST st = dateGroup.getInstanceOf("raiz");
st.add("tipos", tipos);

System.out.println(st.render());
		
	}
}