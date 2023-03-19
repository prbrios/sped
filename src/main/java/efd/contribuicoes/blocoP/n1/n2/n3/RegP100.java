package efd.contribuicoes.blocoP.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoP.n1.n2.n3.n4.RegP110;
import efd.contribuicoes.blocoP.n1.n2.n3.n4.RegP199;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegP100 implements Serializable {
	private static final long serialVersionUID = 1922350901014792331L;

	@Inclui
	private final String reg = "P100";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Inclui
    private BigDecimal vlRecTotEst;

    @Inclui
    private String codAtivEcon;

    @Inclui
    private BigDecimal vlRecAtivEstab;

    @Inclui
    private BigDecimal vlExc;

    @Inclui
    private BigDecimal vlBcCont;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCont;

    @Inclui
    private BigDecimal vlContApu;

    @Inclui
    private String codCta;

    @Inclui
    private String infoCompl;

    @Filho
    private List<RegP110> regP110;

    @Filho
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

    public String getReg() {
        return reg;
    }

    public LocalDate getDtIni() {
        return dtIni;
    }

    public void setDtIni(LocalDate dtIni) {
        this.dtIni = dtIni;
    }

    public LocalDate getDtFin() {
        return dtFin;
    }

    public void setDtFin(LocalDate dtFin) {
        this.dtFin = dtFin;
    }

    public BigDecimal getVlRecTotEst() {
        return vlRecTotEst;
    }

    public void setVlRecTotEst(BigDecimal vlRecTotEst) {
        this.vlRecTotEst = vlRecTotEst;
    }

    public String getCodAtivEcon() {
        return codAtivEcon;
    }

    public void setCodAtivEcon(String codAtivEcon) {
        this.codAtivEcon = codAtivEcon;
    }

    public BigDecimal getVlRecAtivEstab() {
        return vlRecAtivEstab;
    }

    public void setVlRecAtivEstab(BigDecimal vlRecAtivEstab) {
        this.vlRecAtivEstab = vlRecAtivEstab;
    }

    public BigDecimal getVlExc() {
        return vlExc;
    }

    public void setVlExc(BigDecimal vlExc) {
        this.vlExc = vlExc;
    }

    public BigDecimal getVlBcCont() {
        return vlBcCont;
    }

    public void setVlBcCont(BigDecimal vlBcCont) {
        this.vlBcCont = vlBcCont;
    }

    public BigDecimal getAliqCont() {
        return aliqCont;
    }

    public void setAliqCont(BigDecimal aliqCont) {
        this.aliqCont = aliqCont;
    }

    public BigDecimal getVlContApu() {
        return vlContApu;
    }

    public void setVlContApu(BigDecimal vlContApu) {
        this.vlContApu = vlContApu;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getInfoCompl() {
        return infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }

    public List<RegP110> getRegP110() {
        return regP110;
    }

    public void setRegP110(List<RegP110> regP110) {
        this.regP110 = regP110;
    }

    public List<RegP199> getRegP199() {
        return regP199;
    }

    public void setRegP199(List<RegP199> regP199) {
        this.regP199 = regP199;
    }
    
}
