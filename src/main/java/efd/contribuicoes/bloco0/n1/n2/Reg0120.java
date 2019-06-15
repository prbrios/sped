package efd.contribuicoes.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reg0120 {

    @Inclui
    private final String reg = "0120";

    @Inclui(formatoData = "MMyyyy")
    private LocalDate mesRefer;

    @Inclui
    private String infComp;

    public Reg0120(LocalDate mesRefer, String infComp) {
        this.mesRefer = mesRefer;
        this.infComp = infComp;
    }

    public Reg0120(){}
}