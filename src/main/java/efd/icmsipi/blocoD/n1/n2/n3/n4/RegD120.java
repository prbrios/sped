package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegD120 {

    @Getter @Inclui
    private final String reg = "D120";

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Getter @Setter @Inclui
    private String veicId;

    @Getter @Setter @Inclui
    private String ufId;

    public RegD120(Integer codMunOrig, Integer codMunDest, String veicId, String ufId) {
        this.codMunOrig = codMunOrig;
        this.codMunDest = codMunDest;
        this.veicId = veicId;
        this.ufId = ufId;
    }

    public RegD120(){}
}