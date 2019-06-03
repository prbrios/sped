package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC410 {

    @Inclui
    private final String reg = "C410";

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    public RegC410(BigDecimal vlPis, BigDecimal vlCofins) {
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegC410(){}
}