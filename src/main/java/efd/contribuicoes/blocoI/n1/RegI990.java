package efd.contribuicoes.blocoI.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegI990 {

    @Inclui
    private final String reg = "I990";

    @Inclui
    private Integer qtdLinI;

}
