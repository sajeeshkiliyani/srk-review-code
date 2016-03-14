
package com.ars.srk.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="From" type="{http://www.srk.org/MuleMessageModel/}FromType"/>
 *         &lt;element name="To" type="{http://www.srk.org/MuleMessageModel/}ToType" minOccurs="0"/>
 *         &lt;element name="UserSession" type="{http://www.srk.org/MuleMessageModel/}UserSessionType"/>
 *         &lt;element name="MessageProperties" type="{http://www.srk.org/MuleMessageModel/}MessagePropertiesType"/>
 *         &lt;element name="MessageIdentification" type="{http://www.srk.org/MuleMessageModel/}MessageIdentificationType"/>
 *         &lt;element name="ESBServices" type="{http://www.srk.org/MuleMessageModel/}ESBServicesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", namespace = "http://www.srk.org/MuleMessageModel/", propOrder = {
    "from",
    "to",
    "userSession",
    "messageProperties",
    "messageIdentification",
    "esbServices"
})
public class HeaderType {

    @XmlElement(name = "From", required = true)
    protected FromType from;
    @XmlElement(name = "To")
    protected ToType to;
    @XmlElement(name = "UserSession", required = true)
    protected UserSessionType userSession;
    @XmlElement(name = "MessageProperties", required = true)
    protected MessagePropertiesType messageProperties;
    @XmlElement(name = "MessageIdentification", required = true)
    protected MessageIdentificationType messageIdentification;
    @XmlElement(name = "ESBServices")
    protected ESBServicesType esbServices;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link FromType }
     *     
     */
    public FromType getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromType }
     *     
     */
    public void setFrom(FromType value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link ToType }
     *     
     */
    public ToType getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToType }
     *     
     */
    public void setTo(ToType value) {
        this.to = value;
    }

    /**
     * Gets the value of the userSession property.
     * 
     * @return
     *     possible object is
     *     {@link UserSessionType }
     *     
     */
    public UserSessionType getUserSession() {
        return userSession;
    }

    /**
     * Sets the value of the userSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSessionType }
     *     
     */
    public void setUserSession(UserSessionType value) {
        this.userSession = value;
    }

    /**
     * Gets the value of the messageProperties property.
     * 
     * @return
     *     possible object is
     *     {@link MessagePropertiesType }
     *     
     */
    public MessagePropertiesType getMessageProperties() {
        return messageProperties;
    }

    /**
     * Sets the value of the messageProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagePropertiesType }
     *     
     */
    public void setMessageProperties(MessagePropertiesType value) {
        this.messageProperties = value;
    }

    /**
     * Gets the value of the messageIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentificationType }
     *     
     */
    public MessageIdentificationType getMessageIdentification() {
        return messageIdentification;
    }

    /**
     * Sets the value of the messageIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentificationType }
     *     
     */
    public void setMessageIdentification(MessageIdentificationType value) {
        this.messageIdentification = value;
    }

    /**
     * Gets the value of the esbServices property.
     * 
     * @return
     *     possible object is
     *     {@link ESBServicesType }
     *     
     */
    public ESBServicesType getESBServices() {
        return esbServices;
    }

    /**
     * Sets the value of the esbServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESBServicesType }
     *     
     */
    public void setESBServices(ESBServicesType value) {
        this.esbServices = value;
    }

}
