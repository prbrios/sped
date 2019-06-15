package efd.contribuicoes.blocoM.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegM990 {

    @Inclui
    private final String reg = "M990";

    @Inclui
    private Integer qtdLinM;

}
