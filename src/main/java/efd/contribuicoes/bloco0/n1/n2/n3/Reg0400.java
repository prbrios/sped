package efd.contribuicoes.bloco0.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0400 implements Serializable {
	private static final long serialVersionUID = -5897507882890493941L;

	@Inclui
	private final String reg = "0400";

    @Inclui
    private String codNat;

    @Inclui
    private String descrNat;

    public Reg0400(String codNat, String descrNat) {
        this.codNat = codNat;
        this.descrNat = descrNat;
    }

    public Reg0400(){}

    public String getReg() {
        return reg;
    }

    public String getCodNat() {
        return codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }

    public String getDescrNat() {
        return descrNat;
    }

    public void setDescrNat(String descrNat) {
        this.descrNat = descrNat;
    }
    
}
