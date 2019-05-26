package efd.icmsipi.blocoE.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.RegE100;
import efd.icmsipi.blocoE.n1.n2.RegE200;
import efd.icmsipi.blocoE.n1.n2.RegE300;
import efd.icmsipi.blocoE.n1.n2.RegE500;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegE001 {

    @Inclui
    private final String reg = "E001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegE100> regE100;

    @Filho
    private List<RegE200> regE200;

    @Filho
    private List<RegE300> regE300;

    @Filho
    private List<RegE500> regE500;

}