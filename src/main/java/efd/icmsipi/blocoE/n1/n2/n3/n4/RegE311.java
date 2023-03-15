package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE312;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE313;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class RegE311 implements Serializable {
	private static final long serialVersionUID = -4633430079459077980L;

	@Getter @Inclui
    private final String reg = "E311";

    @Getter @Setter @Inclui
    private String codAjApur;

    @Getter @Setter @Inclui
    private String descrComplAj;

    @Getter @Setter @Inclui
    private BigDecimal vlAjApur;

    @Getter @Setter @Filho
    private List<RegE312> regE312;

    @Getter @Setter @Filho
    private List<RegE313> regE313;

    public RegE311(String codAjApur, String descrComplAj, BigDecimal vlAjApur) {
        this.codAjApur = codAjApur;
        this.descrComplAj = descrComplAj;
        this.vlAjApur = vlAjApur;
    }

    public RegE311(){}
}