package SOAP;

import javax.xml.ws.Endpoint;
//Publisher for Server 2 of Service B
public class Publisher2b{
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9994/SOAP/srv2b", new server2b());
    }

}