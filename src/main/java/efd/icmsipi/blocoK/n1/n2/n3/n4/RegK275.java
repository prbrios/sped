package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegK275 {

    @Getter @Inclui
    private final String reg = "K275";

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorPos;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorNeg;

    @Getter @Setter @Inclui
    private String codInsSubst;

    public RegK275(String codItem, BigDecimal qtdCorPos, BigDecimal qtdCorNeg, String codInsSubst) {
        this.codItem = codItem;
        this.qtdCorPos = qtdCorPos;
        this.qtdCorNeg = qtdCorNeg;
        this.codInsSubst = codInsSubst;
    }

    public RegK275(){}
}