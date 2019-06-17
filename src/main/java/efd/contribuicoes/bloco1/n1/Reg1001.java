package efd.contribuicoes.bloco1.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Reg1001 {

    @Getter @Inclui
private final String reg = "1001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<Reg1010> reg1010;

    @Getter @Setter @Filho
    private List<Reg1020> reg1020;

    @Getter @Setter @Filho
    private List<Reg1050> reg1050;

    @Getter @Setter @Filho
    private List<Reg1100> reg1100;

    @Getter @Setter @Filho
    private List<Reg1200> reg1200;

    @Getter @Setter @Filho
    private List<Reg1300> reg1300;

    @Getter @Setter @Filho
    private List<Reg1500> reg1500;

    @Getter @Setter @Filho
    private List<Reg1600> reg1600;

    @Getter @Setter @Filho
    private List<Reg1700> reg1700;

    @Getter @Setter @Filho
    private List<Reg1800> reg1800;

    @Getter @Setter @Filho
    private List<Reg1900> reg1900;

    public Reg1001(String indMov) {
        this.indMov = indMov;
    }

    public Reg1001(){ }
}
