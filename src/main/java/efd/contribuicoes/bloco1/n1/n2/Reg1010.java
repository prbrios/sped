package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reg1010 {

    @Inclui
    private final String reg = "1010";

    @Inclui
    private String numProc;

    @Inclui
    private String idSecJud;

    @Inclui
    private String idVara;

    @Inclui
    private String indNatAcao;

    @Inclui
    private String descDecJud;

    @Inclui
    private LocalDate dtSentJud;

}
