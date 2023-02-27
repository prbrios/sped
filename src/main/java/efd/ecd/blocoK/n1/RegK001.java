package efd.ecd.blocoK.n1;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.RegK030;
import efd.ecd.blocoK.n1.n2.RegK200;
import lombok.Getter;
import lombok.Setter;

public class RegK001 {
    
    @Getter @Inclui
    private final String reg = "K001";

    @Getter @Setter @Inclui
    private Integer indDad;

    @Getter @Setter @Filho
    private RegK030 regK030;

    @Getter @Setter @Filho
    private List<RegK200> regK200;

    public RegK001() {}

    public RegK001(Integer indDad) {
        this.indDad = indDad;
    }
}
