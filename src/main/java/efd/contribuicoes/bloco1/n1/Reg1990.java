package efd.contribuicoes.bloco1.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg1990 {

    @Getter @Inclui
    private final String reg = "1990";

    @Getter @Inclui
    private Integer qtdLin1;

    public Reg1990(Integer qtdLin1) {
        this.qtdLin1 = qtdLin1;
    }

    public Reg1990(){ }
}
