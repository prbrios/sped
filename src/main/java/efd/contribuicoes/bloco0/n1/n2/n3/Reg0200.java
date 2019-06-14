package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Reg0200 {

    @Inclui
    private final String reg = "0200";

    @Inclui
    private String codItem;

    @Inclui
    private String descrItem;

    @Inclui
    private String codBarra;

    @Inclui
    private String codAndItem;

    @Inclui
    private String unidInv;

    @Inclui(zerosEsquerda = 2)
    private Integer tipoItem;

    @Inclui
    private String codNcm;

    @Inclui
    private String exIpi;

    @Inclui(zerosEsquerda = 2)
    private Integer codGen;

    @Inclui
    private Integer codLst;

    @Inclui
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
