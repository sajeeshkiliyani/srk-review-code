
package com.ars.srk.gateway;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Vessel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vessel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IS_MASTER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
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
 *               &lt;length value="1"/>
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
 *         &lt;element name="RECORD_DATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;minInclusive value="1971-01-01T00:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FREE_TEXT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="300"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LICENSE_HOLDER_ID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PASSENGERS_ONBOARD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CREW_ONBOARD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SHELTER_DECK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MARIFOON" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HELI_DECK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GYRO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SATNAV" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SATCOM_ANSWER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SATCOM_ID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SATCOM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RADIO_TELEPHONE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RADAR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOOR_STERN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOOR_SIDE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOOR_BOW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TURBINE_KW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TURBINE_SHP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OTHER_PROPELLERS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PROPULSION_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PROPULSION_POWER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PROPULSION_STERN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PROPULSION_BOW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PROPELLER_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAST_DRAUGHT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAST_HEIGHT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MACHINERY_POSITION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LENGTH_PERP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LENGTH_METRE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ENGINE_KW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ENGINE_HP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESIGN_CODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CRUISE_SPEED" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TOTAL_TANK_CAP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TOTAL_TANKS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HEIGHT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GROSS_WEIGHT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BEAM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AXES" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CLEARANCE_DATETIME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;minInclusive value="1971-01-01T00:00:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CLEARANCE_GIVEN_BY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SWATH_OPERABLE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ARTICLE_25_STATUS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ARTICLE_16_STATUS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MMSI_ID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CALL_SIGN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VESSEL_NAME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VESSEL_TYPE_ID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
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
@XmlType(name = "Vessel", propOrder = {
    "ismaster",
    "statustime",
    "statuscode",
    "creatorid",
    "recorddate",
    "freetext",
    "licenseholderid",
    "passengersonboard",
    "crewonboard",
    "shelterdeck",
    "marifoon",
    "hf",
    "helideck",
    "gyro",
    "satnav",
    "satcomanswer",
    "satcomid",
    "satcom",
    "radiotelephone",
    "radar",
    "doorstern",
    "doorside",
    "doorbow",
    "turbinekw",
    "turbineshp",
    "otherpropellers",
    "propulsiontype",
    "propulsionpower",
    "propulsionstern",
    "propulsionbow",
    "propellertype",
    "mastdraught",
    "mastheight",
    "machineryposition",
    "lengthperp",
    "lengthmetre",
    "enginekw",
    "enginehp",
    "designcode",
    "cruisespeed",
    "totaltankcap",
    "totaltanks",
    "height",
    "grossweight",
    "beam",
    "axes",
    "clearancedatetime",
    "clearancegivenby",
    "swathoperable",
    "article25STATUS",
    "article16STATUS",
    "mmsiid",
    "callsign",
    "vesselname",
    "vesseltypeid"
})
public class Vessel {

