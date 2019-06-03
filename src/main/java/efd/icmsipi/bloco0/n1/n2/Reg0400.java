package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg0400 {

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

}
