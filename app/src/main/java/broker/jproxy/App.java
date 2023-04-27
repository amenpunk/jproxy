package broker.jproxy;

import javax.xml.ws.Service;
import broker.jproxy.*;
import java.net.URL;
import broker.jproxy.ArrayOfString;

public class App {

  public static void main(String[] args)  throws Exception {
    // consumir el servicio WSSecurityUsernameService en el metodo stockQuoteRequest
    // URL url = new URL("https://brokergt.pagekite.me/WSSecurityUsernameCodeService/WSSecurityUsernameService.asmx?WSDL");
    URL url = new URL("http://brokergt.pagekite.me/WSSecurityUsernameCode/WSSecurityUsernameService.asmx");
    WSSecurityUsernameService security_service = new WSSecurityUsernameService(url);
    WSSecurityUsernameServiceSoap soap = security_service.getWSSecurityUsernameServiceSoap();
    ArrayOfString a = new ArrayOfString();
    soap.stockQuoteRequest(a);

  }

}
