
package com.ars.srk.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LABEL_CODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL_WEIGHT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelType", propOrder = {
    "labelcode",
    "labelweight"
})
public class LabelType {

    @XmlElement(name = "LABEL_CODE")
    protected String labelcode;
    @XmlElement(name = "LABEL_WEIGHT")
    protected Double labelweight;

    /**
     * Gets the value of the labelcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELCODE() {
        return labelcode;
    }

    /**
     * Sets the value of the labelcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELCODE(String value) {
        this.labelcode = value;
    }

    /**
     * Gets the value of the labelweight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLABELWEIGHT() {
        return labelweight;
    }

    /**
     * Sets the value of the labelweight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLABELWEIGHT(Double value) {
        this.labelweight = value;
    }

}
