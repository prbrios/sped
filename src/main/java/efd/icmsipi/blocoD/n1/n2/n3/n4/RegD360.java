package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegD360 {

    @Getter @Inclui
    private final String reg = "D360";

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    public RegD360(BigDecimal vlPis, BigDecimal vlCofins) {
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegD360(){}
}