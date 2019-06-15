package efd.contribuicoes.blocoP.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegP990 {

    @Inclui
    private final String reg = "P990";

    @Inclui
    private Integer qtdLinP;

}
