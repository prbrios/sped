package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Bloco1360;
import efd.icmsipi.bloco1.n1.n2.n3.Bloco1370;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    @Filho
    private List<Bloco1360> bloco1360;

    @Filho
    private List<Bloco1370> bloco1370;

}