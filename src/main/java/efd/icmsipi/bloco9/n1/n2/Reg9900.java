package efd.icmsipi.bloco9.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg9900 {

    @Inclui
    private final String reg = "9900";

    @Inclui
    private String regBlc;

    @Inclui
    private Integer qtdRegBlc;

    public Reg9900(String regBlc, Integer qtdRegBlc) {
        this.regBlc = regBlc;
        this.qtdRegBlc = qtdRegBlc;
    }

    public Reg9900(){}
}