package efd.contribuicoes.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Reg0500 {

    @Getter @Inclui
    private final String reg = "0500";

    @Getter @Inclui
    private LocalDate dtAlt;

    @Getter @Inclui
    private String codNatCc;

    @Getter @Inclui
    private String indCta;

    @Getter @Inclui
    private Integer nivel;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String nomeCta;

    @Getter @Inclui
    private String codCtaRef;

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpjEst;

    public Reg0500(LocalDate dtAlt, String codNatCc, String indCta, Integer nivel, String codCta, String nomeCta, String codCtaRef, Long cnpjEst) {
        this.dtAlt = dtAlt;
        this.codNatCc = codNatCc;
        this.indCta = indCta;
        this.nivel = nivel;
        this.codCta = codCta;
        this.nomeCta = nomeCta;
        this.codCtaRef = codCtaRef;
        this.cnpjEst = cnpjEst;
    }

    public Reg0500(){}
}
