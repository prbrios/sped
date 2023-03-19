package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.Reg1320;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Reg1310 implements Serializable {
	private static final long serialVersionUID = 5355356253627190791L;

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

    public String getReg() {
        return reg;
    }

    public String getNumTanque() {
        return numTanque;
    }

    public void setNumTanque(String numTanque) {
        this.numTanque = numTanque;
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

    public List<Reg1320> getReg1320() {
        return reg1320;
    }

    public void setReg1320(List<Reg1320> reg1320) {
        this.reg1320 = reg1320;
    }
    
}