package efd.icmsipi.blocoD.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegD370 {

    @Inclui
    private final String reg = "D370";

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private Integer qtdBilh;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    public RegD370(Integer codMunOrig, BigDecimal vlServ, Integer qtdBilh, BigDecimal vlBcIcms, BigDecimal vlIcms) {
        this.codMunOrig = codMunOrig;
        this.vlServ = vlServ;
        this.qtdBilh = qtdBilh;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
    }

    public RegD370(){}
}