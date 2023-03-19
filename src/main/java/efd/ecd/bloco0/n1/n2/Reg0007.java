package efd.ecd.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0007 implements Serializable {
	private static final long serialVersionUID = -8906550933578771063L;

	@Inclui
    private final String reg = "0007";

    @Inclui
    private String codEntRef;

    @Inclui
    private String codInscr;

    public Reg0007(String codEntRef, String codInscr) {
        this.codEntRef = codEntRef;
        this.codInscr = codInscr;
    }

    public Reg0007() {/* */}

    public String getReg() {
        return reg;
    }

    public String getCodEntRef() {
        return codEntRef;
    }

    public void setCodEntRef(String codEntRef) {
        this.codEntRef = codEntRef;
    }

    public String getCodInscr() {
        return codInscr;
    }

    public void setCodInscr(String codInscr) {
        this.codInscr = codInscr;
    }
    
}
