package efd.icmsipi.blocoD.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegD161 implements Serializable {
	private static final long serialVersionUID = 6669430072190846232L;

	@Inclui
    private final String reg = "D161";

    @Inclui
    private Integer indCarga;

    @Inclui
    private String cnpjCpfCol;

    @Inclui
    private String ieCol;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunCol;

    @Inclui
    private String cnpjCpfEntg;

    @Inclui
    private String ieEntg;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunEntg;

    public RegD161(Integer indCarga, String cnpjCpfCol, String ieCol, Integer codMunCol, String cnpjCpfEntg, String ieEntg, Integer codMunEntg) {
        this.indCarga = indCarga;
        this.cnpjCpfCol = cnpjCpfCol;
        this.ieCol = ieCol;
        this.codMunCol = codMunCol;
        this.cnpjCpfEntg = cnpjCpfEntg;
        this.ieEntg = ieEntg;
        this.codMunEntg = codMunEntg;
    }

    public RegD161(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndCarga() {
        return indCarga;
    }

    public void setIndCarga(Integer indCarga) {
        this.indCarga = indCarga;
    }

    public String getCnpjCpfCol() {
        return cnpjCpfCol;
    }

    public void setCnpjCpfCol(String cnpjCpfCol) {
        this.cnpjCpfCol = cnpjCpfCol;
    }

    public String getIeCol() {
        return ieCol;
    }

    public void setIeCol(String ieCol) {
        this.ieCol = ieCol;
    }

    public Integer getCodMunCol() {
        return codMunCol;
    }

    public void setCodMunCol(Integer codMunCol) {
        this.codMunCol = codMunCol;
    }

    public String getCnpjCpfEntg() {
        return cnpjCpfEntg;
    }

    public void setCnpjCpfEntg(String cnpjCpfEntg) {
        this.cnpjCpfEntg = cnpjCpfEntg;
    }

    public String getIeEntg() {
        return ieEntg;
    }

    public void setIeEntg(String ieEntg) {
        this.ieEntg = ieEntg;
    }

    public Integer getCodMunEntg() {
        return codMunEntg;
    }

    public void setCodMunEntg(Integer codMunEntg) {
        this.codMunEntg = codMunEntg;
    }
    
}