package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD161;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD162;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegD160 {

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
    private RegD161 regD161;

    @Filho
    private List<RegD162> regD162;

    public RegD160(String despacho, Long cnpjCpfRem, String ieRem, Integer codMunOri, Long cnpjCpfDest, Integer ieDest, Integer codMunDest) {
        this.despacho = despacho;
        this.cnpjCpfRem = cnpjCpfRem;
        this.ieRem = ieRem;
        this.codMunOri = codMunOri;
        this.cnpjCpfDest = cnpjCpfDest;
        this.ieDest = ieDest;
        this.codMunDest = codMunDest;
    }

    public RegD160(){}
}