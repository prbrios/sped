package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1809;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Reg1800 implements Serializable {
	private static final long serialVersionUID = 218122543739445591L;

	@Getter @Inclui
	private final String reg = "1800";

    @Getter @Setter @Inclui
    private String incImob;

    @Getter @Setter @Inclui
    private BigDecimal recRecebRet;

    @Getter @Setter @Inclui
    private BigDecimal recFinRet;

    @Getter @Setter @Inclui
    private BigDecimal bcRet;

    @Getter @Setter @Inclui
    private BigDecimal aliqRet;

    @Getter @Setter @Inclui
    private BigDecimal vlRecUni;

    @Getter @Setter @Inclui
    private LocalDate dtRecUni;

    @Getter @Setter @Inclui
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
