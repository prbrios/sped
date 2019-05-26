package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC310;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC510;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC590;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoC500 {

    @Inclui
    private final String reg = "C500";

    @Inclui
    private String indOper;

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Inclui
    private String ser;

    @Inclui
    private Integer sub;

    @Inclui
    private String codCons;

    @Inclui
    private Integer numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private LocalDate dtEs;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlForn;

    @Inclui
    private BigDecimal vlServNt;

    @Inclui
    private BigDecimal vlTerc;

    @Inclui
    private BigDecimal vlDa;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlBcIcmsSt;

    @Inclui
    private BigDecimal vlIcmsSt;

    @Inclui
    private String codInf;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private Integer tpLigacao;

    @Inclui
    private String codGrupoTensao;

    @Filho
    private List<BlocoC510> blocoC510;

    @Filho
    private List<BlocoC590> blocoC590;

}