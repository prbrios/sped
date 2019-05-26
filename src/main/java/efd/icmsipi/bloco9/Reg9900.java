package efd.icmsipi.bloco9;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg9900 {

    @Inclui
    private final String reg = "9900";

    @Inclui
    private String regBlc;

    @Inclui
    private Integer qtdRegBlc;

}