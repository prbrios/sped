package efd.contribuicoes.blocoP.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoP.n1.n2.n3.n4.RegP110;
import efd.contribuicoes.blocoP.n1.n2.n3.n4.RegP199;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegP100 implements Serializable {
	private static final long serialVersionUID = 1922350901014792331L;

	@Getter @Inclui
	private final String reg = "P100";

    @Getter @Setter @Inclui
    private LocalDate dtIni;

    @Getter @Setter @Inclui
    private LocalDate dtFin;

    @Getter @Setter @Inclui
    private BigDecimal vlRecTotEst;

    @Getter @Setter @Inclui
    private String codAtivEcon;

    @Getter @Setter @Inclui
    private BigDecimal vlRecAtivEstab;

    @Getter @Setter @Inclui
    private BigDecimal vlExc;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCont;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCont;

    @Getter @Setter @Inclui
    private BigDecimal vlContApu;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String infoCompl;

    @Getter @Setter @Filho
    private List<RegP110> regP110;

    @Getter @Setter @Filho
    private List<RegP199> regP199;

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
