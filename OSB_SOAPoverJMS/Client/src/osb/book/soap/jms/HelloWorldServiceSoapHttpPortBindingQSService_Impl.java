package osb.book.soap.jms;

/**
 * Generated class, do not edit.
 *
 * This service class was generated by weblogic
 * webservice stub gen on Sat Jun 11 22:38:09 CEST 2011 */

public class HelloWorldServiceSoapHttpPortBindingQSService_Impl     extends weblogic.wsee.jaxrpc.ServiceImpl
     implements osb.book.soap.jms.HelloWorldServiceSoapHttpPortBindingQSService {

  public HelloWorldServiceSoapHttpPortBindingQSService_Impl() throws javax.xml.rpc.ServiceException {
    this("osb/book/soap/jms/HelloWorldServiceSoapHttpPortBindingQSService_saved_wsdl.wsdl", null);
  }
  
  public HelloWorldServiceSoapHttpPortBindingQSService_Impl(String wsdlurl) throws javax.xml.rpc.ServiceException {
    this(wsdlurl, null);
  }
  
  public HelloWorldServiceSoapHttpPortBindingQSService_Impl(String wsdlurl, weblogic.wsee.connection.transport.TransportInfo transportInfo) throws javax.xml.rpc.ServiceException {
    super(wsdlurl,
          new javax.xml.namespace.QName("http://wsrm.osbbook", "HelloWorldServiceSoapHttpPortBindingQSService"),
          "osb/book/soap/jms/HelloWorldServiceSoapHttpPortBindingQSService_internaldd.xml", transportInfo);
  }
  
  //***********************************
  // Port Name: HelloWorldServiceSoapHttpPortBindingQSPort 
  // Port Type: HelloWorldService 
  //***********************************

  osb.book.soap.jms.HelloWorldService mvar_HelloWorldServiceSoapHttpPortBindingQSPort;

  /**
   * returns HelloWorldServiceSoapHttpPortBindingQSPort port in this service 
   */
  public osb.book.soap.jms.HelloWorldService getHelloWorldServiceSoapHttpPortBindingQSPort() 
    throws javax.xml.rpc.ServiceException
  {

    if (mvar_HelloWorldServiceSoapHttpPortBindingQSPort == null) {
      mvar_HelloWorldServiceSoapHttpPortBindingQSPort =
        new osb.book.soap.jms.HelloWorldService_Stub(_getPort("HelloWorldServiceSoapHttpPortBindingQSPort"), this);
    }

    if (transportInfo != null && 
        transportInfo instanceof weblogic.wsee.connection.transport.http.HttpTransportInfo) {
      ((javax.xml.rpc.Stub)mvar_HelloWorldServiceSoapHttpPortBindingQSPort)._setProperty(
        "weblogic.wsee.connection.transportinfo", 
        (weblogic.wsee.connection.transport.http.HttpTransportInfo)transportInfo);
    }
    
    return mvar_HelloWorldServiceSoapHttpPortBindingQSPort;
  }

  /**
   * @deprecated  Use getHelloWorldServiceSoapHttpPortBindingQSPort(byte[] username, byte[] password)
   */
  public osb.book.soap.jms.HelloWorldService getHelloWorldServiceSoapHttpPortBindingQSPort(String username, String password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username.getBytes());
      httpInfo.setPassword(password.getBytes());
      transportInfo = httpInfo;
    }
    return getHelloWorldServiceSoapHttpPortBindingQSPort();
  }

  public osb.book.soap.jms.HelloWorldService getHelloWorldServiceSoapHttpPortBindingQSPort(byte[] username, byte[] password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username);
      httpInfo.setPassword(password);
      transportInfo = httpInfo;
    }
    return getHelloWorldServiceSoapHttpPortBindingQSPort();
  }
  
  
}