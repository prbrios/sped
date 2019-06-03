package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC510 {

    @Inclui
    private final String reg = "C510";

    @Inclui
    private Integer numItem;

    @Inclui
    private String codItem;

    @Inclui(zerosEsquerda = 4)
    private Integer cldClass;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui
    private String unid;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlBcIcmsSt;

    @Inclui
    private BigDecimal aliqSt;

    @Inclui
    private BigDecimal vlIcmsSt;

    @Inclui
    private String indRec;

    @Inclui
    private String codPart;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

    public RegC510(Integer numItem, String codItem, Integer cldClass, BigDecimal qtd, String unid, BigDecimal vlItem, BigDecimal vlDesc, Integer cstIcms, Integer cfop, BigDecimal vlBcIcms, BigDecimal aliqIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal aliqSt, BigDecimal vlIcmsSt, String indRec, String codPart, BigDecimal vlPis, BigDecimal vlCofins, String codCta) {
        this.numItem = numItem;
        this.codItem = codItem;
        this.cldClass = cldClass;
        this.qtd = qtd;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.vlBcIcms = vlBcIcms;
        this.aliqIcms = aliqIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.aliqSt = aliqSt;
        this.vlIcmsSt = vlIcmsSt;
        this.indRec = indRec;
        this.codPart = codPart;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegC510(){}
}