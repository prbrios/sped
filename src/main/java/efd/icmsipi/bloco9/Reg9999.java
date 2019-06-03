package efd.icmsipi.bloco9;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg9999 {

    @Inclui
    private final String reg = "9999";

    @Inclui
    private Integer qtdLin;

    public Reg9999(Integer qtdLin) {
        this.qtdLin = qtdLin;
    }

    public Reg9999(){}
}