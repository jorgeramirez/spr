
package py.gov.stp.mh.update_presupuesto;

import javax.xml.ws.WebFault;

/**
 * @author		DGTIC-STP
 * @email		dgtic@stp.gov.py 
 *
 **/

/**
 * This class was generated by Apache CXF 2.4.6
 * 2015-09-24T12:38:32.569-04:00
 * Generated source version: 2.4.6
 */

@WebFault(name = "WsException", targetNamespace = "localhost")
public class WsException_Exception extends Exception {
    
    private py.gov.stp.mh.update_presupuesto.WsException wsException;

    public WsException_Exception() {
        super();
    }
    
    public WsException_Exception(String message) {
        super(message);
    }
    
    public WsException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public WsException_Exception(String message, py.gov.stp.mh.update_presupuesto.WsException wsException) {
        super(message);
        this.wsException = wsException;
    }

    public WsException_Exception(String message, py.gov.stp.mh.update_presupuesto.WsException wsException, Throwable cause) {
        super(message, cause);
        this.wsException = wsException;
    }

    public py.gov.stp.mh.update_presupuesto.WsException getFaultInfo() {
        return this.wsException;
    }
}
