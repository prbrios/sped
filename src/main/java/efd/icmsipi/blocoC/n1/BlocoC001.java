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
    private List<BlocoC100> blocoC100 = new ArrayList<BlocoC100>();

    @Filho
    private List<BlocoC300> blocoC300 = new ArrayList<BlocoC300>();

    @Filho
    private List<BlocoC350> blocoC350 = new ArrayList<BlocoC350>();

    @Filho
    private List<BlocoC400> blocoC400 = new ArrayList<BlocoC400>();

    @Filho
    private List<BlocoC495> blocoC495 = new ArrayList<BlocoC495>();

    @Filho
    private List<BlocoC500> blocoC500 = new ArrayList<BlocoC500>();

    @Filho
    private List<BlocoC600> blocoC600 = new ArrayList<BlocoC600>();

    @Filho
    private List<BlocoC700> blocoC700 = new ArrayList<BlocoC700>();

    @Filho
    private List<BlocoC800> blocoC800 = new ArrayList<BlocoC800>();

    @Filho
    private List<BlocoC860> blocoC860 = new ArrayList<BlocoC860>();


}
