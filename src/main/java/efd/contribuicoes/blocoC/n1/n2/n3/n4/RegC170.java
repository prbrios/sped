package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC170 {

    @Inclui
    private final String reg = "C170";

    @Inclui
    private Integer numItem;

    @Inclui
    private String codItem;

    @Inclui
    private String descrCompl;

    @Inclui(casasDecimais = 5)
    private BigDecimal qtd;

    @Inclui
    private String unid;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private String indMov;

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private String codNat;

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
    private String indApur;

    @Inclui
    private Integer cstIpi;

    @Inclui
    private String codEnq;

    @Inclui
    private BigDecimal vlBcIpi;

    @Inclui
    private BigDecimal aliqIpi;

    @Inclui
    private BigDecimal vlIpi;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Inclui
    private BigDecimal vlPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsQuant;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

}
