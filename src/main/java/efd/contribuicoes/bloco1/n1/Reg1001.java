package efd.contribuicoes.bloco1.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.*;

import java.io.Serializable;
import java.util.List;

public class Reg1001 implements Serializable {
	private static final long serialVersionUID = 597839463306430281L;

	@Inclui
	private final String reg = "1001";

    @Inclui
    private String indMov;

    @Filho
    private List<Reg1010> reg1010;

    @Filho
    private List<Reg1020> reg1020;

    @Filho
    private List<Reg1050> reg1050;

    @Filho
    private List<Reg1100> reg1100;

    @Filho
    private List<Reg1200> reg1200;

    @Filho
    private List<Reg1300> reg1300;

    @Filho
    private List<Reg1500> reg1500;

    @Filho
    private List<Reg1600> reg1600;

    @Filho
    private List<Reg1700> reg1700;

    @Filho
    private List<Reg1800> reg1800;

    @Filho
    private List<Reg1900> reg1900;

    public Reg1001(String indMov) {
        this.indMov = indMov;
    }

    public Reg1001(){ }

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public List<Reg1010> getReg1010() {
        return reg1010;
    }

    public void setReg1010(List<Reg1010> reg1010) {
        this.reg1010 = reg1010;
    }

    public List<Reg1020> getReg1020() {
        return reg1020;
    }

    public void setReg1020(List<Reg1020> reg1020) {
        this.reg1020 = reg1020;
    }

    public List<Reg1050> getReg1050() {
        return reg1050;
    }

    public void setReg1050(List<Reg1050> reg1050) {
        this.reg1050 = reg1050;
    }

    public List<Reg1100> getReg1100() {
        return reg1100;
    }

    public void setReg1100(List<Reg1100> reg1100) {
        this.reg1100 = reg1100;
    }

    public List<Reg1200> getReg1200() {
        return reg1200;
    }

    public void setReg1200(List<Reg1200> reg1200) {
        this.reg1200 = reg1200;
    }

    public List<Reg1300> getReg1300() {
        return reg1300;
    }

    public void setReg1300(List<Reg1300> reg1300) {
        this.reg1300 = reg1300;
    }

    public List<Reg1500> getReg1500() {
        return reg1500;
    }

    public void setReg1500(List<Reg1500> reg1500) {
        this.reg1500 = reg1500;
    }

    public List<Reg1600> getReg1600() {
        return reg1600;
    }

    public void setReg1600(List<Reg1600> reg1600) {
        this.reg1600 = reg1600;
    }

    public List<Reg1700> getReg1700() {
        return reg1700;
    }

    public void setReg1700(List<Reg1700> reg1700) {
        this.reg1700 = reg1700;
    }

    public List<Reg1800> getReg1800() {
        return reg1800;
    }

    public void setReg1800(List<Reg1800> reg1800) {
        this.reg1800 = reg1800;
    }

    public List<Reg1900> getReg1900() {
        return reg1900;
    }

    public void setReg1900(List<Reg1900> reg1900) {
        this.reg1900 = reg1900;
    }
    
}
