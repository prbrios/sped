package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegF100 {

    @Getter @Inclui
    private final String reg = "F100";

    @Getter @Inclui
    private String indOper;

    @Getter @Inclui
    private String codPart;

    @Getter @Inclui
    private String codItem;

    @Getter @Inclui
    private LocalDate dtOper;

    @Getter @Inclui
    private BigDecimal vlOper;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal vlBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal vlBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private String natBcCred;

    @Getter @Inclui
    private String indOrigCred;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String codCcus;

    @Getter @Inclui
    private String descDocOper;

    public RegF100(String indOper, String codPart, String codItem, LocalDate dtOper, BigDecimal vlOper, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String natBcCred, String indOrigCred, String codCta, String codCcus, String descDocOper) {
        this.indOper = indOper;
        this.codPart = codPart;
        this.codItem = codItem;
        this.dtOper = dtOper;
        this.vlOper = vlOper;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.natBcCred = natBcCred;
        this.indOrigCred = indOrigCred;
        this.codCta = codCta;
        this.codCcus = codCcus;
        this.descDocOper = descDocOper;
    }

    public RegF100(){}
}
