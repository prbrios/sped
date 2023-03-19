package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC174 implements Serializable {
	private static final long serialVersionUID = 3001121341933004118L;

	@Inclui
    private final String reg = "C174";

    @Inclui
    private String indArm;

    @Inclui
    private String numArm;

    @Inclui
    private String descrCompl;

    public RegC174(String indArm, String numArm, String descrCompl) {
        this.indArm = indArm;
        this.numArm = numArm;
        this.descrCompl = descrCompl;
    }

    public RegC174(){}

    public String getReg() {
        return reg;
    }

    public String getIndArm() {
        return indArm;
    }

    public void setIndArm(String indArm) {
        this.indArm = indArm;
    }

    public String getNumArm() {
        return numArm;
    }

    public void setNumArm(String numArm) {
        this.numArm = numArm;
    }

    public String getDescrCompl() {
        return descrCompl;
    }

    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
    }
    
}
