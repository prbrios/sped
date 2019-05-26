package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bloco1350 {

    @Inclui
    private final String reg = "1350";

    @Inclui
    private String serie;

    @Inclui
    private String fabricante;

    @Inclui
    private String modelo;

    @Inclui
    private String tipoMedicao;

}