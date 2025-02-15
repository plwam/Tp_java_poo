public class App {

    //NB:Don't make Lucide Dreams stand up and do your best , overtake your limits
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Programmation orienté object");
        Institution java_institutione= new Institution("JS-institution","RDC","public",2023);
        System.out.println();
        System.out.println("voici une INSTITUTION \n"+java_institutione.description());
        System.out.println();

        Universite ulpgl =new Universite("ULPG","RDC","public",2004,"LMD",6,"prof WASO");
        System.out.println("voici une UNIVERSITE \n"+ulpgl.decri_univ());
        System.out.println();

        Ecole kautaa =new Ecole("KAUTAA","RDC","public",2004,"Primaire",6,"prof WASO");
        System.out.println("voici une ECOLE \n"+kautaa.decri_ecole());
        System.out.println();

 
        //les methodes d'instances
        System.out.println("********les methodes*******");

            // pour trouver les nom des recteurs 
        Universite univ_finder_recteurs = new Universite();
        Universite univ_Universite1 =new Universite("UNIVERSITE 1 "," RDC "," public ",2004," LMD ",6," RECTEUR 1");
        Universite univ_Universite2 =new Universite("UNIVERSITE 2 "," RDC "," public ",2004," CLASSIQUE ",6," RECTEUR 2 ");
        univ_finder_recteurs.find_recteurs(univ_Universite1, univ_Universite2);
        System.out.println();

            // pour trouver le 3 promoteurs 
            System.out.println("********les methodes*******");
            Ecole ecole_finder_promoteurs =new Ecole();
            Ecole ecole1 =new Ecole("ecole1","RDC","public",2004," Primaire ",6," promoteur1");
            Ecole ecole2 =new Ecole("ecole2","RDC","public",2004," secondaire",6," promoteur2");
            Ecole ecole3 =new Ecole("ecole3","RDC","privée",2004," Primaire ",6," promoteur3");
            ecole_finder_promoteurs.find_promoteurs(ecole1, ecole2, ecole3);
    }
    // tp esili ohhh thanks for your participation 

}
/* love is hard 
 * life is hard 
 * world is had 
 * you are hard
 * just follow the waves 
 * maybe one day you'll be more than the happiest
 * you must work hardly ,do your best for realise your dreams 
 */
