package efd.icmsipi.blocoC.n1.n2.n3.n4.n5;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC465 implements Serializable {
	private static final long serialVersionUID = 3420720128180562247L;

	@Inclui
    private final String reg = "C465";

    @Inclui
    private String chvCfe;

    @Inclui
    private Integer numCcf;

    public RegC465(String chvCfe, Integer numCcf) {
        this.chvCfe = chvCfe;
        this.numCcf = numCcf;
    }

    public RegC465(){}

    public String getReg() {
        return reg;
    }

    public String getChvCfe() {
        return chvCfe;
    }

    public void setChvCfe(String chvCfe) {
        this.chvCfe = chvCfe;
    }

    public Integer getNumCcf() {
        return numCcf;
    }

    public void setNumCcf(Integer numCcf) {
        this.numCcf = numCcf;
    }
    
}