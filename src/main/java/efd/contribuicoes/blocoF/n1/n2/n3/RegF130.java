package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegF130 {

    @Inclui
    private final String reg = "F130";

    @Inclui
    private String natBcCred;

    @Inclui(zerosEsquerda = 2)
    private Integer identBemImob;

    @Inclui
    private String indOrigCred;

    @Inclui
    private Integer indUtilBemImob;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate mesOperAquis;

    @Inclui
    private BigDecimal vlOperAquis;

    @Inclui
    private BigDecimal parcOperNaoBcCred;

    @Inclui
    private BigDecimal vlBcCred;

    @Inclui
    private Integer indNrParc;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

    @Inclui
    private String codCcus;

    @Inclui
    private String descBemImob;

}
