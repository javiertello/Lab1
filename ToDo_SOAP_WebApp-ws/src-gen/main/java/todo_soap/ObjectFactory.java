
package todo_soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the todo_soap package. 
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

    private final static QName _ListToDo_QNAME = new QName("http://toDo_SOAP/", "listToDo");
    private final static QName _ListToDoResponse_QNAME = new QName("http://toDo_SOAP/", "listToDoResponse");
    private final static QName _RemoveToDoResponse_QNAME = new QName("http://toDo_SOAP/", "removeToDoResponse");
    private final static QName _AddToDo_QNAME = new QName("http://toDo_SOAP/", "addToDo");
    private final static QName _AddToDoResponse_QNAME = new QName("http://toDo_SOAP/", "addToDoResponse");
    private final static QName _RemoveToDo_QNAME = new QName("http://toDo_SOAP/", "removeToDo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: todo_soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveToDo }
     * 
     */
    public RemoveToDo createRemoveToDo() {
        return new RemoveToDo();
    }

    /**
     * Create an instance of {@link AddToDoResponse }
     * 
     */
    public AddToDoResponse createAddToDoResponse() {
        return new AddToDoResponse();
    }

    /**
     * Create an instance of {@link AddToDo }
     * 
     */
    public AddToDo createAddToDo() {
        return new AddToDo();
    }

    /**
     * Create an instance of {@link RemoveToDoResponse }
     * 
     */
    public RemoveToDoResponse createRemoveToDoResponse() {
        return new RemoveToDoResponse();
    }

    /**
     * Create an instance of {@link ListToDo }
     * 
     */
    public ListToDo createListToDo() {
        return new ListToDo();
    }

    /**
     * Create an instance of {@link ListToDoResponse }
     * 
     */
    public ListToDoResponse createListToDoResponse() {
        return new ListToDoResponse();
    }

    /**
     * Create an instance of {@link ToDo }
     * 
     */
    public ToDo createToDo() {
        return new ToDo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListToDo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toDo_SOAP/", name = "listToDo")
    public JAXBElement<ListToDo> createListToDo(ListToDo value) {
        return new JAXBElement<ListToDo>(_ListToDo_QNAME, ListToDo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListToDoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toDo_SOAP/", name = "listToDoResponse")
    public JAXBElement<ListToDoResponse> createListToDoResponse(ListToDoResponse value) {
        return new JAXBElement<ListToDoResponse>(_ListToDoResponse_QNAME, ListToDoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveToDoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toDo_SOAP/", name = "removeToDoResponse")
    public JAXBElement<RemoveToDoResponse> createRemoveToDoResponse(RemoveToDoResponse value) {
        return new JAXBElement<RemoveToDoResponse>(_RemoveToDoResponse_QNAME, RemoveToDoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddToDo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toDo_SOAP/", name = "addToDo")
    public JAXBElement<AddToDo> createAddToDo(AddToDo value) {
        return new JAXBElement<AddToDo>(_AddToDo_QNAME, AddToDo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddToDoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toDo_SOAP/", name = "addToDoResponse")
    public JAXBElement<AddToDoResponse> createAddToDoResponse(AddToDoResponse value) {
        return new JAXBElement<AddToDoResponse>(_AddToDoResponse_QNAME, AddToDoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveToDo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toDo_SOAP/", name = "removeToDo")
    public JAXBElement<RemoveToDo> createRemoveToDo(RemoveToDo value) {
        return new JAXBElement<RemoveToDo>(_RemoveToDo_QNAME, RemoveToDo.class, null, value);
    }

}
