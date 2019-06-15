package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegM700 {

    @Getter @Inclui
    private final String reg = "M700";

    @Getter @Inclui
    private String codCont;

    @Getter @Inclui
    private BigDecimal vlContApurDifer;

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

    public RegM700(String codCont, BigDecimal vlContApurDifer, String natCredDesc, BigDecimal vlCredDescDifer, BigDecimal vlContDiferAnt, LocalDate perApur, LocalDate dtReceb) {
        this.codCont = codCont;
        this.vlContApurDifer = vlContApurDifer;
        this.natCredDesc = natCredDesc;
        this.vlCredDescDifer = vlCredDescDifer;
        this.vlContDiferAnt = vlContDiferAnt;
        this.perApur = perApur;
        this.dtReceb = dtReceb;
    }

    public RegM700(){}
}
