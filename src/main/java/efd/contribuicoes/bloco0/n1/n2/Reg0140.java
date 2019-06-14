package efd.contribuicoes.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg0140 {

    @Inclui
    private final String reg = "0140";

    @Inclui
    private String codEst;

    @Inclui
    private String nome;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String uf;

    @Inclui
    private String ie;

    @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Inclui
    private String im;

    @Inclui
    private String suframa;

    public Reg0140(String codEst, String nome, Long cnpj, String uf, String ie, Integer codMun, String im, String suframa) {
        this.codEst = codEst;
        this.nome = nome;
        this.cnpj = cnpj;
        this.uf = uf;
        this.ie = ie;
        this.codMun = codMun;
        this.im = im;
        this.suframa = suframa;
    }

    public Reg0140(){}
}
