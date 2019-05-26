package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.BlocoD197;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BlocoD195 {

    @Inclui
    private final String reg = "D195";

    @Inclui
    private String codObs;

    @Inclui
    private String txtCompl;

    @Filho
    private List<BlocoD197> blocoD197;

}