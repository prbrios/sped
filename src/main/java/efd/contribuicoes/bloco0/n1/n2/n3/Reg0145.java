package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg0145 implements Serializable {
	private static final long serialVersionUID = 4007724611261441965L;

	@Inclui
	private final String reg = "0145";

    @Inclui
    private Integer codIncTrib;

    @Inclui
    private BigDecimal vlRecTot;

    @Inclui
    private BigDecimal vlRecAtiv;

    @Inclui
    private BigDecimal vlRecDemaisAtiv;

    @Inclui
    private String infoCompl;

    public Reg0145(Integer codIncTrib, BigDecimal vlRecTot, BigDecimal vlRecAtiv, BigDecimal vlRecDemaisAtiv, String infoCompl) {
        this.codIncTrib = codIncTrib;
        this.vlRecTot = vlRecTot;
        this.vlRecAtiv = vlRecAtiv;
        this.vlRecDemaisAtiv = vlRecDemaisAtiv;
        this.infoCompl = infoCompl;
    }

    public Reg0145(){}

    public String getReg() {
        return reg;
    }

    public Integer getCodIncTrib() {
        return codIncTrib;
    }

    public void setCodIncTrib(Integer codIncTrib) {
        this.codIncTrib = codIncTrib;
    }

    public BigDecimal getVlRecTot() {
        return vlRecTot;
    }

    public void setVlRecTot(BigDecimal vlRecTot) {
        this.vlRecTot = vlRecTot;
    }

    public BigDecimal getVlRecAtiv() {
        return vlRecAtiv;
    }

    public void setVlRecAtiv(BigDecimal vlRecAtiv) {
        this.vlRecAtiv = vlRecAtiv;
    }

    public BigDecimal getVlRecDemaisAtiv() {
        return vlRecDemaisAtiv;
    }

    public void setVlRecDemaisAtiv(BigDecimal vlRecDemaisAtiv) {
        this.vlRecDemaisAtiv = vlRecDemaisAtiv;
    }

    public String getInfoCompl() {
        return infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }
    
}
