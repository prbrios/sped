package efd.icmsipi.blocoC.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC601 implements Serializable {
	private static final long serialVersionUID = 6360294112237107063L;

	@Inclui
    private final String reg = "C601";

    @Inclui
    private Long numDocCanc;

    public RegC601(Long numDocCanc) {
        this.numDocCanc = numDocCanc;
    }

    public RegC601(){}

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