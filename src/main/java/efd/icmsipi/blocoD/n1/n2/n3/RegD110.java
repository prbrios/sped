package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD120;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class RegD110 implements Serializable {
	private static final long serialVersionUID = 2362120510801769259L;

	@Getter @Inclui
    private final String reg = "D110";

    @Getter @Setter @Inclui
    private Integer numItem;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui
    private BigDecimal vlServ;

    @Getter @Setter @Inclui
    private BigDecimal vlOut;

    @Getter @Setter @Filho
    private List<RegD120> regD120;

    public RegD110(Integer numItem, String codItem, BigDecimal vlServ, BigDecimal vlOut) {
        this.numItem = numItem;
        this.codItem = codItem;
        this.vlServ = vlServ;
        this.vlOut = vlOut;
    }

    public RegD110(){}
}