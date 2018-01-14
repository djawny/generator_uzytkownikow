package employees.soapobjects;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class ListaStruktur {

    private static final String HOL1_URI = "http://schemas.datacontract.org/2004/07/HoldingDTO.DTO.KadryPlace";

    private List<Uzytkownik> listaStruktur;

    public ListaStruktur() {
    }

    public ListaStruktur(List<Uzytkownik> listaStruktur) {
        this.listaStruktur = listaStruktur;
    }

    public List<Uzytkownik> getListaStruktur() {
        return this.listaStruktur;
    }

    @XmlElement(name = "UzytkownikDTO", namespace = HOL1_URI)
    public void setListaStruktur(List<Uzytkownik> listaStruktur) {
        this.listaStruktur = listaStruktur;
    }

}
