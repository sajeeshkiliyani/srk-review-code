
package com.ars.srk.gateway;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Journey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Journey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JOURNEY_ID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STATUS_TIME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;minInclusive value="1971-01-01T00:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STATUS_CODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="END_JOURNEY_TIME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;minInclusive value="1971-01-01T00:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="END_JOURNEY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NEXT_BLOCK_ID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CURRENT_BLOCK_ID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ATA_EXIT_POINT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;minInclusive value="1971-01-01T00:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ETA_EXIT_POINT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;minInclusive value="1971-01-01T00:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXIT_POINT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXIT_POINT_SOURCE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ATA_ENTRY_POINT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;minInclusive value="1971-01-01T00:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ETA_ENTRY_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ETA_ENTRY_POINT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;minInclusive value="1971-01-01T00:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ENTRY_POINT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ENTRY_POINT_SOURCE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="END_TIME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;minInclusive value="1971-01-01T00:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="START_TIME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;minInclusive value="1971-01-01T00:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESTINATION_CODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CENTRE_ID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CREATOR_ID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INFO_SOURCE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABELS" type="{http://www.srk.org/IVSJourneyManagement/}LabelsType" minOccurs="0"/>
 *         &lt;element name="VESSEL" type="{http://www.srk.org/IVSJourneyManagement/}Vessel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Journey", propOrder = {
    "journeyid",
    "statustime",
    "statuscode",
    "endjourneytime",
    "endjourney",
    "nextblockid",
    "currentblockid",
    "ataexitpoint",
    "etaexitpoint",
    "exitpoint",
    "exitpointsource",
    "ataentrypoint",
    "etaentrytype",
    "etaentrypoint",
    "entrypoint",
    "entrypointsource",
    "endtime",
    "starttime",
    "destinationcode",
    "centreid",
    "creatorid",
    "infosource",
    "labels",
    "vessel"
})
public class Journey {

    @XmlElement(name = "JOURNEY_ID", required = true)
    protected BigInteger journeyid;
    @XmlElement(name = "STATUS_TIME")
    protected XMLGregorianCalendar statustime;
    @XmlElement(name = "STATUS_CODE")
    protected String statuscode;
    @XmlElement(name = "END_JOURNEY_TIME")
    protected XMLGregorianCalendar endjourneytime;
    @XmlElement(name = "END_JOURNEY")
    protected String endjourney;
    @XmlElement(name = "NEXT_BLOCK_ID")
    protected String nextblockid;
    @XmlElement(name = "CURRENT_BLOCK_ID")
    protected String currentblockid;
    @XmlElement(name = "ATA_EXIT_POINT")
    protected XMLGregorianCalendar ataexitpoint;
    @XmlElement(name = "ETA_EXIT_POINT")
    protected XMLGregorianCalendar etaexitpoint;
    @XmlElement(name = "EXIT_POINT")
    protected String exitpoint;
    @XmlElement(name = "EXIT_POINT_SOURCE")
    protected String exitpointsource;
    @XmlElement(name = "ATA_ENTRY_POINT")
    protected XMLGregorianCalendar ataentrypoint;
    @XmlElement(name = "ETA_ENTRY_TYPE")
    protected String etaentrytype;
    @XmlElement(name = "ETA_ENTRY_POINT")
    protected XMLGregorianCalendar etaentrypoint;
    @XmlElement(name = "ENTRY_POINT")
    protected String entrypoint;
    @XmlElement(name = "ENTRY_POINT_SOURCE")
    protected String entrypointsource;
    @XmlElement(name = "END_TIME")
    protected XMLGregorianCalendar endtime;
    @XmlElement(name = "START_TIME")
    protected XMLGregorianCalendar starttime;
    @XmlElement(name = "DESTINATION_CODE")
    protected String destinationcode;
    @XmlElement(name = "CENTRE_ID")
    protected String centreid;
    @XmlElement(name = "CREATOR_ID")
    protected String creatorid;
    @XmlElement(name = "INFO_SOURCE")
    protected String infosource;
    @XmlElement(name = "LABELS")
    protected LabelsType labels;
    @XmlElement(name = "VESSEL")
    protected Vessel vessel;

