package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reg0500 {

    @Inclui
    private final String reg = "0500";

    @Inclui
    private LocalDate dtAlt;

    @Inclui
    private String codNatCc;

    @Inclui
    private String indCta;

    @Inclui
    private Integer nivel;

    @Inclui
    private String codCta;

    @Inclui
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
