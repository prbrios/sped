package efd.icmsipi.bloco1.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.*;

import java.io.Serializable;
import java.util.List;

public class Reg1001 implements Serializable {
	private static final long serialVersionUID = -7994475444985127040L;

	@Inclui
    private final String reg = "1001";

    @Inclui
    private Integer indMov;

    @Filho
    private Reg1010 reg1010;

    @Filho
    private List<Reg1100> reg1100;

    @Filho
    private List<Reg1200> reg1200;

    @Filho
    private Reg1250 reg1250;

    @Filho
    private List<Reg1300> reg1300;

    @Filho
    private List<Reg1350> reg1350;

    @Filho
    private List<Reg1390> reg1390;

    @Filho
    private List<Reg1400> reg1400;

    @Filho
    private List<Reg1500> reg1500;

    @Filho
    private List<Reg1600> reg1600;
    
    @Filho
    private List<Reg1601> reg1601;

    @Filho
    private List<Reg1700> reg1700;

    @Filho
    private Reg1800 reg1800;

    @Filho
    private List<Reg1900> reg1900;

    @Filho
    private List<Reg1960> reg1960;

    @Filho
    private List<Reg1970> reg1970;

    @Filho
    private Reg1980 reg1980;

    public Reg1001(Integer indMov) {
        this.indMov = indMov;
    }

    public Reg1001(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndMov() {
        return indMov;
    }

    public void setIndMov(Integer indMov) {
        this.indMov = indMov;
    }

    public Reg1010 getReg1010() {
        return reg1010;
    }

    public void setReg1010(Reg1010 reg1010) {
        this.reg1010 = reg1010;
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

    public Reg1250 getReg1250() {
        return reg1250;
    }

    public void setReg1250(Reg1250 reg1250) {
        this.reg1250 = reg1250;
    }

    public List<Reg1300> getReg1300() {
        return reg1300;
    }

    public void setReg1300(List<Reg1300> reg1300) {
        this.reg1300 = reg1300;
    }

    public List<Reg1350> getReg1350() {
        return reg1350;
    }

    public void setReg1350(List<Reg1350> reg1350) {
        this.reg1350 = reg1350;
    }

    public List<Reg1390> getReg1390() {
        return reg1390;
    }

    public void setReg1390(List<Reg1390> reg1390) {
        this.reg1390 = reg1390;
    }

    public List<Reg1400> getReg1400() {
        return reg1400;
    }

    public void setReg1400(List<Reg1400> reg1400) {
        this.reg1400 = reg1400;
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

    public List<Reg1601> getReg1601() {
        return reg1601;
    }

    public void setReg1601(List<Reg1601> reg1601) {
        this.reg1601 = reg1601;
    }

    public List<Reg1700> getReg1700() {
        return reg1700;
    }

    public void setReg1700(List<Reg1700> reg1700) {
        this.reg1700 = reg1700;
    }

    public Reg1800 getReg1800() {
        return reg1800;
    }

    public void setReg1800(Reg1800 reg1800) {
        this.reg1800 = reg1800;
    }

    public List<Reg1900> getReg1900() {
        return reg1900;
    }

    public void setReg1900(List<Reg1900> reg1900) {
        this.reg1900 = reg1900;
    }

    public List<Reg1960> getReg1960() {
        return reg1960;
    }

    public void setReg1960(List<Reg1960> reg1960) {
        this.reg1960 = reg1960;
    }

    public List<Reg1970> getReg1970() {
        return reg1970;
    }

    public void setReg1970(List<Reg1970> reg1970) {
        this.reg1970 = reg1970;
    }

    public Reg1980 getReg1980() {
        return reg1980;
    }

    public void setReg1980(Reg1980 reg1980) {
        this.reg1980 = reg1980;
    }
    

}