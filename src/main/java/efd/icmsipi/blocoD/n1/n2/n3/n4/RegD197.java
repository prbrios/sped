package efd.icmsipi.blocoD.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegD197 {

    @Getter @Inclui
    private final String reg = "D197";

    @Getter @Setter @Inclui
    private String codAj;

    @Getter @Setter @Inclui
    private String descrComplAj;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal aliqIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlOutros;

    public RegD197(String codAj, String descrComplAj, String codItem, BigDecimal vlBcIcms, BigDecimal aliqIcms, BigDecimal vlIcms, BigDecimal vlOutros) {
        this.codAj = codAj;
        this.descrComplAj = descrComplAj;
        this.codItem = codItem;
        this.vlBcIcms = vlBcIcms;
        this.aliqIcms = aliqIcms;
        this.vlIcms = vlIcms;
        this.vlOutros = vlOutros;
    }

    public RegD197(){}
}