
package com.ars.srk.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.srk.org/exception/}Exception" minOccurs="0"/>
 *         &lt;element ref="{http://www.srk.org/IVSJourneyManagement/}MANAGE_JOURNEY_REQUEST" minOccurs="0"/>
 *         &lt;element ref="{http://www.srk.org/IVSJourneyManagement/}MANAGE_JOURNEY_RESPONSE" minOccurs="0"/>
 *         &lt;element ref="{http://www.srk.org/IVSJourneyManagement/}LIST_JOURNEYS_REQUEST" minOccurs="0"/>
 *         &lt;element ref="{http://www.srk.org/IVSJourneyManagement/}LIST_JOURNEYS_RESPONSE" minOccurs="0"/>
 *         &lt;element ref="{http://www.srk.org/IVSJourneyManagement/}LIST_VESSELS_REQUEST" minOccurs="0"/>
 *         &lt;element ref="{http://www.srk.org/IVSJourneyManagement/}LIST_VESSELS_RESPONSE" minOccurs="0"/>
 *         &lt;element ref="{http://www.srk.org/IVSUserManagement/}UserAuthenticationRequest" minOccurs="0"/>
 *         &lt;element ref="{http://www.srk.org/IVSUserManagement/}UserAuthenticationResponse" minOccurs="0"/>
 *         &lt;element ref="{http://www.srk.org/IVSUserManagement/}UserLogoutRequest" minOccurs="0"/>
 *         &lt;element ref="{http://www.srk.org/IVSUserManagement/}UserLogoutResponse" minOccurs="0"/>
 *         &lt;element ref="{http://www.srk.org/IVSUserManagement/}ChangeCenterOrRoleRequest" minOccurs="0"/>
 *         &lt;element ref="{http://www.srk.org/IVSUserManagement/}ChangeCenterOrRoleResponse" minOccurs="0"/>
 *         &lt;element ref="{http://www.srk.org/IVSUserManagement/}GetListDefinitionResponse" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyType", namespace = "http://www.srk.org/MuleMessageModel/", propOrder = {
    "exception",
    "managejourneyrequest",
    "managejourneyresponse",
    "listjourneysrequest",
    "listjourneysresponse",
    "listvesselsrequest",
    "listvesselsresponse",
    "userAuthenticationRequest",
    "userAuthenticationResponse",
    "userLogoutRequest",
    "userLogoutResponse",
    "changeCenterOrRoleRequest",
    "changeCenterOrRoleResponse",
    "getListDefinitionResponse"
})
public class BodyType {

    @XmlElement(name = "Exception", namespace = "http://www.srk.org/exception/")
    protected ExceptionType exception;
    @XmlElement(name = "MANAGE_JOURNEY_REQUEST", namespace = "http://www.srk.org/IVSJourneyManagement/")
    protected ManageJourneyType managejourneyrequest;
    @XmlElement(name = "MANAGE_JOURNEY_RESPONSE", namespace = "http://www.srk.org/IVSJourneyManagement/")
    protected JourneyType managejourneyresponse;
    @XmlElement(name = "LIST_JOURNEYS_REQUEST", namespace = "http://www.srk.org/IVSJourneyManagement/")
    protected ListJourneysType listjourneysrequest;
    @XmlElement(name = "LIST_JOURNEYS_RESPONSE", namespace = "http://www.srk.org/IVSJourneyManagement/")
    protected JourneysType listjourneysresponse;
    @XmlElement(name = "LIST_VESSELS_REQUEST", namespace = "http://www.srk.org/IVSJourneyManagement/")
    protected ListVesselsType listvesselsrequest;
    @XmlElement(name = "LIST_VESSELS_RESPONSE", namespace = "http://www.srk.org/IVSJourneyManagement/")
    protected VesselsType listvesselsresponse;
    @XmlElement(name = "UserAuthenticationRequest", namespace = "http://www.srk.org/IVSUserManagement/")
    protected AuthenticationRequestType userAuthenticationRequest;
    @XmlElement(name = "UserAuthenticationResponse", namespace = "http://www.srk.org/IVSUserManagement/")
    protected UserAuthenticationResponseType userAuthenticationResponse;
    @XmlElement(name = "UserLogoutRequest", namespace = "http://www.srk.org/IVSUserManagement/")
    protected UserLogoutInfoType userLogoutRequest;
    @XmlElement(name = "UserLogoutResponse", namespace = "http://www.srk.org/IVSUserManagement/")
    protected UserLogoutResponseType userLogoutResponse;
    @XmlElement(name = "ChangeCenterOrRoleRequest", namespace = "http://www.srk.org/IVSUserManagement/")
    protected ChangeCenterOrRoleNotificationType changeCenterOrRoleRequest;
    @XmlElement(name = "ChangeCenterOrRoleResponse", namespace = "http://www.srk.org/IVSUserManagement/")
    protected ChangeCenterOrRoleResponseType changeCenterOrRoleResponse;
    @XmlElement(name = "GetListDefinitionResponse", namespace = "http://www.srk.org/IVSUserManagement/")
    protected ListDefinitionGetReponseType getListDefinitionResponse;

