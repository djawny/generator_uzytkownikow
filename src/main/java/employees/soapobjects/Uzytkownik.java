package employees.soapobjects;

import javax.xml.bind.annotation.XmlElement;

public class Uzytkownik {

    private final String HOL1_URI = "http://schemas.datacontract.org/2004/07/HoldingDTO.DTO.KadryPlace";

    private BazaDanych bazaDanych;
    private boolean czyDlaSystemuKadrowego;
    private String email;
    String imie;
    private int kodOperacji;
    private String loginAD;
    private String nazwisko;
    private long pracownikKlucz;
    private String telefonKomorkowy;
    private String telefonKorporacyjny;
    private String telefonStacjonarny;
    private String telefonWewnetrzny;

    public BazaDanych getBazaDanych() {
        return this.bazaDanych;
    }

    @XmlElement(name = "BazyDanych", namespace = HOL1_URI)
    public void setBazaDanych(BazaDanych bazaDanych) {
        this.bazaDanych = bazaDanych;
    }

    public boolean isCzyDlaSystemuKadrowego() {
        return this.czyDlaSystemuKadrowego;
    }

    @XmlElement(name = "CzyDlaSystemuKadrowego", namespace = HOL1_URI)
    public void setCzyDlaSystemuKadrowego(boolean czyDlaSystemuKadrowego) {
        this.czyDlaSystemuKadrowego = czyDlaSystemuKadrowego;
    }

    public String getEmail() {
        return this.email;
    }

    @XmlElement(name = "Email", namespace = HOL1_URI)
    public void setEmail(String email) {
        this.email = email;
    }

    public String getImie() {
        return this.imie;
    }

    @XmlElement(name = "Imie", namespace = HOL1_URI)
    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getKodOperacji() {
        return this.kodOperacji;
    }

    @XmlElement(name = "KodOperacji", namespace = HOL1_URI)
    public void setKodOperacji(int kodOperacji) {
        this.kodOperacji = kodOperacji;
    }

    public String getLoginAD() {
        return this.loginAD;
    }

    @XmlElement(name = "LoginAD", namespace = HOL1_URI, required = true, nillable = true)
    public void setLoginAD(String loginAD) {
        this.loginAD = loginAD;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    @XmlElement(name = "Nazwisko", namespace = HOL1_URI)
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public long getPracownikKlucz() {
        return this.pracownikKlucz;
    }

    @XmlElement(name = "PracownikKlucz", namespace = HOL1_URI)
    public void setPracownikKlucz(long pracownikKlucz) {
        this.pracownikKlucz = pracownikKlucz;
    }

    public String getTelefonKomorkowy() {
        return this.telefonKomorkowy;
    }

    @XmlElement(name = "TelefonKomorkowy", namespace = HOL1_URI, required = true, nillable = true)
    public void setTelefonKomorkowy(String telefonKomorkowy) {
        this.telefonKomorkowy = telefonKomorkowy;
    }

    public String getTelefonKorporacyjny() {
        return this.telefonKorporacyjny;
    }

    @XmlElement(name = "TelefonKorporacyjny", namespace = HOL1_URI, required = true, nillable = true)
    public void setTelefonKorporacyjny(String telefonKorporacyjny) {
        this.telefonKorporacyjny = telefonKorporacyjny;
    }

    public String getTelefonStacjonarny() {
        return this.telefonStacjonarny;
    }

    @XmlElement(name = "TelefonStacjonarny", namespace = HOL1_URI, required = true, nillable = true)
    public void setTelefonStacjonarny(String telefonStacjonarny) {
        this.telefonStacjonarny = telefonStacjonarny;
    }

    public String getTelefonWewnetrzny() {
        return this.telefonWewnetrzny;
    }

    @XmlElement(name = "TelefonWewnetrzny", namespace = HOL1_URI, required = true, nillable = true)
    public void setTelefonWewnetrzny(String telefonWewnetrzny) {
        this.telefonWewnetrzny = telefonWewnetrzny;
    }
}
