package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1360;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1370;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Reg1350 {

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
    private List<Reg1360> reg1360;

    @Filho
    private List<Reg1370> reg1370;

}