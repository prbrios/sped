package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE531;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class RegE530 implements Serializable {
	private static final long serialVersionUID = 2714268030159211912L;

	@Getter @Inclui
    private final String reg = "E330";

    @Getter @Setter @Inclui
    private String indAj;

    @Getter @Setter @Inclui
    private BigDecimal vlAj;

    @Getter @Setter @Inclui
    private String codAj;

    @Getter @Setter @Inclui
    private String indDoc;

    @Getter @Setter @Inclui
    private String numDoc;

    @Getter @Setter @Inclui
    private String descrAj;

    @Getter @Setter @Filho
    private List<RegE531> regE531;

    public RegE530(String indAj, BigDecimal vlAj, String codAj, String indDoc, String numDoc, String descrAj) {
        this.indAj = indAj;
        this.vlAj = vlAj;
        this.codAj = codAj;
        this.indDoc = indDoc;
        this.numDoc = numDoc;
        this.descrAj = descrAj;
    }

    public RegE530(){}
}