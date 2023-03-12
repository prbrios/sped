package efd;

import efd.contribuicoes.bloco0.Reg0000;
import efd.contribuicoes.bloco0.n1.Reg0001;
import efd.contribuicoes.bloco0.n1.n2.*;
import efd.contribuicoes.bloco0.n1.n2.n3.*;
import efd.contribuicoes.bloco1.n1.Reg1001;
import efd.contribuicoes.blocoA.n1.RegA001;
import efd.contribuicoes.blocoC.n1.RegC001;
import efd.contribuicoes.blocoC.n1.n2.RegC010;
import efd.contribuicoes.blocoC.n1.n2.n3.RegC500;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC501;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC505;
import efd.contribuicoes.blocoD.n1.RegD001;
import efd.contribuicoes.blocoF.n1.RegF001;
import efd.contribuicoes.blocoI.n1.RegI001;
import efd.contribuicoes.blocoM.n1.RegM001;
import efd.contribuicoes.blocoP.n1.RegP001;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        
        Assert.assertTrue(true);

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

    	RegC505 regC505t = new RegC505(null, null, null, null, null, null, null);
    	
    	List<RegC505> regC505 = new ArrayList<RegC505>();
    	regC505.add(regC505t);
    	
    	List<RegC501> regC501 = new ArrayList<RegC501>();
    	regC501.add(new RegC501(null, null, null, null, null, null, null));
    	regC501.add(new RegC501(null, null, null, null, null, null, null));
    	regC501.add(new RegC501(null, null, null, null, null, null, null));
    	
    	RegC500 regC500t = new RegC500(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    	regC500t.setRegC501(regC501);
    	regC500t.setRegC505(regC505);
    	
    	List<RegC500> regC500 = new ArrayList<RegC500>();
    	regC500.add(regC500t);
    	
    	RegC010 regC010t = new RegC010(1L, "");
    	regC010t.setRegC500(regC500);
    	
    	List<RegC010> regC010 = new ArrayList<RegC010>();
    	regC010.add(regC010t);
    	
    	RegC001 regC001 = new RegC001("0");
    	regC001.setRegC010(regC010);
        return regC001;
    }

    private RegA001 getA001(){
        return new RegA001();
    }
}
