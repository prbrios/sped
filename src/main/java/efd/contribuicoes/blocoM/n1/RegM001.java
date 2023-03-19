package efd.contribuicoes.blocoM.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.*;

import java.io.Serializable;
import java.util.List;

public class RegM001 implements Serializable {
	private static final long serialVersionUID = -7536116551928757839L;

	@Inclui
	private final String reg = "M001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegM100> regM100;

    @Filho
    private RegM200 regM200;

    @Filho
    private List<RegM300> regM300;

    @Filho
    private RegM350 regM350;

    @Filho
    private List<RegM400> regM400;

    @Filho
    private List<RegM500> regM500;

    @Filho
    private RegM600 regM600;

    @Filho
    private List<RegM700> regM700;

    @Filho
    private List<RegM800> regM800;

    public RegM001(String indMov) {
        this.indMov = indMov;
    }

    public RegM001(){}

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public List<RegM100> getRegM100() {
        return regM100;
    }

    public void setRegM100(List<RegM100> regM100) {
        this.regM100 = regM100;
    }

    public RegM200 getRegM200() {
        return regM200;
    }

    public void setRegM200(RegM200 regM200) {
        this.regM200 = regM200;
    }

    public List<RegM300> getRegM300() {
        return regM300;
    }

    public void setRegM300(List<RegM300> regM300) {
        this.regM300 = regM300;
    }

    public RegM350 getRegM350() {
        return regM350;
    }

    public void setRegM350(RegM350 regM350) {
        this.regM350 = regM350;
    }

    public List<RegM400> getRegM400() {
        return regM400;
    }

    public void setRegM400(List<RegM400> regM400) {
        this.regM400 = regM400;
    }

    public List<RegM500> getRegM500() {
        return regM500;
    }

    public void setRegM500(List<RegM500> regM500) {
        this.regM500 = regM500;
    }

    public RegM600 getRegM600() {
        return regM600;
    }

    public void setRegM600(RegM600 regM600) {
        this.regM600 = regM600;
    }

    public List<RegM700> getRegM700() {
        return regM700;
    }

    public void setRegM700(List<RegM700> regM700) {
        this.regM700 = regM700;
    }

    public List<RegM800> getRegM800() {
        return regM800;
    }

    public void setRegM800(List<RegM800> regM800) {
        this.regM800 = regM800;
    }
    
}
