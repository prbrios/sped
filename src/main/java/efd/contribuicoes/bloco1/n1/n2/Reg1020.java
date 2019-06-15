package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reg1020 {

    @Inclui
    private final String reg = "1020";

    @Inclui
    private String numProc;

    @Inclui
    private String indNatAcao;

    @Inclui
    private LocalDate dtDecAdm;

}
