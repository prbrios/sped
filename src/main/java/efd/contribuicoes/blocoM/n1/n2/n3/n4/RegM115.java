package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegM115 {

    @Getter @Inclui
    private final String reg = "M115";

    @Getter @Inclui
    private BigDecimal detValorAj;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal detBcCred;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal detAliq;

    @Getter @Inclui
    private LocalDate dtOprAj;

    @Getter @Inclui
    private String descAj;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String infoCompl;

    public RegM115(BigDecimal detValorAj, Integer cstPis, BigDecimal detBcCred, BigDecimal detAliq, LocalDate dtOprAj, String descAj, String codCta, String infoCompl) {
        this.detValorAj = detValorAj;
        this.cstPis = cstPis;
        this.detBcCred = detBcCred;
        this.detAliq = detAliq;
        this.dtOprAj = dtOprAj;
        this.descAj = descAj;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegM115(){}
}
