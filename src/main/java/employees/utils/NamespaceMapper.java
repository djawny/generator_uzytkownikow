package employees.utils;

import com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper;

public class NamespaceMapper extends NamespacePrefixMapper {

    private static final String HOL1_PREFIX = "hol1";
    public static final String HOL1_URI = "http://schemas.datacontract.org/2004/07/HoldingDTO.DTO.KadryPlace";

    private static final String REQ_PREFIX = "req";
    public static final String REQ_URI = "http://holding.pl/HOLDINGWCF/Requests";

    private static final String HOL_PREFIX = "hol";
    public static final String HOL_URI = "http://holding.pl/HOLDINGWCF";

    private static final String SOAP_PREFIX = "soap";
    public static final String SOAP_URI = "http://www.w3.org/2003/05/soap-envelope";

    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        switch (namespaceUri) {
            case HOL1_URI:
                return HOL1_PREFIX;
            case HOL_URI:
                return HOL_PREFIX;
            case REQ_URI:
                return REQ_PREFIX;
            case SOAP_URI:
                return SOAP_PREFIX;
        }
        return suggestion;
    }

    @Override
    public String[] getPreDeclaredNamespaceUris() {
        return new String[]{HOL1_URI, REQ_URI, HOL_URI, SOAP_URI};
    }
}