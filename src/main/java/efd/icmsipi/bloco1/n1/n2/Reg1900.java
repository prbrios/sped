package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1910;

import java.io.Serializable;
import java.util.List;

public class Reg1900 implements Serializable {
	private static final long serialVersionUID = -3132529090919325822L;

	@Inclui
    private final String reg = "1900";

    @Inclui
    private String indApurIcms;

    @Inclui
    private String descrComplOutApur;

    @Filho
    private List<Reg1910> reg1910;

    public Reg1900(String indApurIcms, String descrComplOutApur) {
        this.indApurIcms = indApurIcms;
        this.descrComplOutApur = descrComplOutApur;
    }

    public Reg1900(){}

    public String getReg() {
        return reg;
    }

    public String getIndApurIcms() {
        return indApurIcms;
    }

    public void setIndApurIcms(String indApurIcms) {
        this.indApurIcms = indApurIcms;
    }

    public String getDescrComplOutApur() {
        return descrComplOutApur;
    }

    public void setDescrComplOutApur(String descrComplOutApur) {
        this.descrComplOutApur = descrComplOutApur;
    }

    public List<Reg1910> getReg1910() {
        return reg1910;
    }

    public void setReg1910(List<Reg1910> reg1910) {
        this.reg1910 = reg1910;
    }
    

}