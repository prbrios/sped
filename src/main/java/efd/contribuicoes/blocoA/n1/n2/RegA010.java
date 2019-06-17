package efd.contribuicoes.blocoA.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoA.n1.n2.n3.RegA100;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class RegA010 {

    @Getter @Inclui
    private final String reg = "A010";

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Filho
    private List<RegA100> regA100;

    public RegA010(Long cnpj) {
        this.cnpj = cnpj;
    }

    public RegA010(){ }
}
