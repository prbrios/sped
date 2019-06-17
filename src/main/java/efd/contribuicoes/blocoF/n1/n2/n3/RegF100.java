package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF111;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegF100 {

    @Getter @Inclui
private final String reg = "F100";

    @Getter @Setter @Inclui
    private String indOper;

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui
    private LocalDate dtOper;

    @Getter @Setter @Inclui
    private BigDecimal vlOper;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal vlBcPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal vlBcCofins;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String natBcCred;

    @Getter @Setter @Inclui
    private String indOrigCred;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String codCcus;

    @Getter @Setter @Inclui
    private String descDocOper;

    @Getter @Setter @Filho
    private List<RegF111> regF111;

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
