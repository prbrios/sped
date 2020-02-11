package efd.icmsipi.blocoC.n1.n2.n3.n4.n5;

import java.math.BigDecimal;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.n6.RegC480;
import lombok.Getter;
import lombok.Setter;


public class RegC470 {

    @Getter @Inclui
    private final String reg = "C470";

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtdCanc;

    @Getter @Setter @Inclui
    private String unid;

    @Getter @Setter @Inclui
    private BigDecimal vlItem;

    @Getter @Setter @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private BigDecimal aliqIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Filho
    private RegC480 regC480;

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