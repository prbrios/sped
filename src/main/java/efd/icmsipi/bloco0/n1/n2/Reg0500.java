package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


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

    public Reg0500(LocalDate dtAlt, String codNatCc, String indCta, Integer nivel, String codCta, String nomeCta) {

        this.dtAlt = dtAlt;
        this.codNatCc = codNatCc;
        this.indCta = indCta;
        this.nivel = nivel;
        this.codCta = codCta;
        this.nomeCta = nomeCta;
    }

    public Reg0500(){}

}
