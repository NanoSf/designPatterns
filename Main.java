import behavioral.chainofresponsability.Tarjeta;
import behavioral.command.CreditCardInvoke;
import behavioral.command.Commands.CreditCard;
import behavioral.command.Commands.CardCommand.CreditCardActivateCommand;
import behavioral.interpreter.Expression;
import behavioral.interpreter.ExpresionesNoTerminal.AndExpression;
import behavioral.interpreter.ExpresionesNoTerminal.OrExpression;
import behavioral.interpreter.ExpresionesTerminales.TerminalExpression;
import behavioral.iterator.CardList;
import behavioral.iterator.Iterator;
import behavioral.iterator.List;
import behavioral.mediator.ConcreteMediator;
import behavioral.mediator.ColleagePack.ConcreteCollege1;
import behavioral.mediator.ColleagePack.ConcreteCollege2;
import behavioral.memento.Article;
import behavioral.memento.mementoPacage.ArticuleMemento;
import behavioral.memento.mementoPacage.Carataker;
import behavioral.observer.Semaforo;
import behavioral.observer.ManagerSusciptor.MessajePublisher;
import behavioral.observer.Suscriptores.Coche;
import behavioral.observer.Suscriptores.Peaton;
import behavioral.state.MobileAlertSteteContex;
import behavioral.state.estados.Silent;
import behavioral.state.estados.Vibration;
import behavioral.strategy.Context;
import behavioral.strategy.Strategy.CapitalStrategyTestFormatter;
import behavioral.strategy.Strategy.LowerStrategyTestFormatter;
import behavioral.templateMethod.Paypal;
import behavioral.templateMethod.Visa;
import behavioral.visitor.elements.OfertaGasolina;
import behavioral.visitor.elements.OfertaVuelos;
import behavioral.visitor.elements.interfaces.OfertaElement;
import behavioral.visitor.visitor.BlackCreditCardVisitor;
import behavioral.visitor.visitor.ClassicCreditCardVisitor;
import creational.abstractFactory.AbstarctFactory;
import creational.abstractFactory.FactoryProvider;
import creational.abstractFactory.PayForFactory.interfaceFactory.PaymentMethod;
import creational.abstractFactory.TarjetFactory.interfaceFactory.Card;
import creational.builder.CardCardBuilder;
import creational.builder.Persona;
import creational.builder.PersonaBuilder;
import creational.builder.PersonaBuilderMenor;
import creational.factorymethod.Payment;
import creational.factorymethod.PaymentFactory;
import creational.factorymethod.TypePayment;
import creational.prototype.PrototypeFactory;
import creational.prototype.ClassPrototype.interfaces.PrototypeCard;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Random;
import structural.bridge.creditCard.SecureCreditCard;
import structural.bridge.creditCard.UnsecureCreditCard;
import structural.bridge.creditCardAdapter.ClassicCreditCard;
import structural.composite.Composite.CuentaComposite;
import structural.composite.Cuenta.CuentaAhorro;
import structural.composite.Cuenta.CuentaComponente;
import structural.composite.Cuenta.CuentaCorriente;
import structural.decorator.ClasesIniciales.Black;
import structural.decorator.ClasesIniciales.Credit;
import structural.decorator.ClasesIniciales.Gold;
import structural.decorator.NuevasFuncionabilidades.InternationalPayment;
import structural.decorator.NuevasFuncionabilidades.SecureDecorator;
import structural.facade.CreditMarker;
import structural.flyweight.EnemyFactory;
import structural.flyweight.Enemigos.interfaces.Enemy;
import structural.proxy.ProxyInternet;

public class Main {
   private static final String[] enemyType = new String[]{"Private", "Detective"};
   private static final String[] weapon = new String[]{"Fusil", "Revolver", "Pistola", "Metralleta", "Lanza Granadas", "9mm"};

