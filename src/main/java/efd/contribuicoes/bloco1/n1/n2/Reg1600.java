package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1610;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1620;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Reg1600 implements Serializable {
	private static final long serialVersionUID = -7385597270183546153L;

	@Getter @Inclui
	private final String reg = "1600";

    @Getter @Setter @Inclui(formatoData = "MMyyyy")
    private LocalDate perApurAnt;

    @Getter @Setter @Inclui
    private String natContRec;

    @Getter @Setter @Inclui
    private BigDecimal vlContApur;

    @Getter @Setter @Inclui
    private BigDecimal vlCredCofinsDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlContDev;

    @Getter @Setter @Inclui
    private BigDecimal vlOutDed;

    @Getter @Setter @Inclui
    private BigDecimal vlContExt;

    @Getter @Setter @Inclui
    private BigDecimal vlMul;

    @Getter @Setter @Inclui
    private BigDecimal vlJur;

    @Getter @Setter @Inclui
    private LocalDate dtRecol;

    @Getter @Setter @Filho
    private List<Reg1610> reg1610;

    @Getter @Setter @Filho
    private List<Reg1620> reg1620;

    public Reg1600(LocalDate perApurAnt, String natContRec, BigDecimal vlContApur, BigDecimal vlCredCofinsDesc, BigDecimal vlContDev, BigDecimal vlOutDed, BigDecimal vlContExt, BigDecimal vlMul, BigDecimal vlJur, LocalDate dtRecol) {
        this.perApurAnt = perApurAnt;
        this.natContRec = natContRec;
        this.vlContApur = vlContApur;
        this.vlCredCofinsDesc = vlCredCofinsDesc;
        this.vlContDev = vlContDev;
        this.vlOutDed = vlOutDed;
        this.vlContExt = vlContExt;
        this.vlMul = vlMul;
        this.vlJur = vlJur;
        this.dtRecol = dtRecol;
    }

    public Reg1600(){ }
}
