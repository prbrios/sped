package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE311;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE316;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


public class RegE310 {

    @Getter @Inclui
    private final String reg = "E310";

    @Getter @Setter @Inclui
    private String indMovDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlSldCredAntDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlTotDebitosDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlOutDebDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlTotDebFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlTotCreditosDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlTotCredFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlOutCredDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlSldDevAntDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlDeducoesDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlRecol;

    @Getter @Setter @Inclui
    private BigDecimal vlSldCredTransportar;

    @Getter @Setter @Inclui
    private BigDecimal debEspDifal;

    @Getter @Setter @Inclui
    private String indMovFcpDifal;

    @Getter @Setter @Inclui
    private BigDecimal vlSldCredAntFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlOutDebFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlOutCredFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlSldDevantFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlDeducoesFcp;

    @Getter @Setter @Inclui
    private BigDecimal vlRecolFcp;

    @Getter @Setter @Inclui
    private BigDecimal debEspFcp;

    @Getter @Setter @Filho
    private List<RegE311> regE311;

    @Getter @Setter @Filho
    private List<RegE316> regE316;

    public RegE310(String indMovDifal, BigDecimal vlSldCredAntDifal, BigDecimal vlTotDebitosDifal, BigDecimal vlOutDebDifal, BigDecimal vlTotDebFcp, BigDecimal vlTotCreditosDifal, BigDecimal vlTotCredFcp, BigDecimal vlOutCredDifal, BigDecimal vlSldDevAntDifal, BigDecimal vlDeducoesDifal, BigDecimal vlRecol, BigDecimal vlSldCredTransportar, BigDecimal debEspDifal, String indMovFcpDifal, BigDecimal vlSldCredAntFcp, BigDecimal vlOutDebFcp, BigDecimal vlOutCredFcp, BigDecimal vlSldDevantFcp, BigDecimal vlDeducoesFcp, BigDecimal vlRecolFcp, BigDecimal debEspFcp) {
        this.indMovDifal = indMovDifal;
        this.vlSldCredAntDifal = vlSldCredAntDifal;
        this.vlTotDebitosDifal = vlTotDebitosDifal;
        this.vlOutDebDifal = vlOutDebDifal;
        this.vlTotDebFcp = vlTotDebFcp;
        this.vlTotCreditosDifal = vlTotCreditosDifal;
        this.vlTotCredFcp = vlTotCredFcp;
        this.vlOutCredDifal = vlOutCredDifal;
        this.vlSldDevAntDifal = vlSldDevAntDifal;
        this.vlDeducoesDifal = vlDeducoesDifal;
        this.vlRecol = vlRecol;
        this.vlSldCredTransportar = vlSldCredTransportar;
        this.debEspDifal = debEspDifal;
        this.indMovFcpDifal = indMovFcpDifal;
        this.vlSldCredAntFcp = vlSldCredAntFcp;
        this.vlOutDebFcp = vlOutDebFcp;
        this.vlOutCredFcp = vlOutCredFcp;
        this.vlSldDevantFcp = vlSldDevantFcp;
        this.vlDeducoesFcp = vlDeducoesFcp;
        this.vlRecolFcp = vlRecolFcp;
        this.debEspFcp = debEspFcp;
    }

    public RegE310(){}
}