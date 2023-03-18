package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg0145 implements Serializable {
	private static final long serialVersionUID = 4007724611261441965L;

	@Getter @Inclui
	private final String reg = "0145";

    @Getter @Setter @Inclui
    private Integer codIncTrib;

    @Getter @Setter @Inclui
    private BigDecimal vlRecTot;

    @Getter @Setter @Inclui
    private BigDecimal vlRecAtiv;

    @Getter @Setter @Inclui
    private BigDecimal vlRecDemaisAtiv;

    @Getter @Setter @Inclui
    private String infoCompl;

    public Reg0145(Integer codIncTrib, BigDecimal vlRecTot, BigDecimal vlRecAtiv, BigDecimal vlRecDemaisAtiv, String infoCompl) {
        this.codIncTrib = codIncTrib;
        this.vlRecTot = vlRecTot;
        this.vlRecAtiv = vlRecAtiv;
        this.vlRecDemaisAtiv = vlRecDemaisAtiv;
        this.infoCompl = infoCompl;
    }

    public Reg0145(){}
}
