package efd.contribuicoes.bloco0;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco0.n1.Reg0001;
import efd.contribuicoes.bloco0.n1.Reg0990;
import efd.contribuicoes.bloco1.n1.Reg1001;
import efd.contribuicoes.bloco1.n1.Reg1990;
import efd.contribuicoes.bloco9.n1.Reg9001;
import efd.contribuicoes.bloco9.n1.Reg9990;
import efd.contribuicoes.blocoA.n1.RegA001;
import efd.contribuicoes.blocoA.n1.RegA990;
import efd.contribuicoes.blocoC.n1.RegC001;
import efd.contribuicoes.blocoC.n1.RegC990;
import efd.contribuicoes.blocoD.n1.RegD001;
import efd.contribuicoes.blocoD.n1.RegD990;
import efd.contribuicoes.blocoF.n1.RegF001;
import efd.contribuicoes.blocoF.n1.RegF990;
import efd.contribuicoes.blocoI.n1.RegI001;
import efd.contribuicoes.blocoI.n1.RegI990;
import efd.contribuicoes.blocoM.n1.RegM001;
import efd.contribuicoes.blocoM.n1.RegM990;
import efd.contribuicoes.blocoP.n1.RegP001;
import efd.contribuicoes.blocoP.n1.RegP990;

import java.io.Serializable;
import java.time.LocalDate;

public class Reg0000 implements Serializable {
	private static final long serialVersionUID = 1752130219378821080L;

	@Inclui
    private final String reg = "0000";

    @Inclui(zerosEsquerda = 3)
    private Integer codVer;

    @Inclui
    private Integer tipoEscrit;

    @Inclui
    private Integer indSitEsp;

    @Inclui
    private String numRecAnterior;

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Inclui
    private String nome;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String uf;

    @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Inclui
    private String suframa;

    @Inclui(zerosEsquerda = 2)
    private Integer indNatPj;

    @Inclui
    private Integer indAtiv;

    @Filho
    private Reg0001 reg0001;

    @Filho
    private Reg0990 reg0990;

    @Filho
    private RegA001 regA001;

    @Filho
    private RegA990 regA990;

    @Filho
    private RegC001 regC001;

    @Filho
    private RegC990 regC990;

    @Filho
    private RegD001 regD001;

    @Filho
    private RegD990 regD990;

    @Filho
    private RegF001 regF001;

    @Filho
    private RegF990 regF990;

    @Filho
    private RegI001 regI001;

    @Filho
    private RegI990 regI990;

    @Filho
    private RegM001 regM001;

    @Filho
    private RegM990 regM990;

    @Filho
    private RegP001 regP001;

    @Filho
    private RegP990 regP990;

    @Filho
    private Reg1001 reg1001;

    @Filho
    private Reg1990 reg1990;

    @Filho
    private Reg9001 reg9001;

    @Filho
    private Reg9990 reg9990;

    /**
     * Abertura do Arquivo Digital e Identificação da Pessoa Jurídica
     *
     * @param codVer Código da versão do leiaute conforme a tabela 3.1.1.
     * @param tipoEscrit Tipo de escrituração
     * @param indSitEsp Indicador de situação especial
     * @param numRecAnterior Número do Recibo da Escrituração anterior a ser retificada, utilizado quando TIPO_ESCRIT for igual a 1
     * @param dtIni Data inicial das informações contidas no arquivo
     * @param dtFin Data final das informações contidas no arquivo
     * @param nome Nome empresarial da pessoa jurídica
     * @param cnpj Número de inscrição do estabelecimento matriz da pessoa jurídica no CNPJ
     * @param uf Sigla da Unidade da Federação da pessoa jurídica
     * @param codMun Código do município do domicílio fiscal da pessoa jurídica, conforme a tabela IBGE
     * @param suframa Inscrição da pessoa jurídica na Suframa
     * @param indNatPj Indicador da natureza da pessoa jurídica
     * @param indAtiv Indicador de tipo de atividade preponderante
     */
    public Reg0000(Integer codVer, Integer tipoEscrit, Integer indSitEsp, String numRecAnterior, LocalDate dtIni, LocalDate dtFin, String nome, Long cnpj, String uf, Integer codMun, String suframa, Integer indNatPj, Integer indAtiv) {
        this.codVer = codVer;
        this.tipoEscrit = tipoEscrit;
        this.indSitEsp = indSitEsp;
        this.numRecAnterior = numRecAnterior;
        this.dtIni = dtIni;
        this.dtFin = dtFin;
        this.nome = nome;
        this.cnpj = cnpj;
        this.uf = uf;
        this.codMun = codMun;
        this.suframa = suframa;
        this.indNatPj = indNatPj;
        this.indAtiv = indAtiv;
    }

