package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.Reg1320;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


public class Reg1310 {

    @Getter @Inclui
    private final String reg = "1310";

    @Getter @Setter @Inclui
    private String numTanque;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal estqAbert;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal volEntr;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal volDisp;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal volSaidas;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal estqEscr;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal valAjPerda;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal valAjGanho;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal fechFisico;

    @Getter @Setter @Filho
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