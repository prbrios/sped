package efd.ecd.blocoJ.n1.n2.n3;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoJ.n1.n2.n3.n4.RegJ215;

public class RegJ210 implements Serializable {
	private static final long serialVersionUID = -5267912330737837998L;

	@Inclui
    private final String reg = "J210";

    @Inclui
    private Integer indTip;

    @Inclui
    private String codAgl;

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
    private String notasExpRef;

    @Filho
    private List<RegJ215> regJ215;

    public RegJ210(Integer indTip, String codAgl, String descrCodAgl, BigDecimal vlCtaIni, String indDcCtaIni,
            BigDecimal vlCtaFin, String indDcCtaFin, String notasExpRef) {
        this.indTip = indTip;
        this.codAgl = codAgl;
        this.descrCodAgl = descrCodAgl;
        this.vlCtaIni = vlCtaIni;
        this.indDcCtaIni = indDcCtaIni;
        this.vlCtaFin = vlCtaFin;
        this.indDcCtaFin = indDcCtaFin;
        this.notasExpRef = notasExpRef;
    }

    public RegJ210() {}

    public String getReg() {
        return reg;
    }

    public Integer getIndTip() {
        return indTip;
    }

    public void setIndTip(Integer indTip) {
        this.indTip = indTip;
    }

    public String getCodAgl() {
        return codAgl;
    }

    public void setCodAgl(String codAgl) {
        this.codAgl = codAgl;
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

    public String getNotasExpRef() {
        return notasExpRef;
    }

    public void setNotasExpRef(String notasExpRef) {
        this.notasExpRef = notasExpRef;
    }

    public List<RegJ215> getRegJ215() {
        return regJ215;
    }

    public void setRegJ215(List<RegJ215> regJ215) {
        this.regJ215 = regJ215;
    }
    

}
