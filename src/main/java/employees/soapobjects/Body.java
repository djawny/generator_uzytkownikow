package employees.soapobjects;

import javax.xml.bind.annotation.XmlElement;

public class Body {

    private final String HOL_URI = "http://holding.pl/HOLDINGWCF";

    private UzytkownicyAktualizacja akt;

    public Body(UzytkownicyAktualizacja akt) {
        this.akt = akt;
    }

    public Body() {
    }

    public UzytkownicyAktualizacja getAkt() {
        return this.akt;
    }

    @XmlElement(name = "UzytkownicyAktualizacja", namespace = HOL_URI)
    public void setAkt(UzytkownicyAktualizacja akt) {
        this.akt = akt;
    }
}
