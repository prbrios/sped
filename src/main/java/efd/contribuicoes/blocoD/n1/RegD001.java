package efd.contribuicoes.blocoD.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoD.n1.n2.RegD010;

import java.io.Serializable;
import java.util.List;

public class RegD001 implements Serializable {
	private static final long serialVersionUID = 3142343053736613687L;

	@Inclui
	private final String reg = "D001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegD010> regD010;

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

    public List<RegD010> getRegD010() {
        return regD010;
    }

    public void setRegD010(List<RegD010> regD010) {
        this.regD010 = regD010;
    }
    
}
