package SOAP;

import javax.xml.ws.Endpoint;
//Publisher for Server 1 of Service B
public class Publisher1b{
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9993/SOAP/srv1b", new server1b());
    }

}