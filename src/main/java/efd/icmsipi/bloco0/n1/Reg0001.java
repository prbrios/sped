package efd.icmsipi.bloco0.n1;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.Reg0005;
import efd.icmsipi.bloco0.n1.n2.Reg0015;
import efd.icmsipi.bloco0.n1.n2.Reg0100;
import efd.icmsipi.bloco0.n1.n2.Reg0150;
import efd.icmsipi.bloco0.n1.n2.Reg0190;
import efd.icmsipi.bloco0.n1.n2.Reg0200;
import efd.icmsipi.bloco0.n1.n2.Reg0300;
import efd.icmsipi.bloco0.n1.n2.Reg0400;
import efd.icmsipi.bloco0.n1.n2.Reg0450;
import efd.icmsipi.bloco0.n1.n2.Reg0460;
import efd.icmsipi.bloco0.n1.n2.Reg0500;
import efd.icmsipi.bloco0.n1.n2.Reg0600;
import lombok.Getter;
import lombok.Setter;


public class Reg0001 {

    @Getter @Inclui
    private final String reg = "0001";

    @Getter @Setter @Inclui
    private Integer indMov;

    @Getter @Setter @Filho
    private Reg0005 reg0005;

    @Getter @Setter @Filho
    private List<Reg0015> reg0015;

    @Getter @Setter @Filho
    private Reg0100 reg0100;

    @Getter @Setter @Filho
    private List<Reg0150> reg0150;

    @Getter @Setter @Filho
    private List<Reg0190> reg0190;

    @Getter @Setter @Filho
    private List<Reg0200> reg0200;

    @Getter @Setter @Filho
    private List<Reg0300> reg0300;

    @Getter @Setter @Filho
    private List<Reg0400> reg0400;

    @Getter @Setter @Filho
    private List<Reg0450> reg0450;

    @Getter @Setter @Filho
    private List<Reg0460> reg0460;

    @Getter @Setter @Filho
    private List<Reg0500> reg0500;

    @Getter @Setter @Filho
    private List<Reg0600> reg0600;

    public Reg0001(Integer indMov) {
        this.indMov = indMov;
    }

    public Reg0001(){}

}
