package efd.icmsipi.blocoE.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegE230 {

    @Inclui
    private final String reg = "E230";

    @Inclui
    private String numDa;

    @Inclui
    private String numProc;

    @Inclui
    private Integer indProc;

    @Inclui
    private String proc;

    @Inclui
    private String txtCompl;

}