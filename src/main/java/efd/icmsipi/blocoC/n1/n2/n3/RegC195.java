package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC197;

import java.io.Serializable;
import java.util.List;

public class RegC195 implements Serializable {
	private static final long serialVersionUID = 3059660621469684471L;

	@Inclui
    private final String reg = "C195";

    @Inclui
    private String codObs;

    @Inclui
    private String txtCompl;

    @Filho
    private List<RegC197> regC197;

    public RegC195(String codObs, String txtCompl) {
        this.codObs = codObs;
        this.txtCompl = txtCompl;
    }

    public RegC195(){}

    public String getReg() {
        return reg;
    }

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }

    public List<RegC197> getRegC197() {
        return regC197;
    }

    public void setRegC197(List<RegC197> regC197) {
        this.regC197 = regC197;
    }
    
}
