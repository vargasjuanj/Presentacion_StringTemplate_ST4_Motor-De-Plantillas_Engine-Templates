import org.stringtemplate.v4.*;

public class Transpilar {
	
	public static void main (String [] args){
    
	STGroup java1_4 = new STGroupFile("Java1_4.stg");
    STGroup java1_5 = new STGroupFile("Java1_5.stg");
    System.out.println( getCode(java1_4) );
    System.out.println( getCode(java1_5) );
}
	public static String getCode(STGroup java) {
    ST cl = java.getInstanceOf("class"); // create class
    cl.add("name", "T");
    ST consts = java.getInstanceOf("constants");
    consts.add("typename", "MyEnum");
    consts.add("names", new String[] {"A","B"});
    cl.add("members", consts); // add constants as a member
    return cl.render();
		
	}
}