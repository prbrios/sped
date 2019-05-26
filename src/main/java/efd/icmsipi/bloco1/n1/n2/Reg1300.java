package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1310;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Reg1300 {

    @Inclui
    private final String reg = "1300";

    @Inclui
    private String codItem;

    @Inclui
    private LocalDate dtFech;

    @Inclui(casasDecimais = 3)
    private BigDecimal estqAbert;

    @Inclui(casasDecimais = 3)
    private BigDecimal volEntr;

    @Inclui(casasDecimais = 3)
    private BigDecimal volDisp;

    @Inclui(casasDecimais = 3)
    private BigDecimal volSaidas;

    @Inclui(casasDecimais = 3)
    private BigDecimal estqEscr;

    @Inclui(casasDecimais = 3)
    private BigDecimal valAjPerda;

    @Inclui(casasDecimais = 3)
    private BigDecimal valAjGanho;

    @Inclui(casasDecimais = 3)
    private BigDecimal fechFisico;

    @Filho
    private List<Reg1310> reg1310;

}