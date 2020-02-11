package efd.icmsipi.blocoK.n1;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.RegK100;
import lombok.Getter;
import lombok.Setter;


public class RegK001 {

    @Getter @Inclui
    private final String reg = "K001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegK100> regK100;

    public RegK001(String indMov) {
        this.indMov = indMov;
    }

    public RegK001(){}
}