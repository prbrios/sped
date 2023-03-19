package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegC112 implements Serializable {
	private static final long serialVersionUID = 3335662827761497679L;

	@Inclui
    private final String reg = "C112";

    @Inclui
    private String codDa;

    @Inclui
    private String uf;

    @Inclui
    private String numDa;

    @Inclui
    private String codAut;

    @Inclui
    private BigDecimal vlDa;

    @Inclui
    private LocalDate dtVcto;

    @Inclui
    private LocalDate dtPgto;

    public RegC112(String codDa, String uf, String numDa, String codAut, BigDecimal vlDa, LocalDate dtVcto, LocalDate dtPgto) {
        this.codDa = codDa;
        this.uf = uf;
        this.numDa = numDa;
        this.codAut = codAut;
        this.vlDa = vlDa;
        this.dtVcto = dtVcto;
        this.dtPgto = dtPgto;
    }

    public RegC112(){}

    public String getReg() {
        return reg;
    }

    public String getCodDa() {
        return codDa;
    }

    public void setCodDa(String codDa) {
        this.codDa = codDa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumDa() {
        return numDa;
    }

    public void setNumDa(String numDa) {
        this.numDa = numDa;
    }

    public String getCodAut() {
        return codAut;
    }

    public void setCodAut(String codAut) {
        this.codAut = codAut;
    }

    public BigDecimal getVlDa() {
        return vlDa;
    }

    public void setVlDa(BigDecimal vlDa) {
        this.vlDa = vlDa;
    }

    public LocalDate getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(LocalDate dtVcto) {
        this.dtVcto = dtVcto;
    }

    public LocalDate getDtPgto() {
        return dtPgto;
    }

    public void setDtPgto(LocalDate dtPgto) {
        this.dtPgto = dtPgto;
    }
    
}
