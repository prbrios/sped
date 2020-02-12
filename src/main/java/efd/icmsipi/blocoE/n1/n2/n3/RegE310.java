package efd.icmsipi.blocoE.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegE310 {

    @Getter @Inclui
    private final String reg = "E310";

    @Getter @Setter @Inclui
    private String indMovFcpDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlSldCredAntDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlTotDebitosDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlOutDebDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlTotCreditosDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlOutCredDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlSldDevAntDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlDeducoesDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlRecolDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlSldCredTransportarDifal;

    @Getter @Setter @Inclui
    private BigDecimal debEspDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlSldCredAntFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlTotDebFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlOutDebFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlTotCredFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlOutCredFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlSldDevAntFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlDeducoesFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlRecolFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlSldCredTransportarFcp;

    @Getter @Setter @Inclui
    private BigDecimal debEspFcp;

    public RegE310(String indMovFcpDifal, BigDecimal vlSldCredAntDifal, BigDecimal vlTotDebitosDifal, BigDecimal vlOutDebDifal, BigDecimal vlTotCreditosDifal, BigDecimal vlOutCredDifal, BigDecimal vlSldDevAntDifal, BigDecimal vlDeducoesDifal, BigDecimal vlRecolDifal, BigDecimal vlSldCredTransportarDifal, BigDecimal debEspDifal, BigDecimal vlSldCredAntFcp, BigDecimal vlTotDebFcp, BigDecimal vlOutDebFcp, BigDecimal vlTotCredFcp, BigDecimal vlOutCredFcp, BigDecimal vlSldDevAntFcp, BigDecimal vlDeducoesFcp, BigDecimal vlRecolFcp, BigDecimal vlSldCredTransportarFcp, BigDecimal debEspFcp) {
        this.indMovFcpDifal = indMovFcpDifal;
        this.vlSldCredAntDifal = vlSldCredAntDifal;
        this.vlTotDebitosDifal = vlTotDebitosDifal;
        this.vlOutDebDifal = vlOutDebDifal;
        this.vlTotCreditosDifal = vlTotCreditosDifal;
        this.vlOutCredDifal = vlOutCredDifal;
        this.vlSldDevAntDifal = vlSldDevAntDifal;
        this.vlDeducoesDifal = vlDeducoesDifal;
        this.vlRecolDifal = vlRecolDifal;
        this.vlSldCredTransportarDifal = vlSldCredTransportarDifal;
        this.debEspDifal = debEspDifal;
        this.vlSldCredAntFcp = vlSldCredAntFcp;
        this.vlTotDebFcp = vlTotDebFcp;
        this.vlOutDebFcp = vlOutDebFcp;
        this.vlTotCredFcp = vlTotCredFcp;
        this.vlOutCredFcp = vlOutCredFcp;
        this.vlSldDevAntFcp = vlSldDevAntFcp;
        this.vlDeducoesFcp = vlDeducoesFcp;
        this.vlRecolFcp = vlRecolFcp;
        this.vlSldCredTransportarFcp = vlSldCredTransportarFcp;
        this.debEspFcp = debEspFcp;
    }

    public RegE310(){}
}