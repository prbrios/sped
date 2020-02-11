package efd.icmsipi.blocoD.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegD310 {

    @Getter @Inclui
    private final String reg = "D310";

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Getter @Setter @Inclui
    private BigDecimal vlServ;

    @Getter @Setter @Inclui
    private BigDecimal vlbcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    public RegD310(Integer codMunOrig, BigDecimal vlServ, BigDecimal vlbcIcms, BigDecimal vlIcms) {
        this.codMunOrig = codMunOrig;
        this.vlServ = vlServ;
        this.vlbcIcms = vlbcIcms;
        this.vlIcms = vlIcms;
    }

    public RegD310(){}
}