package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class Reg1960 implements Serializable {
	private static final long serialVersionUID = 6860203490842340992L;

	@Getter @Inclui
    private final String reg = "1960";

    @Getter @Setter @Inclui
    private Integer indAp;

    @Getter @Setter @Inclui
    private BigDecimal g101;

    @Getter @Setter @Inclui
    private BigDecimal g102;

    @Getter @Setter @Inclui
    private BigDecimal g103;

    @Getter @Setter @Inclui
    private BigDecimal g104;

    @Getter @Setter @Inclui
    private BigDecimal g105;

    @Getter @Setter @Inclui
    private BigDecimal g106;

    @Getter @Setter @Inclui
    private BigDecimal g107;

    @Getter @Setter @Inclui
    private BigDecimal g108;

    @Getter @Setter @Inclui
    private BigDecimal g109;

    @Getter @Setter @Inclui
    private BigDecimal g110;

    @Getter @Setter @Inclui
    private BigDecimal g111;

    public Reg1960(Integer indAp) {
        this.indAp = indAp;
    }

    public Reg1960(){}
}