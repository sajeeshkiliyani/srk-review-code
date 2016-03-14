
package com.ars.srk.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACTION">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EDITED_PARAMETERS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="JOURNEY" type="{http://www.srk.org/IVSJourneyManagement/}Journey" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyType", propOrder = {
    "action",
    "editedparameters",
    "journey"
})
public class JourneyType {

    @XmlElement(name = "ACTION", required = true)
    protected String action;
    @XmlElement(name = "EDITED_PARAMETERS")
    protected String editedparameters;
    @XmlElement(name = "JOURNEY")
    protected Journey journey;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTION() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTION(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the editedparameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDITEDPARAMETERS() {
        return editedparameters;
    }

    /**
     * Sets the value of the editedparameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDITEDPARAMETERS(String value) {
        this.editedparameters = value;
    }

    /**
     * Gets the value of the journey property.
     * 
     * @return
     *     possible object is
     *     {@link Journey }
     *     
     */
    public Journey getJOURNEY() {
        return journey;
    }

    /**
     * Sets the value of the journey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Journey }
     *     
     */
    public void setJOURNEY(Journey value) {
        this.journey = value;
    }

}
