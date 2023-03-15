package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class RegE115 implements Serializable {
	private static final long serialVersionUID = 8964512841395206021L;

	@Getter @Inclui
    private final String reg = "E115";

    @Getter @Setter @Inclui
    private String codInfAdic;

    @Getter @Setter @Inclui
    private BigDecimal vlInfAdic;

    @Getter @Setter @Inclui
    private String descrComplAj;

    public RegE115(String codInfAdic, BigDecimal vlInfAdic, String descrComplAj) {
        this.codInfAdic = codInfAdic;
        this.vlInfAdic = vlInfAdic;
        this.descrComplAj = descrComplAj;
    }

    public RegE115(){}
}