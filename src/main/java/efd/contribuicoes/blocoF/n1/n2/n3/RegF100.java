package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegF100 {

    @Inclui
    private final String reg = "F100";

    @Inclui
    private String indOper;

    @Inclui
    private String codPart;

    @Inclui
    private String codItem;

    @Inclui
    private LocalDate dtOper;

    @Inclui
    private BigDecimal vlOper;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String natBcCred;

    @Inclui
    private String indOrigCred;

    @Inclui
    private String codCta;

    @Inclui
    private String codCcus;

    @Inclui
    private String descDocOper;

}
