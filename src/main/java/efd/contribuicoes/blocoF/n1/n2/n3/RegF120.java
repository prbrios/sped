package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegF120 {

    @Inclui
    private final String reg = "F120";

    @Inclui
    private String natBcCred;

    @Inclui(zerosEsquerda = 2)
    private Integer identBemMob;

    @Inclui
    private String indOrigCred;

    @Inclui
    private Integer indUtilBemImob;

    @Inclui
    private BigDecimal vlOperDep;

    @Inclui
    private BigDecimal parcOperNaoBcCred;

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
