
package com.ars.srk.gateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColumnIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ColumnID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnIDType", namespace = "http://www.srk.org/IVSUserManagement/", propOrder = {
    "columnID"
})
public class ColumnIDType {

    @XmlElement(name = "ColumnID")
    protected List<String> columnID;

    /**
     * Gets the value of the columnID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColumnID() {
        if (columnID == null) {
            columnID = new ArrayList<String>();
        }
        return this.columnID;
    }

    /**
     * Sets the value of the columnID property.
     * 
     * @param columnID
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnID(List<String> columnID) {
        this.columnID = columnID;
    }

}
