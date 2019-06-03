package efd.icmsipi.blocoG.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.RegG110;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegG001 {

    @Inclui
    private final String reg = "G001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegG110> regG110;

    public RegG001(String indMov) {
        this.indMov = indMov;
    }

    public RegG001(){}
}