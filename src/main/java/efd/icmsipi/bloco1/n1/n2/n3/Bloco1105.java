package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.Bloco1110;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Bloco1105 {

    @Inclui
    private final String reg = "1105";

    @Inclui
    private String codMod;

    @Inclui
    private String serie;

    @Inclui
    private Integer numDoc;

    @Inclui
    private String chvNfe;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private String codItem;

    @Filho
    private List<Bloco1110> bloco1110;

}