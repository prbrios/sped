package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg1370 {

    @Inclui
    private final String reg = "1370";

    @Inclui
    private Integer numBico;

    @Inclui
    private String codItem;

    @Inclui
    private String numTanque;

}