package employees.soapobjects;

import javax.xml.bind.annotation.XmlElement;

public class UzytkownicyAktualizacja {

    private final String HOL_URI = "http://holding.pl/HOLDINGWCF";

    private UzytkownicyAktualizacjaRequest request;

    public UzytkownicyAktualizacja(UzytkownicyAktualizacjaRequest request) {
        this.request = request;
    }

    public UzytkownicyAktualizacja() {}

    public UzytkownicyAktualizacjaRequest getRequest() {
        return this.request;
    }

    @XmlElement(name = "uzytkownicyAktualizacjaRequest", namespace = HOL_URI)
    public void setRequest(UzytkownicyAktualizacjaRequest request) {
        this.request = request;
    }
}
