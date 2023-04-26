
package broker.jproxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSSecurityUsernameService", targetNamespace = "http://stockservice.contoso.com/wse/samples/2005/10", wsdlLocation = "https://brokergt.pagekite.me/WSSecurityUsernameCodeService/WSSecurityUsernameService.asmx?WSDL")
public class WSSecurityUsernameService
    extends Service
{

    private final static URL WSSECURITYUSERNAMESERVICE_WSDL_LOCATION;
    private final static WebServiceException WSSECURITYUSERNAMESERVICE_EXCEPTION;
    private final static QName WSSECURITYUSERNAMESERVICE_QNAME = new QName("http://stockservice.contoso.com/wse/samples/2005/10", "WSSecurityUsernameService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://brokergt.pagekite.me/WSSecurityUsernameCodeService/WSSecurityUsernameService.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSSECURITYUSERNAMESERVICE_WSDL_LOCATION = url;
        WSSECURITYUSERNAMESERVICE_EXCEPTION = e;
    }

    public WSSecurityUsernameService() {
        super(__getWsdlLocation(), WSSECURITYUSERNAMESERVICE_QNAME);
    }

    public WSSecurityUsernameService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSSECURITYUSERNAMESERVICE_QNAME, features);
    }

    public WSSecurityUsernameService(URL wsdlLocation) {
        super(wsdlLocation, WSSECURITYUSERNAMESERVICE_QNAME);
    }

    public WSSecurityUsernameService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSSECURITYUSERNAMESERVICE_QNAME, features);
    }

    public WSSecurityUsernameService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSSecurityUsernameService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSSecurityUsernameServiceSoap
     */
    @WebEndpoint(name = "WSSecurityUsernameServiceSoap")
    public WSSecurityUsernameServiceSoap getWSSecurityUsernameServiceSoap() {
        return super.getPort(new QName("http://stockservice.contoso.com/wse/samples/2005/10", "WSSecurityUsernameServiceSoap"), WSSecurityUsernameServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSSecurityUsernameServiceSoap
     */
    @WebEndpoint(name = "WSSecurityUsernameServiceSoap")
    public WSSecurityUsernameServiceSoap getWSSecurityUsernameServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://stockservice.contoso.com/wse/samples/2005/10", "WSSecurityUsernameServiceSoap"), WSSecurityUsernameServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSSECURITYUSERNAMESERVICE_EXCEPTION!= null) {
            throw WSSECURITYUSERNAMESERVICE_EXCEPTION;
        }
        return WSSECURITYUSERNAMESERVICE_WSDL_LOCATION;
    }

}