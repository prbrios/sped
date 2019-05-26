package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC310;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC601;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC610;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC690;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoC600 {

    @Inclui
    private final String reg = "C600";

    @Inclui
    private String codMod;

    @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Inclui
    private String ser;

    @Inclui
    private Integer sub;

    @Inclui
    private String codCons;

    @Inclui
    private Integer qtdCons;

    @Inclui
    private Integer qtdCanc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private Integer cons;

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
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Filho
    private List<BlocoC601> blocoC601;

    @Filho
    private List<BlocoC610> blocoC610;

    @Filho
    private List<BlocoC690> blocoC690;

}