    public Reg0000(){}

    public String getReg() {
        return reg;
    }

    public Integer getCodVer() {
        return codVer;
    }

    public void setCodVer(Integer codVer) {
        this.codVer = codVer;
    }

    public Integer getTipoEscrit() {
        return tipoEscrit;
    }

    public void setTipoEscrit(Integer tipoEscrit) {
        this.tipoEscrit = tipoEscrit;
    }

    public Integer getIndSitEsp() {
        return indSitEsp;
    }

    public void setIndSitEsp(Integer indSitEsp) {
        this.indSitEsp = indSitEsp;
    }

    public String getNumRecAnterior() {
        return numRecAnterior;
    }

    public void setNumRecAnterior(String numRecAnterior) {
        this.numRecAnterior = numRecAnterior;
    }

    public LocalDate getDtIni() {
        return dtIni;
    }

    public void setDtIni(LocalDate dtIni) {
        this.dtIni = dtIni;
    }

    public LocalDate getDtFin() {
        return dtFin;
    }

    public void setDtFin(LocalDate dtFin) {
        this.dtFin = dtFin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getCodMun() {
        return codMun;
    }

    public void setCodMun(Integer codMun) {
        this.codMun = codMun;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public Integer getIndNatPj() {
        return indNatPj;
    }

    public void setIndNatPj(Integer indNatPj) {
        this.indNatPj = indNatPj;
    }

    public Integer getIndAtiv() {
        return indAtiv;
    }

    public void setIndAtiv(Integer indAtiv) {
        this.indAtiv = indAtiv;
    }

    public Reg0001 getReg0001() {
        return reg0001;
    }

    public void setReg0001(Reg0001 reg0001) {
        this.reg0001 = reg0001;
    }

    public Reg0990 getReg0990() {
        return reg0990;
    }

    public void setReg0990(Reg0990 reg0990) {
        this.reg0990 = reg0990;
    }

    public RegA001 getRegA001() {
        return regA001;
    }

    public void setRegA001(RegA001 regA001) {
        this.regA001 = regA001;
    }

    public RegA990 getRegA990() {
        return regA990;
    }

    public void setRegA990(RegA990 regA990) {
        this.regA990 = regA990;
    }

    public RegC001 getRegC001() {
        return regC001;
    }

    public void setRegC001(RegC001 regC001) {
        this.regC001 = regC001;
    }

    public RegC990 getRegC990() {
        return regC990;
    }

    public void setRegC990(RegC990 regC990) {
        this.regC990 = regC990;
    }

    public RegD001 getRegD001() {
        return regD001;
    }

    public void setRegD001(RegD001 regD001) {
        this.regD001 = regD001;
    }

    public RegD990 getRegD990() {
        return regD990;
    }

    public void setRegD990(RegD990 regD990) {
        this.regD990 = regD990;
    }

    public RegF001 getRegF001() {
        return regF001;
    }

    public void setRegF001(RegF001 regF001) {
        this.regF001 = regF001;
    }

    public RegF990 getRegF990() {
        return regF990;
    }

    public void setRegF990(RegF990 regF990) {
        this.regF990 = regF990;
    }

    public RegI001 getRegI001() {
        return regI001;
    }

    public void setRegI001(RegI001 regI001) {
        this.regI001 = regI001;
    }

    public RegI990 getRegI990() {
        return regI990;
    }

    public void setRegI990(RegI990 regI990) {
        this.regI990 = regI990;
    }

    public RegM001 getRegM001() {
        return regM001;
    }

    public void setRegM001(RegM001 regM001) {
        this.regM001 = regM001;
    }

    public RegM990 getRegM990() {
        return regM990;
    }

    public void setRegM990(RegM990 regM990) {
        this.regM990 = regM990;
    }

    public RegP001 getRegP001() {
        return regP001;
    }

    public void setRegP001(RegP001 regP001) {
        this.regP001 = regP001;
    }

    public RegP990 getRegP990() {
        return regP990;
    }

    public void setRegP990(RegP990 regP990) {
        this.regP990 = regP990;
    }

    public Reg1001 getReg1001() {
        return reg1001;
    }

    public void setReg1001(Reg1001 reg1001) {
        this.reg1001 = reg1001;
    }

    public Reg1990 getReg1990() {
        return reg1990;
    }

    public void setReg1990(Reg1990 reg1990) {
        this.reg1990 = reg1990;
    }

    public Reg9001 getReg9001() {
        return reg9001;
    }

    public void setReg9001(Reg9001 reg9001) {
        this.reg9001 = reg9001;
    }

    public Reg9990 getReg9990() {
        return reg9990;
    }

    public void setReg9990(Reg9990 reg9990) {
        this.reg9990 = reg9990;
    }
    
}
