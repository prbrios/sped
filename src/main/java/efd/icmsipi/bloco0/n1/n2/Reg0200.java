package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0205;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0206;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0210;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0220;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

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
    private String codBarras;

    @Inclui
    private String codAntItem;

    @Inclui
    private String unidInv;

    @Inclui(zerosEsquerda = 2)
    private Integer tipoItem;

    @Inclui(zerosEsquerda = 8)
    private Integer codNcm;

    @Inclui
    private String exIpi;

    @Inclui(zerosEsquerda = 2)
    private Integer codGen;

    @Inclui
    private String codLst;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui(zerosEsquerda = 7)
    private Integer cest;

    @Filho
    private List<Reg0205> reg0205;

    @Filho
    private Reg0206 reg0206;

    @Filho
    private List<Reg0210> reg0210;

    @Filho
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
