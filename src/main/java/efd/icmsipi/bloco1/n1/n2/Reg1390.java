package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1391;

import java.io.Serializable;
import java.util.List;

public class Reg1390 implements Serializable {
	private static final long serialVersionUID = -228374041716302223L;

	@Inclui
    private final String reg = "1390";

    @Inclui(zerosEsquerda = 2)
    private Integer codProd;

    @Filho
    private List<Reg1391> reg1391;

    public Reg1390(Integer codProd) {
        this.codProd = codProd;
    }

    public Reg1390(){}

    public String getReg() {
        return reg;
    }

    public Integer getCodProd() {
        return codProd;
    }

    public void setCodProd(Integer codProd) {
        this.codProd = codProd;
    }

    public List<Reg1391> getReg1391() {
        return reg1391;
    }

    public void setReg1391(List<Reg1391> reg1391) {
        this.reg1391 = reg1391;
    }
    
}