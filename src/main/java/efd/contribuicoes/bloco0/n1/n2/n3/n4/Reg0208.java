package efd.contribuicoes.bloco0.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0208 implements Serializable {
	private static final long serialVersionUID = -359237969503734962L;

	@Inclui
	private final String reg = "0208";

    @Inclui
    private String codTab;

    @Inclui
    private String codGru;

    @Inclui
    private String marcaCom;

    public Reg0208(String codTab, String codGru, String marcaCom) {
        this.codTab = codTab;
        this.codGru = codGru;
        this.marcaCom = marcaCom;
    }

    public Reg0208(){}

    public String getReg() {
        return reg;
    }

    public String getCodTab() {
        return codTab;
    }

    public void setCodTab(String codTab) {
        this.codTab = codTab;
    }

    public String getCodGru() {
        return codGru;
    }

    public void setCodGru(String codGru) {
        this.codGru = codGru;
    }

    public String getMarcaCom() {
        return marcaCom;
    }

    public void setMarcaCom(String marcaCom) {
        this.marcaCom = marcaCom;
    }
    
}
