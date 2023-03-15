package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;



public class RegC160 implements Serializable {
	private static final long serialVersionUID = -3584697133795870167L;

	@Getter @Inclui
    private final String reg = "C160";

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String veicId;

    @Getter @Setter @Inclui
    private Integer qtdVol;

    @Getter @Setter @Inclui
    private BigDecimal pesoBrt;

    @Getter @Setter @Inclui
    private BigDecimal pesoLiq;

    @Getter @Setter @Inclui
    private String ufId;

    public RegC160(String codPart, String veicId, Integer qtdVol, BigDecimal pesoBrt, BigDecimal pesoLiq, String ufId) {
        this.codPart = codPart;
        this.veicId = veicId;
        this.qtdVol = qtdVol;
        this.pesoBrt = pesoBrt;
        this.pesoLiq = pesoLiq;
        this.ufId = ufId;
    }

    public RegC160(){}
}
