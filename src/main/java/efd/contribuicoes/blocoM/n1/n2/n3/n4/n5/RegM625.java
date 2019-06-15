package efd.contribuicoes.blocoM.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegM625 {

    @Getter @Inclui
    private final String reg = "M625";

    @Getter @Inclui
    private BigDecimal detValorAj;

    @Getter @Inclui
    private BigDecimal cstCofins;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal detBcCred;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal detAliq;

    @Getter @Inclui
    private BigDecimal dtOperAj;

    @Getter @Inclui
    private String descAj;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
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
