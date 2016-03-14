
package com.ars.srk.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneysType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneysType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JOURNEYS" type="{http://www.srk.org/IVSJourneyManagement/}Journeys" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneysType", propOrder = {
    "journeys"
})
public class JourneysType {

    @XmlElement(name = "JOURNEYS")
    protected Journeys journeys;

    /**
     * Gets the value of the journeys property.
     * 
     * @return
     *     possible object is
     *     {@link Journeys }
     *     
     */
    public Journeys getJOURNEYS() {
        return journeys;
    }

    /**
     * Sets the value of the journeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Journeys }
     *     
     */
    public void setJOURNEYS(Journeys value) {
        this.journeys = value;
    }

}
