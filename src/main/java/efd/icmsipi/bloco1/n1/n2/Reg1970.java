package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1975;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Reg1970 implements Serializable {
	private static final long serialVersionUID = 8696230691716044621L;

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
    private List<Reg1975> reg1975;

    public Reg1970(String indAp) {
        this.indAp = indAp;
    }

    public Reg1970(){}

    public String getReg() {
        return reg;
    }

    public String getIndAp() {
        return indAp;
    }

    public void setIndAp(String indAp) {
        this.indAp = indAp;
    }

    public BigDecimal getG301() {
        return g301;
    }

    public void setG301(BigDecimal g301) {
        this.g301 = g301;
    }

    public BigDecimal getG302() {
        return g302;
    }

    public void setG302(BigDecimal g302) {
        this.g302 = g302;
    }

    public BigDecimal getG303() {
        return g303;
    }

    public void setG303(BigDecimal g303) {
        this.g303 = g303;
    }

    public BigDecimal getG304() {
        return g304;
    }

    public void setG304(BigDecimal g304) {
        this.g304 = g304;
    }

    public BigDecimal getG305() {
        return g305;
    }

    public void setG305(BigDecimal g305) {
        this.g305 = g305;
    }

    public BigDecimal getG306() {
        return g306;
    }

    public void setG306(BigDecimal g306) {
        this.g306 = g306;
    }

    public BigDecimal getG307() {
        return g307;
    }

    public void setG307(BigDecimal g307) {
        this.g307 = g307;
    }

    public BigDecimal getG3T() {
        return g3T;
    }

    public void setG3T(BigDecimal g3t) {
        g3T = g3t;
    }

    public BigDecimal getG308() {
        return g308;
    }

    public void setG308(BigDecimal g308) {
        this.g308 = g308;
    }

    public BigDecimal getG309() {
        return g309;
    }

    public void setG309(BigDecimal g309) {
        this.g309 = g309;
    }

    public List<Reg1975> getReg1975() {
        return reg1975;
    }

    public void setReg1975(List<Reg1975> reg1975) {
        this.reg1975 = reg1975;
    }
    
}