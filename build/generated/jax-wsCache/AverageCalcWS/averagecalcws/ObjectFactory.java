
package averagecalcws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the averagecalcws package. 
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

    private final static QName _Average_QNAME = new QName("http://averageCalcWS/", "Average");
    private final static QName _AverageResponse_QNAME = new QName("http://averageCalcWS/", "AverageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: averagecalcws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Average }
     * 
     */
    public Average createAverage() {
        return new Average();
    }

    /**
     * Create an instance of {@link AverageResponse }
     * 
     */
    public AverageResponse createAverageResponse() {
        return new AverageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Average }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://averageCalcWS/", name = "Average")
    public JAXBElement<Average> createAverage(Average value) {
        return new JAXBElement<Average>(_Average_QNAME, Average.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AverageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://averageCalcWS/", name = "AverageResponse")
    public JAXBElement<AverageResponse> createAverageResponse(AverageResponse value) {
        return new JAXBElement<AverageResponse>(_AverageResponse_QNAME, AverageResponse.class, null, value);
    }

}
