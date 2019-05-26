package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlocoD160 {

    @Inclui
    private final String reg = "D160";

    @Inclui
    private String despacho;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjCpfRem;

    @Inclui
    private String ieRem;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOri;

    @Inclui(zerosEsquerda = 7)
    private Long cnpjCpfDest;

    @Inclui
    private Integer ieDest;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

}