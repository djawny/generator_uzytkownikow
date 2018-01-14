package employees.soapobjects;

import javax.xml.bind.annotation.XmlElement;

public class BazaDanych {

    private final String DATABASE_NAME = "1000";
    private final String COMPANY_NAME = "Centrum_Holding1_SA_SpK_testowa";
    private final String HOL1_URI = "http://schemas.datacontract.org/2004/07/HoldingDTO.DTO.KadryPlace";
    private Baza baza;

    public BazaDanych(Baza baza) {
        this.baza = baza;
    }

    public BazaDanych() {
        baza = new Baza(DATABASE_NAME, COMPANY_NAME);
    }

    public Baza getBaza() {
        return this.baza;
    }

    @XmlElement(name = "BazaDTO", namespace = HOL1_URI)
    public void setBaza(Baza baza) {
        this.baza = baza;
    }
}
