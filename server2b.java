package SOAP;
import javax.jws.WebService;

@WebService(endpointInterface = "SOAP.ServiceBInterface")
public class server2b {
	int numReq = 0;
	public String getServerB() {
		numReq++;
		   return "Service: B\nServer: 2";
	    }
}