package efd.icmsipi.blocoC.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BlocoC001 {

    @Inclui
    private final String reg = "C001";

    @Inclui
    private String indMov;

    @Filho
    private List<BlocoC100> blocoC100;

    @Filho
    private List<BlocoC300> blocoC300;

    @Filho
    private List<BlocoC350> blocoC350;

    @Filho
    private List<BlocoC400> blocoC400;

    @Filho
    private List<BlocoC495> blocoC495;

    @Filho
    private List<BlocoC500> blocoC500;

    @Filho
    private List<BlocoC600> blocoC600;

    @Filho
    private List<BlocoC700> blocoC700;

    @Filho
    private List<BlocoC800> blocoC800;

    @Filho
    private List<BlocoC860> blocoC860;


}
