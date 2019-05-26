package efd.icmsipi.bloco9;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
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

}