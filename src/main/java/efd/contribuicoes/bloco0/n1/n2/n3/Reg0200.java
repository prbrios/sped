package efd.contribuicoes.bloco0.n1.n2.n3;

import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco0.n1.n2.n3.n4.Reg0205;
import efd.contribuicoes.bloco0.n1.n2.n3.n4.Reg0206;
import efd.contribuicoes.bloco0.n1.n2.n3.n4.Reg0208;
import lombok.Getter;
import lombok.Setter;

public class Reg0200 {

    @Getter @Inclui
private final String reg = "0200";

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui
    private String descrItem;

    @Getter @Setter @Inclui
    private String codBarra;

    @Getter @Setter @Inclui
    private String codAndItem;

    @Getter @Setter @Inclui
    private String unidInv;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer tipoItem;

    @Getter @Setter @Inclui
    private String codNcm;

    @Getter @Setter @Inclui
    private String exIpi;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer codGen;

    @Getter @Setter @Inclui
    private Integer codLst;

    @Getter @Setter @Inclui
    private BigDecimal aliqIcms;

    @Getter @Setter @Filho
    private List<Reg0205> reg0205;

    @Getter @Setter @Filho
    private Reg0206 reg0206;

    @Getter @Setter @Filho
    private Reg0208 reg0208;

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
