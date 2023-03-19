package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC405;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC489;

import java.io.Serializable;
import java.util.List;

public class RegC400 implements Serializable {
	private static final long serialVersionUID = 228334774517452721L;

	@Inclui
	private final String reg = "C400";

    @Inclui
    private String codMod;

    @Inclui
    private String ecfMod;

    @Inclui
    private String ecfFab;

    @Inclui
    private Integer ecfCx;

    @Filho
    private List<RegC405> regC405;

    @Filho
    private List<RegC489> regC489;

    public RegC400(String codMod, String ecfMod, String ecfFab, Integer ecfCx) {
        this.codMod = codMod;
        this.ecfMod = ecfMod;
        this.ecfFab = ecfFab;
        this.ecfCx = ecfCx;
    }

    public RegC400(){ }

    public String getReg() {
        return reg;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getEcfMod() {
        return ecfMod;
    }

    public void setEcfMod(String ecfMod) {
        this.ecfMod = ecfMod;
    }

    public String getEcfFab() {
        return ecfFab;
    }

    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }

    public Integer getEcfCx() {
        return ecfCx;
    }

    public void setEcfCx(Integer ecfCx) {
        this.ecfCx = ecfCx;
    }

    public List<RegC405> getRegC405() {
        return regC405;
    }

    public void setRegC405(List<RegC405> regC405) {
        this.regC405 = regC405;
    }

    public List<RegC489> getRegC489() {
        return regC489;
    }

    public void setRegC489(List<RegC489> regC489) {
        this.regC489 = regC489;
    }
    
}
