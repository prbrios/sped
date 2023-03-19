package efd.contribuicoes.blocoF.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.n3.*;

import java.io.Serializable;
import java.util.List;

public class RegF010 implements Serializable {
	private static final long serialVersionUID = 8838775355613132003L;

	@Inclui
	private final String reg = "F010";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Filho
    private List<RegF100> regF100;

    @Filho
    private List<RegF120> regF120;

    @Filho
    private List<RegF130> regF130;

    @Filho
    private List<RegF150> regF150;

    @Filho
    private List<RegF200> regF200;

    @Filho
    private List<RegF500> regF500;

    @Filho
    private List<RegF510> regF510;

    @Filho
    private List<RegF525> regF525;

    @Filho
    private List<RegF550> regF550;

    @Filho
    private List<RegF560> regF560;

    @Filho
    private List<RegF600> regF600;

    @Filho
    private List<RegF700> regF700;

    @Filho
    private List<RegF800> regF800;

    public RegF010(Long cnpj) {
        this.cnpj = cnpj;
    }

    public RegF010(){ }

    public String getReg() {
        return reg;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public List<RegF100> getRegF100() {
        return regF100;
    }

    public void setRegF100(List<RegF100> regF100) {
        this.regF100 = regF100;
    }

    public List<RegF120> getRegF120() {
        return regF120;
    }

    public void setRegF120(List<RegF120> regF120) {
        this.regF120 = regF120;
    }

    public List<RegF130> getRegF130() {
        return regF130;
    }

    public void setRegF130(List<RegF130> regF130) {
        this.regF130 = regF130;
    }

    public List<RegF150> getRegF150() {
        return regF150;
    }

    public void setRegF150(List<RegF150> regF150) {
        this.regF150 = regF150;
    }

    public List<RegF200> getRegF200() {
        return regF200;
    }

    public void setRegF200(List<RegF200> regF200) {
        this.regF200 = regF200;
    }

    public List<RegF500> getRegF500() {
        return regF500;
    }

    public void setRegF500(List<RegF500> regF500) {
        this.regF500 = regF500;
    }

    public List<RegF510> getRegF510() {
        return regF510;
    }

    public void setRegF510(List<RegF510> regF510) {
        this.regF510 = regF510;
    }

    public List<RegF525> getRegF525() {
        return regF525;
    }

    public void setRegF525(List<RegF525> regF525) {
        this.regF525 = regF525;
    }

    public List<RegF550> getRegF550() {
        return regF550;
    }

    public void setRegF550(List<RegF550> regF550) {
        this.regF550 = regF550;
    }

    public List<RegF560> getRegF560() {
        return regF560;
    }

    public void setRegF560(List<RegF560> regF560) {
        this.regF560 = regF560;
    }

    public List<RegF600> getRegF600() {
        return regF600;
    }

    public void setRegF600(List<RegF600> regF600) {
        this.regF600 = regF600;
    }

    public List<RegF700> getRegF700() {
        return regF700;
    }

    public void setRegF700(List<RegF700> regF700) {
        this.regF700 = regF700;
    }

    public List<RegF800> getRegF800() {
        return regF800;
    }

    public void setRegF800(List<RegF800> regF800) {
        this.regF800 = regF800;
    }
    
}
