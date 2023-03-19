package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegK220 implements Serializable {
	private static final long serialVersionUID = 973698595620178574L;

	@Inclui
    private final String reg = "K220";

    @Inclui
    private LocalDate dtMov;

    @Inclui
    private String codItemOri;

    @Inclui
    private String codItemDeSt;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdOri;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdDest;

    public RegK220(LocalDate dtMov, String codItemOri, String codItemDeSt, BigDecimal qtdOri, BigDecimal qtdDest) {
        this.dtMov = dtMov;
        this.codItemOri = codItemOri;
        this.codItemDeSt = codItemDeSt;
        this.qtdOri = qtdOri;
        this.qtdDest = qtdDest;
    }

    public RegK220(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtMov() {
        return dtMov;
    }

    public void setDtMov(LocalDate dtMov) {
        this.dtMov = dtMov;
    }

    public String getCodItemOri() {
        return codItemOri;
    }

    public void setCodItemOri(String codItemOri) {
        this.codItemOri = codItemOri;
    }

    public String getCodItemDeSt() {
        return codItemDeSt;
    }

    public void setCodItemDeSt(String codItemDeSt) {
        this.codItemDeSt = codItemDeSt;
    }

    public BigDecimal getQtdOri() {
        return qtdOri;
    }

    public void setQtdOri(BigDecimal qtdOri) {
        this.qtdOri = qtdOri;
    }

    public BigDecimal getQtdDest() {
        return qtdDest;
    }

    public void setQtdDest(BigDecimal qtdDest) {
        this.qtdDest = qtdDest;
    }
    
}