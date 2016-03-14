
package com.ars.srk.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AllowedCentreRoles" type="{http://www.srk.org/IVSUserManagement/}MultipleCentreRoleType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LabelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ColumnIDs" type="{http://www.srk.org/IVSUserManagement/}ColumnIDType" minOccurs="0"/>
 *         &lt;element name="IsDefault">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
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
@XmlType(name = "ListDefinition", namespace = "http://www.srk.org/IVSUserManagement/", propOrder = {
    "id",
    "name",
    "allowedCentreRoles",
    "description",
    "labelCode",
    "columnIDs",
    "isDefault"
})
public class ListDefinition {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "AllowedCentreRoles")
    protected MultipleCentreRoleType allowedCentreRoles;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "LabelCode", required = true)
    protected String labelCode;
    @XmlElement(name = "ColumnIDs")
    protected ColumnIDType columnIDs;
    @XmlElement(name = "IsDefault", required = true)
    protected String isDefault;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the allowedCentreRoles property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleCentreRoleType }
     *     
     */
    public MultipleCentreRoleType getAllowedCentreRoles() {
        return allowedCentreRoles;
    }

    /**
     * Sets the value of the allowedCentreRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleCentreRoleType }
     *     
     */
    public void setAllowedCentreRoles(MultipleCentreRoleType value) {
        this.allowedCentreRoles = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the labelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelCode() {
        return labelCode;
    }

    /**
     * Sets the value of the labelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelCode(String value) {
        this.labelCode = value;
    }

    /**
     * Gets the value of the columnIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnIDType }
     *     
     */
    public ColumnIDType getColumnIDs() {
        return columnIDs;
    }

    /**
     * Sets the value of the columnIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnIDType }
     *     
     */
    public void setColumnIDs(ColumnIDType value) {
        this.columnIDs = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDefault(String value) {
        this.isDefault = value;
    }

}
