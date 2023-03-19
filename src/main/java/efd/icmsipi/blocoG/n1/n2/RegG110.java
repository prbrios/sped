package efd.icmsipi.blocoG.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.n3.RegG125;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegG110 implements Serializable {
	private static final long serialVersionUID = -47039553638218421L;

	@Inclui
    private final String reg = "G110";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Inclui
    private BigDecimal saldoInIcms;

    @Inclui
    private BigDecimal somParc;

    @Inclui
    private BigDecimal vlTribExp;

    @Inclui
    private BigDecimal vlTotal;

    @Inclui(casasDecimais = 8)
    private BigDecimal indPerSai;

    @Inclui
    private BigDecimal icmsAprop;

    @Inclui
    private BigDecimal somIcmsOc;

    @Filho
    private List<RegG125> regG125;

    public RegG110(LocalDate dtIni, LocalDate dtFin, BigDecimal saldoInIcms, BigDecimal somParc, BigDecimal vlTribExp, BigDecimal vlTotal, BigDecimal indPerSai, BigDecimal icmsAprop, BigDecimal somIcmsOc) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
        this.saldoInIcms = saldoInIcms;
        this.somParc = somParc;
        this.vlTribExp = vlTribExp;
        this.vlTotal = vlTotal;
        this.indPerSai = indPerSai;
        this.icmsAprop = icmsAprop;
        this.somIcmsOc = somIcmsOc;
    }

    public RegG110(){}

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

    public BigDecimal getSaldoInIcms() {
        return saldoInIcms;
    }

    public void setSaldoInIcms(BigDecimal saldoInIcms) {
        this.saldoInIcms = saldoInIcms;
    }

    public BigDecimal getSomParc() {
        return somParc;
    }

    public void setSomParc(BigDecimal somParc) {
        this.somParc = somParc;
    }

    public BigDecimal getVlTribExp() {
        return vlTribExp;
    }

    public void setVlTribExp(BigDecimal vlTribExp) {
        this.vlTribExp = vlTribExp;
    }

    public BigDecimal getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(BigDecimal vlTotal) {
        this.vlTotal = vlTotal;
    }

    public BigDecimal getIndPerSai() {
        return indPerSai;
    }

    public void setIndPerSai(BigDecimal indPerSai) {
        this.indPerSai = indPerSai;
    }

    public BigDecimal getIcmsAprop() {
        return icmsAprop;
    }

    public void setIcmsAprop(BigDecimal icmsAprop) {
        this.icmsAprop = icmsAprop;
    }

    public BigDecimal getSomIcmsOc() {
        return somIcmsOc;
    }

    public void setSomIcmsOc(BigDecimal somIcmsOc) {
        this.somIcmsOc = somIcmsOc;
    }

    public List<RegG125> getRegG125() {
        return regG125;
    }

    public void setRegG125(List<RegG125> regG125) {
        this.regG125 = regG125;
    }
    
}