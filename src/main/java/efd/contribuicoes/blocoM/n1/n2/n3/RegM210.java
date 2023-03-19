package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.Grupo;
import efd.anotacoes.Filho;
import efd.anotacoes.G1;
import efd.anotacoes.G2;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.RegM211;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.RegM215;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.RegM220;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.RegM230;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegM210 implements Serializable {
	private static final long serialVersionUID = -5896964615458163110L;

	@SuppressWarnings("unused")
	private Grupo grupo;

    @Inclui @G1 @G2
    private final String reg = "M210";

    @Inclui @G1 @G2
    private String codCont;

    @Inclui @G1 @G2
    private BigDecimal vlRecBrt;

    @Inclui @G1 @G2
    private BigDecimal vlBcCont;

    @Inclui @G2
    private BigDecimal vlAjusAcresBcPis;

    @Inclui @G2
    private BigDecimal vlAjusReducBcPis;

    @Inclui @G2
    private BigDecimal vlBcContAjus;

    @Inclui(casasDecimais = 4) @G1 @G2
    private BigDecimal aliqPis;

    @Inclui(casasDecimais = 3) @G1 @G2
    private BigDecimal quantBcPis;

    @Inclui(casasDecimais = 4) @G1 @G2
    private BigDecimal aliqPisQuant;

    @Inclui @G1 @G2
    private BigDecimal vlContApur;

    @Inclui @G1 @G2
    private BigDecimal vlAjusAcres;

    @Inclui @G1 @G2
    private BigDecimal vlAjusReduc;

    @Inclui @G1 @G2
    private BigDecimal vlContDifer;

    @Inclui @G1 @G2
    private BigDecimal vlContDiferAnt;

    @Inclui @G1 @G2
    private BigDecimal vlContPer;

    @Filho
    private RegM211 regM211;

    @Filho
    private List<RegM215> regM215;

    @Filho
    private List<RegM220> regM220;

    @Filho
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

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public String getReg() {
        return reg;
    }

    public String getCodCont() {
        return codCont;
    }

    public void setCodCont(String codCont) {
        this.codCont = codCont;
    }

    public BigDecimal getVlRecBrt() {
        return vlRecBrt;
    }

    public void setVlRecBrt(BigDecimal vlRecBrt) {
        this.vlRecBrt = vlRecBrt;
    }

    public BigDecimal getVlBcCont() {
        return vlBcCont;
    }

    public void setVlBcCont(BigDecimal vlBcCont) {
        this.vlBcCont = vlBcCont;
    }

    public BigDecimal getVlAjusAcresBcPis() {
        return vlAjusAcresBcPis;
    }

    public void setVlAjusAcresBcPis(BigDecimal vlAjusAcresBcPis) {
        this.vlAjusAcresBcPis = vlAjusAcresBcPis;
    }

    public BigDecimal getVlAjusReducBcPis() {
        return vlAjusReducBcPis;
    }

    public void setVlAjusReducBcPis(BigDecimal vlAjusReducBcPis) {
        this.vlAjusReducBcPis = vlAjusReducBcPis;
    }

    public BigDecimal getVlBcContAjus() {
        return vlBcContAjus;
    }

    public void setVlBcContAjus(BigDecimal vlBcContAjus) {
        this.vlBcContAjus = vlBcContAjus;
    }

    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }

    public BigDecimal getQuantBcPis() {
        return quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }

    public BigDecimal getAliqPisQuant() {
        return aliqPisQuant;
    }

    public void setAliqPisQuant(BigDecimal aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
    }

    public BigDecimal getVlContApur() {
        return vlContApur;
    }

    public void setVlContApur(BigDecimal vlContApur) {
        this.vlContApur = vlContApur;
    }

    public BigDecimal getVlAjusAcres() {
        return vlAjusAcres;
    }

    public void setVlAjusAcres(BigDecimal vlAjusAcres) {
        this.vlAjusAcres = vlAjusAcres;
    }

    public BigDecimal getVlAjusReduc() {
        return vlAjusReduc;
    }

    public void setVlAjusReduc(BigDecimal vlAjusReduc) {
        this.vlAjusReduc = vlAjusReduc;
    }

    public BigDecimal getVlContDifer() {
        return vlContDifer;
    }

    public void setVlContDifer(BigDecimal vlContDifer) {
        this.vlContDifer = vlContDifer;
    }

    public BigDecimal getVlContDiferAnt() {
        return vlContDiferAnt;
    }

    public void setVlContDiferAnt(BigDecimal vlContDiferAnt) {
        this.vlContDiferAnt = vlContDiferAnt;
    }

    public BigDecimal getVlContPer() {
        return vlContPer;
    }

    public void setVlContPer(BigDecimal vlContPer) {
        this.vlContPer = vlContPer;
    }

    public RegM211 getRegM211() {
        return regM211;
    }

    public void setRegM211(RegM211 regM211) {
        this.regM211 = regM211;
    }

    public List<RegM215> getRegM215() {
        return regM215;
    }

    public void setRegM215(List<RegM215> regM215) {
        this.regM215 = regM215;
    }

    public List<RegM220> getRegM220() {
        return regM220;
    }

    public void setRegM220(List<RegM220> regM220) {
        this.regM220 = regM220;
    }

    public List<RegM230> getRegM230() {
        return regM230;
    }

    public void setRegM230(List<RegM230> regM230) {
        this.regM230 = regM230;
    }
    
}
