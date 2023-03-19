package efd.icmsipi.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.Reg1921;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.Reg1925;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.Reg1926;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Reg1920 implements Serializable {
	private static final long serialVersionUID = 2354592453070680139L;

	@Inclui
    private final String reg = "1920";

    @Inclui
    private BigDecimal vltotTransfDebitosOa;

    @Inclui
    private BigDecimal vlTotAjDebitosOa;

    @Inclui
    private BigDecimal vlEstornosCredOa;

    @Inclui
    private BigDecimal vlTotTransfCreditosOa;

    @Inclui
    private BigDecimal vlTotAjCretidosOa;

    @Inclui
    private BigDecimal vlEstornosDebOa;

    @Inclui
    private BigDecimal vlSldCredorAntOa;

    @Inclui
    private BigDecimal vlSldApuradoOa;

    @Inclui
    private BigDecimal vlTotDed;

    @Inclui
    private BigDecimal vlIcmsRecolherOa;

    @Inclui
    private BigDecimal vlSldCredorTranspOa;

    @Inclui
    private BigDecimal debEspOa;

    @Filho
    private List<Reg1921> reg1921;

    @Filho
    private List<Reg1925> reg1925;

    @Filho
    private List<Reg1926> reg1926;

    public Reg1920(BigDecimal vltotTransfDebitosOa, BigDecimal vlTotAjDebitosOa, BigDecimal vlEstornosCredOa, BigDecimal vlTotTransfCreditosOa, BigDecimal vlTotAjCretidosOa, BigDecimal vlEstornosDebOa, BigDecimal vlSldCredorAntOa, BigDecimal vlSldApuradoOa, BigDecimal vlTotDed, BigDecimal vlIcmsRecolherOa, BigDecimal vlSldCredorTranspOa, BigDecimal debEspOa) {
        this.vltotTransfDebitosOa = vltotTransfDebitosOa;
        this.vlTotAjDebitosOa = vlTotAjDebitosOa;
        this.vlEstornosCredOa = vlEstornosCredOa;
        this.vlTotTransfCreditosOa = vlTotTransfCreditosOa;
        this.vlTotAjCretidosOa = vlTotAjCretidosOa;
        this.vlEstornosDebOa = vlEstornosDebOa;
        this.vlSldCredorAntOa = vlSldCredorAntOa;
        this.vlSldApuradoOa = vlSldApuradoOa;
        this.vlTotDed = vlTotDed;
        this.vlIcmsRecolherOa = vlIcmsRecolherOa;
        this.vlSldCredorTranspOa = vlSldCredorTranspOa;
        this.debEspOa = debEspOa;
    }

    public Reg1920(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVltotTransfDebitosOa() {
        return vltotTransfDebitosOa;
    }

    public void setVltotTransfDebitosOa(BigDecimal vltotTransfDebitosOa) {
        this.vltotTransfDebitosOa = vltotTransfDebitosOa;
    }

    public BigDecimal getVlTotAjDebitosOa() {
        return vlTotAjDebitosOa;
    }

    public void setVlTotAjDebitosOa(BigDecimal vlTotAjDebitosOa) {
        this.vlTotAjDebitosOa = vlTotAjDebitosOa;
    }

    public BigDecimal getVlEstornosCredOa() {
        return vlEstornosCredOa;
    }

    public void setVlEstornosCredOa(BigDecimal vlEstornosCredOa) {
        this.vlEstornosCredOa = vlEstornosCredOa;
    }

    public BigDecimal getVlTotTransfCreditosOa() {
        return vlTotTransfCreditosOa;
    }

    public void setVlTotTransfCreditosOa(BigDecimal vlTotTransfCreditosOa) {
        this.vlTotTransfCreditosOa = vlTotTransfCreditosOa;
    }

    public BigDecimal getVlTotAjCretidosOa() {
        return vlTotAjCretidosOa;
    }

    public void setVlTotAjCretidosOa(BigDecimal vlTotAjCretidosOa) {
        this.vlTotAjCretidosOa = vlTotAjCretidosOa;
    }

    public BigDecimal getVlEstornosDebOa() {
        return vlEstornosDebOa;
    }

    public void setVlEstornosDebOa(BigDecimal vlEstornosDebOa) {
        this.vlEstornosDebOa = vlEstornosDebOa;
    }

    public BigDecimal getVlSldCredorAntOa() {
        return vlSldCredorAntOa;
    }

    public void setVlSldCredorAntOa(BigDecimal vlSldCredorAntOa) {
        this.vlSldCredorAntOa = vlSldCredorAntOa;
    }

    public BigDecimal getVlSldApuradoOa() {
        return vlSldApuradoOa;
    }

    public void setVlSldApuradoOa(BigDecimal vlSldApuradoOa) {
        this.vlSldApuradoOa = vlSldApuradoOa;
    }

    public BigDecimal getVlTotDed() {
        return vlTotDed;
    }

    public void setVlTotDed(BigDecimal vlTotDed) {
        this.vlTotDed = vlTotDed;
    }

    public BigDecimal getVlIcmsRecolherOa() {
        return vlIcmsRecolherOa;
    }

    public void setVlIcmsRecolherOa(BigDecimal vlIcmsRecolherOa) {
        this.vlIcmsRecolherOa = vlIcmsRecolherOa;
    }

    public BigDecimal getVlSldCredorTranspOa() {
        return vlSldCredorTranspOa;
    }

    public void setVlSldCredorTranspOa(BigDecimal vlSldCredorTranspOa) {
        this.vlSldCredorTranspOa = vlSldCredorTranspOa;
    }

    public BigDecimal getDebEspOa() {
        return debEspOa;
    }

    public void setDebEspOa(BigDecimal debEspOa) {
        this.debEspOa = debEspOa;
    }

    public List<Reg1921> getReg1921() {
        return reg1921;
    }

    public void setReg1921(List<Reg1921> reg1921) {
        this.reg1921 = reg1921;
    }

    public List<Reg1925> getReg1925() {
        return reg1925;
    }

    public void setReg1925(List<Reg1925> reg1925) {
        this.reg1925 = reg1925;
    }

    public List<Reg1926> getReg1926() {
        return reg1926;
    }

    public void setReg1926(List<Reg1926> reg1926) {
        this.reg1926 = reg1926;
    }
    
}