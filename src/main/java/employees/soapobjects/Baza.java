package employees.soapobjects;

import javax.xml.bind.annotation.XmlElement;

import static employees.utils.NamespaceMapper.HOL1_URI;

public class Baza {

    private String bazaDanych;
    private String NazwaFirmy;

    public Baza() {
    }

    public String getBazaDanych() {
        return this.bazaDanych;
    }

    @XmlElement(name = "BazaDanych", namespace = HOL1_URI)
    public void setBazaDanych(String bazaDanych) {
        this.bazaDanych = bazaDanych;
    }

    public String getNazwaFirmy() {
        return this.NazwaFirmy;
    }

    @XmlElement(name = "NazwaFirmy", namespace = HOL1_URI)
    public void setNazwaFirmy(String nazwaFirmy) {
        this.NazwaFirmy = nazwaFirmy;
    }
}
