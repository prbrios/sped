package efd.icmsipi.blocoD.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegD301 implements Serializable {
	private static final long serialVersionUID = -6385896381682561927L;

	@Inclui
    private final String reg = "D301";

    @Inclui
    private Long numDocCan;

    public RegD301(Long numDocCan) {
        this.numDocCan = numDocCan;
    }

    public RegD301(){}

    public String getReg() {
        return reg;
    }

    public Long getNumDocCan() {
        return numDocCan;
    }

    public void setNumDocCan(Long numDocCan) {
        this.numDocCan = numDocCan;
    }
    
}