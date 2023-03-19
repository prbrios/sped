package efd.contribuicoes.blocoA.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoA.n1.n2.RegA010;

import java.io.Serializable;
import java.util.List;

public class RegA001 implements Serializable {
	private static final long serialVersionUID = 9109970408434947974L;

	@Inclui
	private final String reg = "A001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegA010> regA010;

    public RegA001(String indMov) {
        this.indMov = indMov;
    }

    public RegA001(){ }

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public List<RegA010> getRegA010() {
        return regA010;
    }

    public void setRegA010(List<RegA010> regA010) {
        this.regA010 = regA010;
    }
    
}
