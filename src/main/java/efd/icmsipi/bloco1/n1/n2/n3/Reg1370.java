package efd.icmsipi.bloco1.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg1370 implements Serializable {
	private static final long serialVersionUID = 7425266625970368848L;

	@Inclui
    private final String reg = "1370";

    @Inclui
    private Integer numBico;

    @Inclui
    private String codItem;

    @Inclui
    private String numTanque;

    public Reg1370(Integer numBico, String codItem, String numTanque) {
        this.numBico = numBico;
        this.codItem = codItem;
        this.numTanque = numTanque;
    }

    public Reg1370(){}

    public String getReg() {
        return reg;
    }

    public Integer getNumBico() {
        return numBico;
    }

    public void setNumBico(Integer numBico) {
        this.numBico = numBico;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getNumTanque() {
        return numTanque;
    }

    public void setNumTanque(String numTanque) {
        this.numTanque = numTanque;
    }
    
}