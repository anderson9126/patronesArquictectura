package patronesarquitectura;

import java.math.BigDecimal;
import patronesarquitectura.Responsability.Coordinador;
import patronesarquitectura.Responsability.Director;
import patronesarquitectura.Responsability.Gerente;
import patronesarquitectura.Responsability.ICliente;
import patronesarquitectura.Responsability.NivelAutoriza;
import patronesarquitectura.Responsability.Permiso;
import patronesarquitectura.Responsability.Presidente;
import patronesarquitectura.Responsability.Viceprecidente;
import patronesarquitectura.adapter.BatmanAdapter;
import patronesarquitectura.adapter.CarrozaAdapter;
import patronesarquitectura.adapter.IAutomovil;
import patronesarquitectura.adapter.PicaPiedraAdapter;
import patronesarquitectura.adapter.TricicloAdapter;
import patronesarquitectura.adapter.VehiculoNormal;
import patronesarquitectura.composite.Housing;
import patronesarquitectura.composite.IStructure;
import patronesarquitectura.composite.Room;
import patronesarquitectura.decorator.AdWebPageDecoratator;
import patronesarquitectura.decorator.AuthenticateWebPageDecorator;
import patronesarquitectura.decorator.AuthorizedWebPageDecoratator;
import patronesarquitectura.decorator.BasicWebPage;
import patronesarquitectura.decorator.FooterWebPageDecoratator;
import patronesarquitectura.decorator.HeadWebPageDecoratator;
import patronesarquitectura.decorator.IWebPage;
import patronesarquitectura.decorator.MenuWebPageDecoratator;
import patronesarquitectura.factory.BudgetKnifeStrore;
import patronesarquitectura.factory.FamilyKnifeStrore;
import patronesarquitectura.factory.Knife;
import patronesarquitectura.factory.KnifeStore;
import patronesarquitectura.factory.QualityKnifeStrore;
import patronesarquitectura.fachada.BankService;
import patronesarquitectura.singleton.TareaSingleton;
import patronesarquitectura.state.VendingMachine;
import patronesarquitectura.template.PastaDish;
import patronesarquitectura.template.SpaghettiBolognesa;

public class PatronesArquitecturaMain {

