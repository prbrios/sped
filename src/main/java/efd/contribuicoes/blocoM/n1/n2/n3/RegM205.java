package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM205 implements Serializable {
	private static final long serialVersionUID = -6599803400700003924L;

	@Inclui
	private final String reg = "M205";

    @Inclui
    private String numCampo;

    @Inclui
    private String codRec;

    @Inclui
    private BigDecimal vlDebito;

    public RegM205(String numCampo, String codRec, BigDecimal vlDebito) {
        this.numCampo = numCampo;
        this.codRec = codRec;
        this.vlDebito = vlDebito;
    }

    public RegM205(){}

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
