package efd.ecd.blocoK.n1;

import java.io.Serializable;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.RegK030;
import efd.ecd.blocoK.n1.n2.RegK200;

public class RegK001 implements Serializable {
	private static final long serialVersionUID = -1120972246032060157L;

	@Inclui
    private final String reg = "K001";

    @Inclui
    private Integer indDad;

    @Filho
    private RegK030 regK030;

    @Filho
    private List<RegK200> regK200;

    public RegK001(Integer indDad) {
        this.indDad = indDad;
    }

    public RegK001() {}

    public String getReg() {
        return reg;
    }

    public Integer getIndDad() {
        return indDad;
    }

    public void setIndDad(Integer indDad) {
        this.indDad = indDad;
    }

    public RegK030 getRegK030() {
        return regK030;
    }

    public void setRegK030(RegK030 regK030) {
        this.regK030 = regK030;
    }

    public List<RegK200> getRegK200() {
        return regK200;
    }

    public void setRegK200(List<RegK200> regK200) {
        this.regK200 = regK200;
    }
    
}
