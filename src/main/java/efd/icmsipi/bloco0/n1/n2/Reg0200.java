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
    private String cest;

    @Filho
    private List<Reg0205> reg0205;

    @Filho
    private Reg0206 reg0206;

    @Filho
    private List<Reg0210> reg0210;

    @Filho
    private List<Reg0220> reg0220;

}
