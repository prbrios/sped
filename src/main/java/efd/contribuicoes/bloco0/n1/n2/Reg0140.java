package efd.contribuicoes.bloco0.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco0.n1.n2.n3.*;

import java.io.Serializable;
import java.util.List;

public class Reg0140 implements Serializable {
	private static final long serialVersionUID = 608860731453803381L;

	@Inclui
	private final String reg = "0140";

    @Inclui
    private String codEst;

    @Inclui
    private String nome;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String uf;

    @Inclui
    private String ie;

    @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Inclui
    private String im;

    @Inclui
    private String suframa;

    @Filho
    private Reg0145 reg0145;

    @Filho
    private List<Reg0150> reg0150;

    @Filho
    private List<Reg0190> reg0190;

    @Filho
    private List<Reg0200> reg0200;

    @Filho
    private List<Reg0400> reg0400;

    @Filho
    private List<Reg0450> reg0450;

    public Reg0140(String codEst, String nome, Long cnpj, String uf, String ie, Integer codMun, String im, String suframa) {
        this.codEst = codEst;
        this.nome = nome;
        this.cnpj = cnpj;
        this.uf = uf;
        this.ie = ie;
        this.codMun = codMun;
        this.im = im;
        this.suframa = suframa;
    }

    public Reg0140(){}

    public String getReg() {
        return reg;
    }

    public String getCodEst() {
        return codEst;
    }

    public void setCodEst(String codEst) {
        this.codEst = codEst;
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

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Integer getCodMun() {
        return codMun;
    }

    public void setCodMun(Integer codMun) {
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

    public Reg0145 getReg0145() {
        return reg0145;
    }

    public void setReg0145(Reg0145 reg0145) {
        this.reg0145 = reg0145;
    }

    public List<Reg0150> getReg0150() {
        return reg0150;
    }

    public void setReg0150(List<Reg0150> reg0150) {
        this.reg0150 = reg0150;
    }

    public List<Reg0190> getReg0190() {
        return reg0190;
    }

    public void setReg0190(List<Reg0190> reg0190) {
        this.reg0190 = reg0190;
    }

    public List<Reg0200> getReg0200() {
        return reg0200;
    }

    public void setReg0200(List<Reg0200> reg0200) {
        this.reg0200 = reg0200;
    }

    public List<Reg0400> getReg0400() {
        return reg0400;
    }

    public void setReg0400(List<Reg0400> reg0400) {
        this.reg0400 = reg0400;
    }

    public List<Reg0450> getReg0450() {
        return reg0450;
    }

    public void setReg0450(List<Reg0450> reg0450) {
        this.reg0450 = reg0450;
    }
    
}
