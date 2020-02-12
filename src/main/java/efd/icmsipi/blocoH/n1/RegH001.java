package efd.icmsipi.blocoH.n1;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoH.n1.n2.RegH005;
import lombok.Getter;
import lombok.Setter;


public class RegH001 {

    @Getter @Inclui
    private final String reg = "H001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegH005> regH005;

    public RegH001(String indMov) {
        this.indMov = indMov;
    }

    public RegH001(){}
}