    /**
     * Gets the value of the exception property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionType }
     *     
     */
    public ExceptionType getException() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionType }
     *     
     */
    public void setException(ExceptionType value) {
        this.exception = value;
    }

    /**
     * Gets the value of the managejourneyrequest property.
     * 
     * @return
     *     possible object is
     *     {@link ManageJourneyType }
     *     
     */
    public ManageJourneyType getMANAGEJOURNEYREQUEST() {
        return managejourneyrequest;
    }

    /**
     * Sets the value of the managejourneyrequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageJourneyType }
     *     
     */
    public void setMANAGEJOURNEYREQUEST(ManageJourneyType value) {
        this.managejourneyrequest = value;
    }

    /**
     * Gets the value of the managejourneyresponse property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyType }
     *     
     */
    public JourneyType getMANAGEJOURNEYRESPONSE() {
        return managejourneyresponse;
    }

    /**
     * Sets the value of the managejourneyresponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyType }
     *     
     */
    public void setMANAGEJOURNEYRESPONSE(JourneyType value) {
        this.managejourneyresponse = value;
    }

    /**
     * Gets the value of the listjourneysrequest property.
     * 
     * @return
     *     possible object is
     *     {@link ListJourneysType }
     *     
     */
    public ListJourneysType getLISTJOURNEYSREQUEST() {
        return listjourneysrequest;
    }

    /**
     * Sets the value of the listjourneysrequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListJourneysType }
     *     
     */
    public void setLISTJOURNEYSREQUEST(ListJourneysType value) {
        this.listjourneysrequest = value;
    }

    /**
     * Gets the value of the listjourneysresponse property.
     * 
     * @return
     *     possible object is
     *     {@link JourneysType }
     *     
     */
    public JourneysType getLISTJOURNEYSRESPONSE() {
        return listjourneysresponse;
    }

    /**
     * Sets the value of the listjourneysresponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneysType }
     *     
     */
    public void setLISTJOURNEYSRESPONSE(JourneysType value) {
        this.listjourneysresponse = value;
    }

    /**
     * Gets the value of the listvesselsrequest property.
     * 
     * @return
     *     possible object is
     *     {@link ListVesselsType }
     *     
     */
    public ListVesselsType getLISTVESSELSREQUEST() {
        return listvesselsrequest;
    }

    /**
     * Sets the value of the listvesselsrequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListVesselsType }
     *     
     */
    public void setLISTVESSELSREQUEST(ListVesselsType value) {
        this.listvesselsrequest = value;
    }

    /**
     * Gets the value of the listvesselsresponse property.
     * 
     * @return
     *     possible object is
     *     {@link VesselsType }
     *     
     */
    public VesselsType getLISTVESSELSRESPONSE() {
        return listvesselsresponse;
    }

    /**
     * Sets the value of the listvesselsresponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselsType }
     *     
     */
    public void setLISTVESSELSRESPONSE(VesselsType value) {
        this.listvesselsresponse = value;
    }

    /**
     * Gets the value of the userAuthenticationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationRequestType }
     *     
     */
    public AuthenticationRequestType getUserAuthenticationRequest() {
        return userAuthenticationRequest;
    }

    /**
     * Sets the value of the userAuthenticationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationRequestType }
     *     
     */
    public void setUserAuthenticationRequest(AuthenticationRequestType value) {
        this.userAuthenticationRequest = value;
    }

    /**
     * Gets the value of the userAuthenticationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UserAuthenticationResponseType }
     *     
     */
    public UserAuthenticationResponseType getUserAuthenticationResponse() {
        return userAuthenticationResponse;
    }

    /**
     * Sets the value of the userAuthenticationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAuthenticationResponseType }
     *     
     */
    public void setUserAuthenticationResponse(UserAuthenticationResponseType value) {
        this.userAuthenticationResponse = value;
    }

    /**
     * Gets the value of the userLogoutRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UserLogoutInfoType }
     *     
     */
    public UserLogoutInfoType getUserLogoutRequest() {
        return userLogoutRequest;
    }

    /**
     * Sets the value of the userLogoutRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLogoutInfoType }
     *     
     */
    public void setUserLogoutRequest(UserLogoutInfoType value) {
        this.userLogoutRequest = value;
    }

    /**
     * Gets the value of the userLogoutResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UserLogoutResponseType }
     *     
     */
    public UserLogoutResponseType getUserLogoutResponse() {
        return userLogoutResponse;
    }

    /**
     * Sets the value of the userLogoutResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLogoutResponseType }
     *     
     */
    public void setUserLogoutResponse(UserLogoutResponseType value) {
        this.userLogoutResponse = value;
    }

    /**
     * Gets the value of the changeCenterOrRoleRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeCenterOrRoleNotificationType }
     *     
     */
    public ChangeCenterOrRoleNotificationType getChangeCenterOrRoleRequest() {
        return changeCenterOrRoleRequest;
    }

    /**
     * Sets the value of the changeCenterOrRoleRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeCenterOrRoleNotificationType }
     *     
     */
    public void setChangeCenterOrRoleRequest(ChangeCenterOrRoleNotificationType value) {
        this.changeCenterOrRoleRequest = value;
    }

    /**
     * Gets the value of the changeCenterOrRoleResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeCenterOrRoleResponseType }
     *     
     */
    public ChangeCenterOrRoleResponseType getChangeCenterOrRoleResponse() {
        return changeCenterOrRoleResponse;
    }

    /**
     * Sets the value of the changeCenterOrRoleResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeCenterOrRoleResponseType }
     *     
     */
    public void setChangeCenterOrRoleResponse(ChangeCenterOrRoleResponseType value) {
        this.changeCenterOrRoleResponse = value;
    }

    /**
     * Gets the value of the getListDefinitionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ListDefinitionGetReponseType }
     *     
     */
    public ListDefinitionGetReponseType getGetListDefinitionResponse() {
        return getListDefinitionResponse;
    }

    /**
     * Sets the value of the getListDefinitionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListDefinitionGetReponseType }
     *     
     */
    public void setGetListDefinitionResponse(ListDefinitionGetReponseType value) {
        this.getListDefinitionResponse = value;
    }

}