    /**
     * Gets the value of the journeyid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJOURNEYID() {
        return journeyid;
    }

    /**
     * Sets the value of the journeyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJOURNEYID(BigInteger value) {
        this.journeyid = value;
    }

    /**
     * Gets the value of the statustime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTATUSTIME() {
        return statustime;
    }

    /**
     * Sets the value of the statustime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTATUSTIME(XMLGregorianCalendar value) {
        this.statustime = value;
    }

    /**
     * Gets the value of the statuscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUSCODE() {
        return statuscode;
    }

    /**
     * Sets the value of the statuscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUSCODE(String value) {
        this.statuscode = value;
    }

    /**
     * Gets the value of the endjourneytime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getENDJOURNEYTIME() {
        return endjourneytime;
    }

    /**
     * Sets the value of the endjourneytime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setENDJOURNEYTIME(XMLGregorianCalendar value) {
        this.endjourneytime = value;
    }

    /**
     * Gets the value of the endjourney property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDJOURNEY() {
        return endjourney;
    }

    /**
     * Sets the value of the endjourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDJOURNEY(String value) {
        this.endjourney = value;
    }

    /**
     * Gets the value of the nextblockid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEXTBLOCKID() {
        return nextblockid;
    }

    /**
     * Sets the value of the nextblockid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEXTBLOCKID(String value) {
        this.nextblockid = value;
    }

    /**
     * Gets the value of the currentblockid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENTBLOCKID() {
        return currentblockid;
    }

    /**
     * Sets the value of the currentblockid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENTBLOCKID(String value) {
        this.currentblockid = value;
    }

    /**
     * Gets the value of the ataexitpoint property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getATAEXITPOINT() {
        return ataexitpoint;
    }

    /**
     * Sets the value of the ataexitpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setATAEXITPOINT(XMLGregorianCalendar value) {
        this.ataexitpoint = value;
    }

    /**
     * Gets the value of the etaexitpoint property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETAEXITPOINT() {
        return etaexitpoint;
    }

    /**
     * Sets the value of the etaexitpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETAEXITPOINT(XMLGregorianCalendar value) {
        this.etaexitpoint = value;
    }

    /**
     * Gets the value of the exitpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXITPOINT() {
        return exitpoint;
    }

    /**
     * Sets the value of the exitpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXITPOINT(String value) {
        this.exitpoint = value;
    }

    /**
     * Gets the value of the exitpointsource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXITPOINTSOURCE() {
        return exitpointsource;
    }

    /**
     * Sets the value of the exitpointsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXITPOINTSOURCE(String value) {
        this.exitpointsource = value;
    }

    /**
     * Gets the value of the ataentrypoint property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getATAENTRYPOINT() {
        return ataentrypoint;
    }

    /**
     * Sets the value of the ataentrypoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setATAENTRYPOINT(XMLGregorianCalendar value) {
        this.ataentrypoint = value;
    }

    /**
     * Gets the value of the etaentrytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETAENTRYTYPE() {
        return etaentrytype;
    }

    /**
     * Sets the value of the etaentrytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETAENTRYTYPE(String value) {
        this.etaentrytype = value;
    }

    /**
     * Gets the value of the etaentrypoint property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETAENTRYPOINT() {
        return etaentrypoint;
    }

    /**
     * Sets the value of the etaentrypoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETAENTRYPOINT(XMLGregorianCalendar value) {
        this.etaentrypoint = value;
    }

    /**
     * Gets the value of the entrypoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTRYPOINT() {
        return entrypoint;
    }

    /**
     * Sets the value of the entrypoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTRYPOINT(String value) {
        this.entrypoint = value;
    }

    /**
     * Gets the value of the entrypointsource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTRYPOINTSOURCE() {
        return entrypointsource;
    }

    /**
     * Sets the value of the entrypointsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTRYPOINTSOURCE(String value) {
        this.entrypointsource = value;
    }

    /**
     * Gets the value of the endtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getENDTIME() {
        return endtime;
    }

    /**
     * Sets the value of the endtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setENDTIME(XMLGregorianCalendar value) {
        this.endtime = value;
    }

    /**
     * Gets the value of the starttime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTARTTIME() {
        return starttime;
    }

    /**
     * Sets the value of the starttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTARTTIME(XMLGregorianCalendar value) {
        this.starttime = value;
    }

    /**
     * Gets the value of the destinationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINATIONCODE() {
        return destinationcode;
    }

    /**
     * Sets the value of the destinationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINATIONCODE(String value) {
        this.destinationcode = value;
    }

    /**
     * Gets the value of the centreid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCENTREID() {
        return centreid;
    }

    /**
     * Sets the value of the centreid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCENTREID(String value) {
        this.centreid = value;
    }

    /**
     * Gets the value of the creatorid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATORID() {
        return creatorid;
    }

    /**
     * Sets the value of the creatorid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATORID(String value) {
        this.creatorid = value;
    }

    /**
     * Gets the value of the infosource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINFOSOURCE() {
        return infosource;
    }

    /**
     * Sets the value of the infosource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINFOSOURCE(String value) {
        this.infosource = value;
    }

    /**
     * Gets the value of the labels property.
     * 
     * @return
     *     possible object is
     *     {@link LabelsType }
     *     
     */
    public LabelsType getLABELS() {
        return labels;
    }

    /**
     * Sets the value of the labels property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelsType }
     *     
     */
    public void setLABELS(LabelsType value) {
        this.labels = value;
    }

    /**
     * Gets the value of the vessel property.
     * 
     * @return
     *     possible object is
     *     {@link Vessel }
     *     
     */
    public Vessel getVESSEL() {
        return vessel;
    }

    /**
     * Sets the value of the vessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vessel }
     *     
     */
    public void setVESSEL(Vessel value) {
        this.vessel = value;
    }

}
