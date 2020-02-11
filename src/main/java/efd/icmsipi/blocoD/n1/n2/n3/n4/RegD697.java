package efd.icmsipi.blocoD.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegD697 {

    @Getter @Inclui
    private final String reg = "D697";

    @Getter @Setter @Inclui
    private String uf;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    public RegD697(String uf, BigDecimal vlBcIcms, BigDecimal vlIcms) {
        this.uf = uf;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
    }

    public RegD697(){}
}