    public static void main(String[] args) {

        /*bloque singleton*/
//        TareaSingleton prueba1 = new TareaSingleton();
//        prueba1.pruebas("Conexion 1");
//        TareaSingleton prueba2 = TareaSingleton.getInstance();
//        prueba2.pruebas("Conexion 2");
//
//        TareaSingleton prueba3 = TareaSingleton.getInstance();
//        prueba3.pruebas("Conexion 3");

        /*FIN bloque singleton*/

 /*bloque factory*/
//        KnifeStore budget = new BudgetKnifeStrore();
//        KnifeStore family = new FamilyKnifeStrore();
//        KnifeStore quality = new QualityKnifeStrore();
//
//        Knife k1 = budget.orderKnife("chef");
//        Knife k2 = budget.orderKnife("steak");
////
//        Knife k3 = family.orderKnife("bread");
//        Knife k4 = family.orderKnife("paring");
//
//        Knife k5 = quality.orderKnife("paring");
//        Knife k6 = quality.orderKnife("chef");
        /*FIN bloque factory*/

 /*bloque Fachada*/
//        BankService myBankService = new BankService();
//        int mySaving = myBankService.createNewAccount("chequing", 2111);
//        int mySaving2 = myBankService.createNewAccount("saving", 333);
//        myBankService.depositarDinero(1, 100);
//        myBankService.depositarDinero(2, 300);
//        myBankService.retiroDinero(1, 999);
//        myBankService.retiroDinero(2, 555);
//        System.out.println("aca esta el numero de cuenta: "+mySaving);
//        System.out.println("aca esta el numero de cuenta: "+mySaving2);

        /*FIN bloque Fachada*/

 /*bloque Adapter*/
//        IAutomovil vehiculo;
//        vehiculo = new BatmanAdapter();
////        vehiculo = new CarrozaAdapter();
////        vehiculo = new PicaPiedraAdapter();
////        vehiculo = new TricicloAdapter();
//        vehiculo.acelerar();
//        vehiculo.frenar();

        /*FIN bloque Adapter*/

 /* bloque Composite*/
//        Housing building = new Housing("calle 123");
//        Housing floor1 = new Housing("calle 123 - piso 1");
//        int firstFloor = building.addStructure(floor1);
//
//        Room bano1men = new Room("piso 1 baño men");
//        Room bano1w = new Room("piso 1 baño women");
//        Room comun = new Room("piso 1 area comun");
//
//        int primerPisoMens = floor1.addStructure(bano1men);
//        int primerPisoWomn = floor1.addStructure(bano1w);
//        int primerComun = floor1.addStructure(comun);
//
//        building.enter();
//        System.out.println("---------");
//        Housing currentFloor = (Housing) building.getStructure(firstFloor);
//        currentFloor.location();
//        currentFloor.enter();
//        currentFloor.exit();
//        System.out.println("---------");
//        Room currentRoom = (Room) currentFloor.getStructure(primerPisoMens);
//        currentRoom.location();
//        currentRoom.enter();
//        currentRoom.exit();
//        System.out.println("---------");
//        currentRoom = (Room) currentFloor.getStructure(primerComun);
//        currentRoom.location();
//        currentRoom.enter();
//        currentRoom.exit();
//        System.out.println("---------");
        /* FIN  bloque Composite*/

 /* bloque Decorator*/
//        IWebPage page1 = new BasicWebPage();
//        page1 = new AuthorizedWebPageDecoratator(page1);
//        page1 = new AuthenticateWebPageDecorator(page1);
//        page1 = new HeadWebPageDecoratator(page1);
//        page1 = new MenuWebPageDecoratator(page1);
//        page1 = new FooterWebPageDecoratator(page1);
//        page1 = new AdWebPageDecoratator(page1);
//        page1.display();
//
//        System.out.println("------------------------------------");
//
//        IWebPage page2 = new BasicWebPage();
//        page2 = new AuthorizedWebPageDecoratator(page2);
//        page2 = new HeadWebPageDecoratator(page2);
//        page2 = new FooterWebPageDecoratator(page2);
//        page2 = new AdWebPageDecoratator(page2);
//        page2.display();
//
//        System.out.println("------------------------------------");
//        IWebPage page3 = new BasicWebPage();
//        page3 = new HeadWebPageDecoratator(page3);
//        page3 = new MenuWebPageDecoratator(page3);
//        page3 = new FooterWebPageDecoratator(page3);
//        page3.display();
        /* FIN  bloque Decorator*/

 /* bloque Responsability*/
//        PatronesArquitecturaMain inicia = new PatronesArquitecturaMain();
//        inicia.flujoNormal(1);
//        System.out.println("------------------------------------");
//        inicia.flujoEspecial(6);
//        /* FIN  bloque Responsability*/

 /* bloque Stata*/
        VendingMachine vemachine = new VendingMachine(3);
        vemachine.dispense();
        vemachine.ejectMoney();
        vemachine.insertDollar();
        vemachine.dispense();
        vemachine.ejectMoney();
        vemachine.insertDollar();
        vemachine.insertDollar();
        vemachine.insertDollar();
        vemachine.ejectMoney();
        vemachine.ejectMoney();
        vemachine.ejectMoney();
        vemachine.ejectMoney();

        /* Fin bloque Stata*/
    }

    private void flujoNormal(int dias) {
        NivelAutoriza coordi = new Coordinador();
        NivelAutoriza director = new Director();
        NivelAutoriza gerente = new Gerente();
        NivelAutoriza presi = new Presidente();
        coordi.setSuccessor(director);
        director.setSuccessor(gerente);
        gerente.setSuccessor(presi);
        ICliente cli = coordi;
        cli.procesaSolicitud(new Permiso(dias, "permiso"));
    }

    private void flujoEspecial(int dias) {
        NivelAutoriza vice = new Viceprecidente();
        NivelAutoriza presi = new Presidente();
        vice.setSuccessor(presi);
        ICliente cli = vice;
        cli.procesaSolicitud(new Permiso(dias, "permiso"));
    }
}
