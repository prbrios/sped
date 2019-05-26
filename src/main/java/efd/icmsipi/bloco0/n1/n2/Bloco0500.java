package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Bloco0500 {

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

}
