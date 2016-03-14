
package com.ars.srk.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageDomain">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="User"/>
 *               &lt;enumeration value="Journey"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MessageType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AuthenticateUser"/>
 *               &lt;enumeration value="TraceCentreRoleChange"/>
 *               &lt;enumeration value="LogoutUser"/>
 *               &lt;enumeration value="GetListDefinitions"/>
 *               &lt;enumeration value="ManageJourney"/>
 *               &lt;enumeration value="ListJourneys"/>
 *               &lt;enumeration value="ListVessels"/>
 *               &lt;enumeration value="GetViapoints"/>
 *               &lt;enumeration value="GetDeviations"/>
 *               &lt;enumeration value="SetViapoints"/>
 *               &lt;enumeration value="SetDeviations"/>
 *               &lt;enumeration value="ListRoutes"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MessageSubtype">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="CREATE"/>
 *               &lt;enumeration value="EDIT"/>
 *               &lt;enumeration value="REMOVE"/>
 *               &lt;enumeration value="VIAPOINT"/>
 *               &lt;enumeration value="DEVIATION"/>
 *               &lt;enumeration value="NA"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MessageEnvironment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="DEVELOPMENT"/>
 *               &lt;enumeration value="TEST"/>
 *               &lt;enumeration value="UAT"/>
 *               &lt;enumeration value="PRODUCTION"/>
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
@XmlType(name = "MessageIdentificationType", namespace = "http://www.srk.org/MuleMessageModel/", propOrder = {
    "messageDomain",
    "messageType",
    "messageSubtype",
    "messageEnvironment"
})
public class MessageIdentificationType {

    @XmlElement(name = "MessageDomain", required = true)
    protected String messageDomain;
    @XmlElement(name = "MessageType", required = true)
    protected String messageType;
    @XmlElement(name = "MessageSubtype", required = true)
    protected String messageSubtype;
    @XmlElement(name = "MessageEnvironment")
    protected String messageEnvironment;

    /**
     * Gets the value of the messageDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDomain() {
        return messageDomain;
    }

    /**
     * Sets the value of the messageDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDomain(String value) {
        this.messageDomain = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the messageSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSubtype() {
        return messageSubtype;
    }

    /**
     * Sets the value of the messageSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSubtype(String value) {
        this.messageSubtype = value;
    }

    /**
     * Gets the value of the messageEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageEnvironment() {
        return messageEnvironment;
    }

    /**
     * Sets the value of the messageEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageEnvironment(String value) {
        this.messageEnvironment = value;
    }

}
