package efd.ecd.blocoJ.n1.n2.n3;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;

public class RegJ100 implements Serializable {
	private static final long serialVersionUID = -515802653120544928L;

	@Inclui
    private final String reg = "J100";

    @Inclui
    private String codAgl;

    @Inclui
    private String indCodAgl;

    @Inclui
    private Integer nivelAgl;

    @Inclui
    private String codAglSup;

    @Inclui
    private String indGrpBal;

    @Inclui
    private String descrCodAgl;

    @Inclui
    private BigDecimal vlCtaIni;

    @Inclui
    private String indDcCtaIni;

    @Inclui
    private BigDecimal vlCtaFin;

    @Inclui
    private String indDcCtaFin;

    @Inclui
    private String notaExpRef;

    public RegJ100(String codAgl, String indCodAgl, Integer nivelAgl, String codAglSup, String indGrpBal,
            String descrCodAgl, BigDecimal vlCtaIni, String indDcCtaIni, BigDecimal vlCtaFin, String indDcCtaFin,
            String notaExpRef) {
        this.codAgl = codAgl;
        this.indCodAgl = indCodAgl;
        this.nivelAgl = nivelAgl;
        this.codAglSup = codAglSup;
        this.indGrpBal = indGrpBal;
        this.descrCodAgl = descrCodAgl;
        this.vlCtaIni = vlCtaIni;
        this.indDcCtaIni = indDcCtaIni;
        this.vlCtaFin = vlCtaFin;
        this.indDcCtaFin = indDcCtaFin;
        this.notaExpRef = notaExpRef;
    }

    public RegJ100() {}

    public String getReg() {
        return reg;
    }

    public String getCodAgl() {
        return codAgl;
    }

    public void setCodAgl(String codAgl) {
        this.codAgl = codAgl;
    }

    public String getIndCodAgl() {
        return indCodAgl;
    }

    public void setIndCodAgl(String indCodAgl) {
        this.indCodAgl = indCodAgl;
    }

    public Integer getNivelAgl() {
        return nivelAgl;
    }

    public void setNivelAgl(Integer nivelAgl) {
        this.nivelAgl = nivelAgl;
    }

    public String getCodAglSup() {
        return codAglSup;
    }

    public void setCodAglSup(String codAglSup) {
        this.codAglSup = codAglSup;
    }

    public String getIndGrpBal() {
        return indGrpBal;
    }

    public void setIndGrpBal(String indGrpBal) {
        this.indGrpBal = indGrpBal;
    }

    public String getDescrCodAgl() {
        return descrCodAgl;
    }

    public void setDescrCodAgl(String descrCodAgl) {
        this.descrCodAgl = descrCodAgl;
    }

    public BigDecimal getVlCtaIni() {
        return vlCtaIni;
    }

    public void setVlCtaIni(BigDecimal vlCtaIni) {
        this.vlCtaIni = vlCtaIni;
    }

    public String getIndDcCtaIni() {
        return indDcCtaIni;
    }

    public void setIndDcCtaIni(String indDcCtaIni) {
        this.indDcCtaIni = indDcCtaIni;
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

    public String getNotaExpRef() {
        return notaExpRef;
    }

    public void setNotaExpRef(String notaExpRef) {
        this.notaExpRef = notaExpRef;
    }
    


}
