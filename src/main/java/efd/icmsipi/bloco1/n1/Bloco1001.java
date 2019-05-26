package efd.icmsipi.bloco1.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Bloco1001 {

    @Inclui
    private final String reg = "1001";

    @Inclui
    private Integer indMov;

    @Filho
    private Bloco1010 bloco1010;

    @Filho
    private List<Bloco1100> bloco1100;

    @Filho
    private List<Bloco1200> bloco1200;

    @Filho
    private List<Bloco1300> bloco1300;

    @Filho
    private List<Bloco1350> bloco1350;

    @Filho
    private List<Bloco1390> bloco1390;

    @Filho
    private List<Bloco1400> bloco1400;

    @Filho
    private List<Bloco1500> bloco1500;

    @Filho
    private List<Bloco1600> bloco1600;

    @Filho
    private List<Bloco1700> bloco1700;

    @Filho
    private Bloco1800 bloco1800;

    @Filho
    private List<Bloco1900> bloco1900;

    @Filho
    private List<Bloco1960> bloco1960;

    @Filho
    private List<Bloco1970> bloco1970;

    @Filho
    private Bloco1980 bloco1980;

}