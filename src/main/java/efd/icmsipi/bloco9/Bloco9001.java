package efd.icmsipi.bloco9;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Bloco9001 {

    @Inclui
    private final String reg = "9001";

    @Inclui
    private Integer indMov;

    @Filho
    private List<Bloco9900> bloco9900;

}