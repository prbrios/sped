package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.Grupo;
import efd.anotacoes.G1;
import efd.anotacoes.G2;
import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegM610 {

    private Grupo grupo;

    @Getter @Inclui @G1 @G2
    private final String reg = "M610";

    @Getter @Inclui @G1 @G2
    private String codCont;

    @Getter @Inclui @G1 @G2
    private BigDecimal vlRecBrt;

    @Getter @Inclui @G1 @G2
    private BigDecimal vlBcCont;

    @Getter @Inclui @G2
    private BigDecimal vlAjusAcresBcCofins;

    @Getter @Inclui @G2
    private BigDecimal vlAjusReducBcCofins;

    @Getter @Inclui @G2
    private BigDecimal vlBcContAjus;

    @Getter @Inclui(casasDecimais = 4) @G1 @G2
    private BigDecimal aliqCofins;

    @Getter @Inclui(casasDecimais = 3) @G1 @G2
    private BigDecimal quantBcCofins;

    @Getter @Inclui(casasDecimais = 4) @G1 @G2
    private BigDecimal aliqCofinsQuant;

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
}
