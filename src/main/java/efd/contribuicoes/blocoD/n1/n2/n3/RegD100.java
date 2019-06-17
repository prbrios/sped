package efd.contribuicoes.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD101;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD105;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD111;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegD100 {

    @Getter @Inclui
    private final String reg = "D100";

    @Getter @Inclui
    private String indOper;

    @Getter @Inclui
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
    private String sub;

    @Getter @Inclui
    private Integer numDoc;

    @Getter @Inclui
    private String chvCte;

    @Getter @Inclui
    private LocalDate dtDoc;

    @Getter @Inclui
    private LocalDate dtAP;

    @Getter @Inclui
    private Integer tpCte;

    @Getter @Inclui
    private String chvCteRef;

    @Getter @Inclui
    private BigDecimal vlDoc;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui
    private String indFrt;

    @Getter @Inclui
    private BigDecimal vlServ;

    @Getter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Inclui
    private BigDecimal vlIcms;

    @Getter @Inclui
    private BigDecimal vlNt;

    @Getter @Inclui
    private String coInf;

    @Getter @Inclui
    private String codCta;

    @Getter @Setter @Filho
    private List<RegD101> regD101;

    @Getter @Setter @Filho
    private List<RegD105> regD105;

    @Getter @Setter @Filho
    private List<RegD111> regD111;

    public RegD100(String indOper, String indEmit, String codPart, String codMod, Integer codSit, String ser, String sub, Integer numDoc, String chvCte, LocalDate dtDoc, LocalDate dtAP, Integer tpCte, String chvCteRef, BigDecimal vlDoc, BigDecimal vlDesc, String indFrt, BigDecimal vlServ, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlNt, String coInf, String codCta) {
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
        this.dtAP = dtAP;
        this.tpCte = tpCte;
        this.chvCteRef = chvCteRef;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.indFrt = indFrt;
        this.vlServ = vlServ;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlNt = vlNt;
        this.coInf = coInf;
        this.codCta = codCta;
    }

    public RegD100(){}
}
