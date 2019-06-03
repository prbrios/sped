package efd.icmsipi.blocoK.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.RegK100;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegK001 {

    @Inclui
    private final String reg = "K001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegK100> regK100;

    public RegK001(String indMov) {
        this.indMov = indMov;
    }

    public RegK001(){}
}