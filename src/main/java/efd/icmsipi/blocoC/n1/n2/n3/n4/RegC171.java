package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC171 implements Serializable {
	private static final long serialVersionUID = -1659578247789460906L;

	@Inclui
    private final String reg = "C171";

    @Inclui
    private String numTanque;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtde;

    public RegC171(String numTanque, BigDecimal qtde) {
        this.numTanque = numTanque;
        this.qtde = qtde;
    }

    public RegC171(){}

    public String getReg() {
        return reg;
    }

    public String getNumTanque() {
        return numTanque;
    }

    public void setNumTanque(String numTanque) {
        this.numTanque = numTanque;
    }

    public BigDecimal getQtde() {
        return qtde;
    }

    public void setQtde(BigDecimal qtde) {
        this.qtde = qtde;
    }
    
}
