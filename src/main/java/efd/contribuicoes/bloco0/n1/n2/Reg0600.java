package efd.contribuicoes.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Reg0600 {

    @Getter @Inclui
private final String reg = "0600";

    @Getter @Setter @Inclui
    private LocalDate dtAlt;

    @Getter @Setter @Inclui
    private String codCcus;

    @Getter @Setter @Inclui
    private String ccus;

    public Reg0600(LocalDate dtAlt, String codCcus, String ccus) {
        this.dtAlt = dtAlt;
        this.codCcus = codCcus;
        this.ccus = ccus;
    }

    public Reg0600(){}
}
