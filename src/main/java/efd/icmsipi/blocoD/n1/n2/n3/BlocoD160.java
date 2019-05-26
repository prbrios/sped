package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.BlocoD161;
import efd.icmsipi.blocoD.n1.n2.n3.n4.BlocoD162;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    @Filho
    private BlocoD161 blocoD161;

    @Filho
    private List<BlocoD162> blocoD162;

}