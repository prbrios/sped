package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0400 {

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
