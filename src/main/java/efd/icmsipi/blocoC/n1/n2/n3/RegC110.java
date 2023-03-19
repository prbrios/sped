package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.*;

import java.io.Serializable;
import java.util.List;

public class RegC110 implements Serializable {
	private static final long serialVersionUID = -5750011719803228713L;

	@Inclui
    private final String reg = "C110";

    @Inclui
    private String codInf;

    @Inclui
    private String txtCompl;

    @Filho
    private List<RegC111> regC111;

    @Filho
    private List<RegC112> regC112;

    @Filho
    private List<RegC113> regC113;

    @Filho
    private List<RegC114> regC114;

    @Filho
    private List<RegC115> regC115;

    @Filho
    private List<RegC116> regC116;

    public RegC110(String codInf, String txtCompl) {
        this.codInf = codInf;
        this.txtCompl = txtCompl;
    }

    public RegC110(){}

    public String getReg() {
        return reg;
    }

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }

    public List<RegC111> getRegC111() {
        return regC111;
    }

    public void setRegC111(List<RegC111> regC111) {
        this.regC111 = regC111;
    }

    public List<RegC112> getRegC112() {
        return regC112;
    }

    public void setRegC112(List<RegC112> regC112) {
        this.regC112 = regC112;
    }

    public List<RegC113> getRegC113() {
        return regC113;
    }

    public void setRegC113(List<RegC113> regC113) {
        this.regC113 = regC113;
    }

    public List<RegC114> getRegC114() {
        return regC114;
    }

    public void setRegC114(List<RegC114> regC114) {
        this.regC114 = regC114;
    }

    public List<RegC115> getRegC115() {
        return regC115;
    }

    public void setRegC115(List<RegC115> regC115) {
        this.regC115 = regC115;
    }

    public List<RegC116> getRegC116() {
        return regC116;
    }

    public void setRegC116(List<RegC116> regC116) {
        this.regC116 = regC116;
    }
    
}
