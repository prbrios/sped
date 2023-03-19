package efd.icmsipi.blocoC.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.*;

import java.io.Serializable;
import java.util.List;

public class RegC001 implements Serializable {
	private static final long serialVersionUID = -8220944236978162227L;

	@Inclui
    private final String reg = "C001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegC100> regC100;

    @Filho
    private List<RegC300> regC300;

    @Filho
    private List<RegC350> regC350;

    @Filho
    private List<RegC400> regC400;

    @Filho
    private List<RegC495> regC495;

    @Filho
    private List<RegC500> regC500;

    @Filho
    private List<RegC600> regC600;

    @Filho
    private List<RegC700> regC700;

    @Filho
    private List<RegC800> regC800;

    @Filho
    private List<RegC860> regC860;

    public RegC001(String indMov) {
        this.indMov = indMov;
    }

    public RegC001(){}

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public List<RegC100> getRegC100() {
        return regC100;
    }

    public void setRegC100(List<RegC100> regC100) {
        this.regC100 = regC100;
    }

    public List<RegC300> getRegC300() {
        return regC300;
    }

    public void setRegC300(List<RegC300> regC300) {
        this.regC300 = regC300;
    }

    public List<RegC350> getRegC350() {
        return regC350;
    }

    public void setRegC350(List<RegC350> regC350) {
        this.regC350 = regC350;
    }

    public List<RegC400> getRegC400() {
        return regC400;
    }

    public void setRegC400(List<RegC400> regC400) {
        this.regC400 = regC400;
    }

    public List<RegC495> getRegC495() {
        return regC495;
    }

    public void setRegC495(List<RegC495> regC495) {
        this.regC495 = regC495;
    }

    public List<RegC500> getRegC500() {
        return regC500;
    }

    public void setRegC500(List<RegC500> regC500) {
        this.regC500 = regC500;
    }

    public List<RegC600> getRegC600() {
        return regC600;
    }

    public void setRegC600(List<RegC600> regC600) {
        this.regC600 = regC600;
    }

    public List<RegC700> getRegC700() {
        return regC700;
    }

    public void setRegC700(List<RegC700> regC700) {
        this.regC700 = regC700;
    }

    public List<RegC800> getRegC800() {
        return regC800;
    }

    public void setRegC800(List<RegC800> regC800) {
        this.regC800 = regC800;
    }

    public List<RegC860> getRegC860() {
        return regC860;
    }

    public void setRegC860(List<RegC860> regC860) {
        this.regC860 = regC860;
    }
    
}
