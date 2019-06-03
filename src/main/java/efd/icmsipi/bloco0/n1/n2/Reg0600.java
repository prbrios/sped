package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reg0600 {

    @Inclui
    private final String reg = "0600";

    @Inclui
    private LocalDate dtAlt;

    @Inclui
    private String codCcus;

    @Inclui
    private String ccus;

    public Reg0600(LocalDate dtAlt, String codCcus, String ccus) {
        this.dtAlt = dtAlt;
        this.codCcus = codCcus;
        this.ccus = ccus;
    }

    public Reg0600(){}
}
