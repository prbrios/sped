package efd.icmsipi.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1320 implements Serializable {
	private static final long serialVersionUID = 1912506546658040651L;

	@Inclui
    private final String reg = "1320";

    @Inclui
    private Integer numBico;

    @Inclui
    private Integer nrInterv;

    @Inclui
    private String motInterv;

    @Inclui
    private String nomInterv;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjInterv;

    @Inclui(zerosEsquerda = 11)
    private Long cpfInterv;

    @Inclui(casasDecimais = 3)
    private BigDecimal valFecha;

    @Inclui(casasDecimais = 3)
    private BigDecimal valAbert;

    @Inclui(casasDecimais = 3)
    private BigDecimal volAferi;

    @Inclui(casasDecimais = 3)
    private BigDecimal volVendas;

    public Reg1320(Integer numBico, Integer nrInterv, String motInterv, String nomInterv, Long cnpjInterv, Long cpfInterv, BigDecimal valFecha, BigDecimal valAbert, BigDecimal volAferi, BigDecimal volVendas) {
        this.numBico = numBico;
        this.nrInterv = nrInterv;
        this.motInterv = motInterv;
        this.nomInterv = nomInterv;
        this.cnpjInterv = cnpjInterv;
        this.cpfInterv = cpfInterv;
        this.valFecha = valFecha;
        this.valAbert = valAbert;
        this.volAferi = volAferi;
        this.volVendas = volVendas;
    }

    public Reg1320(){}

    public String getReg() {
        return reg;
    }

    public Integer getNumBico() {
        return numBico;
    }

    public void setNumBico(Integer numBico) {
        this.numBico = numBico;
    }

    public Integer getNrInterv() {
        return nrInterv;
    }

    public void setNrInterv(Integer nrInterv) {
        this.nrInterv = nrInterv;
    }

    public String getMotInterv() {
        return motInterv;
    }

    public void setMotInterv(String motInterv) {
        this.motInterv = motInterv;
    }

    public String getNomInterv() {
        return nomInterv;
    }

    public void setNomInterv(String nomInterv) {
        this.nomInterv = nomInterv;
    }

    public Long getCnpjInterv() {
        return cnpjInterv;
    }

    public void setCnpjInterv(Long cnpjInterv) {
        this.cnpjInterv = cnpjInterv;
    }

    public Long getCpfInterv() {
        return cpfInterv;
    }

    public void setCpfInterv(Long cpfInterv) {
        this.cpfInterv = cpfInterv;
    }

    public BigDecimal getValFecha() {
        return valFecha;
    }

    public void setValFecha(BigDecimal valFecha) {
        this.valFecha = valFecha;
    }

    public BigDecimal getValAbert() {
        return valAbert;
    }

    public void setValAbert(BigDecimal valAbert) {
        this.valAbert = valAbert;
    }

    public BigDecimal getVolAferi() {
        return volAferi;
    }

    public void setVolAferi(BigDecimal volAferi) {
        this.volAferi = volAferi;
    }

    public BigDecimal getVolVendas() {
        return volVendas;
    }

    public void setVolVendas(BigDecimal volVendas) {
        this.volVendas = volVendas;
    }
    
}