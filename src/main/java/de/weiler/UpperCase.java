import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperCase {
	
	
    public static void main(String[] args) throws IOException {
    	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
	    System.out.print("Geben Sie etwas ein: ");
	    String eingabe = br.readLine();
	   	      
	    System.out.println("Umgewandelt:" + eingabe.toUpperCase());
	}

}
