package efd.contribuicoes.blocoM.n1.n2.n3.n4.n5;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegM625 {

    @Getter @Inclui
private final String reg = "M625";

    @Getter @Setter @Inclui
    private BigDecimal detValorAj;

    @Getter @Setter @Inclui
    private BigDecimal cstCofins;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal detBcCred;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal detAliq;

    @Getter @Setter @Inclui
    private BigDecimal dtOperAj;

    @Getter @Setter @Inclui
    private String descAj;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String infoCompl;

    public RegM625(BigDecimal detValorAj, BigDecimal cstCofins, BigDecimal detBcCred, BigDecimal detAliq, BigDecimal dtOperAj, String descAj, String codCta, String infoCompl) {
        this.detValorAj = detValorAj;
        this.cstCofins = cstCofins;
        this.detBcCred = detBcCred;
        this.detAliq = detAliq;
        this.dtOperAj = dtOperAj;
        this.descAj = descAj;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegM625(){}
}
