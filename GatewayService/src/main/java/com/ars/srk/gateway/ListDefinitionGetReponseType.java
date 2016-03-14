
package com.ars.srk.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListDefinitionGetReponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListDefinitionGetReponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListDefinitions" type="{http://www.srk.org/IVSUserManagement/}ListDefinitions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListDefinitionGetReponseType", namespace = "http://www.srk.org/IVSUserManagement/", propOrder = {
    "listDefinitions"
})
public class ListDefinitionGetReponseType {

    @XmlElement(name = "ListDefinitions")
    protected ListDefinitions listDefinitions;

    /**
     * Gets the value of the listDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link ListDefinitions }
     *     
     */
    public ListDefinitions getListDefinitions() {
        return listDefinitions;
    }

    /**
     * Sets the value of the listDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListDefinitions }
     *     
     */
    public void setListDefinitions(ListDefinitions value) {
        this.listDefinitions = value;
    }

}
