package efd.contribuicoes.blocoA.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlInlineBinaryData;
import java.math.BigDecimal;

public class RegA170 {

    @Getter @Inclui
private final String reg = "A170";

    @Getter @Setter @Inclui
    private Integer numItem;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui
    private String descrCompl;

    @Getter @Setter @Inclui
    private BigDecimal vlItem;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Inclui
    private String natBcCred;

    @Getter @Setter @Inclui
    private String indOrigCred;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Setter @Inclui
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Setter @Inclui
    private BigDecimal aliqCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
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
