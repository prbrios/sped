package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegD100 {

    @Inclui
    private final String reg = "D100";

    @Inclui
    private String indOper;

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui
    private Integer codSit;

    @Inclui
    private String ser;

    @Inclui
    private String sub;

    @Inclui
    private Integer numDoc;

    @Inclui
    private String chvCte;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private LocalDate dtAp;

    @Inclui
    private Integer tpCte;

    @Inclui
    private String chvCteRef;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private String indFrt;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlNt;

    @Inclui
    private String codInf;

    @Inclui
    private String codCta;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Filho
    private RegD101 regD101;

    @Filho
    private List<RegD110> regD110;

    @Filho
    private List<RegD130> regD130;

    @Filho
    private RegD140 regD140;

    @Filho
    private RegD150 regD150;

    @Filho
    private List<RegD160> regD160;

    @Filho
    private RegD170 regD170;

    @Filho
    private List<RegD180> regD180;

    @Filho
    private List<RegD190> regD190;

    @Filho
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