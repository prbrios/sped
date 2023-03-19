package efd.ecd.bloco0.n1;

import java.io.Serializable;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.bloco0.n1.n2.Reg0007;
import efd.ecd.bloco0.n1.n2.Reg0020;
import efd.ecd.bloco0.n1.n2.Reg0035;
import efd.ecd.bloco0.n1.n2.Reg0150;

public class Reg0001 implements Serializable {
	private static final long serialVersionUID = 1431649468739411979L;

	@Inclui
    private final String reg = "0001";

    @Inclui
    private Integer indDad;

    @Filho
    private List<Reg0007> reg0007;

    @Filho
    private List<Reg0020> reg0020;

    @Filho
    private List<Reg0035> reg0035;
    
    @Filho
    private List<Reg0150> reg0150;
    

    public Reg0001(Integer indDad) {
        this.indDad = indDad;
    }

    public Reg0001(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndDad() {
        return indDad;
    }

    public void setIndDad(Integer indDad) {
        this.indDad = indDad;
    }

    public List<Reg0007> getReg0007() {
        return reg0007;
    }

    public void setReg0007(List<Reg0007> reg0007) {
        this.reg0007 = reg0007;
    }

    public List<Reg0020> getReg0020() {
        return reg0020;
    }

    public void setReg0020(List<Reg0020> reg0020) {
        this.reg0020 = reg0020;
    }

    public List<Reg0035> getReg0035() {
        return reg0035;
    }

    public void setReg0035(List<Reg0035> reg0035) {
        this.reg0035 = reg0035;
    }

    public List<Reg0150> getReg0150() {
        return reg0150;
    }

    public void setReg0150(List<Reg0150> reg0150) {
        this.reg0150 = reg0150;
    }
    
}
