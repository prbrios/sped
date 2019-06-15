package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegM515 {

    @Getter @Inclui
    private final String reg = "M515";

    @Getter @Inclui
    private BigDecimal detValorAj;

    @Getter @Inclui
    private Integer cstCofins;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal detBcCred;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal detAliq;

    @Getter @Inclui
    private LocalDate dtOperAj;

    @Getter @Inclui
    private String descAj;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
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
