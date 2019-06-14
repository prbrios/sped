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

    @Inclui(zerosEsquerda = 3)
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

    public Reg0000(Integer codVer, Integer tipoEscrit, Integer indSitEsp, String numRecAnterior, LocalDate dtIni, LocalDate dtFin, String nome, Long cnpj, String uf, Integer codMun, String suframa, Integer indNatPj, Integer indAtiv) {
        this.codVer = codVer;
        this.tipoEscrit = tipoEscrit;
        this.indSitEsp = indSitEsp;
        this.numRecAnterior = numRecAnterior;
        this.dtIni = dtIni;
        this.dtFin = dtFin;
        this.nome = nome;
        this.cnpj = cnpj;
        this.uf = uf;
        this.codMun = codMun;
        this.suframa = suframa;
        this.indNatPj = indNatPj;
        this.indAtiv = indAtiv;
    }

    public Reg0000(){}
}
