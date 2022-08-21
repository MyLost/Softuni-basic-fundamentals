package test;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.stream.Collectors;

public class TestPaymentProvider {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String signatureKey = "Train37There28Metal";

        Map<String, String> config = new TreeMap<>();
        config.put("merchantID", "101073");
        config.put("action",  "SALE");
        config.put("type", "1");
        config.put("countryCode", "826");
        config.put("currencyCode", "826");
        config.put("amount", "2691");
        config.put("orderRef", "Signature Test");
        config.put("transactionUnique", "55f025addd3c2");
        config.put("redirectURL", "http://localhost:8082/universal-payment");
//        config.put("cardExpiryDate", "1213");
//        config.put("cardNumber", "4929 4212 3460 0821");

        String query = config.keySet()
                .stream().map(key -> key + "=" + encodeValue(config.get(key))).collect(Collectors.joining("&"));

        //47951de02f2d581a3b75d86b3fbe69fdde941f0ec169b5db212bbb8e5395d59d9b2b662a7cc577a25be8f61501d115e1aef06a8fef606faa94f0c1cb1adb62d0
        String signature = query + signatureKey;

        MessageDigest md = MessageDigest.getInstance("SHA-512");
        byte[] messageDigest = md.digest(signature.getBytes());
        BigInteger no = new BigInteger(1, messageDigest);
        String hash = no.toString(16);
        System.out.println(hash);
    }
    private static String encodeValue(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private String createSignature(String signatureKey, Map<String, Object> request) {
        return null;
    }
}
//action=SALE&amount=2691&cardExpiryDate=1213&cardNumber=4929+4212+3460+0821&countryCode=826&currencyCode=826&merchantID=101073&orderRef=Signature+Test&redirectURL=http%3A%2F%2Flocalhost%3A8082%2Funiversal-payment&transactionUnique=55f025addd3c2&type=1Train37There28Metal
//action=SALE&amount=2691&cardExpiryDate=1213&cardNumber=4929+4212+3460+0821&countryCode=826&currencyCode=826&merchantID=101073&orderRef=Signature+Test&redirectURL=http%3A%2F%2Flocalhost%3A8082%2Funiversal-payment&transactionUnique=55f025addd3c2&type=1Train37There28Metal