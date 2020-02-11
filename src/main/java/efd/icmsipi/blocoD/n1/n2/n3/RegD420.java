package efd.icmsipi.blocoD.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegD420 {

    @Getter @Inclui
    private final String reg = "D420";

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Getter @Setter @Inclui
    private BigDecimal vlServ;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlImcs;

    public RegD420(Integer codMunOrig, BigDecimal vlServ, BigDecimal vlBcIcms, BigDecimal vlImcs) {
        this.codMunOrig = codMunOrig;
        this.vlServ = vlServ;
        this.vlBcIcms = vlBcIcms;
        this.vlImcs = vlImcs;
    }

    public RegD420(){}
}