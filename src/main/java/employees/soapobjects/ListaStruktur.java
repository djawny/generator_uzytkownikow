package employees.soapobjects;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

import static employees.utils.NamespaceMapper.HOL1_URI;

public class ListaStruktur {

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
