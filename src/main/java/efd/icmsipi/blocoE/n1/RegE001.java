package efd.icmsipi.blocoE.n1;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.RegE100;
import efd.icmsipi.blocoE.n1.n2.RegE200;
import efd.icmsipi.blocoE.n1.n2.RegE300;
import efd.icmsipi.blocoE.n1.n2.RegE500;
import lombok.Getter;
import lombok.Setter;


public class RegE001 {

    @Getter @Inclui
    private final String reg = "E001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegE100> regE100;

    @Getter @Setter @Filho
    private List<RegE200> regE200;

    @Getter @Setter @Filho
    private List<RegE300> regE300;

    @Getter @Setter @Filho
    private List<RegE500> regE500;

    public RegE001(String indMov) {
        this.indMov = indMov;
    }

    public RegE001(){}
}