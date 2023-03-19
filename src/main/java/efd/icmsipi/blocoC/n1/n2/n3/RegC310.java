package efd.icmsipi.blocoC.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC310 implements Serializable {
	private static final long serialVersionUID = -7274657628974914253L;

	@Inclui
    private final String reg = "C310";

    @Inclui
    private Long numDocCanc;

    public RegC310(Long numDocCanc) {
        this.numDocCanc = numDocCanc;
    }

    public RegC310(){}

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
