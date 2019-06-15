package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Reg0200 {

    @Getter @Inclui
    private final String reg = "0200";

    @Getter @Inclui
    private String codItem;

    @Getter @Inclui
    private String descrItem;

    @Getter @Inclui
    private String codBarra;

    @Getter @Inclui
    private String codAndItem;

    @Getter @Inclui
    private String unidInv;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer tipoItem;

    @Getter @Inclui
    private String codNcm;

    @Getter @Inclui
    private String exIpi;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer codGen;

    @Getter @Inclui
    private Integer codLst;

    @Getter @Inclui
    private BigDecimal aliqIcms;

    public Reg0200(String codItem, String descrItem, String codBarra, String codAndItem, String unidInv, Integer tipoItem, String codNcm, String exIpi, Integer codGen, Integer codLst, BigDecimal aliqIcms) {
        this.codItem = codItem;
        this.descrItem = descrItem;
        this.codBarra = codBarra;
        this.codAndItem = codAndItem;
        this.unidInv = unidInv;
        this.tipoItem = tipoItem;
        this.codNcm = codNcm;
        this.exIpi = exIpi;
        this.codGen = codGen;
        this.codLst = codLst;
        this.aliqIcms = aliqIcms;
    }

    public Reg0200(){}
}
