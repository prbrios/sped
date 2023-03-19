package efd.contribuicoes.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.*;

import java.io.Serializable;
import java.util.List;

public class RegC010 implements Serializable {
	private static final long serialVersionUID = -3157258733000835729L;

	@Inclui
	private final String reg = "C010";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String indEscri;

    @Filho
    private List<RegC100> regC100;

    @Filho
    private List<RegC180> regC180;

    @Filho
    private List<RegC190> regC190;

    @Filho
    private List<RegC380> regC380;

    @Filho
    private List<RegC395> regC395;

    @Filho
    private List<RegC400> regC400;

    @Filho
    private List<RegC490> regC490;

    @Filho
    private List<RegC500> regC500;

    @Filho
    private List<RegC600> regC600;

    @Filho
    private List<RegC800> regC800;

    @Filho
    private List<RegC860> regC860;

    public RegC010(Long cnpj, String indEscri) {
        this.cnpj = cnpj;
        this.indEscri = indEscri;
    }

    public RegC010(){ }

    public String getReg() {
        return reg;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getIndEscri() {
        return indEscri;
    }

    public void setIndEscri(String indEscri) {
        this.indEscri = indEscri;
    }

    public List<RegC100> getRegC100() {
        return regC100;
    }

    public void setRegC100(List<RegC100> regC100) {
        this.regC100 = regC100;
    }

    public List<RegC180> getRegC180() {
        return regC180;
    }

    public void setRegC180(List<RegC180> regC180) {
        this.regC180 = regC180;
    }

    public List<RegC190> getRegC190() {
        return regC190;
    }

    public void setRegC190(List<RegC190> regC190) {
        this.regC190 = regC190;
    }

    public List<RegC380> getRegC380() {
        return regC380;
    }

    public void setRegC380(List<RegC380> regC380) {
        this.regC380 = regC380;
    }

    public List<RegC395> getRegC395() {
        return regC395;
    }

    public void setRegC395(List<RegC395> regC395) {
        this.regC395 = regC395;
    }

    public List<RegC400> getRegC400() {
        return regC400;
    }

    public void setRegC400(List<RegC400> regC400) {
        this.regC400 = regC400;
    }

    public List<RegC490> getRegC490() {
        return regC490;
    }

    public void setRegC490(List<RegC490> regC490) {
        this.regC490 = regC490;
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
