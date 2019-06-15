package efd.contribuicoes.blocoP.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegP100 {

    @Getter @Inclui
    private final String reg = "P100";

    @Getter @Inclui
    private LocalDate dtIni;

    @Getter @Inclui
    private LocalDate dtFin;

    @Getter @Inclui
    private BigDecimal vlRecTotEst;

    @Getter @Inclui
    private String codAtivEcon;

    @Getter @Inclui
    private BigDecimal vlRecAtivEstab;

    @Getter @Inclui
    private BigDecimal vlExc;

    @Getter @Inclui
    private BigDecimal vlBcCont;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCont;

    @Getter @Inclui
    private BigDecimal vlContApu;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String infoCompl;

    public RegP100(LocalDate dtIni, LocalDate dtFin, BigDecimal vlRecTotEst, String codAtivEcon, BigDecimal vlRecAtivEstab, BigDecimal vlExc, BigDecimal vlBcCont, BigDecimal aliqCont, BigDecimal vlContApu, String codCta, String infoCompl) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
        this.vlRecTotEst = vlRecTotEst;
        this.codAtivEcon = codAtivEcon;
        this.vlRecAtivEstab = vlRecAtivEstab;
        this.vlExc = vlExc;
        this.vlBcCont = vlBcCont;
        this.aliqCont = aliqCont;
        this.vlContApu = vlContApu;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegP100(){}
}
