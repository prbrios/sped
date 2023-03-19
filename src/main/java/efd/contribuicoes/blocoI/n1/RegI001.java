package efd.contribuicoes.blocoI.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;

import efd.contribuicoes.blocoI.n1.n2.RegI010;

import java.io.Serializable;
import java.util.List;

public class RegI001 implements Serializable {
	private static final long serialVersionUID = -1906825789252151507L;

	@Inclui
	private final String reg = "I001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegI010> regI010;

    public RegI001(String indMov) {
        this.indMov = indMov;
    }

    public RegI001(){}

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public List<RegI010> getRegI010() {
        return regI010;
    }

    public void setRegI010(List<RegI010> regI010) {
        this.regI010 = regI010;
    }
    
}
