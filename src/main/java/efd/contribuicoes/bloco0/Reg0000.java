package efd.contribuicoes.bloco0;

import java.time.LocalDate;

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
import lombok.Getter;
import lombok.Setter;

public class Reg0000 {

    @Getter @Inclui
    private final String reg = "0000";

    @Getter @Setter @Inclui(zerosEsquerda = 3)
    private Integer codVer;

    @Getter @Setter @Inclui
    private Integer tipoEscrit;

    @Getter @Setter @Inclui
    private Integer indSitEsp;

    @Getter @Setter @Inclui
    private String numRecAnterior;

    @Getter @Setter @Inclui
    private LocalDate dtIni;

    @Getter @Setter @Inclui
    private LocalDate dtFin;

    @Getter @Setter @Inclui
    private String nome;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Inclui
    private String uf;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Getter @Setter @Inclui
    private String suframa;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer indNatPj;

    @Getter @Setter @Inclui
    private Integer indAtiv;

    @Getter @Setter @Filho
    private Reg0001 reg0001;

    @Getter @Setter @Filho
    private Reg0990 reg0990;

    @Getter @Setter @Filho
    private RegA001 regA001;

    @Getter @Setter @Filho
    private RegA990 regA990;

    @Getter @Setter @Filho
    private RegC001 regC001;

    @Getter @Setter @Filho
    private RegC990 regC990;

    @Getter @Setter @Filho
    private RegD001 regD001;

    @Getter @Setter @Filho
    private RegD990 regD990;

    @Getter @Setter @Filho
    private RegF001 regF001;

    @Getter @Setter @Filho
    private RegF990 regF990;

    @Getter @Setter @Filho
    private RegI001 regI001;

    @Getter @Setter @Filho
    private RegI990 regI990;

    @Getter @Setter @Filho
    private RegM001 regM001;

    @Getter @Setter @Filho
    private RegM990 regM990;

    @Getter @Setter @Filho
    private RegP001 regP001;

    @Getter @Setter @Filho
    private RegP990 regP990;

    @Getter @Setter @Filho
    private Reg1001 reg1001;

    @Getter @Setter @Filho
    private Reg1990 reg1990;

    @Getter @Setter @Filho
    private Reg9001 reg9001;

    @Getter @Setter @Filho
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
}
