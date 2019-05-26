package efd.icmsipi;

import org.apache.commons.lang3.StringUtils;

public class Util {

    public static String formata(String str){
        return String.format("%s%s%s", str, StringUtils.CR, StringUtils.LF);
    }
}
