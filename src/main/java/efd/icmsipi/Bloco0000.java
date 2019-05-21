package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.time.LocalDate;

/**
 * BLOCO 0: ABERTURA, IDENTIFICAÇÃO E REFERÊNCIAS
 * REGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÇÃO DA ENTIDADE
 *<p>
 * Este Registro é obrigatório e corresponde ao primeiro registro do arquivo.
 * Nos casos de EFD-ICMS/IPI apresentadas por estabelecimentos situados em outra UF e que possuam Inscrição Estadual nos termos do Convênio ICMS nº 113/04 (serviços de comunicação definidos pela Anatel), deve-se observar o seguinte procedimento para preenchimento do registro 0000:
 * </p>
 * <ul>
 * <li>Informar o campo UF da unidade federada do tomador de serviços</li>
 * <li>Informar no campo IE a inscrição estadual na unidade federada do tomador de serviços</li>
 * <li>Informar no campo COD_MUN o código de município correspondente à capital do estado do tomador de serviços</li>
 * </ul>
 *
 * @author Paulo Rios prbrios@gmail.com
 * @since 17/05/2019
 * @see efd.icmsipi.Bloco0000
 *
 */
public class Bloco0000 {

    /**
     * 01 REG
     * Texto fixo contendo "0000"
     */
    @Inclui
    private String reg = "0000";

    /**
     * 02 COD_VER
     */
    @Inclui
    private String codVer;

    /**
     * 03 COD_FIN
     */
    @Inclui
    private String codFin;

    /**
     * 04 DT_INI
     */
    @Inclui
    private LocalDate dtIni;

    /**
     * 05 DT_FIN
     */
    @Inclui
    private LocalDate dtFin;

    /**
     * 06 NOME
     */
    @Inclui
    private String nome;

    /**
     * 07 CNPJ
     */
    @Inclui
    private String cnpj;

    /**
     * 08 CPF
     */
    @Inclui
    private String cpf;

    /**
     * 09 UF
     */
    @Inclui
    private String uf;

    /**
     * 10 IE
     */
    @Inclui
    private String ie;

    /**
     * 11 COD_MUN
     */
    @Inclui
    private String codMun;

    /**
     * 12 IM
     */
    @Inclui
    private String im;

    /**
     * 13 SUFRAMA
     */
    @Inclui
    private String suframa;

    /**
     * 14 IND_PERFIL
     */
    @Inclui
    private String indPerfil;

    /**
     * 15 IND_ATIV
     */
    @Inclui
    private String indAtiv;

    private Bloco0001 bloco0001;


    public String getReg() {
        return reg;
    }

    public String getCodVer() {
        return codVer;
    }

    public void setCodVer(String codVer) {
        this.codVer = codVer;
    }

    public String getCodFin() {
        return codFin;
    }

    public void setCodFin(String codFin) {
        this.codFin = codFin;
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
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getCodMun() {
        return codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public String getIndPerfil() {
        return indPerfil;
    }

    public void setIndPerfil(String indPerfil) {
        this.indPerfil = indPerfil;
    }

    public String getIndAtiv() {
        return indAtiv;
    }

    public void setIndAtiv(String indAtiv) {
        this.indAtiv = indAtiv;
    }

    public Bloco0001 getBloco0001() {
        return bloco0001;
    }

    public void setBloco0001(Bloco0001 bloco0001) {
        this.bloco0001 = bloco0001;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}
