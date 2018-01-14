package employees.soapobjects;

import javax.xml.bind.annotation.XmlElement;

import static employees.utils.NamespaceMapper.HOL_URI;

public class UzytkownicyAktualizacja {

    private UzytkownicyAktualizacjaRequest request;

    public UzytkownicyAktualizacja(UzytkownicyAktualizacjaRequest request) {
        this.request = request;
    }

    public UzytkownicyAktualizacja() {
    }

    public UzytkownicyAktualizacjaRequest getRequest() {
        return this.request;
    }

    @XmlElement(name = "uzytkownicyAktualizacjaRequest", namespace = HOL_URI)
    public void setRequest(UzytkownicyAktualizacjaRequest request) {
        this.request = request;
    }
}
