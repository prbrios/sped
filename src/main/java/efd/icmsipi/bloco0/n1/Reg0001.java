package efd.icmsipi.bloco0.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Reg0001 {

    @Inclui
    private final String reg = "0001";

    @Inclui
    private Integer indMov;

    @Filho
    private Reg0005 reg0005;

    @Filho
    private List<Reg0015> reg0015;

    @Filho
    private Reg0100 reg0100;

    @Filho
    private List<Reg0150> reg0150;

    @Filho
    private List<Reg0190> reg0190;

    @Filho
    private List<Reg0200> reg0200;

    @Filho
    private List<Reg0300> reg0300;

    @Filho
    private List<Reg0400> reg0400;

    @Filho
    private List<Reg0450> reg0450;

    @Filho
    private List<Reg0460> reg0460;

    @Filho
    private List<Reg0500> reg0500;

    @Filho
    private List<Reg0600> reg0600;

}
