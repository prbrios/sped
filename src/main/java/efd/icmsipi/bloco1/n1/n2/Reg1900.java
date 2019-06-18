package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1910;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class Reg1900 {

    @Getter @Inclui
    private final String reg = "1900";

    @Getter @Setter @Inclui
    private String indApurIcms;

    @Getter @Setter @Inclui
    private String descrComplOutApur;

    @Getter @Setter @Filho
    private List<Reg1910> reg1910;

    public Reg1900(String indApurIcms, String descrComplOutApur) {
        this.indApurIcms = indApurIcms;
        this.descrComplOutApur = descrComplOutApur;
    }

    public Reg1900(){}

}