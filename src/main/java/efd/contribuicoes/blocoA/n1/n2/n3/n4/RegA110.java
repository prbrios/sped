package efd.contribuicoes.blocoA.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegA110 implements Serializable {
	private static final long serialVersionUID = -8852339394470025268L;

	@Inclui
	private final String reg = "A110";

    @Inclui
    private String codInf;

    @Inclui
    private String txtCompl;

    public RegA110(String codInf, String txtCompl) {
        this.codInf = codInf;
        this.txtCompl = txtCompl;
    }

    public RegA110(){ }

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
    
}