   public static void main(String[] args) {
      System.out.println("##################CREACIONALES##################");
      System.out.println("---------Factory Method---------");
      probarFactoryMethod();
      System.out.println("---------Abstract Factory---------");
      probarAbstractFactory();
      System.out.println("---------Builder---------");
      probarBuilder();
      System.out.println("---------Prototype---------");
      probarPrototype();
      System.out.println("---------Singleton---------");
      probarSingleton();
      System.out.println("##################COMPORTAMIENTO##################");
      System.out.println("---------ChainOfResponsability---------");
      probarChainOfResponsability();
      System.out.println("---------Command---------");
      probarCommand();
      System.out.println("---------Iterator---------");
      probarIterator();
      System.out.println("---------Mediator---------");
      probarMediator();
      System.out.println("---------Memento---------");
      probarMemento();
      System.out.println("---------Observer---------");
      probarObserver();
      System.out.println("---------State---------");
      probarState();
      System.out.println("---------Interpreter---------");
      probarInterpreter();
      System.out.println("---------Strategy---------");
      probarStrategy();
      System.out.println("---------Template Method---------");
      probarTemplateMethod();
      System.out.println("---------Visitor---------");
      probarVisitor();
      System.out.println("##################ESTRUCTURALES##################");
      System.out.println("---------Adapter---------");
      probarAdapter();
      System.out.println("---------Bridge---------");
      probarBridge();
      System.out.println("---------Composite---------");
      probarComposite();
      System.out.println("---------Decorator---------");
      probarDecorator();
      System.out.println("---------Facade---------");
      probarFacade();
      System.out.println("---------Flyweight---------");
      probarFlyweight();
      System.out.println("---------Proxy---------");
      probarProxy();
   }

   private static void probarFactoryMethod() {
      Payment payment = PaymentFactory.buildPayment(TypePayment.GOOGLEPAY);
      payment.doPayment();
      Payment paymentTwo = PaymentFactory.buildPayment(TypePayment.CARD);
      paymentTwo.doPayment();
   }

   private static void probarAbstractFactory() {
      AbstarctFactory abstarctFactory = FactoryProvider.getFactory("Card");
      Card cardVisa = (Card)abstarctFactory.create("VISA");
      AbstarctFactory abstarctFactoryTwo = FactoryProvider.getFactory("PaymentMehtod");
      PaymentMethod paymentCredito = (PaymentMethod)abstarctFactoryTwo.create("CREDIT");
      PrintStream var10000 = System.out;
      String var10001 = cardVisa.getCardType();
      var10000.println("Una tarjeta de tipo: " + var10001 + " con el medio de pago: " + paymentCredito.doPay() + " " + paymentCredito.doMenssaje() + " " + cardVisa.getCardNumber());
      Card cardMasterCard = (Card)abstarctFactory.create("MASTERCARD");
      PaymentMethod paymentDebito = (PaymentMethod)abstarctFactoryTwo.create("DEBIT");
      var10000 = System.out;
      var10001 = cardMasterCard.getCardType();
      var10000.println("Una tarjeta de tipo: " + var10001 + " con el medio de pago: " + paymentDebito.doPay() + " " + paymentDebito.doMenssaje() + " " + cardMasterCard.getCardNumber());
   }

   private static void probarBuilder() {
      creational.builder.Card card = (new CardCardBuilder("VISA", "0000 0000 0000 0000")).name("Einer Aponte").expires(2030).credit(false).build();
      creational.builder.Card card2 = (new CardCardBuilder("MASTERCARD", "1111 1111 1111 1111")).build();
      System.out.println(card);
      System.out.println(card2);
      System.out.println("USAR CLASE PERSONAS");
      Persona persona = (new PersonaBuilder("Einer", "Aponte")).segundoApellido("Cubides").mayor(24).numeroDocumento("1048851401").tipoDocumento("CC").build();
      Persona personaMenor = (new PersonaBuilder("Jacabo", "Gomez")).menor(4).fechaNacimiento(LocalDate.now()).sexo("masculino").build();
      System.out.println(persona.toString());
      System.out.println(personaMenor.toString());
   }

   private static void probarPrototype() {
      PrototypeFactory.loadCard();

      try {
         PrototypeCard visa = PrototypeFactory.getInstance("VISA");
         visa.getCard();
         PrototypeCard amex = PrototypeFactory.getInstance("AMEX");
         amex.getCard();
      } catch (CloneNotSupportedException var2) {
         System.out.println("Error: " + var2);
      }

   }

