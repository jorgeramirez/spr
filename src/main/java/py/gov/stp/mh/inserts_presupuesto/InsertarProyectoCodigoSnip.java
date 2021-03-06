
package py.gov.stp.mh.inserts_presupuesto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
@author		DGTIC-STP
@email      dgtic@stp.gov.py
*/

/**
 * <p>Java class for insertarProyectoCodigoSnip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertarProyectoCodigoSnip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nivel" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="entidad" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="tipoPrograma" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="codigoPrograma" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="codigoSubprograma" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="codigoProyecto" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="codigoSnip" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarProyectoCodigoSnip", propOrder = {
    "anio",
    "nivel",
    "entidad",
    "tipoPrograma",
    "codigoPrograma",
    "codigoSubprograma",
    "codigoProyecto",
    "codigoSnip"
})
public class InsertarProyectoCodigoSnip {

    protected Short anio;
    protected Short nivel;
    protected Short entidad;
    protected Short tipoPrograma;
    protected Short codigoPrograma;
    protected Short codigoSubprograma;
    protected Short codigoProyecto;
    protected Short codigoSnip;

    /**
     * Gets the value of the anio property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAnio() {
        return anio;
    }

    /**
     * Sets the value of the anio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAnio(Short value) {
        this.anio = value;
    }

    /**
     * Gets the value of the nivel property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNivel() {
        return nivel;
    }

    /**
     * Sets the value of the nivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNivel(Short value) {
        this.nivel = value;
    }

    /**
     * Gets the value of the entidad property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEntidad() {
        return entidad;
    }

    /**
     * Sets the value of the entidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEntidad(Short value) {
        this.entidad = value;
    }

    /**
     * Gets the value of the tipoPrograma property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTipoPrograma() {
        return tipoPrograma;
    }

    /**
     * Sets the value of the tipoPrograma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTipoPrograma(Short value) {
        this.tipoPrograma = value;
    }

    /**
     * Gets the value of the codigoPrograma property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCodigoPrograma() {
        return codigoPrograma;
    }

    /**
     * Sets the value of the codigoPrograma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCodigoPrograma(Short value) {
        this.codigoPrograma = value;
    }

    /**
     * Gets the value of the codigoSubprograma property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCodigoSubprograma() {
        return codigoSubprograma;
    }

    /**
     * Sets the value of the codigoSubprograma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCodigoSubprograma(Short value) {
        this.codigoSubprograma = value;
    }

    /**
     * Gets the value of the codigoProyecto property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCodigoProyecto() {
        return codigoProyecto;
    }

    /**
     * Sets the value of the codigoProyecto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCodigoProyecto(Short value) {
        this.codigoProyecto = value;
    }

    /**
     * Gets the value of the codigoSnip property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCodigoSnip() {
        return codigoSnip;
    }

    /**
     * Sets the value of the codigoSnip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCodigoSnip(Short value) {
        this.codigoSnip = value;
    }

}
