package efd.icmsipi.blocoD.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.*;

import java.io.Serializable;
import java.util.List;

public class RegD001 implements Serializable {
	private static final long serialVersionUID = 8294414379216856553L;

	@Inclui
    private final String reg = "D001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegD100> regD100;

    @Filho
    private List<RegD300> regD300;

    @Filho
    private List<RegD350> regD350;

    @Filho
    private List<RegD400> regD400;

    @Filho
    private List<RegD500> regD500;

    @Filho
    private List<RegD600> regD600;

    @Filho
    private List<RegD695> regD695;

    public RegD001(String indMov) {
        this.indMov = indMov;
    }

    public RegD001(){}

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public List<RegD100> getRegD100() {
        return regD100;
    }

    public void setRegD100(List<RegD100> regD100) {
        this.regD100 = regD100;
    }

    public List<RegD300> getRegD300() {
        return regD300;
    }

    public void setRegD300(List<RegD300> regD300) {
        this.regD300 = regD300;
    }

    public List<RegD350> getRegD350() {
        return regD350;
    }

    public void setRegD350(List<RegD350> regD350) {
        this.regD350 = regD350;
    }

    public List<RegD400> getRegD400() {
        return regD400;
    }

    public void setRegD400(List<RegD400> regD400) {
        this.regD400 = regD400;
    }

    public List<RegD500> getRegD500() {
        return regD500;
    }

    public void setRegD500(List<RegD500> regD500) {
        this.regD500 = regD500;
    }

    public List<RegD600> getRegD600() {
        return regD600;
    }

    public void setRegD600(List<RegD600> regD600) {
        this.regD600 = regD600;
    }

    public List<RegD695> getRegD695() {
        return regD695;
    }

    public void setRegD695(List<RegD695> regD695) {
        this.regD695 = regD695;
    }
    
}