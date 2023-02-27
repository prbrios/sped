package efd.ecd.blocoJ.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegJ990 {
    
    @Getter @Inclui
    private final String reg = "J990";

    @Getter @Setter @Inclui
    private Integer qtdLinJ;

    public RegJ990() {}
    
    public RegJ990(Integer qtdLinJ) {
        this.qtdLinJ = qtdLinJ;
    }

}