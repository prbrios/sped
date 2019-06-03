package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.Reg1320;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Reg1310 {

    @Inclui
    private final String reg = "1310";

    @Inclui
    private String numTanque;

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
    private List<Reg1320> reg1320;

    public Reg1310(String numTanque, BigDecimal estqAbert, BigDecimal volEntr, BigDecimal volDisp, BigDecimal volSaidas, BigDecimal estqEscr, BigDecimal valAjPerda, BigDecimal valAjGanho, BigDecimal fechFisico) {
        this.numTanque = numTanque;
        this.estqAbert = estqAbert;
        this.volEntr = volEntr;
        this.volDisp = volDisp;
        this.volSaidas = volSaidas;
        this.estqEscr = estqEscr;
        this.valAjPerda = valAjPerda;
        this.valAjGanho = valAjGanho;
        this.fechFisico = fechFisico;
    }

    public Reg1310(){}
}