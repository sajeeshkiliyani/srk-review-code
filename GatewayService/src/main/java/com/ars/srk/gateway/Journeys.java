
package com.ars.srk.gateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Journeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Journeys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JOURNEY" type="{http://www.srk.org/IVSJourneyManagement/}Journey" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Journeys", propOrder = {
    "journey"
})
public class Journeys {

    @XmlElement(name = "JOURNEY")
    protected List<Journey> journey;

    /**
     * Gets the value of the journey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJOURNEY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Journey }
     * 
     * 
     */
    public List<Journey> getJOURNEY() {
        if (journey == null) {
            journey = new ArrayList<Journey>();
        }
        return this.journey;
    }

    /**
     * Sets the value of the journey property.
     * 
     * @param journey
     *     allowed object is
     *     {@link Journey }
     *     
     */
    public void setJOURNEY(List<Journey> journey) {
        this.journey = journey;
    }

}
