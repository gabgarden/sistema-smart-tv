public class Usuario 
{
    public static void main(String[] args) throws Exception 
    {


        SmartTv smartTv = new SmartTv();
        System.out.println("------------");
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        System.out.println("------------");


        System.out.println("Digamos que às  8 horas de uma manhã chuvosa, a TV foi ligada...");

        smartTv.ligar();

        System.out.println("------------");
        System.out.println("Novo Status");
        System.out.println("------------");
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("------------");
        System.out.println(" ");
        System.out.println("Porra mané, que TV baixa...");
        System.out.println("------------");

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.diminuirVolume();

        System.out.println("------------");
        System.out.println("Novo Status");
        System.out.println("------------");
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);


        System.out.println("------------");

        System.out.println("Canal passando leilão de boi é sacanagem...");
        System.out.println("------------");

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        System.out.println("------------");
        System.out.println("Nada presta, que saco.");

        smartTv.diminuirCanal();

        System.out.println("------------");
        System.out.println("Qual o canal que passa South Park mané???");

        smartTv.mudarCanal(42);



    }
}
