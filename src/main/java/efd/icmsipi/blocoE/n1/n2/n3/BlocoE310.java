package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BlocoE310 {

    @Inclui
    private final String reg = "E310";

    @Inclui
    private String indMovDifal;

    @Inclui
    private BigDecimal vlSldCredAntDifal;

    @Inclui
    private BigDecimal vlTotDebitosDifal;

    @Inclui
    private BigDecimal vlOutDebDifal;

    @Inclui
    private BigDecimal vlTotDebFcp;

    @Inclui
    private BigDecimal vlTotCreditosDifal;

    @Inclui
    private BigDecimal vlTotCredFcp;

    @Inclui
    private BigDecimal vlOutCredDifal;

    @Inclui
    private BigDecimal vlSldDevAntDifal;

    @Inclui
    private BigDecimal vlDeducoesDifal;

    @Inclui
    private BigDecimal vlRecol;

    @Inclui
    private BigDecimal vlSldCredTransportar;

    @Inclui
    private BigDecimal debEspDifal;

    @Inclui
    private String indMovFcpDifal;

    @Inclui
    private BigDecimal vlSldCredAntFcp;

    @Inclui
    private BigDecimal vlOutDebFcp;

    @Inclui
    private BigDecimal vlOutCredFcp;

    @Inclui
    private BigDecimal vlSldDevantFcp;

    @Inclui
    private BigDecimal vlDeducoesFcp;

    @Inclui
    private BigDecimal vlRecolFcp;

    @Inclui
    private BigDecimal debEspFcp;

}