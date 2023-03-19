package efd.ecd.blocoK.n1.n2.n3.n4;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.n3.n4.n5.RegK115;

public class RegK110 implements Serializable {
	private static final long serialVersionUID = -561536673634244134L;

	@Inclui
    private final String reg = "K110";

    @Inclui
    private Integer evento;

    @Inclui
    private LocalDate dtEvento;

    @Filho
    private List<RegK115> regK115;

    public RegK110(Integer evento, LocalDate dtEvento) {
        this.evento = evento;
        this.dtEvento = dtEvento;
    }

    public RegK110() {}

    public String getReg() {
        return reg;
    }

    public Integer getEvento() {
        return evento;
    }

    public void setEvento(Integer evento) {
        this.evento = evento;
    }

    public LocalDate getDtEvento() {
        return dtEvento;
    }

    public void setDtEvento(LocalDate dtEvento) {
        this.dtEvento = dtEvento;
    }

    public List<RegK115> getRegK115() {
        return regK115;
    }

    public void setRegK115(List<RegK115> regK115) {
        this.regK115 = regK115;
    }
    

}
