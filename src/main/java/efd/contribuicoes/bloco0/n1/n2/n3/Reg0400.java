package efd.contribuicoes.bloco0.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0400 implements Serializable {
	private static final long serialVersionUID = -5897507882890493941L;

	@Getter @Inclui
	private final String reg = "0400";

    @Getter @Setter @Inclui
    private String codNat;

    @Getter @Setter @Inclui
    private String descrNat;

    public Reg0400(String codNat, String descrNat) {
        this.codNat = codNat;
        this.descrNat = descrNat;
    }

    public Reg0400(){}
}
