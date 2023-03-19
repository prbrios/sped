package efd.ecd.blocoC.n1.n2.n3.n4;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;

public class RegC650 implements Serializable {
	private static final long serialVersionUID = -3468450881299387093L;

	@Inclui
    private final String reg = "C650";

    @Inclui
    private String codAgl;

    @Inclui
    private Integer nivelAgl;

    @Inclui
    private String descrCodAgl;

    @Inclui
    private BigDecimal vlCtaFin;

    @Inclui
    private String indDcCtaFin;

    public RegC650(String codAgl, Integer nivelAgl, String descrCodAgl, BigDecimal vlCtaFin, String indDcCtaFin) {
        this.codAgl = codAgl;
        this.nivelAgl = nivelAgl;
        this.descrCodAgl = descrCodAgl;
        this.vlCtaFin = vlCtaFin;
        this.indDcCtaFin = indDcCtaFin;
    }
    
    public RegC650() {}

    public String getReg() {
        return reg;
    }

    public String getCodAgl() {
        return codAgl;
    }

    public void setCodAgl(String codAgl) {
        this.codAgl = codAgl;
    }

    public Integer getNivelAgl() {
        return nivelAgl;
    }

    public void setNivelAgl(Integer nivelAgl) {
        this.nivelAgl = nivelAgl;
    }

    public String getDescrCodAgl() {
        return descrCodAgl;
    }

    public void setDescrCodAgl(String descrCodAgl) {
        this.descrCodAgl = descrCodAgl;
    }

    public BigDecimal getVlCtaFin() {
        return vlCtaFin;
    }

    public void setVlCtaFin(BigDecimal vlCtaFin) {
        this.vlCtaFin = vlCtaFin;
    }

    public String getIndDcCtaFin() {
        return indDcCtaFin;
    }

    public void setIndDcCtaFin(String indDcCtaFin) {
        this.indDcCtaFin = indDcCtaFin;
    }
    

}
