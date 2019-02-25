
package com.yesmywine.logistics.rushDelivery;

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
@WebServiceClient(name = "ZJSTracking", targetNamespace = "http://edi.zjs.vientiane.rushDelivery/", wsdlLocation = "http://1.202.169.32:8002/svst/tracking.asmx?WSDL")
public class ZJSTracking
    extends Service
{

    private final static URL ZJSTRACKING_WSDL_LOCATION;
    private final static WebServiceException ZJSTRACKING_EXCEPTION;
    private final static QName ZJSTRACKING_QNAME = new QName("http://edi.zjs.vientiane.rushDelivery/", "ZJSTracking");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://1.202.169.32:8002/svst/tracking.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ZJSTRACKING_WSDL_LOCATION = url;
        ZJSTRACKING_EXCEPTION = e;
    }

    public ZJSTracking() {
        super(__getWsdlLocation(), ZJSTRACKING_QNAME);
    }

    public ZJSTracking(WebServiceFeature... features) {
        super(__getWsdlLocation(), ZJSTRACKING_QNAME, features);
    }

    public ZJSTracking(URL wsdlLocation) {
        super(wsdlLocation, ZJSTRACKING_QNAME);
    }

    public ZJSTracking(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ZJSTRACKING_QNAME, features);
    }

    public ZJSTracking(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZJSTracking(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ZJSTrackingSoap
     */
    @WebEndpoint(name = "ZJSTrackingSoap")
    public ZJSTrackingSoap getZJSTrackingSoap() {
        return super.getPort(new QName("http://edi.zjs.vientiane.rushDelivery/", "ZJSTrackingSoap"), ZJSTrackingSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZJSTrackingSoap
     */
    @WebEndpoint(name = "ZJSTrackingSoap")
    public ZJSTrackingSoap getZJSTrackingSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://edi.zjs.vientiane.rushDelivery/", "ZJSTrackingSoap"), ZJSTrackingSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ZJSTRACKING_EXCEPTION!= null) {
            throw ZJSTRACKING_EXCEPTION;
        }
        return ZJSTRACKING_WSDL_LOCATION;
    }

}
