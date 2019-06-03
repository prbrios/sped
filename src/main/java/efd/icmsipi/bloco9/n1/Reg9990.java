package efd.icmsipi.bloco9.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg9990 {

    @Inclui
    private final String reg = "9990";

    @Inclui
    private Integer qtdLin9;

    public Reg9990(Integer qtdLin9) {
        this.qtdLin9 = qtdLin9;
    }

    public Reg9990(){}
}