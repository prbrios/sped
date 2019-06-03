package efd.icmsipi.blocoC.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC470 {

    @Inclui
    private final String reg = "C470";

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtdCanc;

    @Inclui
    private String unid;

    @Inclui
    private BigDecimal vlItem;

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    public RegC470(String codItem, BigDecimal qtd, BigDecimal qtdCanc, String unid, BigDecimal vlItem, Integer cstIcms, Integer cfop, BigDecimal aliqIcms, BigDecimal vlPis, BigDecimal vlCofins) {
        this.codItem = codItem;
        this.qtd = qtd;
        this.qtdCanc = qtdCanc;
        this.unid = unid;
        this.vlItem = vlItem;
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegC470(){}
}