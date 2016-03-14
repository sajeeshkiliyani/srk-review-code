
package com.ars.srk.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VesselsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VesselsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JOURNEY_VESSELS" type="{http://www.srk.org/IVSJourneyManagement/}Vessels"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselsType", propOrder = {
    "journeyvessels"
})
public class VesselsType {

    @XmlElement(name = "JOURNEY_VESSELS", required = true)
    protected Vessels journeyvessels;

    /**
     * Gets the value of the journeyvessels property.
     * 
     * @return
     *     possible object is
     *     {@link Vessels }
     *     
     */
    public Vessels getJOURNEYVESSELS() {
        return journeyvessels;
    }

    /**
     * Sets the value of the journeyvessels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vessels }
     *     
     */
    public void setJOURNEYVESSELS(Vessels value) {
        this.journeyvessels = value;
    }

}
