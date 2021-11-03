import org.stringtemplate.v4.*;
public class Comparacion{
	
	public static void main (String [] args){
		
	String nombre = "pedro";
	String direccion = "Av Las Heras 132";
	int edad = 66;
	
	
	String query = "SELECT * FROM clientes WHERE nombre = " + nombre
	+ ",direccion = " + direccion 
	+ ",edad = " + edad;
	
	
//A continuación, tenemos StringBuilder. En general, se considera una mejor práctica utilizar StringBuilder debido a su perfil de rendimiento.

StringBuilder queryBuilder = new StringBuilder ( 
	 "SELECT * from clientes WHERE nombre =").append (nombre) 
	 .append( ",direccion = ").append(direccion)
	 .append(",edad = ").append(edad);
	

	
	String mensaje = "Hola" 
 + "Estimado," + nombre + ",\n" 
 + "Con dirección en " + direccion +"\n"
 + "Y edad de " + edad + "\n"
 + "Permítame informarle de mi deseo de" 
 + "entablar una relación comercial con usted." 
 + "Creo que es un " 
 +" de buena reputación y persona responsable y de confianza \n" 
 +" con la que puedo hacer negocios a partir de la " 
 +" pequeña información que recopilé sobre ti " 
 +" durante mi búsqueda de un socio y por " 
 +" asunto de confianza. No debe dudar en confiarte " 
 +" para este sencillo y sincero negocio. ";
 
// Esto de arriba es complicad, ademas si deseamos darle cierto tipo de formato se complica más. 

//Solución: usar un motor de plantillas , en este caso StringTemplate que separa perfectamente el modelo de la vista.
ST queryTemplate = new ST ("SELECT * from clientes WHERE nombre = '<name>', direccion = '<address>', edad = <age>"); 

queryTemplate.add ("name", nombre); 
queryTemplate.add ("address", direccion); 
queryTemplate.add ("age", edad); 
System.out.println (queryTemplate.render());

//System.out.println (query);
//System.out.println (querBuilder.toString());
//System.out.println (mensaje);
 
}
	
}