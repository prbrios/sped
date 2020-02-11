package efd.icmsipi.blocoD.n1.n2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.RegD301;
import efd.icmsipi.blocoD.n1.n2.n3.RegD310;
import lombok.Getter;
import lombok.Setter;


public class RegD300 {

    @Getter @Inclui
    private final String reg = "D300";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Integer sub;

    @Getter @Setter @Inclui
    private Integer numDocIni;

    @Getter @Setter @Inclui
    private Integer numDocFin;

    @Getter @Setter @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private BigDecimal aliqIcms;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlOpr;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlServ;

    @Getter @Setter @Inclui
    private BigDecimal vlSeg;

    @Getter @Setter @Inclui
    private BigDecimal vlOutDesp;

    @Getter @Setter @Inclui
    private BigDecimal vlbcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlRedBc;

    @Getter @Setter @Inclui
    private String codObs;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Filho
    private List<RegD301> regD301;

    @Getter @Setter @Filho
    private List<RegD310> regD310;

    public RegD300(String codMod, String ser, Integer sub, Integer numDocIni, Integer numDocFin, Integer cstIcms, Integer cfop, BigDecimal aliqIcms, LocalDate dtDoc, BigDecimal vlOpr, BigDecimal vlDesc, BigDecimal vlServ, BigDecimal vlSeg, BigDecimal vlOutDesp, BigDecimal vlbcIcms, BigDecimal vlIcms, BigDecimal vlRedBc, String codObs, String codCta) {
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.dtDoc = dtDoc;
        this.vlOpr = vlOpr;
        this.vlDesc = vlDesc;
        this.vlServ = vlServ;
        this.vlSeg = vlSeg;
        this.vlOutDesp = vlOutDesp;
        this.vlbcIcms = vlbcIcms;
        this.vlIcms = vlIcms;
        this.vlRedBc = vlRedBc;
        this.codObs = codObs;
        this.codCta = codCta;
    }

    public RegD300(){}
}