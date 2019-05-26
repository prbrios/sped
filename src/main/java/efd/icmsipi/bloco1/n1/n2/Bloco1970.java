package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Bloco1975;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Bloco1970 {

    @Inclui
    private final String reg = "1970";

    @Inclui
    private String indAp;

    @Inclui
    private BigDecimal g301;

    @Inclui
    private BigDecimal g302;

    @Inclui
    private BigDecimal g303;

    @Inclui
    private BigDecimal g304;

    @Inclui
    private BigDecimal g305;

    @Inclui
    private BigDecimal g306;

    @Inclui
    private BigDecimal g307;

    @Inclui
    private BigDecimal g3T;

    @Inclui
    private BigDecimal g308;

    @Inclui
    private BigDecimal g309;

    @Filho
    private List<Bloco1975> bloco1975;

}