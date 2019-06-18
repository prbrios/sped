package efd.icmsipi.blocoC.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegC990 {

    @Getter @Inclui
    private final String reg = "C990";

    @Getter @Setter @Inclui
    private Integer qtdLinC;

    public RegC990(Integer qtdLinC) {
        this.qtdLinC = qtdLinC;
    }

    public RegC990(){}
}