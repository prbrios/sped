package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE311;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE316;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class RegE310 {

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

    @Filho
    private List<RegE311> regE311;

    @Filho
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