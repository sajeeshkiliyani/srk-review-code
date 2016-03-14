
package com.ars.srk.gateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultipleCentreRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultipleCentreRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CentreRole" type="{http://www.srk.org/IVSUserManagement/}CentreRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleCentreRoleType", namespace = "http://www.srk.org/IVSUserManagement/", propOrder = {
    "centreRole"
})
public class MultipleCentreRoleType {

    @XmlElement(name = "CentreRole")
    protected List<CentreRoleType> centreRole;

    /**
     * Gets the value of the centreRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the centreRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCentreRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CentreRoleType }
     * 
     * 
     */
    public List<CentreRoleType> getCentreRole() {
        if (centreRole == null) {
            centreRole = new ArrayList<CentreRoleType>();
        }
        return this.centreRole;
    }

    /**
     * Sets the value of the centreRole property.
     * 
     * @param centreRole
     *     allowed object is
     *     {@link CentreRoleType }
     *     
     */
    public void setCentreRole(List<CentreRoleType> centreRole) {
        this.centreRole = centreRole;
    }

}
