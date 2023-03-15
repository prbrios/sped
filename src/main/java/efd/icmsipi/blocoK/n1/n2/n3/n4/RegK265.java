package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class RegK265 implements Serializable {
	private static final long serialVersionUID = 6029454640830596652L;

	@Getter @Inclui
    private final String reg = "K265";

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtdCons;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtdRet;

    public RegK265(String codItem, BigDecimal qtdCons, BigDecimal qtdRet) {
        this.codItem = codItem;
        this.qtdCons = qtdCons;
        this.qtdRet = qtdRet;
    }

    public RegK265(){}
}