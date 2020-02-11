package efd.icmsipi.blocoD.n1.n2.n3;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD161;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD162;
import lombok.Getter;
import lombok.Setter;


public class RegD160 {

    @Getter @Inclui
    private final String reg = "D160";

    @Getter @Setter @Inclui
    private String despacho;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpjCpfRem;

    @Getter @Setter @Inclui
    private String ieRem;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunOri;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Long cnpjCpfDest;

    @Getter @Setter @Inclui
    private Integer ieDest;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Getter @Setter @Filho
    private RegD161 regD161;

    @Getter @Setter @Filho
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