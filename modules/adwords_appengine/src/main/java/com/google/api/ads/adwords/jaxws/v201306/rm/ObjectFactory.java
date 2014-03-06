
package com.google.api.ads.adwords.jaxws.v201306.rm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.google.api.ads.adwords.jaxws.v201306.cm.ApiException;
import com.google.api.ads.adwords.jaxws.v201306.cm.SoapHeader;
import com.google.api.ads.adwords.jaxws.v201306.cm.SoapResponseHeader;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.api.ads.adwords.jaxws.v201306.rm package. 
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

    private final static QName _ResponseHeader_QNAME = new QName("https://adwords.google.com/api/adwords/rm/v201306", "ResponseHeader");
    private final static QName _RequestHeader_QNAME = new QName("https://adwords.google.com/api/adwords/rm/v201306", "RequestHeader");
    private final static QName _ApiExceptionFault_QNAME = new QName("https://adwords.google.com/api/adwords/rm/v201306", "ApiExceptionFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.api.ads.adwords.jaxws.v201306.rm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserListReturnValue }
     * 
     */
    public UserListReturnValue createUserListReturnValue() {
        return new UserListReturnValue();
    }

    /**
     * Create an instance of {@link UserList }
     * 
     */
    public UserList createUserList() {
        return new UserList();
    }

    /**
     * Create an instance of {@link UserListOperation }
     * 
     */
    public UserListOperation createUserListOperation() {
        return new UserListOperation();
    }

    /**
     * Create an instance of {@link CollectionSizeError }
     * 
     */
    public CollectionSizeError createCollectionSizeError() {
        return new CollectionSizeError();
    }

    /**
     * Create an instance of {@link UserInterest }
     * 
     */
    public UserInterest createUserInterest() {
        return new UserInterest();
    }

    /**
     * Create an instance of {@link BasicUserList }
     * 
     */
    public BasicUserList createBasicUserList() {
        return new BasicUserList();
    }

    /**
     * Create an instance of {@link UserListLogicalRule }
     * 
     */
    public UserListLogicalRule createUserListLogicalRule() {
        return new UserListLogicalRule();
    }

    /**
     * Create an instance of {@link ExternalRemarketingUserList }
     * 
     */
    public ExternalRemarketingUserList createExternalRemarketingUserList() {
        return new ExternalRemarketingUserList();
    }

    /**
     * Create an instance of {@link UserListError }
     * 
     */
    public UserListError createUserListError() {
        return new UserListError();
    }

    /**
     * Create an instance of {@link UserListPage }
     * 
     */
    public UserListPage createUserListPage() {
        return new UserListPage();
    }

    /**
     * Create an instance of {@link LogicalUserList }
     * 
     */
    public LogicalUserList createLogicalUserList() {
        return new LogicalUserList();
    }

    /**
     * Create an instance of {@link UserListConversionType }
     * 
     */
    public UserListConversionType createUserListConversionType() {
        return new UserListConversionType();
    }

    /**
     * Create an instance of {@link LogicalUserListOperand }
     * 
     */
    public LogicalUserListOperand createLogicalUserListOperand() {
        return new LogicalUserListOperand();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/rm/v201306", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/rm/v201306", name = "RequestHeader")
    public JAXBElement<SoapHeader> createRequestHeader(SoapHeader value) {
        return new JAXBElement<SoapHeader>(_RequestHeader_QNAME, SoapHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/rm/v201306", name = "ApiExceptionFault")
    public JAXBElement<ApiException> createApiExceptionFault(ApiException value) {
        return new JAXBElement<ApiException>(_ApiExceptionFault_QNAME, ApiException.class, null, value);
    }

}
