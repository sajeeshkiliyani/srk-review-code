
package com.ars.srk.gateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vessels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vessels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VESSEL" type="{http://www.srk.org/IVSJourneyManagement/}Vessel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vessels", propOrder = {
    "vessel"
})
public class Vessels {

    @XmlElement(name = "VESSEL")
    protected List<Vessel> vessel;

    /**
     * Gets the value of the vessel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vessel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVESSEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vessel }
     * 
     * 
     */
    public List<Vessel> getVESSEL() {
        if (vessel == null) {
            vessel = new ArrayList<Vessel>();
        }
        return this.vessel;
    }

    /**
     * Sets the value of the vessel property.
     * 
     * @param vessel
     *     allowed object is
     *     {@link Vessel }
     *     
     */
    public void setVESSEL(List<Vessel> vessel) {
        this.vessel = vessel;
    }

}
