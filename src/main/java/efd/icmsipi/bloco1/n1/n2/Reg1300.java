package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1310;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class Reg1300 implements Serializable {
	private static final long serialVersionUID = -5232601356449271722L;

	@Getter @Inclui
    private final String reg = "1300";

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui
    private LocalDate dtFech;

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
    private List<Reg1310> reg1310;

    public Reg1300(String codItem, LocalDate dtFech, BigDecimal estqAbert, BigDecimal volEntr, BigDecimal volDisp, BigDecimal volSaidas, BigDecimal estqEscr, BigDecimal valAjPerda, BigDecimal valAjGanho, BigDecimal fechFisico) {
        this.codItem = codItem;
        this.dtFech = dtFech;
        this.estqAbert = estqAbert;
        this.volEntr = volEntr;
        this.volDisp = volDisp;
        this.volSaidas = volSaidas;
        this.estqEscr = estqEscr;
        this.valAjPerda = valAjPerda;
        this.valAjGanho = valAjGanho;
        this.fechFisico = fechFisico;
    }

    public Reg1300(){}
}