    @XmlElement(name = "IS_MASTER")
    protected String ismaster;
    @XmlElement(name = "STATUS_TIME")
    protected XMLGregorianCalendar statustime;
    @XmlElement(name = "STATUS_CODE")
    protected String statuscode;
    @XmlElement(name = "CREATOR_ID")
    protected String creatorid;
    @XmlElement(name = "RECORD_DATE")
    protected XMLGregorianCalendar recorddate;
    @XmlElement(name = "FREE_TEXT")
    protected String freetext;
    @XmlElement(name = "LICENSE_HOLDER_ID")
    protected BigInteger licenseholderid;
    @XmlElement(name = "PASSENGERS_ONBOARD")
    protected BigInteger passengersonboard;
    @XmlElement(name = "CREW_ONBOARD")
    protected BigInteger crewonboard;
    @XmlElement(name = "SHELTER_DECK")
    protected String shelterdeck;
    @XmlElement(name = "MARIFOON")
    protected String marifoon;
    @XmlElement(name = "HF")
    protected String hf;
    @XmlElement(name = "HELI_DECK")
    protected String helideck;
    @XmlElement(name = "GYRO")
    protected String gyro;
    @XmlElement(name = "SATNAV")
    protected String satnav;
    @XmlElement(name = "SATCOM_ANSWER")
    protected String satcomanswer;
    @XmlElement(name = "SATCOM_ID")
    protected String satcomid;
    @XmlElement(name = "SATCOM")
    protected String satcom;
    @XmlElement(name = "RADIO_TELEPHONE")
    protected String radiotelephone;
    @XmlElement(name = "RADAR")
    protected String radar;
    @XmlElement(name = "DOOR_STERN")
    protected String doorstern;
    @XmlElement(name = "DOOR_SIDE")
    protected String doorside;
    @XmlElement(name = "DOOR_BOW")
    protected String doorbow;
    @XmlElement(name = "TURBINE_KW")
    protected Double turbinekw;
    @XmlElement(name = "TURBINE_SHP")
    protected Double turbineshp;
    @XmlElement(name = "OTHER_PROPELLERS")
    protected String otherpropellers;
    @XmlElement(name = "PROPULSION_TYPE")
    protected String propulsiontype;
    @XmlElement(name = "PROPULSION_POWER")
    protected Double propulsionpower;
    @XmlElement(name = "PROPULSION_STERN")
    protected String propulsionstern;
    @XmlElement(name = "PROPULSION_BOW")
    protected String propulsionbow;
    @XmlElement(name = "PROPELLER_TYPE")
    protected String propellertype;
    @XmlElement(name = "MAST_DRAUGHT")
    protected Double mastdraught;
    @XmlElement(name = "MAST_HEIGHT")
    protected Double mastheight;
    @XmlElement(name = "MACHINERY_POSITION")
    protected String machineryposition;
    @XmlElement(name = "LENGTH_PERP")
    protected Double lengthperp;
    @XmlElement(name = "LENGTH_METRE")
    protected Double lengthmetre;
    @XmlElement(name = "ENGINE_KW")
    protected Double enginekw;
    @XmlElement(name = "ENGINE_HP")
    protected Double enginehp;
    @XmlElement(name = "DESIGN_CODE")
    protected String designcode;
    @XmlElement(name = "CRUISE_SPEED")
    protected Double cruisespeed;
    @XmlElement(name = "TOTAL_TANK_CAP")
    protected Double totaltankcap;
    @XmlElement(name = "TOTAL_TANKS")
    protected BigInteger totaltanks;
    @XmlElement(name = "HEIGHT")
    protected Double height;
    @XmlElement(name = "GROSS_WEIGHT")
    protected Double grossweight;
    @XmlElement(name = "BEAM")
    protected Double beam;
    @XmlElement(name = "AXES")
    protected BigInteger axes;
    @XmlElement(name = "CLEARANCE_DATETIME")
    protected XMLGregorianCalendar clearancedatetime;
    @XmlElement(name = "CLEARANCE_GIVEN_BY")
    protected String clearancegivenby;
    @XmlElement(name = "SWATH_OPERABLE")
    protected String swathoperable;
    @XmlElement(name = "ARTICLE_25_STATUS")
    protected String article25STATUS;
    @XmlElement(name = "ARTICLE_16_STATUS")
    protected String article16STATUS;
    @XmlElement(name = "MMSI_ID")
    protected String mmsiid;
    @XmlElement(name = "CALL_SIGN")
    protected String callsign;
    @XmlElement(name = "VESSEL_NAME")
    protected String vesselname;
    @XmlElement(name = "VESSEL_TYPE_ID")
    protected String vesseltypeid;

