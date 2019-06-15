package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegC199 {

    @Getter @Inclui
    private final String reg = "C199";

    @Getter @Inclui
    private String codDocImp;

    @Getter @Inclui
    private String numDocImp;

    @Getter @Inclui
    private BigDecimal vlPisImp;

    @Getter @Inclui
    private BigDecimal vlCofinsImp;

    @Getter @Inclui
    private String numAcdraw;

    public RegC199(String codDocImp, String numDocImp, BigDecimal vlPisImp, BigDecimal vlCofinsImp, String numAcdraw) {
        this.codDocImp = codDocImp;
        this.numDocImp = numDocImp;
        this.vlPisImp = vlPisImp;
        this.vlCofinsImp = vlCofinsImp;
        this.numAcdraw = numAcdraw;
    }

    public RegC199(){}
}
