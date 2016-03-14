
package com.ars.srk.gateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserAuthenticationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAuthenticationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IVSUser">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LastLoginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="DefaultCentre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Centres">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Centre" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CentreName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CentreID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="IsOperational" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="XPosition" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                       &lt;element name="YPosition" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                       &lt;element name="DefaultArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Roles">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Role" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="RoleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "UserAuthenticationResponseType", namespace = "http://www.srk.org/IVSUserManagement/", propOrder = {
    "ivsUser"
})
public class UserAuthenticationResponseType {

    @XmlElement(name = "IVSUser", required = true)
    protected UserAuthenticationResponseType.IVSUser ivsUser;

    /**
     * Gets the value of the ivsUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserAuthenticationResponseType.IVSUser }
     *     
     */
    public UserAuthenticationResponseType.IVSUser getIVSUser() {
        return ivsUser;
    }

    /**
     * Sets the value of the ivsUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAuthenticationResponseType.IVSUser }
     *     
     */
    public void setIVSUser(UserAuthenticationResponseType.IVSUser value) {
        this.ivsUser = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="LastLoginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="DefaultCentre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Centres">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Centre" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CentreName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CentreID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="IsOperational" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                             &lt;element name="XPosition" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                             &lt;element name="YPosition" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                             &lt;element name="DefaultArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Roles">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Role" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="RoleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "userName",
        "userId",
        "firstName",
        "lastName",
        "accountStatus",
        "lastLoginTime",
        "defaultCentre",
        "centres"
    })
    public static class IVSUser {

        @XmlElement(name = "UserName", required = true)
        protected String userName;
        @XmlElement(name = "UserId")
        protected byte userId;
        @XmlElement(name = "FirstName", required = true)
        protected String firstName;
        @XmlElement(name = "LastName", required = true)
        protected String lastName;
        @XmlElement(name = "AccountStatus", required = true)
        protected String accountStatus;
        @XmlElement(name = "LastLoginTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastLoginTime;
        @XmlElement(name = "DefaultCentre", required = true)
        protected String defaultCentre;
        @XmlElement(name = "Centres", required = true)
        protected UserAuthenticationResponseType.IVSUser.Centres centres;

        /**
         * Gets the value of the userName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserName() {
            return userName;
        }

        /**
         * Sets the value of the userName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserName(String value) {
            this.userName = value;
        }

        /**
         * Gets the value of the userId property.
         * 
         */
        public byte getUserId() {
            return userId;
        }

        /**
         * Sets the value of the userId property.
         * 
         */
        public void setUserId(byte value) {
            this.userId = value;
        }

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the accountStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountStatus() {
            return accountStatus;
        }

        /**
         * Sets the value of the accountStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountStatus(String value) {
            this.accountStatus = value;
        }

        /**
         * Gets the value of the lastLoginTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastLoginTime() {
            return lastLoginTime;
        }

        /**
         * Sets the value of the lastLoginTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastLoginTime(XMLGregorianCalendar value) {
            this.lastLoginTime = value;
        }

        /**
         * Gets the value of the defaultCentre property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefaultCentre() {
            return defaultCentre;
        }

        /**
         * Sets the value of the defaultCentre property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefaultCentre(String value) {
            this.defaultCentre = value;
        }

        /**
         * Gets the value of the centres property.
         * 
         * @return
         *     possible object is
         *     {@link UserAuthenticationResponseType.IVSUser.Centres }
         *     
         */
        public UserAuthenticationResponseType.IVSUser.Centres getCentres() {
            return centres;
        }

        /**
         * Sets the value of the centres property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserAuthenticationResponseType.IVSUser.Centres }
         *     
         */
        public void setCentres(UserAuthenticationResponseType.IVSUser.Centres value) {
            this.centres = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Centre" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CentreName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CentreID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="IsOperational" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                   &lt;element name="XPosition" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="YPosition" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="DefaultArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Roles">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Role" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="RoleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
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
        @XmlType(name = "", propOrder = {
            "centre"
        })
        public static class Centres {

            @XmlElement(name = "Centre")
            protected List<UserAuthenticationResponseType.IVSUser.Centres.Centre> centre;

            /**
             * Gets the value of the centre property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the centre property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCentre().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UserAuthenticationResponseType.IVSUser.Centres.Centre }
             * 
             * 
             */
            public List<UserAuthenticationResponseType.IVSUser.Centres.Centre> getCentre() {
                if (centre == null) {
                    centre = new ArrayList<UserAuthenticationResponseType.IVSUser.Centres.Centre>();
                }
                return this.centre;
            }

            /**
             * Sets the value of the centre property.
             * 
             * @param centre
             *     allowed object is
             *     {@link UserAuthenticationResponseType.IVSUser.Centres.Centre }
             *     
             */
            public void setCentre(List<UserAuthenticationResponseType.IVSUser.Centres.Centre> centre) {
                this.centre = centre;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CentreName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CentreID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="IsOperational" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *         &lt;element name="XPosition" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="YPosition" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="DefaultArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Roles">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Role" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="RoleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
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
            @XmlType(name = "", propOrder = {
                "centreName",
                "centreID",
                "isOperational",
                "xPosition",
                "yPosition",
                "defaultArea",
                "roles"
            })
            public static class Centre {

                @XmlElement(name = "CentreName", required = true)
                protected String centreName;
                @XmlElement(name = "CentreID", required = true)
                protected String centreID;
                @XmlElement(name = "IsOperational")
                protected byte isOperational;
                @XmlElement(name = "XPosition")
                protected float xPosition;
                @XmlElement(name = "YPosition")
                protected float yPosition;
                @XmlElement(name = "DefaultArea", required = true)
                protected String defaultArea;
                @XmlElement(name = "Roles", required = true)
                protected UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles roles;

                /**
                 * Gets the value of the centreName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCentreName() {
                    return centreName;
                }

                /**
                 * Sets the value of the centreName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCentreName(String value) {
                    this.centreName = value;
                }

                /**
                 * Gets the value of the centreID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCentreID() {
                    return centreID;
                }

                /**
                 * Sets the value of the centreID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCentreID(String value) {
                    this.centreID = value;
                }

                /**
                 * Gets the value of the isOperational property.
                 * 
                 */
                public byte getIsOperational() {
                    return isOperational;
                }

                /**
                 * Sets the value of the isOperational property.
                 * 
                 */
                public void setIsOperational(byte value) {
                    this.isOperational = value;
                }

                /**
                 * Gets the value of the xPosition property.
                 * 
                 */
                public float getXPosition() {
                    return xPosition;
                }

                /**
                 * Sets the value of the xPosition property.
                 * 
                 */
                public void setXPosition(float value) {
                    this.xPosition = value;
                }

                /**
                 * Gets the value of the yPosition property.
                 * 
                 */
                public float getYPosition() {
                    return yPosition;
                }

                /**
                 * Sets the value of the yPosition property.
                 * 
                 */
                public void setYPosition(float value) {
                    this.yPosition = value;
                }

                /**
                 * Gets the value of the defaultArea property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefaultArea() {
                    return defaultArea;
                }

                /**
                 * Sets the value of the defaultArea property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefaultArea(String value) {
                    this.defaultArea = value;
                }

                /**
                 * Gets the value of the roles property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles }
                 *     
                 */
                public UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles getRoles() {
                    return roles;
                }

                /**
                 * Sets the value of the roles property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles }
                 *     
                 */
                public void setRoles(UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles value) {
                    this.roles = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Role" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="RoleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
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
                @XmlType(name = "", propOrder = {
                    "role"
                })
                public static class Roles {

                    @XmlElement(name = "Role")
                    protected List<UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles.Role> role;

                    /**
                     * Gets the value of the role property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the role property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRole().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles.Role }
                     * 
                     * 
                     */
                    public List<UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles.Role> getRole() {
                        if (role == null) {
                            role = new ArrayList<UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles.Role>();
                        }
                        return this.role;
                    }

                    /**
                     * Sets the value of the role property.
                     * 
                     * @param role
                     *     allowed object is
                     *     {@link UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles.Role }
                     *     
                     */
                    public void setRole(List<UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles.Role> role) {
                        this.role = role;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="RoleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "roleName",
                        "roleID"
                    })
                    public static class Role {

                        @XmlElement(name = "RoleName", required = true)
                        protected String roleName;
                        @XmlElement(name = "RoleID")
                        protected byte roleID;

                        /**
                         * Gets the value of the roleName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRoleName() {
                            return roleName;
                        }

                        /**
                         * Sets the value of the roleName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRoleName(String value) {
                            this.roleName = value;
                        }

                        /**
                         * Gets the value of the roleID property.
                         * 
                         */
                        public byte getRoleID() {
                            return roleID;
                        }

                        /**
                         * Sets the value of the roleID property.
                         * 
                         */
                        public void setRoleID(byte value) {
                            this.roleID = value;
                        }

                    }

                }

            }

        }

    }

}
