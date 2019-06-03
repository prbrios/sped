package efd.icmsipi.blocoE.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegE990 {

    @Inclui
    private final String reg = "E990";

    @Inclui
    private Integer qtdLinE;

    public RegE990(Integer qtdLinE) {
        this.qtdLinE = qtdLinE;
    }

    public RegE990(){}
}