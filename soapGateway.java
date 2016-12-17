package SOAP;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import SOAP.ServiceAInterface;
import SOAP.ServiceBInterface;

@WebService(endpointInterface = "SOAP.ClientGatewayInt")
public class soapGateway implements ClientGatewayInt{
	int x = 0, y = 0, logNum = 0;String[] portLog = new String[100];
	public String getGateway(String dest,String IP) {
		String src = "";
		if(dest.equals("A")||dest.equals("a")){
			x++;logNum++;
			if(x%2 == 0){
				portLog[logNum]="Service Incoming: " + IP + " Port: 9991";
				try{
					URL url = new URL("http://localhost:9991/SOAP/srv1a?wsdl");
					
					QName qname = new QName("http://SOAP/", "server1aService");
		
				    Service service1 = Service.create(url, qname);									//create a service using the given URL with the Name
				    ServiceAInterface srv1a = service1.getPort(ServiceAInterface.class);			//create our internal service and attach it to the real one using HelloWorld as the interface
				    
				    src = srv1a.getServerA();														//the output is = to srv1a and go to service A to find that
				} catch (MalformedURLException e){
					e.printStackTrace();
				}
			}
			else{
				portLog[logNum]="Service Incoming: " + IP + " Port: 9992";
				try{
					URL url = new URL("http://localhost:9992/SOAP/srv2a?wsdl");
					
					QName qname = new QName("http://SOAP/", "server2aService");
		
				    Service service1 = Service.create(url, qname);									//create a service using the given URL with the Name
				    ServiceAInterface srv2a = service1.getPort(ServiceAInterface.class);			//create our internal service and attach it to the real one using HelloWorld as the interface
				    
				    src = srv2a.getServerA();						//the output is = to srv2a and go to service A to find that
				} catch (MalformedURLException e){
					e.printStackTrace();
				}
			}
			return src ;
		}
		else if(dest.equals("B")||dest.equals("b")){
			y++;logNum++;
			if(y%2 == 0){
				portLog[logNum]="Service Incoming: " + IP + " Port: 9993";
				try{
					URL url = new URL("http://localhost:9993/SOAP/srv1b?wsdl");
					
					QName qname = new QName("http://SOAP/", "server1bService");
		
				    Service service2 = Service.create(url, qname);									//create a service using the given URL with the Name
				    ServiceBInterface srv1b = service2.getPort(ServiceBInterface.class);			//create our internal service and attach it to the real one using HelloWorld as the interface
				    
				    src = srv1b.getServerB();							//the output is = to srv1b and go to service B to find that
				} catch (MalformedURLException e){
					e.printStackTrace();
				}
			}
			else{
				portLog[logNum]="Service Incoming: " + IP + " Port: 9994";
				try{
					URL url = new URL("http://localhost:9994/SOAP/srv2b?wsdl");
					
					QName qname = new QName("http://SOAP/", "server2bService");
		
				    Service service2 = Service.create(url, qname);									//create a service using the given URL with the Name
				    ServiceBInterface srv2b = service2.getPort(ServiceBInterface.class);			//create our internal service and attach it to the real one using HelloWorld as the interface
				    
				    src = srv2b.getServerB();							//the output is = to srv2b and go to service B to find that
				} catch (MalformedURLException e){
					e.printStackTrace();
				}
			}
			return src ;
		}
		else{
			return "Error: Neither Service A or B were choosen.";				
		}
	}
}
