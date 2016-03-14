
package com.ars.srk.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeCenterOrRoleNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeCenterOrRoleNotificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CenterID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RoleID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
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
@XmlType(name = "ChangeCenterOrRoleNotificationType", namespace = "http://www.srk.org/IVSUserManagement/", propOrder = {
    "centerID",
    "roleID"
})
public class ChangeCenterOrRoleNotificationType {

    @XmlElement(name = "CenterID", required = true)
    protected String centerID;
    @XmlElement(name = "RoleID")
    protected int roleID;

    /**
     * Gets the value of the centerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterID() {
        return centerID;
    }

    /**
     * Sets the value of the centerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterID(String value) {
        this.centerID = value;
    }

    /**
     * Gets the value of the roleID property.
     * 
     */
    public int getRoleID() {
        return roleID;
    }

    /**
     * Sets the value of the roleID property.
     * 
     */
    public void setRoleID(int value) {
        this.roleID = value;
    }

}
