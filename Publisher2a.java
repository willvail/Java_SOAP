package SOAP;

import javax.xml.ws.Endpoint;
//Publisher for Server 2 of Service A
public class Publisher2a{
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9992/SOAP/srv2a", new server2a());
    }

}