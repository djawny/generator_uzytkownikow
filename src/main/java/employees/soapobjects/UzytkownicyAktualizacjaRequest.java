package employees.soapobjects;

import javax.xml.bind.annotation.XmlElement;
import java.text.SimpleDateFormat;
import java.util.Date;

import static employees.utils.NamespaceMapper.REQ_URI;

public class UzytkownicyAktualizacjaRequest {

    private ListaStruktur list;
    private String systemKlucz;
    private String zadanieGuid;
    private String zadanieCzas;

    public UzytkownicyAktualizacjaRequest(ListaStruktur list) {
        this.list = list;
        this.systemKlucz = "NEX001";
        this.zadanieGuid = "3c16c2c9-8ce3-46f4-899c-fb1d7f0f2bde";
        this.zadanieCzas = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").format(new Date());
    }

    public UzytkownicyAktualizacjaRequest() {
    }

    public String getSystemKlucz() {
        return this.systemKlucz;
    }

    @XmlElement(name = "SystemKlucz", namespace = REQ_URI)
    public void setSystemKlucz(String systemKlucz) {
        this.systemKlucz = systemKlucz;
    }

    public String getZadanieGuid() {
        return this.zadanieGuid;
    }

    @XmlElement(name = "ZadanieGuid", namespace = REQ_URI)
    public void setZadanieGuid(String zadanieGuid) {
        this.zadanieGuid = zadanieGuid;
    }

    public String getZadanieCzas() {
        return this.zadanieCzas;
    }

    @XmlElement(name = "ZadanieCzas", namespace = REQ_URI)
    public void setZadanieCzas(String zadanieCzas) {
        this.zadanieCzas = zadanieCzas;
    }

    public ListaStruktur getList() {
        return this.list;
    }

    @XmlElement(name = "ListaStruktur", namespace = REQ_URI)
    public void setList(ListaStruktur list) {
        this.list = list;
    }
}
