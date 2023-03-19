package efd.contribuicoes.blocoP.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoP.n1.n2.RegP010;
import efd.contribuicoes.blocoP.n1.n2.RegP200;

import java.io.Serializable;
import java.util.List;

public class RegP001 implements Serializable {
	private static final long serialVersionUID = -9194037600315582888L;

	@Inclui
	private final String reg = "P001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegP010> regP010;

    @Filho
    private List<RegP200> regP200;

    public RegP001(String indMov) {
        this.indMov = indMov;
    }

    public RegP001(){}

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public List<RegP010> getRegP010() {
        return regP010;
    }

    public void setRegP010(List<RegP010> regP010) {
        this.regP010 = regP010;
    }

    public List<RegP200> getRegP200() {
        return regP200;
    }

    public void setRegP200(List<RegP200> regP200) {
        this.regP200 = regP200;
    }
    
}
