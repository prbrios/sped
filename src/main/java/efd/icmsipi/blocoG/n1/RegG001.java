package efd.icmsipi.blocoG.n1;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.RegG110;
import lombok.Getter;
import lombok.Setter;


public class RegG001 {

    @Getter @Inclui
    private final String reg = "G001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegG110> regG110;

    public RegG001(String indMov) {
        this.indMov = indMov;
    }

    public RegG001(){}
}