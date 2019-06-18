package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegC410 {

    @Getter @Inclui
    private final String reg = "C410";

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    public RegC410(BigDecimal vlPis, BigDecimal vlCofins) {
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegC410(){}
}