    /**
     * Gets the value of the ismaster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISMASTER() {
        return ismaster;
    }

    /**
     * Sets the value of the ismaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISMASTER(String value) {
        this.ismaster = value;
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
     * Gets the value of the recorddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRECORDDATE() {
        return recorddate;
    }

    /**
     * Sets the value of the recorddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRECORDDATE(XMLGregorianCalendar value) {
        this.recorddate = value;
    }

    /**
     * Gets the value of the freetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREETEXT() {
        return freetext;
    }

    /**
     * Sets the value of the freetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREETEXT(String value) {
        this.freetext = value;
    }

    /**
     * Gets the value of the licenseholderid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLICENSEHOLDERID() {
        return licenseholderid;
    }

    /**
     * Sets the value of the licenseholderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLICENSEHOLDERID(BigInteger value) {
        this.licenseholderid = value;
    }

    /**
     * Gets the value of the passengersonboard property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPASSENGERSONBOARD() {
        return passengersonboard;
    }

    /**
     * Sets the value of the passengersonboard property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPASSENGERSONBOARD(BigInteger value) {
        this.passengersonboard = value;
    }

    /**
     * Gets the value of the crewonboard property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCREWONBOARD() {
        return crewonboard;
    }

    /**
     * Sets the value of the crewonboard property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCREWONBOARD(BigInteger value) {
        this.crewonboard = value;
    }

    /**
     * Gets the value of the shelterdeck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHELTERDECK() {
        return shelterdeck;
    }

    /**
     * Sets the value of the shelterdeck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHELTERDECK(String value) {
        this.shelterdeck = value;
    }

    /**
     * Gets the value of the marifoon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARIFOON() {
        return marifoon;
    }

    /**
     * Sets the value of the marifoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARIFOON(String value) {
        this.marifoon = value;
    }

    /**
     * Gets the value of the hf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHF() {
        return hf;
    }

    /**
     * Sets the value of the hf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHF(String value) {
        this.hf = value;
    }

    /**
     * Gets the value of the helideck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHELIDECK() {
        return helideck;
    }

    /**
     * Sets the value of the helideck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHELIDECK(String value) {
        this.helideck = value;
    }

    /**
     * Gets the value of the gyro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGYRO() {
        return gyro;
    }

    /**
     * Sets the value of the gyro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGYRO(String value) {
        this.gyro = value;
    }

    /**
     * Gets the value of the satnav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSATNAV() {
        return satnav;
    }

    /**
     * Sets the value of the satnav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSATNAV(String value) {
        this.satnav = value;
    }

    /**
     * Gets the value of the satcomanswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSATCOMANSWER() {
        return satcomanswer;
    }

    /**
     * Sets the value of the satcomanswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSATCOMANSWER(String value) {
        this.satcomanswer = value;
    }

    /**
     * Gets the value of the satcomid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSATCOMID() {
        return satcomid;
    }

    /**
     * Sets the value of the satcomid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSATCOMID(String value) {
        this.satcomid = value;
    }

    /**
     * Gets the value of the satcom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSATCOM() {
        return satcom;
    }

    /**
     * Sets the value of the satcom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSATCOM(String value) {
        this.satcom = value;
    }

    /**
     * Gets the value of the radiotelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRADIOTELEPHONE() {
        return radiotelephone;
    }

    /**
     * Sets the value of the radiotelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRADIOTELEPHONE(String value) {
        this.radiotelephone = value;
    }

    /**
     * Gets the value of the radar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRADAR() {
        return radar;
    }

    /**
     * Sets the value of the radar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRADAR(String value) {
        this.radar = value;
    }

    /**
     * Gets the value of the doorstern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOORSTERN() {
        return doorstern;
    }

    /**
     * Sets the value of the doorstern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOORSTERN(String value) {
        this.doorstern = value;
    }

    /**
     * Gets the value of the doorside property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOORSIDE() {
        return doorside;
    }

    /**
     * Sets the value of the doorside property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOORSIDE(String value) {
        this.doorside = value;
    }

    /**
     * Gets the value of the doorbow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOORBOW() {
        return doorbow;
    }

    /**
     * Sets the value of the doorbow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOORBOW(String value) {
        this.doorbow = value;
    }

    /**
     * Gets the value of the turbinekw property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTURBINEKW() {
        return turbinekw;
    }

    /**
     * Sets the value of the turbinekw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTURBINEKW(Double value) {
        this.turbinekw = value;
    }

    /**
     * Gets the value of the turbineshp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTURBINESHP() {
        return turbineshp;
    }

    /**
     * Sets the value of the turbineshp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTURBINESHP(Double value) {
        this.turbineshp = value;
    }

    /**
     * Gets the value of the otherpropellers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHERPROPELLERS() {
        return otherpropellers;
    }

    /**
     * Sets the value of the otherpropellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHERPROPELLERS(String value) {
        this.otherpropellers = value;
    }

    /**
     * Gets the value of the propulsiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROPULSIONTYPE() {
        return propulsiontype;
    }

    /**
     * Sets the value of the propulsiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROPULSIONTYPE(String value) {
        this.propulsiontype = value;
    }

    /**
     * Gets the value of the propulsionpower property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPROPULSIONPOWER() {
        return propulsionpower;
    }

    /**
     * Sets the value of the propulsionpower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPROPULSIONPOWER(Double value) {
        this.propulsionpower = value;
    }

    /**
     * Gets the value of the propulsionstern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROPULSIONSTERN() {
        return propulsionstern;
    }

    /**
     * Sets the value of the propulsionstern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROPULSIONSTERN(String value) {
        this.propulsionstern = value;
    }

    /**
     * Gets the value of the propulsionbow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROPULSIONBOW() {
        return propulsionbow;
    }

    /**
     * Sets the value of the propulsionbow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROPULSIONBOW(String value) {
        this.propulsionbow = value;
    }

    /**
     * Gets the value of the propellertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROPELLERTYPE() {
        return propellertype;
    }

    /**
     * Sets the value of the propellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROPELLERTYPE(String value) {
        this.propellertype = value;
    }

    /**
     * Gets the value of the mastdraught property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMASTDRAUGHT() {
        return mastdraught;
    }

    /**
     * Sets the value of the mastdraught property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMASTDRAUGHT(Double value) {
        this.mastdraught = value;
    }

    /**
     * Gets the value of the mastheight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMASTHEIGHT() {
        return mastheight;
    }

    /**
     * Sets the value of the mastheight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMASTHEIGHT(Double value) {
        this.mastheight = value;
    }

    /**
     * Gets the value of the machineryposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACHINERYPOSITION() {
        return machineryposition;
    }

    /**
     * Sets the value of the machineryposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACHINERYPOSITION(String value) {
        this.machineryposition = value;
    }

    /**
     * Gets the value of the lengthperp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLENGTHPERP() {
        return lengthperp;
    }

    /**
     * Sets the value of the lengthperp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLENGTHPERP(Double value) {
        this.lengthperp = value;
    }

    /**
     * Gets the value of the lengthmetre property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLENGTHMETRE() {
        return lengthmetre;
    }

    /**
     * Sets the value of the lengthmetre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLENGTHMETRE(Double value) {
        this.lengthmetre = value;
    }

    /**
     * Gets the value of the enginekw property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getENGINEKW() {
        return enginekw;
    }

    /**
     * Sets the value of the enginekw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setENGINEKW(Double value) {
        this.enginekw = value;
    }

    /**
     * Gets the value of the enginehp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getENGINEHP() {
        return enginehp;
    }

    /**
     * Sets the value of the enginehp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setENGINEHP(Double value) {
        this.enginehp = value;
    }

    /**
     * Gets the value of the designcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESIGNCODE() {
        return designcode;
    }

    /**
     * Sets the value of the designcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESIGNCODE(String value) {
        this.designcode = value;
    }

    /**
     * Gets the value of the cruisespeed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCRUISESPEED() {
        return cruisespeed;
    }

    /**
     * Sets the value of the cruisespeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCRUISESPEED(Double value) {
        this.cruisespeed = value;
    }

    /**
     * Gets the value of the totaltankcap property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTOTALTANKCAP() {
        return totaltankcap;
    }

    /**
     * Sets the value of the totaltankcap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTOTALTANKCAP(Double value) {
        this.totaltankcap = value;
    }

    /**
     * Gets the value of the totaltanks property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTOTALTANKS() {
        return totaltanks;
    }

    /**
     * Sets the value of the totaltanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTOTALTANKS(BigInteger value) {
        this.totaltanks = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHEIGHT() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHEIGHT(Double value) {
        this.height = value;
    }

    /**
     * Gets the value of the grossweight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGROSSWEIGHT() {
        return grossweight;
    }

    /**
     * Sets the value of the grossweight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGROSSWEIGHT(Double value) {
        this.grossweight = value;
    }

    /**
     * Gets the value of the beam property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBEAM() {
        return beam;
    }

    /**
     * Sets the value of the beam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBEAM(Double value) {
        this.beam = value;
    }

    /**
     * Gets the value of the axes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAXES() {
        return axes;
    }

    /**
     * Sets the value of the axes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAXES(BigInteger value) {
        this.axes = value;
    }

    /**
     * Gets the value of the clearancedatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLEARANCEDATETIME() {
        return clearancedatetime;
    }

    /**
     * Sets the value of the clearancedatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLEARANCEDATETIME(XMLGregorianCalendar value) {
        this.clearancedatetime = value;
    }

    /**
     * Gets the value of the clearancegivenby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLEARANCEGIVENBY() {
        return clearancegivenby;
    }

    /**
     * Sets the value of the clearancegivenby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLEARANCEGIVENBY(String value) {
        this.clearancegivenby = value;
    }

    /**
     * Gets the value of the swathoperable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWATHOPERABLE() {
        return swathoperable;
    }

    /**
     * Sets the value of the swathoperable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWATHOPERABLE(String value) {
        this.swathoperable = value;
    }

    /**
     * Gets the value of the article25STATUS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARTICLE25STATUS() {
        return article25STATUS;
    }

    /**
     * Sets the value of the article25STATUS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARTICLE25STATUS(String value) {
        this.article25STATUS = value;
    }

    /**
     * Gets the value of the article16STATUS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARTICLE16STATUS() {
        return article16STATUS;
    }

    /**
     * Sets the value of the article16STATUS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARTICLE16STATUS(String value) {
        this.article16STATUS = value;
    }

    /**
     * Gets the value of the mmsiid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMSIID() {
        return mmsiid;
    }

    /**
     * Sets the value of the mmsiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMSIID(String value) {
        this.mmsiid = value;
    }

    /**
     * Gets the value of the callsign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALLSIGN() {
        return callsign;
    }

    /**
     * Sets the value of the callsign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALLSIGN(String value) {
        this.callsign = value;
    }

    /**
     * Gets the value of the vesselname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVESSELNAME() {
        return vesselname;
    }

    /**
     * Sets the value of the vesselname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVESSELNAME(String value) {
        this.vesselname = value;
    }

    /**
     * Gets the value of the vesseltypeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVESSELTYPEID() {
        return vesseltypeid;
    }

    /**
     * Sets the value of the vesseltypeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVESSELTYPEID(String value) {
        this.vesseltypeid = value;
    }

}
