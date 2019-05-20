package efd;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

public class Parsers {

    public static String converteBlocoEmString(List arr){
        arr.removeAll(Collections.singleton(null));
        return "|" + String.join("|", arr) + "|" + System.getProperty("line.separator");
    }

    public static String formataData(LocalDate data, String f) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern(f);
        return formato.format(data);
    }

    public static String formataNumero(BigDecimal numero, Integer decimais){
        return String.format("%0"+decimais+"f", numero);
    }

}
