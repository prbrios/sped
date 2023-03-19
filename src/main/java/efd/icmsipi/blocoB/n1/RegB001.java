package efd.icmsipi.blocoB.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoB.n1.n2.*;
import efd.icmsipi.blocoB.n1.n2.n3.RegB035;

import java.io.Serializable;
import java.util.List;

public class RegB001 implements Serializable {
	private static final long serialVersionUID = 6897109089198534154L;

	@Inclui
    private final String reg = "B001";

    @Inclui
    private String indDad;

    @Filho
    private List<RegB020> regB020;

    @Filho
    private List<RegB030> regB030;

    @Filho
    private List<RegB035> regB035;

    @Filho
    private List<RegB350> regB350;

    @Filho
    private List<RegB420> regB420;

    @Filho
    private List<RegB440> regB440;

    @Filho
    private List<RegB460> regB460;

    @Filho
    private RegB470 regB470;

    @Filho
    private RegB500 regB500;

    public RegB001(String indDad) {
        this.indDad = indDad;
    }

    public RegB001(){}

    public String getReg() {
        return reg;
    }

    public String getIndDad() {
        return indDad;
    }

    public void setIndDad(String indDad) {
        this.indDad = indDad;
    }

    public List<RegB020> getRegB020() {
        return regB020;
    }

    public void setRegB020(List<RegB020> regB020) {
        this.regB020 = regB020;
    }

    public List<RegB030> getRegB030() {
        return regB030;
    }

    public void setRegB030(List<RegB030> regB030) {
        this.regB030 = regB030;
    }

    public List<RegB035> getRegB035() {
        return regB035;
    }

    public void setRegB035(List<RegB035> regB035) {
        this.regB035 = regB035;
    }

    public List<RegB350> getRegB350() {
        return regB350;
    }

    public void setRegB350(List<RegB350> regB350) {
        this.regB350 = regB350;
    }

    public List<RegB420> getRegB420() {
        return regB420;
    }

    public void setRegB420(List<RegB420> regB420) {
        this.regB420 = regB420;
    }

    public List<RegB440> getRegB440() {
        return regB440;
    }

    public void setRegB440(List<RegB440> regB440) {
        this.regB440 = regB440;
    }

    public List<RegB460> getRegB460() {
        return regB460;
    }

    public void setRegB460(List<RegB460> regB460) {
        this.regB460 = regB460;
    }

    public RegB470 getRegB470() {
        return regB470;
    }

    public void setRegB470(RegB470 regB470) {
        this.regB470 = regB470;
    }

    public RegB500 getRegB500() {
        return regB500;
    }

    public void setRegB500(RegB500 regB500) {
        this.regB500 = regB500;
    }
    
}
