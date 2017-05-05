package py.gov.stp.mh.update_presupuesto;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * @author		DGTIC-STP
 * @email		dgtic@stp.gov.py 
 *
 **/

/**
 * This class was generated by Apache CXF 2.4.6
 * 2015-09-24T12:38:32.603-04:00
 * Generated source version: 2.4.6
 * 
 */
@WebService(targetNamespace = "localhost", name = "UpdatesPresupuesto")
@XmlSeeAlso({ObjectFactory.class})
public interface UpdatesPresupuesto {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "actualizarEntidad", targetNamespace = "localhost", className = "py.gov.stp.mh.update_presupuesto.ActualizarEntidad")
    @WebMethod
    @ResponseWrapper(localName = "actualizarEntidadResponse", targetNamespace = "localhost", className = "py.gov.stp.mh.update_presupuesto.ActualizarEntidadResponse")
    public java.lang.Short actualizarEntidad(
        @WebParam(name = "anio", targetNamespace = "")
        java.lang.Short anio,
        @WebParam(name = "nivel", targetNamespace = "")
        java.lang.Short nivel,
        @WebParam(name = "entidad", targetNamespace = "")
        java.lang.Short entidad,
        @WebParam(name = "changeNombreEntidad", targetNamespace = "")
        java.lang.String changeNombreEntidad,
        @WebParam(name = "changeAbrevEntidad", targetNamespace = "")
        java.lang.String changeAbrevEntidad,
        @WebParam(name = "changeSigla", targetNamespace = "")
        java.lang.String changeSigla,
        @WebParam(name = "changeRuc", targetNamespace = "")
        java.lang.String changeRuc,
        @WebParam(name = "changeBaseLegal", targetNamespace = "")
        java.lang.String changeBaseLegal,
        @WebParam(name = "changeMision", targetNamespace = "")
        java.lang.String changeMision,
        @WebParam(name = "changePolitica", targetNamespace = "")
        java.lang.String changePolitica,
        @WebParam(name = "changeObjetivo", targetNamespace = "")
        java.lang.String changeObjetivo,
        @WebParam(name = "changeDiagnostico", targetNamespace = "")
        java.lang.String changeDiagnostico
    ) throws WsException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "actualizarProyecto", targetNamespace = "localhost", className = "py.gov.stp.mh.update_presupuesto.ActualizarProyecto")
    @WebMethod
    @ResponseWrapper(localName = "actualizarProyectoResponse", targetNamespace = "localhost", className = "py.gov.stp.mh.update_presupuesto.ActualizarProyectoResponse")
    public java.lang.Short actualizarProyecto(
        @WebParam(name = "anio", targetNamespace = "")
        java.lang.Short anio,
        @WebParam(name = "nivel", targetNamespace = "")
        java.lang.Short nivel,
        @WebParam(name = "entidad", targetNamespace = "")
        java.lang.Short entidad,
        @WebParam(name = "tipoPrograma", targetNamespace = "")
        java.lang.Short tipoPrograma,
        @WebParam(name = "codigoPrograma", targetNamespace = "")
        java.lang.Short codigoPrograma,
        @WebParam(name = "codigoSubprograma", targetNamespace = "")
        java.lang.Short codigoSubprograma,
        @WebParam(name = "codigoProyecto", targetNamespace = "")
        java.lang.Short codigoProyecto,
        @WebParam(name = "changeUnrCodigo", targetNamespace = "")
        java.lang.Short changeUnrCodigo,
        @WebParam(name = "changeNombreProyecto", targetNamespace = "")
        java.lang.String changeNombreProyecto,
        @WebParam(name = "changeAbrevProyecto", targetNamespace = "")
        java.lang.String changeAbrevProyecto,
        @WebParam(name = "changeDescripcion", targetNamespace = "")
        java.lang.String changeDescripcion,
        @WebParam(name = "changeCodigoDepto", targetNamespace = "")
        java.lang.Short changeCodigoDepto,
        @WebParam(name = "changeResultadoEsperado", targetNamespace = "")
        java.lang.String changeResultadoEsperado,
        @WebParam(name = "changeDiagnostico", targetNamespace = "")
        java.lang.String changeDiagnostico,
        @WebParam(name = "changeCodigoFuncional", targetNamespace = "")
        java.lang.Short changeCodigoFuncional
    ) throws WsException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "actualizarPrograma", targetNamespace = "localhost", className = "py.gov.stp.mh.update_presupuesto.ActualizarPrograma")
    @WebMethod
    @ResponseWrapper(localName = "actualizarProgramaResponse", targetNamespace = "localhost", className = "py.gov.stp.mh.update_presupuesto.ActualizarProgramaResponse")
    public java.lang.Short actualizarPrograma(
        @WebParam(name = "anio", targetNamespace = "")
        java.lang.Short anio,
        @WebParam(name = "nivel", targetNamespace = "")
        java.lang.Short nivel,
        @WebParam(name = "entidad", targetNamespace = "")
        java.lang.Short entidad,
        @WebParam(name = "tipoPrograma", targetNamespace = "")
        java.lang.Short tipoPrograma,
        @WebParam(name = "codigoPrograma", targetNamespace = "")
        java.lang.Short codigoPrograma,
        @WebParam(name = "changeNombrePrograma", targetNamespace = "")
        java.lang.String changeNombrePrograma,
        @WebParam(name = "changeAbrevPrograma", targetNamespace = "")
        java.lang.String changeAbrevPrograma,
        @WebParam(name = "changeDescripcion", targetNamespace = "")
        java.lang.String changeDescripcion,
        @WebParam(name = "changeBaseLegal", targetNamespace = "")
        java.lang.String changeBaseLegal,
        @WebParam(name = "changeResultado", targetNamespace = "")
        java.lang.String changeResultado,
        @WebParam(name = "changeCodigoDepto", targetNamespace = "")
        java.lang.Short changeCodigoDepto,
        @WebParam(name = "changeObjetivo", targetNamespace = "")
        java.lang.String changeObjetivo,
        @WebParam(name = "changeDiagnostico", targetNamespace = "")
        java.lang.String changeDiagnostico
    ) throws WsException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "actualizarSubprograma", targetNamespace = "localhost", className = "py.gov.stp.mh.update_presupuesto.ActualizarSubprograma")
    @WebMethod
    @ResponseWrapper(localName = "actualizarSubprogramaResponse", targetNamespace = "localhost", className = "py.gov.stp.mh.update_presupuesto.ActualizarSubprogramaResponse")
    public java.lang.Short actualizarSubprograma(
        @WebParam(name = "anio", targetNamespace = "")
        java.lang.Short anio,
        @WebParam(name = "nivel", targetNamespace = "")
        java.lang.Short nivel,
        @WebParam(name = "entidad", targetNamespace = "")
        java.lang.Short entidad,
        @WebParam(name = "tipoPrograma", targetNamespace = "")
        java.lang.Short tipoPrograma,
        @WebParam(name = "codigoPrograma", targetNamespace = "")
        java.lang.Short codigoPrograma,
        @WebParam(name = "codigoSubprograma", targetNamespace = "")
        java.lang.Short codigoSubprograma,
        @WebParam(name = "changeNombreSubprograma", targetNamespace = "")
        java.lang.String changeNombreSubprograma,
        @WebParam(name = "changeAbrevSubprograma", targetNamespace = "")
        java.lang.String changeAbrevSubprograma,
        @WebParam(name = "changeDescripcion", targetNamespace = "")
        java.lang.String changeDescripcion,
        @WebParam(name = "changeCodigoDepto", targetNamespace = "")
        java.lang.Short changeCodigoDepto,
        @WebParam(name = "changeObjetivo", targetNamespace = "")
        java.lang.String changeObjetivo
    ) throws WsException_Exception;
}
