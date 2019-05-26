package efd.icmsipi.bloco0.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Bloco0001 {

    @Inclui
    private final String reg = "0001";

    @Inclui
    private Integer indMov;

    @Filho
    private Bloco0005 bloco0005;

    @Filho
    private List<Bloco0015> bloco0015;

    @Filho
    private Bloco0100 bloco0100;

    @Filho
    private List<Bloco0150> bloco0150;

    @Filho
    private List<Bloco0190> bloco0190;

    @Filho
    private List<Bloco0200> bloco0200;

    @Filho
    private List<Bloco0300> bloco0300;

    @Filho
    private List<Bloco0400> bloco0400;

    @Filho
    private List<Bloco0450> bloco0450;

    @Filho
    private List<Bloco0460> bloco0460;

    @Filho
    private List<Bloco0500> bloco0500;

    @Filho
    private List<Bloco0600> bloco0600;

}
