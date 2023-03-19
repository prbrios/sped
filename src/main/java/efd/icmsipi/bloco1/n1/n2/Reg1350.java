package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1360;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1370;

import java.io.Serializable;
import java.util.List;

public class Reg1350 implements Serializable {
	private static final long serialVersionUID = -713871634902123266L;

	@Inclui
    private final String reg = "1350";

    @Inclui
    private String serie;

    @Inclui
    private String fabricante;

    @Inclui
    private String modelo;

    @Inclui
    private String tipoMedicao;

    @Filho
    private List<Reg1360> reg1360;

    @Filho
    private List<Reg1370> reg1370;

    public Reg1350(String serie, String fabricante, String modelo, String tipoMedicao) {
        this.serie = serie;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tipoMedicao = tipoMedicao;
    }

    public Reg1350(){}

    public String getReg() {
        return reg;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoMedicao() {
        return tipoMedicao;
    }

    public void setTipoMedicao(String tipoMedicao) {
        this.tipoMedicao = tipoMedicao;
    }

    public List<Reg1360> getReg1360() {
        return reg1360;
    }

    public void setReg1360(List<Reg1360> reg1360) {
        this.reg1360 = reg1360;
    }

    public List<Reg1370> getReg1370() {
        return reg1370;
    }

    public void setReg1370(List<Reg1370> reg1370) {
        this.reg1370 = reg1370;
    }
    
}