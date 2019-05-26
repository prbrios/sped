package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Bloco1910;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Bloco1900 {

    @Inclui
    private final String reg = "1900";

    @Inclui
    private String indApurIcms;

    @Inclui
    private String descrComplOutApur;

    @Filho
    private List<Bloco1910> bloco1910;

}