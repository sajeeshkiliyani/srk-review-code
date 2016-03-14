
package com.ars.srk.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentreRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentreRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CentreID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentreRoleType", namespace = "http://www.srk.org/IVSUserManagement/", propOrder = {
    "centreID",
    "roleID"
})
public class CentreRoleType {

    @XmlElement(name = "CentreID", required = true)
    protected String centreID;
    @XmlElement(name = "RoleID", required = true)
    protected String roleID;

    /**
     * Gets the value of the centreID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentreID() {
        return centreID;
    }

    /**
     * Sets the value of the centreID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentreID(String value) {
        this.centreID = value;
    }

    /**
     * Gets the value of the roleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleID() {
        return roleID;
    }

    /**
     * Sets the value of the roleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleID(String value) {
        this.roleID = value;
    }

}
