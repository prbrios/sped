package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1610;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1620;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Reg1600 {

    @Getter @Inclui
    private final String reg = "1600";

    @Getter @Inclui(formatoData = "MMyyyy")
    private LocalDate perApurAnt;

    @Getter @Inclui
    private String natContRec;

    @Getter @Inclui
    private BigDecimal vlContApur;

    @Getter @Inclui
    private BigDecimal vlCredCofinsDesc;

    @Getter @Inclui
    private BigDecimal vlContDev;

    @Getter @Inclui
    private BigDecimal vlOutDed;

    @Getter @Inclui
    private BigDecimal vlContExt;

    @Getter @Inclui
    private BigDecimal vlMul;

    @Getter @Inclui
    private BigDecimal vlJur;

    @Getter @Inclui
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
