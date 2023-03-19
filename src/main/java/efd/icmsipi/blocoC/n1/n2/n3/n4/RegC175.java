package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC175 implements Serializable {
	private static final long serialVersionUID = 5809523151282628421L;

	@Inclui
    private final String reg = "C175";

    @Inclui
    private String indVeicOper;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String uf;

    @Inclui
    private String chassiVeic;

    public RegC175(String indVeicOper, Long cnpj, String uf, String chassiVeic) {
        this.indVeicOper = indVeicOper;
        this.cnpj = cnpj;
        this.uf = uf;
        this.chassiVeic = chassiVeic;
    }

    public RegC175(){}

    public String getReg() {
        return reg;
    }

    public String getIndVeicOper() {
        return indVeicOper;
    }

    public void setIndVeicOper(String indVeicOper) {
        this.indVeicOper = indVeicOper;
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

    public String getChassiVeic() {
        return chassiVeic;
    }

    public void setChassiVeic(String chassiVeic) {
        this.chassiVeic = chassiVeic;
    }
    
}
