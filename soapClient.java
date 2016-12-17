package SOAP;

import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import SOAP.ClientGatewayInt;

public class soapClient {
	public static void main(String[] args) throws Exception {
		int end = 1;
		Scanner reader = new Scanner(System.in);
		URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qname = new QName("http://SOAP/", "soapGatewayService");

        Service service = Service.create(url, qname);

        ClientGatewayInt hello = service.getPort(ClientGatewayInt.class);
        
        System.out.println("What is your IP address?");
        String IP = reader.nextLine();
        while(end == 1){
        	System.out.println("What Service do you wish to access? (A or B) or 'Exit' to end.");
            String serv = reader.nextLine();
            if(serv.toLowerCase().equals("exit")){
            	end--;
            }
            else{
                System.out.println(hello.getGateway(serv,IP));
            }
        }
        System.out.println("Program End.");
        reader.close();
    }
}
