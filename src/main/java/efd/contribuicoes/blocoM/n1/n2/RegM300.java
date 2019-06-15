package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegM300 {

    @Getter @Inclui
    private final String reg = "M300";

    @Getter @Inclui
    private String codCont;

    @Getter @Inclui
    private BigDecimal vlContAputDifer;

    @Getter @Inclui
    private String natCredDesc;

    @Getter @Inclui
    private BigDecimal vlCredDescDifer;

    @Getter @Inclui
    private BigDecimal vlContDiferAnt;

    @Getter @Inclui(formatoData = "MMyyyy")
    private LocalDate perApur;

    @Getter @Inclui
    private LocalDate dtReceb;

    public RegM300(String codCont, BigDecimal vlContAputDifer, String natCredDesc, BigDecimal vlCredDescDifer, BigDecimal vlContDiferAnt, LocalDate perApur, LocalDate dtReceb) {
        this.codCont = codCont;
        this.vlContAputDifer = vlContAputDifer;
        this.natCredDesc = natCredDesc;
        this.vlCredDescDifer = vlCredDescDifer;
        this.vlContDiferAnt = vlContDiferAnt;
        this.perApur = perApur;
        this.dtReceb = dtReceb;
    }

    public RegM300(){}
}