   private static void probarSingleton() {
      creational.singleton.Card card = creational.singleton.Card.getINSTANCE();
      card.setCardNumber("1234-5412-7896");
      creational.singleton.Card card2 = creational.singleton.Card.getINSTANCE();
      creational.singleton.Card card3 = creational.singleton.Card.getINSTANCE();
      PrintStream var10000 = System.out;
      String var10001 = card.getCardNumber();
      var10000.println("Number: " + var10001 + " HashCode: " + card.hashCode());
      var10000 = System.out;
      var10001 = card2.getCardNumber();
      var10000.println("Number: " + var10001 + " HashCode: " + card2.hashCode());
      var10000 = System.out;
      var10001 = card3.getCardNumber();
      var10000.println("Number: " + var10001 + " HashCode: " + card3.hashCode());
   }

   private static void probarChainOfResponsability() {
      Tarjeta tarjeta = new Tarjeta();
      tarjeta.credidCardRequest(20000);
   }

   private static void probarCommand() {
      CreditCard creditCard = new CreditCard();
      CreditCard creditCardDesactivate = new CreditCard();
      CreditCardInvoke cardInvoke = new CreditCardInvoke();
      cardInvoke.setCommand(new CreditCardActivateCommand(creditCard));
      cardInvoke.run();
      System.out.println("----------------------------------");
      cardInvoke.setCommand(new CreditCardActivateCommand(creditCardDesactivate));
      cardInvoke.run();
   }

   private static void probarIterator() {
      behavioral.iterator.Card[] cards = new behavioral.iterator.Card[]{new behavioral.iterator.Card("VISA"), new behavioral.iterator.Card("AMEX"), new behavioral.iterator.Card("MASTER CARD"), new behavioral.iterator.Card("GOOGLE CARD"), new behavioral.iterator.Card("APPLE CARD")};
      List lista = new CardList(cards);
      Iterator iterator = lista.iterator();

      while(iterator.hasNext()) {
         behavioral.iterator.Card tarjeta = (behavioral.iterator.Card)iterator.next();
         System.out.println(tarjeta.getType());
      }

   }

   private static void probarMediator() {
      ConcreteMediator mediator = new ConcreteMediator();
      ConcreteCollege1 user1 = new ConcreteCollege1(mediator);
      ConcreteCollege2 user2 = new ConcreteCollege2(mediator);
      mediator.setUser1(user1);
      mediator.setUser2(user2);
      user1.send("Hola soy el user numero uno");
      user2.send("Hola user uno soy user dos");
   }

   private static void probarMemento() {
      Carataker carataker = new Carataker();
      Article article = new Article("Einer", "Memento es una peli");
      article.setTexto(article.getTexto() + " de Pixar");
      System.out.println(article.getTexto());
      carataker.addMemento(article.createMemento());
      article.setTexto(article.getTexto() + " protagonizada por el bartolito ");
      System.out.println(article.getTexto());
      carataker.addMemento(article.createMemento());
      article.setTexto(article.getTexto() + " y san son el perro nalgon ");
      System.out.println(article.getTexto());
      ArticuleMemento mementoUno = carataker.getMemento(0);
      ArticuleMemento mementoDos = carataker.getMemento(1);
      System.out.println("-----------Restaurando a memento inicial-----------");
      article.restoreMemento(mementoUno);
      System.out.println(article.getTexto());
      System.out.println("-----------Restaurando a segundo memento-----------");
      article.restoreMemento(mementoDos);
      System.out.println(article.getTexto());
   }

   private static void probarObserver() {
      Coche coche = new Coche();
      Peaton peaton = new Peaton();
      MessajePublisher messajePublisher = new MessajePublisher();
      messajePublisher.attach(coche);
      messajePublisher.attach(peaton);
      messajePublisher.notifyUpdate(new Semaforo("ROJO_COCHE"));

      try {
         Thread.sleep(1000L);
      } catch (Exception var4) {
         System.out.println("ERROR: " + var4);
      }

      messajePublisher.notifyUpdate(new Semaforo("VERDE_COCHE"));
   }

   private static void probarState() {
      MobileAlertSteteContex context = new MobileAlertSteteContex();
      context.alert();
      context.alert();
      context.setState(new Vibration());
      context.alert();
      context.alert();
      context.setState(new Silent());
      context.alert();
      context.alert();
   }

