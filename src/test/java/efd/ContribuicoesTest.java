package efd;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import efd.contribuicoes.bloco0.Reg0000;
import efd.contribuicoes.bloco0.n1.Reg0001;
import efd.contribuicoes.bloco0.n1.n2.Reg0035;
import efd.contribuicoes.bloco0.n1.n2.Reg0100;
import efd.contribuicoes.bloco0.n1.n2.Reg0110;
import efd.contribuicoes.bloco0.n1.n2.Reg0120;
import efd.contribuicoes.bloco0.n1.n2.Reg0140;
import efd.contribuicoes.bloco0.n1.n2.Reg0500;
import efd.contribuicoes.bloco0.n1.n2.Reg0600;
import efd.contribuicoes.bloco0.n1.n2.n3.Reg0111;
import efd.contribuicoes.bloco0.n1.n2.n3.Reg0145;
import efd.contribuicoes.bloco0.n1.n2.n3.Reg0150;
import efd.contribuicoes.bloco0.n1.n2.n3.Reg0190;
import efd.contribuicoes.bloco0.n1.n2.n3.Reg0200;
import efd.contribuicoes.bloco0.n1.n2.n3.Reg0400;
import efd.contribuicoes.bloco0.n1.n2.n3.Reg0450;
import efd.contribuicoes.bloco1.n1.Reg1001;
import efd.contribuicoes.blocoA.n1.RegA001;
import efd.contribuicoes.blocoC.n1.RegC001;
import efd.contribuicoes.blocoD.n1.RegD001;
import efd.contribuicoes.blocoF.n1.RegF001;
import efd.contribuicoes.blocoI.n1.RegI001;
import efd.contribuicoes.blocoM.n1.RegM001;
import efd.contribuicoes.blocoP.n1.RegP001;

public class ContribuicoesTest {

    @Test
    public void teste(){

        Reg0000 r0000 = new Reg0000();
        r0000.setReg0001(this.get0001());
        r0000.setRegA001(this.getA001());
        r0000.setRegC001(this.getC001());
        r0000.setRegD001(this.getD001());
        r0000.setRegF001(this.getF001());
        r0000.setRegI001(this.getI001());
        r0000.setRegM001(this.getM001());
        r0000.setRegP001(this.getP001());
        r0000.setReg1001(this.get1001());

        Contribuicoes obj = new Contribuicoes();
        obj.setReg0000(r0000);

        System.out.println(Conversor.converte(obj, true));

    }

    private Reg0001 get0001() {

        Reg0001 obj = new Reg0001();
        obj.setReg0035(this.get0035());
        obj.setReg0100(this.get0100());
        obj.setReg0110(this.get0110());
        obj.setReg0120(this.get0120());
        obj.setReg0140(this.get0140());
        obj.setReg0500(this.get0500());
        obj.setReg0600(this.get0600());
        return obj;
    }

    private List<Reg0600> get0600() {
        List<Reg0600> obj = new ArrayList<>();
        obj.add(new Reg0600());
        return obj;
    }

    private List<Reg0500> get0500() {
        List<Reg0500> obj = new ArrayList<>();
        obj.add(new Reg0500());
        return obj;
    }

    private List<Reg0140> get0140() {

        List<Reg0150> r0150l = new ArrayList<>();

        List<Reg0190> r0190l = new ArrayList<>();

        List<Reg0200> r0200l = new ArrayList<>();

        List<Reg0400> r0400l = new ArrayList<>();

        List<Reg0450> r0450l = new ArrayList<>();

        Reg0140 r0140 = new Reg0140();
        r0140.setReg0145(new Reg0145());
        r0140.setReg0150(r0150l);
        r0140.setReg0190(r0190l);
        r0140.setReg0200(r0200l);
        r0140.setReg0400(r0400l);
        r0140.setReg0450(r0450l);

        List<Reg0140> obj = new ArrayList<>();
        obj.add(r0140);
        return obj;
    }

    private List<Reg0120> get0120() {
        List<Reg0120> obj = new ArrayList<>();
        obj.add(new Reg0120());
        return obj;
    }

    private Reg0110 get0110() {
        Reg0110 obj = new Reg0110();
        obj.setReg0111(this.get0111());

        return obj;
    }

    private Reg0111 get0111() {
        Reg0111 obj = new Reg0111();
        return obj;
    }

    private List<Reg0100> get0100() {
        List<Reg0100> obj = new ArrayList<>();
        obj.add(new Reg0100());
        return obj;
    }

    private List<Reg0035> get0035() {
        List<Reg0035> obj = new ArrayList<>();
        obj.add(new Reg0035());
        return obj;
    }

    private Reg1001 get1001() {
        return null;
    }

    private RegP001 getP001() {
        return null;
    }

    private RegM001 getM001() {
        return null;
    }

    private RegI001 getI001() {
        return null;
    }

    private RegF001 getF001() {
        return null;
    }

    private RegD001 getD001() {
        return null;
    }

    private RegC001 getC001() {
        return null;
    }

    private RegA001 getA001(){
        return new RegA001();
    }
}
