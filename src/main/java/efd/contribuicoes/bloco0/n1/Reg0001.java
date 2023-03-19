package efd.contribuicoes.bloco0.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco0.n1.n2.*;



import java.io.Serializable;
import java.util.List;

public class Reg0001 implements Serializable {
	private static final long serialVersionUID = 3458672570343298447L;

	@Inclui
    private final String reg = "0001";

    @Inclui
    private Integer indMov;

    @Filho
    private List<Reg0035> reg0035;

    @Filho
    private List<Reg0100> reg0100;

    @Filho
    private Reg0110 reg0110;

    @Filho
    private List<Reg0120> reg0120;

    @Filho
    private List<Reg0140> reg0140;

    @Filho
    private List<Reg0500> reg0500;

    @Filho
    private List<Reg0600> reg0600;

    public Reg0001(Integer indMov) {
        this.indMov = indMov;
    }

    public Reg0001(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndMov() {
        return indMov;
    }

    public void setIndMov(Integer indMov) {
        this.indMov = indMov;
    }

    public List<Reg0035> getReg0035() {
        return reg0035;
    }

    public void setReg0035(List<Reg0035> reg0035) {
        this.reg0035 = reg0035;
    }

    public List<Reg0100> getReg0100() {
        return reg0100;
    }

    public void setReg0100(List<Reg0100> reg0100) {
        this.reg0100 = reg0100;
    }

    public Reg0110 getReg0110() {
        return reg0110;
    }

    public void setReg0110(Reg0110 reg0110) {
        this.reg0110 = reg0110;
    }

    public List<Reg0120> getReg0120() {
        return reg0120;
    }

    public void setReg0120(List<Reg0120> reg0120) {
        this.reg0120 = reg0120;
    }

    public List<Reg0140> getReg0140() {
        return reg0140;
    }

    public void setReg0140(List<Reg0140> reg0140) {
        this.reg0140 = reg0140;
    }

    public List<Reg0500> getReg0500() {
        return reg0500;
    }

    public void setReg0500(List<Reg0500> reg0500) {
        this.reg0500 = reg0500;
    }

    public List<Reg0600> getReg0600() {
        return reg0600;
    }

    public void setReg0600(List<Reg0600> reg0600) {
        this.reg0600 = reg0600;
    }
    
}
