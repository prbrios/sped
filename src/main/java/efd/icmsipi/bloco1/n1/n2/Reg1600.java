package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1600 implements Serializable {
	private static final long serialVersionUID = 865151368169935817L;

	@Inclui
    private final String reg = "1600";

    @Inclui
    private String codPart;

    @Inclui
    private BigDecimal totCredito;

    @Inclui
    private BigDecimal totDebito;

    public Reg1600(String codPart, BigDecimal totCredito, BigDecimal totDebito) {
        this.codPart = codPart;
        this.totCredito = totCredito;
        this.totDebito = totDebito;
    }

    public Reg1600(){}

    public String getReg() {
        return reg;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public BigDecimal getTotCredito() {
        return totCredito;
    }

    public void setTotCredito(BigDecimal totCredito) {
        this.totCredito = totCredito;
    }

    public BigDecimal getTotDebito() {
        return totDebito;
    }

    public void setTotDebito(BigDecimal totDebito) {
        this.totDebito = totDebito;
    }
    

}