package efd.contribuicoes.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD501;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD505;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD509;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegD500 {

    @Getter @Inclui
    private final String reg = "D500";

    @Getter @Inclui
    private String indOper;

    @Getter @Inclui(zerosEsquerda = 2)
    private String indEmit;

    @Getter @Inclui
    private String codPart;

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui
    private Integer codSit;

    @Getter @Inclui
    private String ser;

    @Getter @Inclui
    private Integer sub;

    @Getter @Inclui
    private Integer numDoc;

    @Getter @Inclui
    private LocalDate dtDoc;

    @Getter @Inclui
    private LocalDate dtAP;

    @Getter @Inclui
    private BigDecimal vlDoc;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui
    private BigDecimal vlServ;

    @Getter @Inclui
    private BigDecimal vlServNt;

    @Getter @Inclui
    private BigDecimal vlTerc;

    @Getter @Inclui
    private BigDecimal vlDA;

    @Getter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Inclui
    private BigDecimal vlIcms;

    @Getter @Inclui
    private String codInf;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Filho
    private List<RegD501> regD501;

    @Getter @Setter @Filho
    private List<RegD505> regD505;

    @Getter @Setter @Filho
    private List<RegD509> regD509;

    public RegD500(String indOper, String indEmit, String codPart, String codMod, Integer codSit, String ser, Integer sub, Integer numDoc, LocalDate dtDoc, LocalDate dtAP, BigDecimal vlDoc, BigDecimal vlDesc, BigDecimal vlServ, BigDecimal vlServNt, BigDecimal vlTerc, BigDecimal vlDA, BigDecimal vlBcIcms, BigDecimal vlIcms, String codInf, BigDecimal vlPis, BigDecimal vlCofins) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.dtAP = dtAP;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.vlServ = vlServ;
        this.vlServNt = vlServNt;
        this.vlTerc = vlTerc;
        this.vlDA = vlDA;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.codInf = codInf;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegD500(){}
}
