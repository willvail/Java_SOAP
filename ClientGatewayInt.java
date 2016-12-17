package SOAP;
import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import SOAP.ClientGatewayInt;
@WebService
@SOAPBinding(style = Style.RPC)
public interface ClientGatewayInt  {
	@WebMethod String getGateway(String dest, String IP);
}
