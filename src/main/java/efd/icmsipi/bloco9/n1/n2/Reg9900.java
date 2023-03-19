package efd.icmsipi.bloco9.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg9900 implements Serializable {
	private static final long serialVersionUID = -8987162123698619642L;

	@Inclui
    private final String reg = "9900";

    @Inclui
    private String regBlc;

    @Inclui
    private Integer qtdRegBlc;

    public Reg9900(String regBlc, Integer qtdRegBlc) {
        this.regBlc = regBlc;
        this.qtdRegBlc = qtdRegBlc;
    }

    public Reg9900(){}

    public String getReg() {
        return reg;
    }

    public String getRegBlc() {
        return regBlc;
    }

    public void setRegBlc(String regBlc) {
        this.regBlc = regBlc;
    }

    public Integer getQtdRegBlc() {
        return qtdRegBlc;
    }

    public void setQtdRegBlc(Integer qtdRegBlc) {
        this.qtdRegBlc = qtdRegBlc;
    }
    
}