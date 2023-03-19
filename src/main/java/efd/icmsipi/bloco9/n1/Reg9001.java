package efd.icmsipi.bloco9.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco9.n1.n2.Reg9900;

import java.io.Serializable;
import java.util.List;

public class Reg9001 implements Serializable {
	private static final long serialVersionUID = 358745747048739476L;

	@Inclui
    private final String reg = "9001";

    @Inclui
    private Integer indMov;

    @Filho
    private List<Reg9900> reg9900;

    public Reg9001(Integer indMov) {
        this.indMov = indMov;
    }

    public Reg9001(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndMov() {
        return indMov;
    }

    public void setIndMov(Integer indMov) {
        this.indMov = indMov;
    }

    public List<Reg9900> getReg9900() {
        return reg9900;
    }

    public void setReg9900(List<Reg9900> reg9900) {
        this.reg9900 = reg9900;
    }
    
}