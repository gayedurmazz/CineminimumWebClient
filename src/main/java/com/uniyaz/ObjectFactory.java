
package com.uniyaz;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uniyaz package. 
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

    private final static QName _SaveUser_QNAME = new QName("http://soap.service.cinema.uniyaz.com/", "saveUser");
    private final static QName _SaveUserResponse_QNAME = new QName("http://soap.service.cinema.uniyaz.com/", "saveUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uniyaz
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveUser }
     * 
     */
    public SaveUser createSaveUser() {
        return new SaveUser();
    }

    /**
     * Create an instance of {@link SaveUserResponse }
     * 
     */
    public SaveUserResponse createSaveUserResponse() {
        return new SaveUserResponse();
    }

    /**
     * Create an instance of {@link UserDto }
     * 
     */
    public UserDto createUserDto() {
        return new UserDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.service.cinema.uniyaz.com/", name = "saveUser")
    public JAXBElement<SaveUser> createSaveUser(SaveUser value) {
        return new JAXBElement<SaveUser>(_SaveUser_QNAME, SaveUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.service.cinema.uniyaz.com/", name = "saveUserResponse")
    public JAXBElement<SaveUserResponse> createSaveUserResponse(SaveUserResponse value) {
        return new JAXBElement<SaveUserResponse>(_SaveUserResponse_QNAME, SaveUserResponse.class, null, value);
    }

}
