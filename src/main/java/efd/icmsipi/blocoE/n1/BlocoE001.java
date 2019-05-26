package efd.icmsipi.blocoE.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.BlocoE100;
import efd.icmsipi.blocoE.n1.n2.BlocoE200;
import efd.icmsipi.blocoE.n1.n2.BlocoE300;
import efd.icmsipi.blocoE.n1.n2.BlocoE500;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BlocoE001 {

    @Inclui
    private final String reg = "E001";

    @Inclui
    private String indMov;

    @Filho
    private List<BlocoE100> blocoE100;

    @Filho
    private List<BlocoE200> blocoE200;

    @Filho
    private List<BlocoE300> blocoE300;

    @Filho
    private List<BlocoE500> blocoE500;

}