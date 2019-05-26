package efd;

public class Conversor {

    public static String converte(Object obj){
        return Parsers.converteBlocoEmString(obj, true);
    }

    public static String converteBloco(Object obj){
        return Parsers.converteBlocoEmString(obj, false);
    }

}
