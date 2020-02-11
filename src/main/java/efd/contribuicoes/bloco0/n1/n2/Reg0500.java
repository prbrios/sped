package efd.contribuicoes.bloco0.n1.n2;

import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0500 {

    @Getter @Inclui
private final String reg = "0500";

    @Getter @Setter @Inclui
    private LocalDate dtAlt;

    @Getter @Setter @Inclui
    private String codNatCc;

    @Getter @Setter @Inclui
    private String indCta;

    @Getter @Setter @Inclui
    private Integer nivel;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String nomeCta;

    @Getter @Setter @Inclui
    private String codCtaRef;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
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
