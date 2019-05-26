package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BlocoE210 {

    @Inclui
    private final String reg = "E210";

    @Inclui
    private String indMovSt;

    @Inclui
    private BigDecimal vlSldCredAntSt;

    @Inclui
    private BigDecimal vlDevolSt;

    @Inclui
    private BigDecimal vlRessascSt;

    @Inclui
    private BigDecimal vlOutCredSt;

    @Inclui
    private BigDecimal vlAjCreditosSt;

    @Inclui
    private BigDecimal vlRetencaoSt;

    @Inclui
    private BigDecimal vlOutDebSt;

    @Inclui
    private BigDecimal vlAjdebitosSt;

    @Inclui
    private BigDecimal vlSldDevAntSt;

    @Inclui
    private BigDecimal vlDeducoesSt;

    @Inclui
    private BigDecimal vlicmsRecolSt;

    @Inclui
    private BigDecimal vlSldCredStTransportar;

    @Inclui
    private BigDecimal debEspSt;

}