package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.Grupo;
import efd.anotacoes.G1;
import efd.anotacoes.G2;
import efd.anotacoes.Inclui;
import lombok.Getter;

import java.math.BigDecimal;

public class RegM210 {

    private Grupo grupo;

    @Getter @Inclui @G1 @G2
    private final String reg = "M210";

    @Getter @Inclui @G1 @G2
    private String codCont;

    @Getter @Inclui @G1 @G2
    private BigDecimal vlRecBrt;

    @Getter @Inclui @G1 @G2
    private BigDecimal vlBcCont;

    @Getter @Inclui @G2
    private BigDecimal vlAjusAcresBcPis;

    @Getter @Inclui @G2
    private BigDecimal vlAjusReducBcPis;

    @Getter @Inclui @G2
    private BigDecimal vlBcContAjus;

    @Getter @Inclui(casasDecimais = 4) @G1 @G2
    private BigDecimal aliqPis;

    @Getter @Inclui(casasDecimais = 3) @G1 @G2
    private BigDecimal quantBcPis;

    @Getter @Inclui(casasDecimais = 4) @G1 @G2
    private BigDecimal aliqPisQuant;

    @Getter @Inclui @G1 @G2
    private BigDecimal vlContApur;

    @Getter @Inclui @G1 @G2
    private BigDecimal vlAjusAcres;

    @Getter @Inclui @G1 @G2
    private BigDecimal vlAjusReduc;

    @Getter @Inclui @G1 @G2
    private BigDecimal vlContDifer;

    @Getter @Inclui @G1 @G2
    private BigDecimal vlContDiferAnt;

    @Getter @Inclui @G1 @G2
    private BigDecimal vlContPer;


    public RegM210(String codCont, BigDecimal vlRecBrt, BigDecimal vlBcCont, BigDecimal aliqPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlContApur, BigDecimal vlAjusAcres, BigDecimal vlAjusReduc, BigDecimal vlContDifer, BigDecimal vlContDiferAnt, BigDecimal vlContPer) {
        this.grupo = Grupo.G1;
        this.codCont = codCont;
        this.vlRecBrt = vlRecBrt;
        this.vlBcCont = vlBcCont;
        this.aliqPis = aliqPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisQuant = aliqPisQuant;
        this.vlContApur = vlContApur;
        this.vlAjusAcres = vlAjusAcres;
        this.vlAjusReduc = vlAjusReduc;
        this.vlContDifer = vlContDifer;
        this.vlContDiferAnt = vlContDiferAnt;
        this.vlContPer = vlContPer;
    }

    public RegM210(String codCont, BigDecimal vlRecBrt, BigDecimal vlBcCont, BigDecimal vlAjusAcresBcPis, BigDecimal vlAjusReducBcPis, BigDecimal vlBcContAjus, BigDecimal aliqPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlContApur, BigDecimal vlAjusAcres, BigDecimal vlAjusReduc, BigDecimal vlContDifer, BigDecimal vlContDiferAnt, BigDecimal vlContPer) {
        this.grupo = Grupo.G2;
        this.codCont = codCont;
        this.vlRecBrt = vlRecBrt;
        this.vlBcCont = vlBcCont;
        this.vlAjusAcresBcPis = vlAjusAcresBcPis;
        this.vlAjusReducBcPis = vlAjusReducBcPis;
        this.vlBcContAjus = vlBcContAjus;
        this.aliqPis = aliqPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisQuant = aliqPisQuant;
        this.vlContApur = vlContApur;
        this.vlAjusAcres = vlAjusAcres;
        this.vlAjusReduc = vlAjusReduc;
        this.vlContDifer = vlContDifer;
        this.vlContDiferAnt = vlContDiferAnt;
        this.vlContPer = vlContPer;
    }

    public RegM210(){}
}
