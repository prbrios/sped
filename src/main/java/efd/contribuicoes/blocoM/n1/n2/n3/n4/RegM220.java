package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.n5.RegM225;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegM220 implements Serializable {
	private static final long serialVersionUID = 1803904497707915377L;

	@Getter @Inclui
	private final String reg = "M220";

    @Getter @Setter @Inclui
    private String indAj;

    @Getter @Setter @Inclui
    private BigDecimal vlAj;

    @Getter @Setter @Inclui
    private String codAj;

    @Getter @Setter @Inclui
    private String numDoc;

    @Getter @Setter @Inclui
    private String descrAj;

    @Getter @Setter @Inclui
    private LocalDate dtRef;

    @Getter @Setter @Filho
    private List<RegM225> regM225;

    public RegM220(String indAj, BigDecimal vlAj, String codAj, String numDoc, String descrAj, LocalDate dtRef) {
        this.indAj = indAj;
        this.vlAj = vlAj;
        this.codAj = codAj;
        this.numDoc = numDoc;
        this.descrAj = descrAj;
        this.dtRef = dtRef;
    }

    public RegM220(){}
}
