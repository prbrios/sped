package efd.icmsipi.bloco0.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0206 implements Serializable {
	private static final long serialVersionUID = 924019988785379683L;

	@Inclui
    private final String reg = "0206";

    @Inclui
    private String codComb;

    public Reg0206(String codComb) {
        this.codComb = codComb;
    }

    public Reg0206(){}

    public String getReg() {
        return reg;
    }

    public String getCodComb() {
        return codComb;
    }

    public void setCodComb(String codComb) {
        this.codComb = codComb;
    }
    

}
