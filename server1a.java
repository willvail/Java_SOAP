package SOAP;
import javax.jws.WebService;

@WebService(endpointInterface = "SOAP.ServiceAInterface")
public class server1a {
	int numReq = 0;
	public String getServerA() {
		numReq++;
		   return "Service: A\nServer: 1";
	    }
}
