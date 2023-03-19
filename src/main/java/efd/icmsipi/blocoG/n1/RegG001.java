package efd.icmsipi.blocoG.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.RegG110;

import java.io.Serializable;
import java.util.List;

public class RegG001 implements Serializable {
	private static final long serialVersionUID = 3195764686921234591L;

	@Inclui
    private final String reg = "G001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegG110> regG110;

    public RegG001(String indMov) {
        this.indMov = indMov;
    }

    public RegG001(){}

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public List<RegG110> getRegG110() {
        return regG110;
    }

    public void setRegG110(List<RegG110> regG110) {
        this.regG110 = regG110;
    }
    
}