package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1980 implements Serializable {
	private static final long serialVersionUID = -6154386743804224196L;

	@Inclui
    private final String reg = "1980";

    @Inclui
    private Integer indAp;

    @Inclui
    private BigDecimal g401;

    @Inclui
    private BigDecimal g402;

    @Inclui
    private BigDecimal g403;

    @Inclui
    private BigDecimal g404;

    @Inclui
    private BigDecimal g405;

    @Inclui
    private BigDecimal g406;

    @Inclui
    private BigDecimal g407;

    @Inclui
    private BigDecimal g408;

    @Inclui
    private BigDecimal g409;

    @Inclui
    private BigDecimal g410;

    @Inclui
    private BigDecimal g411;

    @Inclui
    private BigDecimal g412;

    public Reg1980(Integer indAp) {
        this.indAp = indAp;
    }

    public Reg1980(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndAp() {
        return indAp;
    }

    public void setIndAp(Integer indAp) {
        this.indAp = indAp;
    }

    public BigDecimal getG401() {
        return g401;
    }

    public void setG401(BigDecimal g401) {
        this.g401 = g401;
    }

    public BigDecimal getG402() {
        return g402;
    }

    public void setG402(BigDecimal g402) {
        this.g402 = g402;
    }

    public BigDecimal getG403() {
        return g403;
    }

    public void setG403(BigDecimal g403) {
        this.g403 = g403;
    }

    public BigDecimal getG404() {
        return g404;
    }

    public void setG404(BigDecimal g404) {
        this.g404 = g404;
    }

    public BigDecimal getG405() {
        return g405;
    }

    public void setG405(BigDecimal g405) {
        this.g405 = g405;
    }

    public BigDecimal getG406() {
        return g406;
    }

    public void setG406(BigDecimal g406) {
        this.g406 = g406;
    }

    public BigDecimal getG407() {
        return g407;
    }

    public void setG407(BigDecimal g407) {
        this.g407 = g407;
    }

    public BigDecimal getG408() {
        return g408;
    }

    public void setG408(BigDecimal g408) {
        this.g408 = g408;
    }

    public BigDecimal getG409() {
        return g409;
    }

    public void setG409(BigDecimal g409) {
        this.g409 = g409;
    }

    public BigDecimal getG410() {
        return g410;
    }

    public void setG410(BigDecimal g410) {
        this.g410 = g410;
    }

    public BigDecimal getG411() {
        return g411;
    }

    public void setG411(BigDecimal g411) {
        this.g411 = g411;
    }

    public BigDecimal getG412() {
        return g412;
    }

    public void setG412(BigDecimal g412) {
        this.g412 = g412;
    }
    

}