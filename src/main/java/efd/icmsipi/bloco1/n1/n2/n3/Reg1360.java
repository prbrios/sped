package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reg1360 {

    @Inclui
    private final String reg = "1360";

    @Inclui
    private String numLacre;

    @Inclui
    private LocalDate dtAplicacao;

    public Reg1360(String numLacre, LocalDate dtAplicacao) {
        this.numLacre = numLacre;
        this.dtAplicacao = dtAplicacao;
    }

    public Reg1360(){}
}