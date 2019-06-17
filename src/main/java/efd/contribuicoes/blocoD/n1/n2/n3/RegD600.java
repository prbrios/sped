package efd.contribuicoes.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegD600 {

    @Getter @Inclui
    private final String reg = "D600";

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Getter @Inclui
    private String ser;

    @Getter @Inclui
    private Integer sub;

    @Getter @Inclui
    private Integer indRec;

    @Getter @Inclui
    private Integer qtdCons;

    @Getter @Inclui
    private LocalDate dtDocIni;

    @Getter @Inclui
    private LocalDate dtDocFin;

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
    private BigDecimal vlDa;

    @Getter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Inclui
    private BigDecimal vlIcms;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Filho
    private List<RegD600> regD601;

    @Getter @Setter @Filho
    private List<RegD605> regD605;

    @Getter @Setter @Filho
    private List<RegD609> regD609;

    public RegD600(String codMod, Integer codMun, String ser, Integer sub, Integer indRec, Integer qtdCons, LocalDate dtDocIni, LocalDate dtDocFin, BigDecimal vlDoc, BigDecimal vlDesc, BigDecimal vlServ, BigDecimal vlServNt, BigDecimal vlTerc, BigDecimal vlDa, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlPis) {
        this.codMod = codMod;
        this.codMun = codMun;
        this.ser = ser;
        this.sub = sub;
        this.indRec = indRec;
        this.qtdCons = qtdCons;
        this.dtDocIni = dtDocIni;
        this.dtDocFin = dtDocFin;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.vlServ = vlServ;
        this.vlServNt = vlServNt;
        this.vlTerc = vlTerc;
        this.vlDa = vlDa;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlPis = vlPis;
    }

    public RegD600(){}
}
