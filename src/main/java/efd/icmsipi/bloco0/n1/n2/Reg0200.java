package efd.icmsipi.bloco0.n1.n2;

import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0205;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0206;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0210;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0220;
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
    private String codBarras;

    @Getter @Setter @Inclui
    private String codAntItem;

    @Getter @Setter @Inclui
    private String unidInv;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer tipoItem;

    @Getter @Setter @Inclui(zerosEsquerda = 8)
    private Integer codNcm;

    @Getter @Setter @Inclui
    private String exIpi;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer codGen;

    @Getter @Setter @Inclui
    private String codLst;

    @Getter @Setter @Inclui
    private BigDecimal aliqIcms;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer cest;

    @Getter @Setter @Filho
    private List<Reg0205> reg0205;

    @Getter @Setter @Filho
    private Reg0206 reg0206;

    @Getter @Setter @Filho
    private List<Reg0210> reg0210;

    @Getter @Setter @Filho
    private List<Reg0220> reg0220;

    public Reg0200(String codItem, String descrItem, String codBarras, String codAntItem, String unidInv,
                   Integer tipoItem, Integer codNcm, String exIpi, Integer codGen, String codLst,
                   BigDecimal aliqIcms, Integer cest) {

        this.codItem = codItem;
        this.descrItem = descrItem;
        this.codBarras = codBarras;
        this.codAntItem = codAntItem;
        this.unidInv = unidInv;
        this.tipoItem = tipoItem;
        this.codNcm = codNcm;
        this.exIpi = exIpi;
        this.codGen = codGen;
        this.codLst = codLst;
        this.aliqIcms = aliqIcms;
        this.cest = cest;
    }

    public Reg0200(){}

}
