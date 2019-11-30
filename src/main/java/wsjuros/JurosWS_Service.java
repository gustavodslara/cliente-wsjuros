
package wsjuros;

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
@WebServiceClient(name = "JurosWS", targetNamespace = "http://juros.ws/", wsdlLocation = "http://desktop-kuvofv3:8080/JurosServer/JurosWS?wsdl")
public class JurosWS_Service
    extends Service
{

    private final static URL JUROSWS_WSDL_LOCATION;
    private final static WebServiceException JUROSWS_EXCEPTION;
    private final static QName JUROSWS_QNAME = new QName("http://juros.ws/", "JurosWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://desktop-kuvofv3:8080/JurosServer/JurosWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        JUROSWS_WSDL_LOCATION = url;
        JUROSWS_EXCEPTION = e;
    }

    public JurosWS_Service() {
        super(__getWsdlLocation(), JUROSWS_QNAME);
    }

    public JurosWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), JUROSWS_QNAME, features);
    }

    public JurosWS_Service(URL wsdlLocation) {
        super(wsdlLocation, JUROSWS_QNAME);
    }

    public JurosWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, JUROSWS_QNAME, features);
    }

    public JurosWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JurosWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns JurosWS
     */
    @WebEndpoint(name = "JurosWSPort")
    public JurosWS getJurosWSPort() {
        return super.getPort(new QName("http://juros.ws/", "JurosWSPort"), JurosWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JurosWS
     */
    @WebEndpoint(name = "JurosWSPort")
    public JurosWS getJurosWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://juros.ws/", "JurosWSPort"), JurosWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (JUROSWS_EXCEPTION!= null) {
            throw JUROSWS_EXCEPTION;
        }
        return JUROSWS_WSDL_LOCATION;
    }

}
