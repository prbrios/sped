package efd.contribuicoes.bloco0;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Reg0000 {

    @Getter @Inclui
    private final String reg = "0000";

    @Getter @Inclui(zerosEsquerda = 3)
    private Integer codVer;

    @Getter @Inclui
    private Integer tipoEscrit;

    @Getter @Inclui
    private Integer indSitEsp;

    @Getter @Inclui
    private String numRecAnterior;

    @Getter @Inclui
    private LocalDate dtIni;

    @Getter @Inclui
    private LocalDate dtFin;

    @Getter @Inclui
    private String nome;

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Inclui
    private String uf;

    @Getter @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Getter @Inclui
    private String suframa;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer indNatPj;

    @Getter @Inclui
    private Integer indAtiv;

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
