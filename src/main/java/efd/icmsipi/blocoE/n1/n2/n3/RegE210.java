package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE220;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE250;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegE210 implements Serializable {
	private static final long serialVersionUID = -4437770625280188980L;

	@Inclui
    private final String reg = "E210";

    @Inclui
    private String indMovSt;

    @Inclui
    private BigDecimal vlSldCredAntSt;

    @Inclui
    private BigDecimal vlDevolSt;

    @Inclui
    private BigDecimal vlRessascSt;

    @Inclui
    private BigDecimal vlOutCredSt;

    @Inclui
    private BigDecimal vlAjCreditosSt;

    @Inclui
    private BigDecimal vlRetencaoSt;

    @Inclui
    private BigDecimal vlOutDebSt;

    @Inclui
    private BigDecimal vlAjdebitosSt;

    @Inclui
    private BigDecimal vlSldDevAntSt;

    @Inclui
    private BigDecimal vlDeducoesSt;

    @Inclui
    private BigDecimal vlicmsRecolSt;

    @Inclui
    private BigDecimal vlSldCredStTransportar;

    @Inclui
    private BigDecimal debEspSt;

    @Filho
    private List<RegE220> regE220;

    @Filho
    private List<RegE250> regE250;

    public RegE210(String indMovSt, BigDecimal vlSldCredAntSt, BigDecimal vlDevolSt, BigDecimal vlRessascSt, BigDecimal vlOutCredSt, BigDecimal vlAjCreditosSt, BigDecimal vlRetencaoSt, BigDecimal vlOutDebSt, BigDecimal vlAjdebitosSt, BigDecimal vlSldDevAntSt, BigDecimal vlDeducoesSt, BigDecimal vlicmsRecolSt, BigDecimal vlSldCredStTransportar, BigDecimal debEspSt) {
        this.indMovSt = indMovSt;
        this.vlSldCredAntSt = vlSldCredAntSt;
        this.vlDevolSt = vlDevolSt;
        this.vlRessascSt = vlRessascSt;
        this.vlOutCredSt = vlOutCredSt;
        this.vlAjCreditosSt = vlAjCreditosSt;
        this.vlRetencaoSt = vlRetencaoSt;
        this.vlOutDebSt = vlOutDebSt;
        this.vlAjdebitosSt = vlAjdebitosSt;
        this.vlSldDevAntSt = vlSldDevAntSt;
        this.vlDeducoesSt = vlDeducoesSt;
        this.vlicmsRecolSt = vlicmsRecolSt;
        this.vlSldCredStTransportar = vlSldCredStTransportar;
        this.debEspSt = debEspSt;
    }

    public RegE210(){}

    public String getReg() {
        return reg;
    }

    public String getIndMovSt() {
        return indMovSt;
    }

    public void setIndMovSt(String indMovSt) {
        this.indMovSt = indMovSt;
    }

    public BigDecimal getVlSldCredAntSt() {
        return vlSldCredAntSt;
    }

    public void setVlSldCredAntSt(BigDecimal vlSldCredAntSt) {
        this.vlSldCredAntSt = vlSldCredAntSt;
    }

    public BigDecimal getVlDevolSt() {
        return vlDevolSt;
    }

    public void setVlDevolSt(BigDecimal vlDevolSt) {
        this.vlDevolSt = vlDevolSt;
    }

    public BigDecimal getVlRessascSt() {
        return vlRessascSt;
    }

    public void setVlRessascSt(BigDecimal vlRessascSt) {
        this.vlRessascSt = vlRessascSt;
    }

    public BigDecimal getVlOutCredSt() {
        return vlOutCredSt;
    }

    public void setVlOutCredSt(BigDecimal vlOutCredSt) {
        this.vlOutCredSt = vlOutCredSt;
    }

    public BigDecimal getVlAjCreditosSt() {
        return vlAjCreditosSt;
    }

    public void setVlAjCreditosSt(BigDecimal vlAjCreditosSt) {
        this.vlAjCreditosSt = vlAjCreditosSt;
    }

    public BigDecimal getVlRetencaoSt() {
        return vlRetencaoSt;
    }

    public void setVlRetencaoSt(BigDecimal vlRetencaoSt) {
        this.vlRetencaoSt = vlRetencaoSt;
    }

    public BigDecimal getVlOutDebSt() {
        return vlOutDebSt;
    }

    public void setVlOutDebSt(BigDecimal vlOutDebSt) {
        this.vlOutDebSt = vlOutDebSt;
    }

    public BigDecimal getVlAjdebitosSt() {
        return vlAjdebitosSt;
    }

    public void setVlAjdebitosSt(BigDecimal vlAjdebitosSt) {
        this.vlAjdebitosSt = vlAjdebitosSt;
    }

    public BigDecimal getVlSldDevAntSt() {
        return vlSldDevAntSt;
    }

    public void setVlSldDevAntSt(BigDecimal vlSldDevAntSt) {
        this.vlSldDevAntSt = vlSldDevAntSt;
    }

    public BigDecimal getVlDeducoesSt() {
        return vlDeducoesSt;
    }

    public void setVlDeducoesSt(BigDecimal vlDeducoesSt) {
        this.vlDeducoesSt = vlDeducoesSt;
    }

    public BigDecimal getVlicmsRecolSt() {
        return vlicmsRecolSt;
    }

    public void setVlicmsRecolSt(BigDecimal vlicmsRecolSt) {
        this.vlicmsRecolSt = vlicmsRecolSt;
    }

    public BigDecimal getVlSldCredStTransportar() {
        return vlSldCredStTransportar;
    }

    public void setVlSldCredStTransportar(BigDecimal vlSldCredStTransportar) {
        this.vlSldCredStTransportar = vlSldCredStTransportar;
    }

    public BigDecimal getDebEspSt() {
        return debEspSt;
    }

    public void setDebEspSt(BigDecimal debEspSt) {
        this.debEspSt = debEspSt;
    }

    public List<RegE220> getRegE220() {
        return regE220;
    }

    public void setRegE220(List<RegE220> regE220) {
        this.regE220 = regE220;
    }

    public List<RegE250> getRegE250() {
        return regE250;
    }

    public void setRegE250(List<RegE250> regE250) {
        this.regE250 = regE250;
    }
    
}