package efd.icmsipi.blocoK.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.RegK100;

import java.io.Serializable;
import java.util.List;

public class RegK001 implements Serializable {
	private static final long serialVersionUID = 3757358338586039434L;

	@Inclui
    private final String reg = "K001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegK100> regK100;

    public RegK001(String indMov) {
        this.indMov = indMov;
    }

    public RegK001(){}

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public List<RegK100> getRegK100() {
        return regK100;
    }

    public void setRegK100(List<RegK100> regK100) {
        this.regK100 = regK100;
    }
    
}