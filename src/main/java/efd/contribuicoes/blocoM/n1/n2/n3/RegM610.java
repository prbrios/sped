package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.Grupo;
import efd.anotacoes.Filho;
import efd.anotacoes.G1;
import efd.anotacoes.G2;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.RegM611;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.RegM615;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.RegM620;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.RegM630;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegM610 implements Serializable {
	private static final long serialVersionUID = -2063417808920071942L;

	@SuppressWarnings("unused")
	private Grupo grupo;

    @Inclui @G1 @G2
    private final String reg = "M610";

    @Inclui @G1 @G2
    private String codCont;

    @Inclui @G1 @G2
    private BigDecimal vlRecBrt;

    @Inclui @G1 @G2
    private BigDecimal vlBcCont;

    @Inclui @G2
    private BigDecimal vlAjusAcresBcCofins;

    @Inclui @G2
    private BigDecimal vlAjusReducBcCofins;

    @Inclui @G2
    private BigDecimal vlBcContAjus;

    @Inclui(casasDecimais = 4) @G1 @G2
    private BigDecimal aliqCofins;

    @Inclui(casasDecimais = 3) @G1 @G2
    private BigDecimal quantBcCofins;

    @Inclui(casasDecimais = 4) @G1 @G2
    private BigDecimal aliqCofinsQuant;

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
    private RegM611 regM611;

    @Filho
    private List<RegM615> regM615;

    @Filho
    private List<RegM620> regM620;

    @Filho
    private List<RegM630> regM630;

    /**
     * Leiaute do Registro M610 aplicável aos Fatos Geradores ocorridos até 31 de dezembro de 2018
     * @param codCont Código da contribuição social apurada no período, conforme a Tabela 4.3.5.
     * @param vlRecBrt Valor da Receita Bruta
     * @param vlBcCont Valor da Base de Cálculo da Contribuição, antes de ajustes
     * @param aliqCofins Alíquota da Cofins (em percentual)
     * @param quantBcCofins Quantidade - Base de calculo Cofins
     * @param aliqCofinsQuant Alíquota da Cofins (em reais)
     * @param vlContApur Valor total da contribuição social apurada
     * @param vlAjusAcres Valor total dos ajustes de acréscimo da contribuição social apurada
     * @param vlAjusReduc Valor total dos ajustes de redução da contribuição social apurada
     * @param vlContDifer Valor da contribuição a diferir no período
     * @param vlContDiferAnt Valor da contribuição diferida em períodos anteriores
     * @param vlContPer Valor Total da Contribuição do Período (11 + 12 – 13 – 14+15)
     */
    public RegM610(String codCont, BigDecimal vlRecBrt, BigDecimal vlBcCont, BigDecimal aliqCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsQuant, BigDecimal vlContApur, BigDecimal vlAjusAcres, BigDecimal vlAjusReduc, BigDecimal vlContDifer, BigDecimal vlContDiferAnt, BigDecimal vlContPer) {

        this.grupo = Grupo.G1;

        this.codCont = codCont;
        this.vlRecBrt = vlRecBrt;
        this.vlBcCont = vlBcCont;
        this.aliqCofins = aliqCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsQuant = aliqCofinsQuant;
        this.vlContApur = vlContApur;
        this.vlAjusAcres = vlAjusAcres;
        this.vlAjusReduc = vlAjusReduc;
        this.vlContDifer = vlContDifer;
        this.vlContDiferAnt = vlContDiferAnt;
        this.vlContPer = vlContPer;
    }

    /**
     * Leiaute do Registro M610 aplicável aos Fatos Geradores ocorridos a partir de 01 de janeiro de 2019
     *
     * @param codCont Código da contribuição social apurada no período, conforme a Tabela 4.3.5.
     * @param vlRecBrt Valor da Receita Bruta
     * @param vlBcCont Valor da Base de Cálculo da Contribuição, antes de ajustes
     * @param vlAjusAcresBcCofins Valor do total dos ajustes de acréscimo da base de cálculo da contribuição a que se refere o Campo 04
     * @param vlAjusReducBcCofins Valor do total dos ajustes de redução da base de cálculo da contribuição a que se refere o Campo 04
     * @param vlBcContAjus Valor da Base de Cálculo da Contribuição, após os ajustes. (Campo 07 = Campo 04 + Campo 05 - Campo 06)
     * @param aliqCofins Alíquota da Cofins (em percentual)
     * @param quantBcCofins Quantidade - Base de calculo Cofins
     * @param aliqCofinsQuant Alíquota da Cofins (em reais)
     * @param vlContApur Valor total da contribuição social apurada
     * @param vlAjusAcres Valor total dos ajustes de acréscimo da contribuição social apurada
     * @param vlAjusReduc Valor total dos ajustes de redução da contribuição social apurada
     * @param vlContDifer Valor da contribuição a diferir no período
     * @param vlContDiferAnt Valor da contribuição diferida em períodos anteriores
     * @param vlContPer Valor Total da Contribuição do Período (11 + 12 – 13 – 14+15)
     */
    public RegM610(String codCont, BigDecimal vlRecBrt, BigDecimal vlBcCont, BigDecimal vlAjusAcresBcCofins, BigDecimal vlAjusReducBcCofins, BigDecimal vlBcContAjus, BigDecimal aliqCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsQuant, BigDecimal vlContApur, BigDecimal vlAjusAcres, BigDecimal vlAjusReduc, BigDecimal vlContDifer, BigDecimal vlContDiferAnt, BigDecimal vlContPer) {

        this.grupo = Grupo.G2;

        this.codCont = codCont;
        this.vlRecBrt = vlRecBrt;
        this.vlBcCont = vlBcCont;
        this.vlAjusAcresBcCofins = vlAjusAcresBcCofins;
        this.vlAjusReducBcCofins = vlAjusReducBcCofins;
        this.vlBcContAjus = vlBcContAjus;
        this.aliqCofins = aliqCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsQuant = aliqCofinsQuant;
        this.vlContApur = vlContApur;
        this.vlAjusAcres = vlAjusAcres;
        this.vlAjusReduc = vlAjusReduc;
        this.vlContDifer = vlContDifer;
        this.vlContDiferAnt = vlContDiferAnt;
        this.vlContPer = vlContPer;
    }

    public RegM610(){ }

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

    public BigDecimal getVlAjusAcresBcCofins() {
        return vlAjusAcresBcCofins;
    }

    public void setVlAjusAcresBcCofins(BigDecimal vlAjusAcresBcCofins) {
        this.vlAjusAcresBcCofins = vlAjusAcresBcCofins;
    }

    public BigDecimal getVlAjusReducBcCofins() {
        return vlAjusReducBcCofins;
    }

    public void setVlAjusReducBcCofins(BigDecimal vlAjusReducBcCofins) {
        this.vlAjusReducBcCofins = vlAjusReducBcCofins;
    }

    public BigDecimal getVlBcContAjus() {
        return vlBcContAjus;
    }

    public void setVlBcContAjus(BigDecimal vlBcContAjus) {
        this.vlBcContAjus = vlBcContAjus;
    }

    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }

    public BigDecimal getQuantBcCofins() {
        return quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }

    public BigDecimal getAliqCofinsQuant() {
        return aliqCofinsQuant;
    }

    public void setAliqCofinsQuant(BigDecimal aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
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

    public RegM611 getRegM611() {
        return regM611;
    }

    public void setRegM611(RegM611 regM611) {
        this.regM611 = regM611;
    }

    public List<RegM615> getRegM615() {
        return regM615;
    }

    public void setRegM615(List<RegM615> regM615) {
        this.regM615 = regM615;
    }

    public List<RegM620> getRegM620() {
        return regM620;
    }

    public void setRegM620(List<RegM620> regM620) {
        this.regM620 = regM620;
    }

    public List<RegM630> getRegM630() {
        return regM630;
    }

    public void setRegM630(List<RegM630> regM630) {
        this.regM630 = regM630;
    }

    
}
