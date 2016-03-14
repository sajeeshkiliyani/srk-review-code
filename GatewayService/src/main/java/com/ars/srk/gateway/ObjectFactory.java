
package com.ars.srk.gateway;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ars.srk.channelgateway package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ChangeCenterOrRoleRequest_QNAME = new QName("http://www.srk.org/IVSUserManagement/", "ChangeCenterOrRoleRequest");
    private final static QName _ChangeCenterOrRoleResponse_QNAME = new QName("http://www.srk.org/IVSUserManagement/", "ChangeCenterOrRoleResponse");
    private final static QName _LISTJOURNEYSRESPONSE_QNAME = new QName("http://www.srk.org/IVSJourneyManagement/", "LIST_JOURNEYS_RESPONSE");
    private final static QName _LISTJOURNEYSREQUEST_QNAME = new QName("http://www.srk.org/IVSJourneyManagement/", "LIST_JOURNEYS_REQUEST");
    private final static QName _LISTVESSELSRESPONSE_QNAME = new QName("http://www.srk.org/IVSJourneyManagement/", "LIST_VESSELS_RESPONSE");
    private final static QName _UserAuthenticationRequest_QNAME = new QName("http://www.srk.org/IVSUserManagement/", "UserAuthenticationRequest");
    private final static QName _UserAuthenticationResponse_QNAME = new QName("http://www.srk.org/IVSUserManagement/", "UserAuthenticationResponse");
    private final static QName _LISTVESSELSREQUEST_QNAME = new QName("http://www.srk.org/IVSJourneyManagement/", "LIST_VESSELS_REQUEST");
    private final static QName _MANAGEJOURNEYRESPONSE_QNAME = new QName("http://www.srk.org/IVSJourneyManagement/", "MANAGE_JOURNEY_RESPONSE");
    private final static QName _UserLogoutResponse_QNAME = new QName("http://www.srk.org/IVSUserManagement/", "UserLogoutResponse");
    private final static QName _MANAGEJOURNEYREQUEST_QNAME = new QName("http://www.srk.org/IVSJourneyManagement/", "MANAGE_JOURNEY_REQUEST");
    private final static QName _UserLogoutRequest_QNAME = new QName("http://www.srk.org/IVSUserManagement/", "UserLogoutRequest");
    private final static QName _GetListDefinitionResponse_QNAME = new QName("http://www.srk.org/IVSUserManagement/", "GetListDefinitionResponse");
    private final static QName _Exception_QNAME = new QName("http://www.srk.org/exception/", "Exception");
    private final static QName _Message_QNAME = new QName("http://www.srk.org/MuleMessageModel/", "Message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ars.srk.channelgateway
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserAuthenticationResponseType }
     * 
     */
    public UserAuthenticationResponseType createUserAuthenticationResponseType() {
        return new UserAuthenticationResponseType();
    }

    /**
     * Create an instance of {@link UserAuthenticationResponseType.IVSUser }
     * 
     */
    public UserAuthenticationResponseType.IVSUser createUserAuthenticationResponseTypeIVSUser() {
        return new UserAuthenticationResponseType.IVSUser();
    }

    /**
     * Create an instance of {@link UserAuthenticationResponseType.IVSUser.Centres }
     * 
     */
    public UserAuthenticationResponseType.IVSUser.Centres createUserAuthenticationResponseTypeIVSUserCentres() {
        return new UserAuthenticationResponseType.IVSUser.Centres();
    }

    /**
     * Create an instance of {@link UserAuthenticationResponseType.IVSUser.Centres.Centre }
     * 
     */
    public UserAuthenticationResponseType.IVSUser.Centres.Centre createUserAuthenticationResponseTypeIVSUserCentresCentre() {
        return new UserAuthenticationResponseType.IVSUser.Centres.Centre();
    }

    /**
     * Create an instance of {@link UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles }
     * 
     */
    public UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles createUserAuthenticationResponseTypeIVSUserCentresCentreRoles() {
        return new UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles();
    }

    /**
     * Create an instance of {@link ExceptionType }
     * 
     */
    public ExceptionType createExceptionType() {
        return new ExceptionType();
    }

    /**
     * Create an instance of {@link ManageJourneyType }
     * 
     */
    public ManageJourneyType createManageJourneyType() {
        return new ManageJourneyType();
    }

    /**
     * Create an instance of {@link VesselsType }
     * 
     */
    public VesselsType createVesselsType() {
        return new VesselsType();
    }

    /**
     * Create an instance of {@link ListJourneysType }
     * 
     */
    public ListJourneysType createListJourneysType() {
        return new ListJourneysType();
    }

    /**
     * Create an instance of {@link JourneyType }
     * 
     */
    public JourneyType createJourneyType() {
        return new JourneyType();
    }

    /**
     * Create an instance of {@link ListVesselsType }
     * 
     */
    public ListVesselsType createListVesselsType() {
        return new ListVesselsType();
    }

    /**
     * Create an instance of {@link JourneysType }
     * 
     */
    public JourneysType createJourneysType() {
        return new JourneysType();
    }

    /**
     * Create an instance of {@link Vessels }
     * 
     */
    public Vessels createVessels() {
        return new Vessels();
    }

    /**
     * Create an instance of {@link Vessel }
     * 
     */
    public Vessel createVessel() {
        return new Vessel();
    }

    /**
     * Create an instance of {@link MessageStatus }
     * 
     */
    public MessageStatus createMessageStatus() {
        return new MessageStatus();
    }

    /**
     * Create an instance of {@link LabelsType }
     * 
     */
    public LabelsType createLabelsType() {
        return new LabelsType();
    }

    /**
     * Create an instance of {@link LabelType }
     * 
     */
    public LabelType createLabelType() {
        return new LabelType();
    }

    /**
     * Create an instance of {@link Journeys }
     * 
     */
    public Journeys createJourneys() {
        return new Journeys();
    }

    /**
     * Create an instance of {@link Journey }
     * 
     */
    public Journey createJourney() {
        return new Journey();
    }

    /**
     * Create an instance of {@link ListDefinitionGetReponseType }
     * 
     */
    public ListDefinitionGetReponseType createListDefinitionGetReponseType() {
        return new ListDefinitionGetReponseType();
    }

    /**
     * Create an instance of {@link UserLogoutResponseType }
     * 
     */
    public UserLogoutResponseType createUserLogoutResponseType() {
        return new UserLogoutResponseType();
    }

    /**
     * Create an instance of {@link AuthenticationRequestType }
     * 
     */
    public AuthenticationRequestType createAuthenticationRequestType() {
        return new AuthenticationRequestType();
    }

    /**
     * Create an instance of {@link UserLogoutInfoType }
     * 
     */
    public UserLogoutInfoType createUserLogoutInfoType() {
        return new UserLogoutInfoType();
    }

    /**
     * Create an instance of {@link ChangeCenterOrRoleNotificationType }
     * 
     */
    public ChangeCenterOrRoleNotificationType createChangeCenterOrRoleNotificationType() {
        return new ChangeCenterOrRoleNotificationType();
    }

    /**
     * Create an instance of {@link ChangeCenterOrRoleResponseType }
     * 
     */
    public ChangeCenterOrRoleResponseType createChangeCenterOrRoleResponseType() {
        return new ChangeCenterOrRoleResponseType();
    }

    /**
     * Create an instance of {@link MultipleCentreRoleType }
     * 
     */
    public MultipleCentreRoleType createMultipleCentreRoleType() {
        return new MultipleCentreRoleType();
    }

    /**
     * Create an instance of {@link ColumnIDType }
     * 
     */
    public ColumnIDType createColumnIDType() {
        return new ColumnIDType();
    }

    /**
     * Create an instance of {@link CentreRoleType }
     * 
     */
    public CentreRoleType createCentreRoleType() {
        return new CentreRoleType();
    }

    /**
     * Create an instance of {@link ListDefinition }
     * 
     */
    public ListDefinition createListDefinition() {
        return new ListDefinition();
    }

    /**
     * Create an instance of {@link ListDefinitions }
     * 
     */
    public ListDefinitions createListDefinitions() {
        return new ListDefinitions();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link RecipientsType }
     * 
     */
    public RecipientsType createRecipientsType() {
        return new RecipientsType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link UserSessionType }
     * 
     */
    public UserSessionType createUserSessionType() {
        return new UserSessionType();
    }

    /**
     * Create an instance of {@link BodyType }
     * 
     */
    public BodyType createBodyType() {
        return new BodyType();
    }

    /**
     * Create an instance of {@link RecipientType }
     * 
     */
    public RecipientType createRecipientType() {
        return new RecipientType();
    }

    /**
     * Create an instance of {@link MessagePropertiesType }
     * 
     */
    public MessagePropertiesType createMessagePropertiesType() {
        return new MessagePropertiesType();
    }

    /**
     * Create an instance of {@link ESBServicesType }
     * 
     */
    public ESBServicesType createESBServicesType() {
        return new ESBServicesType();
    }

    /**
     * Create an instance of {@link FromType }
     * 
     */
    public FromType createFromType() {
        return new FromType();
    }

    /**
     * Create an instance of {@link ToType }
     * 
     */
    public ToType createToType() {
        return new ToType();
    }

    /**
     * Create an instance of {@link MessageIdentificationType }
     * 
     */
    public MessageIdentificationType createMessageIdentificationType() {
        return new MessageIdentificationType();
    }

    /**
     * Create an instance of {@link UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles.Role }
     * 
     */
    public UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles.Role createUserAuthenticationResponseTypeIVSUserCentresCentreRolesRole() {
        return new UserAuthenticationResponseType.IVSUser.Centres.Centre.Roles.Role();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeCenterOrRoleNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/IVSUserManagement/", name = "ChangeCenterOrRoleRequest")
    public JAXBElement<ChangeCenterOrRoleNotificationType> createChangeCenterOrRoleRequest(ChangeCenterOrRoleNotificationType value) {
        return new JAXBElement<ChangeCenterOrRoleNotificationType>(_ChangeCenterOrRoleRequest_QNAME, ChangeCenterOrRoleNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeCenterOrRoleResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/IVSUserManagement/", name = "ChangeCenterOrRoleResponse")
    public JAXBElement<ChangeCenterOrRoleResponseType> createChangeCenterOrRoleResponse(ChangeCenterOrRoleResponseType value) {
        return new JAXBElement<ChangeCenterOrRoleResponseType>(_ChangeCenterOrRoleResponse_QNAME, ChangeCenterOrRoleResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/IVSJourneyManagement/", name = "LIST_JOURNEYS_RESPONSE")
    public JAXBElement<JourneysType> createLISTJOURNEYSRESPONSE(JourneysType value) {
        return new JAXBElement<JourneysType>(_LISTJOURNEYSRESPONSE_QNAME, JourneysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListJourneysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/IVSJourneyManagement/", name = "LIST_JOURNEYS_REQUEST")
    public JAXBElement<ListJourneysType> createLISTJOURNEYSREQUEST(ListJourneysType value) {
        return new JAXBElement<ListJourneysType>(_LISTJOURNEYSREQUEST_QNAME, ListJourneysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VesselsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/IVSJourneyManagement/", name = "LIST_VESSELS_RESPONSE")
    public JAXBElement<VesselsType> createLISTVESSELSRESPONSE(VesselsType value) {
        return new JAXBElement<VesselsType>(_LISTVESSELSRESPONSE_QNAME, VesselsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/IVSUserManagement/", name = "UserAuthenticationRequest")
    public JAXBElement<AuthenticationRequestType> createUserAuthenticationRequest(AuthenticationRequestType value) {
        return new JAXBElement<AuthenticationRequestType>(_UserAuthenticationRequest_QNAME, AuthenticationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthenticationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/IVSUserManagement/", name = "UserAuthenticationResponse")
    public JAXBElement<UserAuthenticationResponseType> createUserAuthenticationResponse(UserAuthenticationResponseType value) {
        return new JAXBElement<UserAuthenticationResponseType>(_UserAuthenticationResponse_QNAME, UserAuthenticationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListVesselsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/IVSJourneyManagement/", name = "LIST_VESSELS_REQUEST")
    public JAXBElement<ListVesselsType> createLISTVESSELSREQUEST(ListVesselsType value) {
        return new JAXBElement<ListVesselsType>(_LISTVESSELSREQUEST_QNAME, ListVesselsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/IVSJourneyManagement/", name = "MANAGE_JOURNEY_RESPONSE")
    public JAXBElement<JourneyType> createMANAGEJOURNEYRESPONSE(JourneyType value) {
        return new JAXBElement<JourneyType>(_MANAGEJOURNEYRESPONSE_QNAME, JourneyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLogoutResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/IVSUserManagement/", name = "UserLogoutResponse")
    public JAXBElement<UserLogoutResponseType> createUserLogoutResponse(UserLogoutResponseType value) {
        return new JAXBElement<UserLogoutResponseType>(_UserLogoutResponse_QNAME, UserLogoutResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageJourneyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/IVSJourneyManagement/", name = "MANAGE_JOURNEY_REQUEST")
    public JAXBElement<ManageJourneyType> createMANAGEJOURNEYREQUEST(ManageJourneyType value) {
        return new JAXBElement<ManageJourneyType>(_MANAGEJOURNEYREQUEST_QNAME, ManageJourneyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLogoutInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/IVSUserManagement/", name = "UserLogoutRequest")
    public JAXBElement<UserLogoutInfoType> createUserLogoutRequest(UserLogoutInfoType value) {
        return new JAXBElement<UserLogoutInfoType>(_UserLogoutRequest_QNAME, UserLogoutInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDefinitionGetReponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/IVSUserManagement/", name = "GetListDefinitionResponse")
    public JAXBElement<ListDefinitionGetReponseType> createGetListDefinitionResponse(ListDefinitionGetReponseType value) {
        return new JAXBElement<ListDefinitionGetReponseType>(_GetListDefinitionResponse_QNAME, ListDefinitionGetReponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/exception/", name = "Exception")
    public JAXBElement<ExceptionType> createException(ExceptionType value) {
        return new JAXBElement<ExceptionType>(_Exception_QNAME, ExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.srk.org/MuleMessageModel/", name = "Message")
    public JAXBElement<MessageType> createMessage(MessageType value) {
        return new JAXBElement<MessageType>(_Message_QNAME, MessageType.class, null, value);
    }

}
