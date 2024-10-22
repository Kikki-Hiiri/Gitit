public class Main {
    public static void main(String[] args) throws Exception {
    System.out.println("");
    System.out.println("");
    System.out.println("");



        int ika = 18;

        // Tulostusehdot
        
        if (ika >= 0 && ika < 18)
        
        {
        
        System.out.println("Olet alaikäinen");
            if (ika <= 16) {
                System.err.println("Saat ajaa mopoa");

            }

            if  (ika>= 16) {
                System.out.println("Saat ajaa kevaria");
            }
        }
        
        else if (ika >=65)
        
        {
        
        System.out.println("Olet eläkeläinen.");
            if (ika <=65) {
                System.out.println("hyviä eläkepäiviä");
            }
        }

        else if (ika <=18)

         {
            System.out.println("Onnea olet täysi-ikäinen ja saat ajaa autoa");
        }




        else 
        {
            System.out.println("Olet aikuinen");
           
            
        }

}
}
