
package com.ars.srk.gateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipientsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Recipient" type="{http://www.srk.org/MuleMessageModel/}RecipientType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientsType", namespace = "http://www.srk.org/MuleMessageModel/", propOrder = {
    "recipient"
})
public class RecipientsType {

    @XmlElement(name = "Recipient")
    protected List<RecipientType> recipient;

    /**
     * Gets the value of the recipient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipientType }
     * 
     * 
     */
    public List<RecipientType> getRecipient() {
        if (recipient == null) {
            recipient = new ArrayList<RecipientType>();
        }
        return this.recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param recipient
     *     allowed object is
     *     {@link RecipientType }
     *     
     */
    public void setRecipient(List<RecipientType> recipient) {
        this.recipient = recipient;
    }

}
