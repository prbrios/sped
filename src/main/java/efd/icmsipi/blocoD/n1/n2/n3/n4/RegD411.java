package efd.icmsipi.blocoD.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;


public class RegD411 implements Serializable {
	private static final long serialVersionUID = -46625418592469486L;

	@Inclui
    private final String reg = "D411";

    @Inclui
    private Long numDocCanc;

    public RegD411(Long numDocCanc) {
        this.numDocCanc = numDocCanc;
    }

    public RegD411(){}

    public String getReg() {
        return reg;
    }

    public Long getNumDocCanc() {
        return numDocCanc;
    }

    public void setNumDocCanc(Long numDocCanc) {
        this.numDocCanc = numDocCanc;
    }
    
}