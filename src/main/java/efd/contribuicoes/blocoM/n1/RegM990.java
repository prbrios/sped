package efd.contribuicoes.blocoM.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegM990 {

    @Getter @Inclui
    private final String reg = "M990";

    @Getter @Inclui
    private Integer qtdLinM;

    public RegM990(Integer qtdLinM) {
        this.qtdLinM = qtdLinM;
    }

    public RegM990(){}
}
