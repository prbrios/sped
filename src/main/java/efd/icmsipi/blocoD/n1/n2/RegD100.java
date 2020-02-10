package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class RegD100 {

    @Getter @Inclui
    private final String reg = "D100";

    @Getter @Setter @Inclui
    private String indOper;

    @Getter @Setter @Inclui
    private String indEmit;

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private String sub;

    @Getter @Setter @Inclui
    private Integer numDoc;

    @Getter @Setter @Inclui
    private String chvCte;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private LocalDate dtAp;

    @Getter @Setter @Inclui
    private Integer tpCte;

    @Getter @Setter @Inclui
    private String chvCteRef;

    @Getter @Setter @Inclui
    private BigDecimal vlDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Inclui
    private String indFrt;

    @Getter @Setter @Inclui
    private BigDecimal vlServ;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlNt;

    @Getter @Setter @Inclui
    private String codInf;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Getter @Setter @Filho
    private RegD101 regD101;

    @Getter @Setter @Filho
    private List<RegD110> regD110;

    @Getter @Setter @Filho
    private List<RegD130> regD130;

    @Getter @Setter @Filho
    private RegD140 regD140;

    @Getter @Setter @Filho
    private RegD150 regD150;

    @Getter @Setter @Filho
    private List<RegD160> regD160;

    @Getter @Setter @Filho
    private RegD170 regD170;

    @Getter @Setter @Filho
    private List<RegD180> regD180;

    @Getter @Setter @Filho
    private List<RegD190> regD190;

    @Getter @Setter @Filho
    private List<RegD195> regD195;

    public RegD100(String indOper, String indEmit, String codPart, String codMod, Integer codSit, String ser, String sub, Integer numDoc, String chvCte, LocalDate dtDoc, LocalDate dtAp, Integer tpCte, String chvCteRef, BigDecimal vlDoc, BigDecimal vlDesc, String indFrt, BigDecimal vlServ, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlNt, String codInf, String codCta, Integer codMunOrig, Integer codMunDest) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.chvCte = chvCte;
        this.dtDoc = dtDoc;
        this.dtAp = dtAp;
        this.tpCte = tpCte;
        this.chvCteRef = chvCteRef;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.indFrt = indFrt;
        this.vlServ = vlServ;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlNt = vlNt;
        this.codInf = codInf;
        this.codCta = codCta;
        this.codMunOrig = codMunOrig;
        this.codMunDest = codMunDest;
    }

    public RegD100(){}
}