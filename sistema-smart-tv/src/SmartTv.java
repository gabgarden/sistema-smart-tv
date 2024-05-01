public class SmartTv 
{


    // ATRIBUTOS

    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    // MÉTODOS

    public void ligar()
    {
        ligada = true;   
    }

    public void desligar()
    {
        ligada = false;
    }

    public void aumentarVolume()
    {
        volume++;

        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume()
    {
        volume--;

        System.out.println("Diminuindo o volume para: " + volume);
    }
   
    public void aumentarCanal()
    {
        canal++;

        System.out.println("Indo para o canal " + canal);
    }

    public void diminuirCanal()
    {
        canal--;

        System.out.println("Indo para o canal " + canal);
    }

    public void mudarCanal(int canalDesejado)
    {
        canal = canalDesejado;

        System.out.println("Indo para o canal " + canal);
    }
    
}