   private static void probarInterpreter() {
      Expression cero = new TerminalExpression("0");
      Expression uno = new TerminalExpression("1");
      Expression conteinBoolean = new OrExpression(cero, uno);
      Expression conteinOnAndCero = new AndExpression(cero, uno);
      System.out.println(conteinBoolean.interpret("cero"));
      System.out.println(conteinBoolean.interpret("0"));
      System.out.println(conteinOnAndCero.interpret("0"));
      System.out.println(conteinOnAndCero.interpret("0,1"));
   }

   private static void probarStrategy() {
      Context context = new Context(new CapitalStrategyTestFormatter());
      context.publishText("Este texto sera converitido a MAYUSCULAS a traves del algoritmo");
      context.modificarEstrategia(new LowerStrategyTestFormatter());
      context.publishText("ESTE TEXTO SERA CONVERTIDO A minusculas A TRAVES DEL ALGORITMO");
   }

   private static void probarTemplateMethod() {
      behavioral.templateMethod.Payment payment = new Visa();
      payment.makePayment();
      System.out.println("Modificando a pago con Paypal");
      behavioral.templateMethod.Payment paymentDos = new Paypal();
      paymentDos.makePayment();
   }

   private static void probarVisitor() {
      OfertaElement ofertaElement = new OfertaGasolina();
      ofertaElement.accept(new BlackCreditCardVisitor());
      OfertaElement ofertaElementDos = new OfertaVuelos();
      ofertaElementDos.accept(new ClassicCreditCardVisitor());
   }

   private static void probarAdapter() {
      structural.adapter.ClassAdapter.CreditCard card = new structural.adapter.ClassAdapter.CreditCard();
      card.pay("classic");
      card.pay("gold");
      card.pay("black");
      card.pay("silver");
   }

   private static void probarBridge() {
      structural.bridge.creditCardAdapter.CreditCard classic = new ClassicCreditCard(new UnsecureCreditCard());
      classic.realizarPago();
      classic = new ClassicCreditCard(new SecureCreditCard());
      classic.realizarPago();
   }

   private static void probarComposite() {
      CuentaComponente cuentaCorriente = new CuentaCorriente(50000.0D, "Einer");
      CuentaComponente cuentaAhorro = new CuentaAhorro(60000.0D, "Fabian");
      CuentaComposite cuentaComposite = new CuentaComposite();
      cuentaComposite.addCuenta(cuentaCorriente);
      cuentaComposite.addCuenta(cuentaAhorro);
      cuentaComposite.showAccountName();
      cuentaComposite.getAmount();
   }

   private static void probarDecorator() {
      Credit gold = new Gold();
      Credit blackInternationalPayment = new Black();
      blackInternationalPayment = new InternationalPayment(blackInternationalPayment);
      Credit goldSecureInternational = new Gold();
      goldSecureInternational = new InternationalPayment(goldSecureInternational);
      goldSecureInternational = new SecureDecorator(goldSecureInternational);
      System.out.println("------Tarjeta Golf con configuracion------");
      gold.showCredit();
      System.out.println("------Tarjeta Black con configuracion------");
      blackInternationalPayment.showCredit();
      System.out.println("------Tarjeta Golf2 con configuracion------");
      goldSecureInternational.showCredit();
   }

   private static void probarFacade() {
      CreditMarker creditMarker = new CreditMarker();
      creditMarker.showCreditBlack();
      creditMarker.showCreditGold();
      creditMarker.showCreditSilver();
   }

   private static void probarFlyweight() {
      for(int i = 0; i < 15; ++i) {
         Enemy enemy = EnemyFactory.getEnemy(getRandomEnemyType());
         enemy.setWeapont(getRandomWeapon());
         enemy.lifePoints();
      }

   }

   private static String getRandomEnemyType() {
      Random r = new Random();
      int randInt = r.nextInt(enemyType.length);
      return enemyType[randInt];
   }

   private static String getRandomWeapon() {
      Random r = new Random();
      int randInt = r.nextInt(weapon.length);
      return weapon[randInt];
   }

   private static void probarProxy() {
      ProxyInternet internet = new ProxyInternet();

      try {
         internet.connectTo("udemy.com");
         internet.connectTo("facebook.com");
      } catch (Exception var2) {
         System.out.println("ERROR EN PROXY: " + var2.getMessage());
      }

   }
}
