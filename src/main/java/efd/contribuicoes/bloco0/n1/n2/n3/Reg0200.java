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

}
