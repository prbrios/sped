package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE220;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE250;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class RegE210 {

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

    @Filho
    private List<RegE220> regE220;

    @Filho
    private List<RegE250> regE250;

    public RegE210(String indMovSt, BigDecimal vlSldCredAntSt, BigDecimal vlDevolSt, BigDecimal vlRessascSt, BigDecimal vlOutCredSt, BigDecimal vlAjCreditosSt, BigDecimal vlRetencaoSt, BigDecimal vlOutDebSt, BigDecimal vlAjdebitosSt, BigDecimal vlSldDevAntSt, BigDecimal vlDeducoesSt, BigDecimal vlicmsRecolSt, BigDecimal vlSldCredStTransportar, BigDecimal debEspSt) {
        this.indMovSt = indMovSt;
        this.vlSldCredAntSt = vlSldCredAntSt;
        this.vlDevolSt = vlDevolSt;
        this.vlRessascSt = vlRessascSt;
        this.vlOutCredSt = vlOutCredSt;
        this.vlAjCreditosSt = vlAjCreditosSt;
        this.vlRetencaoSt = vlRetencaoSt;
        this.vlOutDebSt = vlOutDebSt;
        this.vlAjdebitosSt = vlAjdebitosSt;
        this.vlSldDevAntSt = vlSldDevAntSt;
        this.vlDeducoesSt = vlDeducoesSt;
        this.vlicmsRecolSt = vlicmsRecolSt;
        this.vlSldCredStTransportar = vlSldCredStTransportar;
        this.debEspSt = debEspSt;
    }

    public RegE210(){}
}