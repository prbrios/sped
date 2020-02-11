package efd.icmsipi.bloco1.n1;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.Reg1010;
import efd.icmsipi.bloco1.n1.n2.Reg1100;
import efd.icmsipi.bloco1.n1.n2.Reg1200;
import efd.icmsipi.bloco1.n1.n2.Reg1250;
import efd.icmsipi.bloco1.n1.n2.Reg1300;
import efd.icmsipi.bloco1.n1.n2.Reg1350;
import efd.icmsipi.bloco1.n1.n2.Reg1390;
import efd.icmsipi.bloco1.n1.n2.Reg1400;
import efd.icmsipi.bloco1.n1.n2.Reg1500;
import efd.icmsipi.bloco1.n1.n2.Reg1600;
import efd.icmsipi.bloco1.n1.n2.Reg1700;
import efd.icmsipi.bloco1.n1.n2.Reg1800;
import efd.icmsipi.bloco1.n1.n2.Reg1900;
import efd.icmsipi.bloco1.n1.n2.Reg1960;
import efd.icmsipi.bloco1.n1.n2.Reg1970;
import efd.icmsipi.bloco1.n1.n2.Reg1980;
import lombok.Getter;
import lombok.Setter;


public class Reg1001 {

    @Getter @Inclui
    private final String reg = "1001";

    @Getter @Setter @Inclui
    private Integer indMov;

    @Getter @Setter @Filho
    private Reg1010 reg1010;

    @Getter @Setter @Filho
    private List<Reg1100> reg1100;

    @Getter @Setter @Filho
    private List<Reg1200> reg1200;

    @Getter @Setter @Filho
    private Reg1250 reg1250;

    @Getter @Setter @Filho
    private List<Reg1300> reg1300;

    @Getter @Setter @Filho
    private List<Reg1350> reg1350;

    @Getter @Setter @Filho
    private List<Reg1390> reg1390;

    @Getter @Setter @Filho
    private List<Reg1400> reg1400;

    @Getter @Setter @Filho
    private List<Reg1500> reg1500;

    @Getter @Setter @Filho
    private List<Reg1600> reg1600;

    @Getter @Setter @Filho
    private List<Reg1700> reg1700;

    @Getter @Setter @Filho
    private Reg1800 reg1800;

    @Getter @Setter @Filho
    private List<Reg1900> reg1900;

    @Getter @Setter @Filho
    private List<Reg1960> reg1960;

    @Getter @Setter @Filho
    private List<Reg1970> reg1970;

    @Getter @Setter @Filho
    private Reg1980 reg1980;

    public Reg1001(Integer indMov) {
        this.indMov = indMov;
    }

    public Reg1001(){}

}