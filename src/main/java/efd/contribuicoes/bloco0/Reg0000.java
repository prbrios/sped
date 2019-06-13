package efd.contribuicoes.bloco0;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reg0000 {

    @Inclui
    private final String reg = "0000";

    @Inclui
    private Integer codVer;

    @Inclui
    private Integer tipoEscrit;

    @Inclui
    private Integer indSitEsp;

    @Inclui
    private String numRecAnterior;

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Inclui
    private String nome;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String uf;

    @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Inclui
    private String suframa;

    @Inclui(zerosEsquerda = 2)
    private Integer indNatPj;

    @Inclui
    private Integer indAtiv;

}
