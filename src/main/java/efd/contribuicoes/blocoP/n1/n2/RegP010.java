package efd.contribuicoes.blocoP.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoP.n1.n2.n3.RegP100;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class RegP010 {

    @Getter @Inclui
    private final String reg = "P010";

    @Getter @Inclui
    private Long cnpj;

    @Getter @Setter @Filho
    private List<RegP100> regP100;

    public RegP010(Long cnpj) {
        this.cnpj = cnpj;
    }

    public RegP010(){}
}
