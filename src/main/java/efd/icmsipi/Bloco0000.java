package efd.icmsipi;

import efd.Parsers;
import efd.UF;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    private String reg = "0000";

    /**
     * 02 COD_VER
     */
    private String codVer;

    /**
     * 03 COD_FIN
     */
    private CodFin codFin;

    /**
     * 04 DT_INI
     */
    private LocalDate dtIni;

    /**
     * 05 DT_FIN
     */
    private LocalDate dtFin;

    /**
     * 06 NOME
     */
    private String nome;

    /**
     * 07 CNPJ
     */
    private String cnpj;

    /**
     * 08 CPF
     */
    private String cpf;

    /**
     * 09 UF
     */
    private UF uf;

    /**
     * 10 IE
     */
    private String ie;

    /**
     * 11 COD_MUN
     */
    private String codMun;

    /**
     * 12 IM
     */
    private String im;

    /**
     * 13 SUFRAMA
     */
    private String suframa;

    /**
     * 14 IND_PERFIL
     */
    private IndPerfil indPerfil;

    /**
     * 15 IND_ATIV
     */
    private IndAtiv indAtiv;

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

    public CodFin getCodFin() {
        return codFin;
    }

    public void setCodFin(CodFin codFin) {
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

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
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

    public IndPerfil getIndPerfil() {
        return indPerfil;
    }

    public void setIndPerfil(IndPerfil indPerfil) {
        this.indPerfil = indPerfil;
    }

    public IndAtiv getIndAtiv() {
        return indAtiv;
    }

    public void setIndAtiv(IndAtiv indAtiv) {
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

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codVer);
        arr.add(this.codFin != null ? this.codFin.getCodigo() : null);
        arr.add(this.dtIni != null ? Parsers.formataData(this.dtIni, "ddMMyyyy") : null);
        arr.add(this.dtFin != null ? Parsers.formataData(this.dtFin, "ddMMyyyy") : null);
        arr.add(this.nome);
        arr.add(this.cnpj);
        arr.add(this.cpf);
        arr.add(this.uf != null ? this.uf.getSigla() : null);
        arr.add(this.ie);
        arr.add(this.codMun);
        arr.add(this.im);
        arr.add(this.suframa);
        arr.add(this.indPerfil != null ? this.indPerfil.getCodigo() : null);
        arr.add(this.indAtiv != null ? this.indAtiv.getCodigo() : null);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IndPerfil {

        PERFIL_A("A"),
        PERFIL_B("B"),
        PERFIL_C("C");

        private String codigo;

        IndPerfil(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }

    }

    public enum CodFin {

        REMESSA_DO_ARQUIVO_ORIGINAL("0"),
        REMESSA_DO_ARQUIVO_SUBSTITUTO("1");

        private String codigo;

        CodFin(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }

    }

    public enum IndAtiv {

        INDUSTRIAL_OU_EQUIPARADO_A_INDUSTRIAL("0"),
        OUTROS("1");

        private String codigo;

        IndAtiv(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return codigo;
        }

    }

}
