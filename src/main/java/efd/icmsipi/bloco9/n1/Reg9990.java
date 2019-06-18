package efd.icmsipi.bloco9.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg9990 {

    @Getter @Inclui
    private final String reg = "9990";

    @Getter @Setter @Inclui
    private Integer qtdLin9;

    public Reg9990(Integer qtdLin9) {
        this.qtdLin9 = qtdLin9;
    }

    public Reg9990(){}
}