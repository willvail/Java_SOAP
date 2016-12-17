package SOAP;

import javax.xml.ws.Endpoint;

import SOAP.soapGateway;
//Publisher for the Gateway
public class GatewayPublisher {
	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:9999/ws/hello", new soapGateway());
	    }
}
