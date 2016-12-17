package SOAP;

import javax.xml.ws.Endpoint;
//Publisher for Server 1 of Service A
public class Publisher1a{
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9991/SOAP/srv1a", new server1a());
    }

}