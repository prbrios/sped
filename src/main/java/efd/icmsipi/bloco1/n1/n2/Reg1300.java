package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1310;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Reg1300 implements Serializable {
	private static final long serialVersionUID = -5232601356449271722L;

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

    public String getReg() {
        return reg;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public LocalDate getDtFech() {
        return dtFech;
    }

    public void setDtFech(LocalDate dtFech) {
        this.dtFech = dtFech;
    }

    public BigDecimal getEstqAbert() {
        return estqAbert;
    }

    public void setEstqAbert(BigDecimal estqAbert) {
        this.estqAbert = estqAbert;
    }

    public BigDecimal getVolEntr() {
        return volEntr;
    }

    public void setVolEntr(BigDecimal volEntr) {
        this.volEntr = volEntr;
    }

    public BigDecimal getVolDisp() {
        return volDisp;
    }

    public void setVolDisp(BigDecimal volDisp) {
        this.volDisp = volDisp;
    }

    public BigDecimal getVolSaidas() {
        return volSaidas;
    }

    public void setVolSaidas(BigDecimal volSaidas) {
        this.volSaidas = volSaidas;
    }

    public BigDecimal getEstqEscr() {
        return estqEscr;
    }

    public void setEstqEscr(BigDecimal estqEscr) {
        this.estqEscr = estqEscr;
    }

    public BigDecimal getValAjPerda() {
        return valAjPerda;
    }

    public void setValAjPerda(BigDecimal valAjPerda) {
        this.valAjPerda = valAjPerda;
    }

    public BigDecimal getValAjGanho() {
        return valAjGanho;
    }

    public void setValAjGanho(BigDecimal valAjGanho) {
        this.valAjGanho = valAjGanho;
    }

    public BigDecimal getFechFisico() {
        return fechFisico;
    }

    public void setFechFisico(BigDecimal fechFisico) {
        this.fechFisico = fechFisico;
    }

    public List<Reg1310> getReg1310() {
        return reg1310;
    }

    public void setReg1310(List<Reg1310> reg1310) {
        this.reg1310 = reg1310;
    }
    
}