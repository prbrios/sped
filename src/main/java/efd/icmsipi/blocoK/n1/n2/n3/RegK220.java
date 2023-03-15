package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


public class RegK220 implements Serializable {
	private static final long serialVersionUID = 973698595620178574L;

	@Getter @Inclui
    private final String reg = "K220";

    @Getter @Setter @Inclui
    private LocalDate dtMov;

    @Getter @Setter @Inclui
    private String codItemOri;

    @Getter @Setter @Inclui
    private String codItemDeSt;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtdOri;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtdDest;

    public RegK220(LocalDate dtMov, String codItemOri, String codItemDeSt, BigDecimal qtdOri, BigDecimal qtdDest) {
        this.dtMov = dtMov;
        this.codItemOri = codItemOri;
        this.codItemDeSt = codItemDeSt;
        this.qtdOri = qtdOri;
        this.qtdDest = qtdDest;
    }

    public RegK220(){}
}