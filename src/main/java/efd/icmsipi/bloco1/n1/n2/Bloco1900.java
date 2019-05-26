package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bloco1900 {

    @Inclui
    private final String reg = "1900";

    @Inclui
    private String indApurIcms;

    @Inclui
    private String descrComplOutApur;

}