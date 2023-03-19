package efd.icmsipi.bloco0.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.*;

import java.io.Serializable;
import java.util.List;

public class Reg0001 implements Serializable {
	private static final long serialVersionUID = -4768662113834142273L;

	@Inclui
    private final String reg = "0001";

    @Inclui
    private Integer indMov;

    @Filho
    private Reg0005 reg0005;

    @Filho
    private List<Reg0015> reg0015;

    @Filho
    private Reg0100 reg0100;

    @Filho
    private List<Reg0150> reg0150;

    @Filho
    private List<Reg0190> reg0190;

    @Filho
    private List<Reg0200> reg0200;

    @Filho
    private List<Reg0300> reg0300;

    @Filho
    private List<Reg0400> reg0400;

    @Filho
    private List<Reg0450> reg0450;

    @Filho
    private List<Reg0460> reg0460;

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

    public Reg0005 getReg0005() {
        return reg0005;
    }

    public void setReg0005(Reg0005 reg0005) {
        this.reg0005 = reg0005;
    }

    public List<Reg0015> getReg0015() {
        return reg0015;
    }

    public void setReg0015(List<Reg0015> reg0015) {
        this.reg0015 = reg0015;
    }

    public Reg0100 getReg0100() {
        return reg0100;
    }

    public void setReg0100(Reg0100 reg0100) {
        this.reg0100 = reg0100;
    }

    public List<Reg0150> getReg0150() {
        return reg0150;
    }

    public void setReg0150(List<Reg0150> reg0150) {
        this.reg0150 = reg0150;
    }

    public List<Reg0190> getReg0190() {
        return reg0190;
    }

    public void setReg0190(List<Reg0190> reg0190) {
        this.reg0190 = reg0190;
    }

    public List<Reg0200> getReg0200() {
        return reg0200;
    }

    public void setReg0200(List<Reg0200> reg0200) {
        this.reg0200 = reg0200;
    }

    public List<Reg0300> getReg0300() {
        return reg0300;
    }

    public void setReg0300(List<Reg0300> reg0300) {
        this.reg0300 = reg0300;
    }

    public List<Reg0400> getReg0400() {
        return reg0400;
    }

    public void setReg0400(List<Reg0400> reg0400) {
        this.reg0400 = reg0400;
    }

    public List<Reg0450> getReg0450() {
        return reg0450;
    }

    public void setReg0450(List<Reg0450> reg0450) {
        this.reg0450 = reg0450;
    }

    public List<Reg0460> getReg0460() {
        return reg0460;
    }

    public void setReg0460(List<Reg0460> reg0460) {
        this.reg0460 = reg0460;
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
