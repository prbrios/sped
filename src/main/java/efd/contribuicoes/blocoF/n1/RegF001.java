package efd.contribuicoes.blocoF.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.RegF010;

import java.io.Serializable;
import java.util.List;

public class RegF001 implements Serializable {
	private static final long serialVersionUID = 8956076859804030998L;

	@Inclui
	private final String reg = "F001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegF010> regF010;

    public RegF001(String indMov) {
        this.indMov = indMov;
    }

    public RegF001(){ }

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public List<RegF010> getRegF010() {
        return regF010;
    }

    public void setRegF010(List<RegF010> regF010) {
        this.regF010 = regF010;
    }
    
}
