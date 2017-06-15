import java.io.PrintStream;
import java.util.Map;

public class SignUp {
	
	public void post(String request, String query, PrintStream out, String body, Map<String, String> fromServer) {
		out.println("HTTP/1.1 200 OK");
		String ret = 
				"<h1>KidSpace Server got the signup request</h1>"+
		        "<p>Body:</p><p>"+body+"</p>";
		
		String [] params = body.split("&");
		ret = ret + "<ul>";
		for(String p : params) {
			ret = ret + "<li>"+p+"</li>";
		}
		ret = ret + "</ul>";
		
		SoftServe.sendContent(out, "text/html", ret);				 
	}

}
