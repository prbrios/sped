package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD161;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD162;

import java.io.Serializable;
import java.util.List;

public class RegD160 implements Serializable {
	private static final long serialVersionUID = 3386045982246113299L;

	@Inclui
    private final String reg = "D160";

    @Inclui
    private String despacho;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjCpfRem;

    @Inclui
    private String ieRem;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOri;

    @Inclui(zerosEsquerda = 7)
    private Long cnpjCpfDest;

    @Inclui
    private Integer ieDest;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Filho
    private RegD161 regD161;

    @Filho
    private List<RegD162> regD162;

    public RegD160(String despacho, Long cnpjCpfRem, String ieRem, Integer codMunOri, Long cnpjCpfDest, Integer ieDest, Integer codMunDest) {
        this.despacho = despacho;
        this.cnpjCpfRem = cnpjCpfRem;
        this.ieRem = ieRem;
        this.codMunOri = codMunOri;
        this.cnpjCpfDest = cnpjCpfDest;
        this.ieDest = ieDest;
        this.codMunDest = codMunDest;
    }

    public RegD160(){}

    public String getReg() {
        return reg;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Long getCnpjCpfRem() {
        return cnpjCpfRem;
    }

    public void setCnpjCpfRem(Long cnpjCpfRem) {
        this.cnpjCpfRem = cnpjCpfRem;
    }

    public String getIeRem() {
        return ieRem;
    }

    public void setIeRem(String ieRem) {
        this.ieRem = ieRem;
    }

    public Integer getCodMunOri() {
        return codMunOri;
    }

    public void setCodMunOri(Integer codMunOri) {
        this.codMunOri = codMunOri;
    }

    public Long getCnpjCpfDest() {
        return cnpjCpfDest;
    }

    public void setCnpjCpfDest(Long cnpjCpfDest) {
        this.cnpjCpfDest = cnpjCpfDest;
    }

    public Integer getIeDest() {
        return ieDest;
    }

    public void setIeDest(Integer ieDest) {
        this.ieDest = ieDest;
    }

    public Integer getCodMunDest() {
        return codMunDest;
    }

    public void setCodMunDest(Integer codMunDest) {
        this.codMunDest = codMunDest;
    }

    public RegD161 getRegD161() {
        return regD161;
    }

    public void setRegD161(RegD161 regD161) {
        this.regD161 = regD161;
    }

    public List<RegD162> getRegD162() {
        return regD162;
    }

    public void setRegD162(List<RegD162> regD162) {
        this.regD162 = regD162;
    }
    
}