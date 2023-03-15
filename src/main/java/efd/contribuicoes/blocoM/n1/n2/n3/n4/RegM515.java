package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegM515 implements Serializable {
	private static final long serialVersionUID = -7756242612452693814L;

	@Getter @Inclui
	private final String reg = "M515";

    @Getter @Setter @Inclui
    private BigDecimal detValorAj;

    @Getter @Setter @Inclui
    private Integer cstCofins;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal detBcCred;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal detAliq;

    @Getter @Setter @Inclui
    private LocalDate dtOperAj;

    @Getter @Setter @Inclui
    private String descAj;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String infoCompl;

    public RegM515(BigDecimal detValorAj, Integer cstCofins, BigDecimal detBcCred, BigDecimal detAliq, LocalDate dtOperAj, String descAj, String codCta, String infoCompl) {
        this.detValorAj = detValorAj;
        this.cstCofins = cstCofins;
        this.detBcCred = detBcCred;
        this.detAliq = detAliq;
        this.dtOperAj = dtOperAj;
        this.descAj = descAj;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegM515(){}
}
