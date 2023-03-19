package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC115 implements Serializable {
	private static final long serialVersionUID = -2210792766552499730L;

	@Inclui
    private final String reg = "C115";

    @Inclui
    private Integer indCarga;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjCol;

    @Inclui
    private String ieCol;

    @Inclui(zerosEsquerda = 11)
    private Long cpfCol;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunCol;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjEntg;

    @Inclui
    private String ieEntg;

    @Inclui(zerosEsquerda = 11)
    private Integer cpfEntg;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunEntg;

    public RegC115(Integer indCarga, Long cnpjCol, String ieCol, Long cpfCol, Integer codMunCol, Long cnpjEntg, String ieEntg, Integer cpfEntg, Integer codMunEntg) {
        this.indCarga = indCarga;
        this.cnpjCol = cnpjCol;
        this.ieCol = ieCol;
        this.cpfCol = cpfCol;
        this.codMunCol = codMunCol;
        this.cnpjEntg = cnpjEntg;
        this.ieEntg = ieEntg;
        this.cpfEntg = cpfEntg;
        this.codMunEntg = codMunEntg;
    }

    public RegC115(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndCarga() {
        return indCarga;
    }

    public void setIndCarga(Integer indCarga) {
        this.indCarga = indCarga;
    }

    public Long getCnpjCol() {
        return cnpjCol;
    }

    public void setCnpjCol(Long cnpjCol) {
        this.cnpjCol = cnpjCol;
    }

    public String getIeCol() {
        return ieCol;
    }

    public void setIeCol(String ieCol) {
        this.ieCol = ieCol;
    }

    public Long getCpfCol() {
        return cpfCol;
    }

    public void setCpfCol(Long cpfCol) {
        this.cpfCol = cpfCol;
    }

    public Integer getCodMunCol() {
        return codMunCol;
    }

    public void setCodMunCol(Integer codMunCol) {
        this.codMunCol = codMunCol;
    }

    public Long getCnpjEntg() {
        return cnpjEntg;
    }

    public void setCnpjEntg(Long cnpjEntg) {
        this.cnpjEntg = cnpjEntg;
    }

    public String getIeEntg() {
        return ieEntg;
    }

    public void setIeEntg(String ieEntg) {
        this.ieEntg = ieEntg;
    }

    public Integer getCpfEntg() {
        return cpfEntg;
    }

    public void setCpfEntg(Integer cpfEntg) {
        this.cpfEntg = cpfEntg;
    }

    public Integer getCodMunEntg() {
        return codMunEntg;
    }

    public void setCodMunEntg(Integer codMunEntg) {
        this.codMunEntg = codMunEntg;
    }
    
}
