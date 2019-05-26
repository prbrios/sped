package efd.icmsipi.bloco1.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Reg1001 {

    @Inclui
    private final String reg = "1001";

    @Inclui
    private Integer indMov;

    @Filho
    private Reg1010 reg1010;

    @Filho
    private List<Reg1100> reg1100;

    @Filho
    private List<Reg1200> reg1200;

    @Filho
    private List<Reg1300> reg1300;

    @Filho
    private List<Reg1350> reg1350;

    @Filho
    private List<Reg1390> reg1390;

    @Filho
    private List<Reg1400> reg1400;

    @Filho
    private List<Reg1500> reg1500;

    @Filho
    private List<Reg1600> reg1600;

    @Filho
    private List<Reg1700> reg1700;

    @Filho
    private Reg1800 reg1800;

    @Filho
    private List<Reg1900> reg1900;

    @Filho
    private List<Reg1960> reg1960;

    @Filho
    private List<Reg1970> reg1970;

    @Filho
    private Reg1980 reg1980;

}