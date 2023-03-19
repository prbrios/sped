package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM605 implements Serializable {
	private static final long serialVersionUID = 4313931287339915996L;

	@Inclui
	private final String reg = "M605";

    @Inclui
    private String numCampo;

    @Inclui
    private String codRec;

    @Inclui
    private BigDecimal vlDebito;

    public RegM605(String numCampo, String codRec, BigDecimal vlDebito) {
        this.numCampo = numCampo;
        this.codRec = codRec;
        this.vlDebito = vlDebito;
    }

    public RegM605(){}

    public String getReg() {
        return reg;
    }

    public String getNumCampo() {
        return numCampo;
    }

    public void setNumCampo(String numCampo) {
        this.numCampo = numCampo;
    }

    public String getCodRec() {
        return codRec;
    }

    public void setCodRec(String codRec) {
        this.codRec = codRec;
    }

    public BigDecimal getVlDebito() {
        return vlDebito;
    }

    public void setVlDebito(BigDecimal vlDebito) {
        this.vlDebito = vlDebito;
    }
    
}
