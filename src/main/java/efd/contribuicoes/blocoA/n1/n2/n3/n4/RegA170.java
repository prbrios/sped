package efd.contribuicoes.blocoA.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlInlineBinaryData;
import java.math.BigDecimal;

public class RegA170 {

    @Getter @Inclui
    private final String reg = "A170";

    @Getter @Inclui
    private Integer numItem;

    @Getter @Inclui
    private String codItem;

    @Getter @Inclui
    private String descrCompl;

    @Getter @Inclui
    private BigDecimal vlItem;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui
    private String natBcCred;

    @Getter @Inclui
    private String indOrigCred;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Inclui
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Inclui
    private BigDecimal aliqCofins;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String codCcus;

    public RegA170(Integer numItem, String codItem, String descrCompl, BigDecimal vlItem, BigDecimal vlDesc, String natBcCred, String indOrigCred, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codCta, String codCcus) {
        this.numItem = numItem;
        this.codItem = codItem;
        this.descrCompl = descrCompl;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.natBcCred = natBcCred;
        this.indOrigCred = indOrigCred;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
        this.codCcus = codCcus;
    }

    public RegA170(){ }
}
