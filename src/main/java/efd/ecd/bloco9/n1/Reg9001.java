package efd.ecd.bloco9.n1;

import java.io.Serializable;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.bloco9.n1.n2.Reg9900;

public class Reg9001 implements Serializable {
	private static final long serialVersionUID = -5960509015183619603L;

	@Inclui
	private final String reg = "9001";

    @Inclui
    private Integer indDad;

    @Filho
    private List<Reg9900> reg9900;

    public Reg9001(Integer indDad) {
        this.indDad = indDad;
    }

    public Reg9001(){/* */}

    public String getReg() {
        return reg;
    }

    public Integer getIndDad() {
        return indDad;
    }

    public void setIndDad(Integer indDad) {
        this.indDad = indDad;
    }

    public List<Reg9900> getReg9900() {
        return reg9900;
    }

    public void setReg9900(List<Reg9900> reg9900) {
        this.reg9900 = reg9900;
    }

}
