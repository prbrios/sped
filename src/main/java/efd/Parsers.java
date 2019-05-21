package efd;

import efd.icmsipi.Bloco0000;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Parsers {

    public static String converteBlocoEmString(Object obj){

        List arr = new ArrayList();
        Class clazz = obj.getClass();

        String formatoData, formatoHora;
        int decimais;
        Object anotacao;

        for(Field m : clazz.getDeclaredFields()){
            m.setAccessible(true);

            if(m.isAnnotationPresent(Inclui.class)) {

                anotacao = m.getAnnotation(Inclui.class);
                formatoData = ((Inclui) anotacao).formatoData();
                formatoHora = ((Inclui) anotacao).formatoHora();
                decimais = ((Inclui) anotacao).casasDecimais();

                try {

                    Object o = null;
                    if(m.get(obj) != null){

                        if(m.getType().equals(BigDecimal.class)){
                            o = (String) formataNumero((BigDecimal) m.get(obj), decimais);
                        }else if(m.getType().equals(String.class)){
                            o = (String) m.get(obj);
                        }else if(m.getType().equals(Integer.class)){
                            o = (Integer) m.get(obj);
                        }else if(m.getType().equals(LocalDate.class)){
                            o = (String) formataData((LocalDate) m.get(obj), formatoData);
                        }else if(m.getType().equals(LocalTime.class)) {
                            o = (String) formataHora((LocalTime) m.get(obj), formatoHora);
                        }

                    }

                    arr.add(o);

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // remove da lista os valores null
        arr.removeAll(Collections.singleton(null));

        // monta a linha
        return "|" + String.join("|", arr) + "|" + System.getProperty("line.separator");

    }

    public static String formataData(LocalDate data, String f) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern(f);
        return formato.format(data);
    }

    public static String formataHora(LocalTime data, String f) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern(f);
        return formato.format(data);
    }

    public static String formataNumero(BigDecimal numero, Integer decimais){
        return String.format(new Locale("pt", "BR"), "%."+decimais+"f", numero);
    }

}
