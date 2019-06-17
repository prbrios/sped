package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF139;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegF130 {

    @Getter @Inclui
private final String reg = "F130";

    @Getter @Setter @Inclui
    private String natBcCred;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer identBemImob;

    @Getter @Setter @Inclui
    private String indOrigCred;

    @Getter @Setter @Inclui
    private Integer indUtilBemImob;

    @Getter @Setter @Inclui(formatoData = "MMyyyy")
    private LocalDate mesOperAquis;

    @Getter @Setter @Inclui
    private BigDecimal vlOperAquis;

    @Getter @Setter @Inclui
    private BigDecimal parcOperNaoBcCred;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCred;

    @Getter @Setter @Inclui
    private Integer indNrParc;

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
    private List<RegF139> regF139;

    public RegF130(String natBcCred, Integer identBemImob, String indOrigCred, Integer indUtilBemImob, LocalDate mesOperAquis, BigDecimal vlOperAquis, BigDecimal parcOperNaoBcCred, BigDecimal vlBcCred, Integer indNrParc, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codCta, String codCcus, String descBemImob) {
        this.natBcCred = natBcCred;
        this.identBemImob = identBemImob;
        this.indOrigCred = indOrigCred;
        this.indUtilBemImob = indUtilBemImob;
        this.mesOperAquis = mesOperAquis;
        this.vlOperAquis = vlOperAquis;
        this.parcOperNaoBcCred = parcOperNaoBcCred;
        this.vlBcCred = vlBcCred;
        this.indNrParc = indNrParc;
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

    public RegF130(){ }
}
