package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.n3.Bloco0205;
import efd.icmsipi.bloco0.n1.n2.n3.Bloco0206;
import efd.icmsipi.bloco0.n1.n2.n3.Bloco0210;
import efd.icmsipi.bloco0.n1.n2.n3.Bloco0220;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Bloco0200 {

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
    private List<Bloco0205> bloco0205 = new ArrayList<Bloco0205>();

    @Filho
    Bloco0206 bloco0206;

    @Filho
    private List<Bloco0210> bloco0210 = new ArrayList<Bloco0210>();

    @Filho
    private List<Bloco0220> bloco0220 = new ArrayList<Bloco0220>();

}
