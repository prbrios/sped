package efd.icmsipi.bloco1.n1.n2.n3;

import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg1360 {

    @Getter @Inclui
    private final String reg = "1360";

    @Getter @Setter @Inclui
    private String numLacre;

    @Getter @Setter @Inclui
    private LocalDate dtAplicacao;

    public Reg1360(String numLacre, LocalDate dtAplicacao) {
        this.numLacre = numLacre;
        this.dtAplicacao = dtAplicacao;
    }

    public Reg1360(){}
}