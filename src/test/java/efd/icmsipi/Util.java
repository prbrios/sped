package efd.icmsipi;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Util {

    public static final BigDecimal VALOR = new BigDecimal(987.963258);
    public static final LocalDate DATA = LocalDate.parse("2019-05-29");

    public static String formata(String str){
        return String.format("%s%s%s", str, StringUtils.CR, StringUtils.LF);
    }
}
