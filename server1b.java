package SOAP;
import javax.jws.WebService;

@WebService(endpointInterface = "SOAP.ServiceBInterface")
public class server1b {
	int numReq = 0;
	public String getServerB() {
		numReq++;
		   return "Service: B\nServer: 1";
	    }
}