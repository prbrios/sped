package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegF130 {

    @Getter @Inclui
    private final String reg = "F130";

    @Getter @Inclui
    private String natBcCred;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer identBemImob;

    @Getter @Inclui
    private String indOrigCred;

    @Getter @Inclui
    private Integer indUtilBemImob;

    @Getter @Inclui(formatoData = "MMyyyy")
    private LocalDate mesOperAquis;

    @Getter @Inclui
    private BigDecimal vlOperAquis;

    @Getter @Inclui
    private BigDecimal parcOperNaoBcCred;

    @Getter @Inclui
    private BigDecimal vlBcCred;

    @Getter @Inclui
    private Integer indNrParc;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String codCcus;

    @Getter @Inclui
    private String descBemImob;

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
