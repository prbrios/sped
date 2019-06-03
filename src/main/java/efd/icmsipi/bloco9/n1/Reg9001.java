package efd.icmsipi.bloco9.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco9.n1.n2.Reg9900;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Reg9001 {

    @Inclui
    private final String reg = "9001";

    @Inclui
    private Integer indMov;

    @Filho
    private List<Reg9900> reg9900;

    public Reg9001(Integer indMov) {
        this.indMov = indMov;
    }

    public Reg9001(){}
}