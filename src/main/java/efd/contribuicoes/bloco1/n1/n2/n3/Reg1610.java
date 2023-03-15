package efd.contribuicoes.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1610 implements Serializable {
	private static final long serialVersionUID = 6325272729529477939L;

	@Getter @Inclui
	private final String reg = "1610";

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private LocalDate dtOper;

    @Getter @Setter @Inclui
    private BigDecimal vlOper;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal vlBcCofins;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String descCompl;

    public Reg1610(Long cnpj, Integer cstCofins, String codPart, LocalDate dtOper, BigDecimal vlOper, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codCta, String descCompl) {
        this.cnpj = cnpj;
        this.cstCofins = cstCofins;
        this.codPart = codPart;
        this.dtOper = dtOper;
        this.vlOper = vlOper;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public Reg1610(){ }
}
