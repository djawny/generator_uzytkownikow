package employees.soapobjects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import static employees.utils.NamespaceMapper.SOAP_URI;

@XmlRootElement(name = "Envelope", namespace = "http://www.w3.org/2003/05/soap-envelope")
public class Envelope {

    private Body body;

    public Envelope(Body body) {
        this.body = body;
    }

    public Envelope() {
    }

    public Body getBody() {
        return this.body;
    }

    @XmlElement(name = "Body", namespace = SOAP_URI)
    public void setBody(Body body) {
        this.body = body;
    }
}
