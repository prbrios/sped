package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1400 implements Serializable {
	private static final long serialVersionUID = 3311337651021122227L;

	@Inclui
    private final String reg = "1400";

    @Inclui
    private String codItemImp;

    @Inclui(zerosEsquerda = 7)
    private Integer mun;

    @Inclui
    private BigDecimal valor;

    public Reg1400(String codItemImp, Integer mun, BigDecimal valor) {
        this.codItemImp = codItemImp;
        this.mun = mun;
        this.valor = valor;
    }

    public Reg1400(){}

    public String getReg() {
        return reg;
    }

    public String getCodItemImp() {
        return codItemImp;
    }

    public void setCodItemImp(String codItemImp) {
        this.codItemImp = codItemImp;
    }

    public Integer getMun() {
        return mun;
    }

    public void setMun(Integer mun) {
        this.mun = mun;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
}