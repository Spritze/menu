import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        
        //HABILITANDO O TECLADO
        Scanner sc = new Scanner (System.in);
        
        //VARIÁVEIS
        int menu;
        char repete;
        int QtdSalgados=0, PrecoSalgados=0;
        int QtdDoces=0, PrecoDoces=0;
        int QtdBebidas=0, PrecoBebidas=0;
        int QtdTototal=0, PrecoTotal=0;
        int pagar=0;
                 
        System.out.println("------------- ");       
        System.out.println("Bar do Alex: ");
        System.out.println("------------- ");  
        

        do{
            System.out.println("[1]Salgados");       
            System.out.println("[2]Doces");
            System.out.println("[3]Bebidas");  
            
            System.out.print("Faça o seu pedido pelo número: ");  
            menu =  sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Pastel R$5,00 un.");
                    System.out.print("Informe a quantidade de salgados: ");
                    QtdSalgados = sc.nextInt();
                    PrecoSalgados = QtdSalgados * 5;
                    pagar = pagar + PrecoSalgados;
                    break;
                case 2:
                    System.out.println("Brigadeiro R$2,00 un.");
                    System.out.print("Informe a quantidade de doces: ");
                    QtdDoces = sc.nextInt();
                    PrecoDoces = QtdDoces * 2;
                    pagar = pagar + PrecoDoces;
                    break;
                case 3:
                    System.out.println("Refrigerante R$10,00 un.");
                    System.out.print("Informe a quantidade de bebidas: ");
                    QtdBebidas = sc.nextInt();
                    PrecoBebidas = QtdBebidas * 10;
                    pagar = pagar + PrecoBebidas;
                    break;
                                          
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("Deseja continuar? [s/n]");
            repete = sc.next().charAt(0) ;
        }
        while(repete == 'S' || repete== 's');
        System.out.println("Nome do produto | Quantidade | Preço ");
        if(PrecoSalgados>0)
        {
            System.out.println("Pastel R$5,00 un.\t"  + QtdSalgados + "\t" + PrecoSalgados );
        }
        if(PrecoDoces>0)
        {
            System.out.println("Brigadeiro R$2,00 un.\t"  + QtdDoces + "\t" + PrecoDoces );
        }
        if(PrecoBebidas>0)
        {
            System.out.println("Refrigerante R$10,00 un.\t"  + QtdBebidas + "\t" + PrecoBebidas);
        }
        System.out.println("Valor da compra: " + pagar);
        
        
            
         
            
       
    }
}
