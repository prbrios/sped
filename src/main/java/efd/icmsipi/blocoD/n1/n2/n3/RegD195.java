package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD197;

import java.io.Serializable;
import java.util.List;

public class RegD195 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inclui
    private final String reg = "D195";

    @Inclui
    private String codObs;

    @Inclui
    private String txtCompl;

    @Filho
    private List<RegD197> regD197;

    public RegD195(String codObs, String txtCompl) {
        this.codObs = codObs;
        this.txtCompl = txtCompl;
    }

    public RegD195(){}

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

    public List<RegD197> getRegD197() {
        return regD197;
    }

    public void setRegD197(List<RegD197> regD197) {
        this.regD197 = regD197;
    }
    
}