package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1960 implements Serializable {
	private static final long serialVersionUID = 6860203490842340992L;

	@Inclui
    private final String reg = "1960";

    @Inclui
    private Integer indAp;

    @Inclui
    private BigDecimal g101;

    @Inclui
    private BigDecimal g102;

    @Inclui
    private BigDecimal g103;

    @Inclui
    private BigDecimal g104;

    @Inclui
    private BigDecimal g105;

    @Inclui
    private BigDecimal g106;

    @Inclui
    private BigDecimal g107;

    @Inclui
    private BigDecimal g108;

    @Inclui
    private BigDecimal g109;

    @Inclui
    private BigDecimal g110;

    @Inclui
    private BigDecimal g111;

    public Reg1960(Integer indAp) {
        this.indAp = indAp;
    }

    public Reg1960(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndAp() {
        return indAp;
    }

    public void setIndAp(Integer indAp) {
        this.indAp = indAp;
    }

    public BigDecimal getG101() {
        return g101;
    }

    public void setG101(BigDecimal g101) {
        this.g101 = g101;
    }

    public BigDecimal getG102() {
        return g102;
    }

    public void setG102(BigDecimal g102) {
        this.g102 = g102;
    }

    public BigDecimal getG103() {
        return g103;
    }

    public void setG103(BigDecimal g103) {
        this.g103 = g103;
    }

    public BigDecimal getG104() {
        return g104;
    }

    public void setG104(BigDecimal g104) {
        this.g104 = g104;
    }

    public BigDecimal getG105() {
        return g105;
    }

    public void setG105(BigDecimal g105) {
        this.g105 = g105;
    }

    public BigDecimal getG106() {
        return g106;
    }

    public void setG106(BigDecimal g106) {
        this.g106 = g106;
    }

    public BigDecimal getG107() {
        return g107;
    }

    public void setG107(BigDecimal g107) {
        this.g107 = g107;
    }

    public BigDecimal getG108() {
        return g108;
    }

    public void setG108(BigDecimal g108) {
        this.g108 = g108;
    }

    public BigDecimal getG109() {
        return g109;
    }

    public void setG109(BigDecimal g109) {
        this.g109 = g109;
    }

    public BigDecimal getG110() {
        return g110;
    }

    public void setG110(BigDecimal g110) {
        this.g110 = g110;
    }

    public BigDecimal getG111() {
        return g111;
    }

    public void setG111(BigDecimal g111) {
        this.g111 = g111;
    }
    
}