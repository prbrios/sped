package efd.contribuicoes.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegD600 implements Serializable {
	private static final long serialVersionUID = -8048830865900346189L;

	@Getter @Inclui
	private final String reg = "D600";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Integer sub;

    @Getter @Setter @Inclui
    private Integer indRec;

    @Getter @Setter @Inclui
    private Integer qtdCons;

    @Getter @Setter @Inclui
    private LocalDate dtDocIni;

    @Getter @Setter @Inclui
    private LocalDate dtDocFin;

    @Getter @Setter @Inclui
    private BigDecimal vlDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlServ;

    @Getter @Setter @Inclui
    private BigDecimal vlServNt;

    @Getter @Setter @Inclui
    private BigDecimal vlTerc;

    @Getter @Setter @Inclui
    private BigDecimal vlDa;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
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
