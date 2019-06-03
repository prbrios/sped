package efd.icmsipi.blocoG.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegG990 {

    @Inclui
    private final String reg = "G990";

    @Inclui
    private Integer qtdLinG;

    public RegG990(Integer qtdLinG) {
        this.qtdLinG = qtdLinG;
    }

    public RegG990(){}
}