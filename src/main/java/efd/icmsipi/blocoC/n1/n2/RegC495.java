package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC495 {

    @Inclui
    private final String reg = "C495";

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtdCanc;

    @Inclui
    private String unid;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlCanc;

    @Inclui
    private BigDecimal vlAcmo;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal clIcms;

    @Inclui
    private BigDecimal vlIsen;

    @Inclui
    private BigDecimal vlNt;

    @Inclui
    private BigDecimal vlIcmsSt;

}