package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE220;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE250;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class RegE210 implements Serializable {
	private static final long serialVersionUID = -4437770625280188980L;

	@Getter @Inclui
    private final String reg = "E210";

    @Getter @Setter @Inclui
    private String indMovSt;

    @Getter @Setter @Inclui
    private BigDecimal vlSldCredAntSt;

    @Getter @Setter @Inclui
    private BigDecimal vlDevolSt;

    @Getter @Setter @Inclui
    private BigDecimal vlRessascSt;

    @Getter @Setter @Inclui
    private BigDecimal vlOutCredSt;

    @Getter @Setter @Inclui
    private BigDecimal vlAjCreditosSt;

    @Getter @Setter @Inclui
    private BigDecimal vlRetencaoSt;

    @Getter @Setter @Inclui
    private BigDecimal vlOutDebSt;

    @Getter @Setter @Inclui
    private BigDecimal vlAjdebitosSt;

    @Getter @Setter @Inclui
    private BigDecimal vlSldDevAntSt;

    @Getter @Setter @Inclui
    private BigDecimal vlDeducoesSt;

    @Getter @Setter @Inclui
    private BigDecimal vlicmsRecolSt;

    @Getter @Setter @Inclui
    private BigDecimal vlSldCredStTransportar;

    @Getter @Setter @Inclui
    private BigDecimal debEspSt;

    @Getter @Setter @Filho
    private List<RegE220> regE220;

    @Getter @Setter @Filho
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