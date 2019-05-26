package efd.icmsipi.blocoD.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.BlocoC176;
import efd.icmsipi.blocoD.n1.n2.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BlocoD001 {

    @Inclui
    private final String reg = "D001";

    @Inclui
    private String indMov;

    @Filho
    private List<BlocoD100> blocoD100;

    @Filho
    private List<BlocoD300> blocoD300;

    @Filho
    private List<BlocoD350> blocoD350;

    @Filho
    private List<BlocoD400> blocoD400;

    @Filho
    private List<BlocoD500> blocoD500;

    @Filho
    private List<BlocoD600> blocoD600;

    @Filho
    private List<BlocoD695> blocoD695;

}