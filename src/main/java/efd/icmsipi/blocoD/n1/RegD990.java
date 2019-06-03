package efd.icmsipi.blocoD.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegD990 {

    @Inclui
    private final String reg = "D990";

    @Inclui
    private Integer qtdLinD;

    public RegD990(Integer qtdLinD) {
        this.qtdLinD = qtdLinD;
    }

    public RegD990(){}
}