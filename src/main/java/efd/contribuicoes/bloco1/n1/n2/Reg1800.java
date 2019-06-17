package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1809;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Reg1800 {

    @Getter @Inclui
    private final String reg = "1800";

    @Getter @Inclui
    private String incImob;

    @Getter @Inclui
    private BigDecimal recRecebRet;

    @Getter @Inclui
    private BigDecimal recFinRet;

    @Getter @Inclui
    private BigDecimal bcRet;

    @Getter @Inclui
    private BigDecimal aliqRet;

    @Getter @Inclui
    private BigDecimal vlRecUni;

    @Getter @Inclui
    private LocalDate dtRecUni;

    @Getter @Inclui
    private String codRec;

    @Getter @Setter @Filho
    private List<Reg1809> reg1809;

    public Reg1800(String incImob, BigDecimal recRecebRet, BigDecimal recFinRet, BigDecimal bcRet, BigDecimal aliqRet, BigDecimal vlRecUni, LocalDate dtRecUni, String codRec) {
        this.incImob = incImob;
        this.recRecebRet = recRecebRet;
        this.recFinRet = recFinRet;
        this.bcRet = bcRet;
        this.aliqRet = aliqRet;
        this.vlRecUni = vlRecUni;
        this.dtRecUni = dtRecUni;
        this.codRec = codRec;
    }

    public Reg1800(){ }
}
