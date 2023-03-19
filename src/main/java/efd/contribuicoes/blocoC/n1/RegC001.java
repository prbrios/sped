package efd.contribuicoes.blocoC.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.RegC010;

import java.io.Serializable;
import java.util.List;

public class RegC001 implements Serializable {
	private static final long serialVersionUID = 8377384511232656741L;

	@Inclui
	private final String reg = "C001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegC010> regC010;

    public RegC001(String indMov) {
        this.indMov = indMov;
    }

    public RegC001(){ }

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public List<RegC010> getRegC010() {
        return regC010;
    }

    public void setRegC010(List<RegC010> regC010) {
        this.regC010 = regC010;
    }
    
}
