package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


public class RegK200 implements Serializable {
	private static final long serialVersionUID = -382752401758872422L;

	@Getter @Inclui
    private final String reg = "K200";

    @Getter @Setter @Inclui
    private LocalDate dtEst;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Getter @Setter @Inclui
    private String indEst;

    @Getter @Setter @Inclui
    private String codPart;

    public RegK200(LocalDate dtEst, String codItem, BigDecimal qtd, String indEst, String codPart) {
        this.dtEst = dtEst;
        this.codItem = codItem;
        this.qtd = qtd;
        this.indEst = indEst;
        this.codPart = codPart;
    }

    public RegK200(){}
}