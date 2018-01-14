package employees.utils;

import employees.soapobjects.Baza;
import employees.soapobjects.BazaDanych;
import employees.soapobjects.Uzytkownik;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UzytkownikGenerator {

    private static final String DATABASE = "1000";
    private static final String COMPANY_NAME = "Centrum_Holding1_SA_SpK_testowa";
    private static final String[] NAMES = {"Agnieszka", "Andrzej", "Marcin", "Marek", "Monika", "Tadeusz", "Tomasz", "Łukasz", "Anna", "Marta", "Ewa", "Michał"};
    private static final String[] SURNAMES = {"Nowak", "Kowalski", "Goralski", "Kowalewski", "Polak", "Kowal", "Przykladowy", "Pokladowy", "Statek", "XMLowy"};
    private static final String EMAIL_DOMAIN = "@holding1.pl";
    private static final int OPERATION_CODE = 1;
    private static final String AD_PREFIX = "ad\\";
    private static final String TELEPHONE_PREFIX = "+48";

    private long firstUserId;
    private int userCount;
    private boolean isForEnova;

    public UzytkownikGenerator(long firstUserId, int userCount, boolean isForEnova) {
        this.firstUserId = firstUserId;
        this.userCount = userCount;
        this.isForEnova = isForEnova;
    }

    public List<Uzytkownik> createUsersList() {
        List<Uzytkownik> listOfUsers = new ArrayList<>();
        for (int iter = 0; iter < userCount; iter++) {
            listOfUsers.add(createUser(iter));
        }
        return listOfUsers;
    }

    private Uzytkownik createUser(long userId) {
        Baza baza = new Baza();
        baza.setNazwaFirmy(COMPANY_NAME);
        baza.setBazaDanych(DATABASE);
        BazaDanych bazaDanych = new BazaDanych();
        bazaDanych.setBaza(baza);
        Uzytkownik user = new Uzytkownik();
        user.setBazaDanych(bazaDanych);
        user.setCzyDlaSystemuKadrowego(isForEnova);
        Random generator = new Random();
        String name = NAMES[generator.nextInt(NAMES.length)];
        user.setImie(name);
        String surname = SURNAMES[generator.nextInt(SURNAMES.length)];
        user.setNazwisko(surname);
        String login = name.substring(0, 1).toLowerCase() + surname.toLowerCase();
        user.setEmail(login + EMAIL_DOMAIN);
        user.setKodOperacji(OPERATION_CODE);
        user.setLoginAD(AD_PREFIX + login);
        user.setPracownikKlucz(firstUserId + userId);
        user.setTelefonKorporacyjny(phoneNumGen(4));
        user.setTelefonKomorkowy(phoneNumGen(9, true));
        user.setTelefonStacjonarny(phoneNumGen(7, false));
        user.setTelefonWewnetrzny(phoneNumGen(4));
        return user;
    }

    private String phoneNumGen(int length) { //generuje numer telefonu
        StringBuilder tel = new StringBuilder();
        int a;
        for (int i = 0; i < length; i++) {
            a = (int) (Math.random() * 10);
            tel.append(a);
        }
        return tel.toString();
    }

    private String phoneNumGen(int length, boolean isGSM) { //generuje numer telefonu
        String tel = phoneNumGen(length);
        return isGSM ? "0 " + tel.substring(0, 3) + ' ' + tel.substring(3, 6) + ' ' + tel.substring(6) : TELEPHONE_PREFIX + tel;
    }

}
