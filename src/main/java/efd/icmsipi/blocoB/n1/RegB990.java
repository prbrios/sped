package efd.icmsipi.blocoB.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegB990 {

    @Getter @Inclui
    private final String reg = "B990";

    @Getter @Setter @Inclui
    private Integer qtdLinB;

    public RegB990(Integer qtdLinB) {
        this.qtdLinB = qtdLinB;
    }

    public RegB990(){}
}
