package efd.contribuicoes.blocoF.n1.n2.n3;

import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF129;
import lombok.Getter;
import lombok.Setter;

public class RegF120 {

    @Getter @Inclui
private final String reg = "F120";

    @Getter @Setter @Inclui
    private String natBcCred;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer identBemMob;

    @Getter @Setter @Inclui
    private String indOrigCred;

    @Getter @Setter @Inclui
    private Integer indUtilBemImob;

    @Getter @Setter @Inclui
    private BigDecimal vlOperDep;

    @Getter @Setter @Inclui
    private BigDecimal parcOperNaoBcCred;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String codCcus;

    @Getter @Setter @Inclui
    private String descBemImob;

    @Getter @Setter @Filho
    private List<RegF129> regF129;

    public RegF120(String natBcCred, Integer identBemMob, String indOrigCred, Integer indUtilBemImob, BigDecimal vlOperDep, BigDecimal parcOperNaoBcCred, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codCta, String codCcus, String descBemImob) {
        this.natBcCred = natBcCred;
        this.identBemMob = identBemMob;
        this.indOrigCred = indOrigCred;
        this.indUtilBemImob = indUtilBemImob;
        this.vlOperDep = vlOperDep;
        this.parcOperNaoBcCred = parcOperNaoBcCred;
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
        this.descBemImob = descBemImob;
    }

    public RegF120(){}
}
