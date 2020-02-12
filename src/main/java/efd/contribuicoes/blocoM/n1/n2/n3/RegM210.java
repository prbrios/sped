package efd.contribuicoes.blocoM.n1.n2.n3;

import java.math.BigDecimal;
import java.util.List;

import efd.Grupo;
import efd.anotacoes.Filho;
import efd.anotacoes.G1;
import efd.anotacoes.G2;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.RegM211;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.RegM215;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.RegM220;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.RegM230;
import lombok.Getter;
import lombok.Setter;

public class RegM210 {

    private Grupo grupo;

    @Getter @Setter @Inclui @G1 @G2
    private final String reg = "M210";

    @Getter @Setter @Inclui @G1 @G2
    private String codCont;

    @Getter @Setter @Inclui @G1 @G2
    private BigDecimal vlRecBrt;

    @Getter @Setter @Inclui @G1 @G2
    private BigDecimal vlBcCont;

    @Getter @Setter @Inclui @G2
    private BigDecimal vlAjusAcresBcPis;

    @Getter @Setter @Inclui @G2
    private BigDecimal vlAjusReducBcPis;

    @Getter @Setter @Inclui @G2
    private BigDecimal vlBcContAjus;

    @Getter @Setter @Inclui(casasDecimais = 4) @G1 @G2
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui(casasDecimais = 3) @G1 @G2
    private BigDecimal quantBcPis;

    @Getter @Setter @Inclui(casasDecimais = 4) @G1 @G2
    private BigDecimal aliqPisQuant;

    @Getter @Setter @Inclui @G1 @G2
    private BigDecimal vlContApur;

    @Getter @Setter @Inclui @G1 @G2
    private BigDecimal vlAjusAcres;

    @Getter @Setter @Inclui @G1 @G2
    private BigDecimal vlAjusReduc;

    @Getter @Setter @Inclui @G1 @G2
    private BigDecimal vlContDifer;

    @Getter @Setter @Inclui @G1 @G2
    private BigDecimal vlContDiferAnt;

    @Getter @Setter @Inclui @G1 @G2
    private BigDecimal vlContPer;

    @Getter @Setter @Filho
    private RegM211 regM211;

    @Getter @Setter @Filho
    private List<RegM215> regM215;

    @Getter @Setter @Filho
    private List<RegM220> regM220;

    @Getter @Setter @Filho
    private List<RegM230> regM230;

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
