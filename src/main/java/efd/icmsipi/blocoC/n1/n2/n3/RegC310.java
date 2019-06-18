package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegC310 {

    @Getter @Inclui
    private final String reg = "C310";

    @Getter @Setter @Inclui
    private Integer numDocCanc;

    public RegC310(Integer numDocCanc) {
        this.numDocCanc = numDocCanc;
    }

    public RegC310(){}
}
