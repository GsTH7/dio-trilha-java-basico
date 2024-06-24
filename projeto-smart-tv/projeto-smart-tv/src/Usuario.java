public class Usuario {
    
    public static void main(String[] args) throws Exception {
        
        SmartTV tv = new SmartTV();

        System.out.println("TV Ligada? " + tv.ligada);
        System.out.println("Canal atual: " + tv.canal);
        System.out.println("Volume atual: " + tv.volume);

        tv.ligar();

        System.out.println("TV Ligada? " + tv.ligada);

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();

        System.out.println("Volume: " + tv.volume);

        tv.mudarCanal(17);

        System.out.println("Canal atual: " + tv.canal);

        tv.desligar();

        System.out.println("TV Ligada? " + tv.ligada);

    }

}
