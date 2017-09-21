package py.gov.stp.mh.proyectopresupuesto;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
@author		DGTIC-STP
@email      dgtic@stp.gov.py
*/

/**
 * This class was generated by Apache CXF 2.4.6
 * 2016-07-25T08:27:15.898-04:00
 * Generated source version: 2.4.6
 * 
 */
@WebService(targetNamespace = "localhost", name = "ProyectoPresupuesto")
@XmlSeeAlso({ObjectFactory.class})
public interface ProyectoPresupuesto {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "obtenerProyecto_AsignacionFinancieraProductos", targetNamespace = "localhost", className = "py.gov.stp.mh.proyectopresupuesto.ObtenerProyectoAsignacionFinancieraProductos")
    @WebMethod(operationName = "obtenerProyecto_AsignacionFinancieraProductos")
    @ResponseWrapper(localName = "obtenerProyecto_AsignacionFinancieraProductosResponse", targetNamespace = "localhost", className = "py.gov.stp.mh.proyectopresupuesto.ObtenerProyectoAsignacionFinancieraProductosResponse")
   public java.util.List<py.gov.stp.mh.proyectopresupuesto.AsignFinanProducto> obtenerProyectoAsignacionFinancieraProductos(
        @WebParam(name = "anio", targetNamespace = "")
        java.lang.Integer anio,
        @WebParam(name = "nivel", targetNamespace = "")
        java.lang.Integer nivel,
        @WebParam(name = "entidad", targetNamespace = "")
        java.lang.Integer entidad,
        @WebParam(name = "version", targetNamespace = "")
        java.lang.Integer version
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "obtenerProyecto_PresupuestoDeGastos", targetNamespace = "localhost", className = "py.gov.stp.mh.proyectopresupuesto.ObtenerProyectoPresupuestoDeGastos")
    @WebMethod(operationName = "obtenerProyecto_PresupuestoDeGastos")
    @ResponseWrapper(localName = "obtenerProyecto_PresupuestoDeGastosResponse", targetNamespace = "localhost", className = "py.gov.stp.mh.proyectopresupuesto.ObtenerProyectoPresupuestoDeGastosResponse")
    public java.util.List<py.gov.stp.mh.proyectopresupuesto.PresupuestoGasto> obtenerProyectoPresupuestoDeGastos(
        @WebParam(name = "anio", targetNamespace = "")
        java.lang.Integer anio,
        @WebParam(name = "nivel", targetNamespace = "")
        java.lang.Integer nivel,
        @WebParam(name = "entidad", targetNamespace = "")
        java.lang.Integer entidad,
        @WebParam(name = "version", targetNamespace = "")
        java.lang.Integer version
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "obtenerProyecto_FundamentacionDeGastos", targetNamespace = "localhost", className = "py.gov.stp.mh.proyectopresupuesto.ObtenerProyectoFundamentacionDeGastos")
    @WebMethod(operationName = "obtenerProyecto_FundamentacionDeGastos")
    @ResponseWrapper(localName = "obtenerProyecto_FundamentacionDeGastosResponse", targetNamespace = "localhost", className = "py.gov.stp.mh.proyectopresupuesto.ObtenerProyectoFundamentacionDeGastosResponse")
    public java.util.List<py.gov.stp.mh.proyectopresupuesto.FundamentacionGasto> obtenerProyectoFundamentacionDeGastos(
        @WebParam(name = "anio", targetNamespace = "")
        java.lang.Integer anio,
        @WebParam(name = "nivel", targetNamespace = "")
        java.lang.Integer nivel,
        @WebParam(name = "entidad", targetNamespace = "")
        java.lang.Integer entidad,
        @WebParam(name = "version", targetNamespace = "")
        java.lang.Integer version
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "obtenerProyecto_PresupuestoDeIngresos", targetNamespace = "localhost", className = "py.gov.stp.mh.proyectopresupuesto.ObtenerProyectoPresupuestoDeIngresos")
    @WebMethod(operationName = "obtenerProyecto_PresupuestoDeIngresos")
    @ResponseWrapper(localName = "obtenerProyecto_PresupuestoDeIngresosResponse", targetNamespace = "localhost", className = "py.gov.stp.mh.proyectopresupuesto.ObtenerProyectoPresupuestoDeIngresosResponse")
    public java.util.List<py.gov.stp.mh.proyectopresupuesto.PresupuestoIngreso> obtenerProyectoPresupuestoDeIngresos(
        @WebParam(name = "anio", targetNamespace = "")
        java.lang.Integer anio,
        @WebParam(name = "nivel", targetNamespace = "")
        java.lang.Integer nivel,
        @WebParam(name = "entidad", targetNamespace = "")
        java.lang.Integer entidad,
        @WebParam(name = "version", targetNamespace = "")
        java.lang.Integer version
    );
}
