
package com.ars.srk.gateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListDefinitions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListDefinitions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListDefinition" type="{http://www.srk.org/IVSUserManagement/}ListDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListDefinitions", namespace = "http://www.srk.org/IVSUserManagement/", propOrder = {
    "listDefinition"
})
public class ListDefinitions {

    @XmlElement(name = "ListDefinition")
    protected List<ListDefinition> listDefinition;

    /**
     * Gets the value of the listDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListDefinition }
     * 
     * 
     */
    public List<ListDefinition> getListDefinition() {
        if (listDefinition == null) {
            listDefinition = new ArrayList<ListDefinition>();
        }
        return this.listDefinition;
    }

    /**
     * Sets the value of the listDefinition property.
     * 
     * @param listDefinition
     *     allowed object is
     *     {@link ListDefinition }
     *     
     */
    public void setListDefinition(List<ListDefinition> listDefinition) {
        this.listDefinition = listDefinition;
    }

}
