import employees.soapobjects.*;
import employees.utils.NamespaceMapper;
import employees.utils.UzytkownikGenerator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type ID of first user: ");
        int firstId = sc.nextInt();
        System.out.println("Type how much users you want to create: ");
        int count = sc.nextInt();
        System.out.println("Are users data should be send to Enova? (type false/true): ");
        boolean forEnova = sc.nextBoolean();

        UzytkownikGenerator generator = new UzytkownikGenerator(firstId, count, forEnova);

        try {
            new File("generated_requests").mkdir(); //jesli nie ma folderu, tworzymy go
            File file = new File("generated_requests/" + new SimpleDateFormat("yyyy-MM-dd_hh#mm#ss#SSS").format(new Date()) + ".xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Envelope.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); //formatowanie

            jaxbMarshaller.setProperty("com.sun.xml.internal.bind.namespacePrefixMapper", new NamespaceMapper()); //dodajemy namespace'y

            jaxbMarshaller.marshal(new Envelope(new Body(new UzytkownicyAktualizacja(new UzytkownicyAktualizacjaRequest(new ListaStruktur(generator.createUsersList()))))), file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
