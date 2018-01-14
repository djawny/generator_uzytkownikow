package employees.soapobjects;

import javax.xml.bind.annotation.XmlElement;

import static employees.utils.NamespaceMapper.HOL1_URI;

public class BazaDanych {

    private Baza baza;

    public BazaDanych(Baza baza) {
        this.baza = baza;
    }

    public BazaDanych() {
    }

    public Baza getBaza() {
        return this.baza;
    }

    @XmlElement(name = "BazaDTO", namespace = HOL1_URI)
    public void setBaza(Baza baza) {
        this.baza = baza;
    }
}
