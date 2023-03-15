package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class Reg1980 implements Serializable {
	private static final long serialVersionUID = -6154386743804224196L;

	@Getter @Inclui
    private final String reg = "1980";

    @Getter @Setter @Inclui
    private Integer indAp;

    @Getter @Setter @Inclui
    private BigDecimal g401;

    @Getter @Setter @Inclui
    private BigDecimal g402;

    @Getter @Setter @Inclui
    private BigDecimal g403;

    @Getter @Setter @Inclui
    private BigDecimal g404;

    @Getter @Setter @Inclui
    private BigDecimal g405;

    @Getter @Setter @Inclui
    private BigDecimal g406;

    @Getter @Setter @Inclui
    private BigDecimal g407;

    @Getter @Setter @Inclui
    private BigDecimal g408;

    @Getter @Setter @Inclui
    private BigDecimal g409;

    @Getter @Setter @Inclui
    private BigDecimal g410;

    @Getter @Setter @Inclui
    private BigDecimal g411;

    @Getter @Setter @Inclui
    private BigDecimal g412;

    public Reg1980(Integer indAp) {
        this.indAp = indAp;
    }

    public Reg1980(){}

}