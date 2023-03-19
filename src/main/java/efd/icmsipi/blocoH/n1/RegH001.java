package efd.icmsipi.blocoH.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoH.n1.n2.RegH005;

import java.io.Serializable;
import java.util.List;

public class RegH001 implements Serializable {
	private static final long serialVersionUID = 7447776642584254147L;

	@Inclui
    private final String reg = "H001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegH005> regH005;

    public RegH001(String indMov) {
        this.indMov = indMov;
    }

    public RegH001(){}

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public List<RegH005> getRegH005() {
        return regH005;
    }

    public void setRegH005(List<RegH005> regH005) {
        this.regH005 = regH005;
    }
    
}