public class Universite extends  Institution {
    // les attributs propres 
    private String system_ens;
    private int nombre_fac;
    private String nom_recteur;
    //constructeur par defaut . kijnga "par defaut jo nini en swahili hhaah"
    public Universite(){
        super(); // tuna ita constructeur par defaut ya mama yake
        system_ens="******";
        nombre_fac=0;
        nom_recteur="*****";
    }
    //constructeur d'initialisation ----------------------------------
    public Universite(String nom_i,String pays_i,String type_i,int year_i,String S_ens,int nbre_f, String recteur){
        super(nom_i,pays_i,type_i,year_i);
        system_ens=S_ens;
        nombre_fac=nbre_f;
        nom_recteur=recteur;
    }
    // damn now we can configure getters and setters hahahaha
        //----getters ----- ju thu bi bane bien
        public String getSystem_ens(){
            return system_ens;
        }
        public int getNombre_fac(){
            return nombre_fac;
        }
        public String getNom_recteur(){
            return nom_recteur;
        }
        //----setters--- damn i'm tired ohh uuoofff
        public void setSystem_ens(String S_ens){
            system_ens= S_ens;
        }
        public void setNombre_fac(int nbre_f)   {
            nombre_fac=nbre_f;
        }
        public void setNom_recteur(String recteur){
            nom_recteur=recteur;
        }
    //tena ma methodes hahaha  aseme methodes instances hahahahahaah:

        //methode description -- weye jo nani hhaahah ji tangaze
    public String decri_univ(){
        String i_m_univ=super.description()+" . \n "+getNom_institution()+" est une Université pratiquant le systéme d'enseignement "
        +system_ens+" et qui comprend  "+nombre_fac+" facultés"+"elle est leadé par le recteur "+nom_recteur;
        return i_m_univ;
    }
        //methode pour savoir les noms des recteurs de 2 Université passées en parametre 
    public void  find_recteurs(Universite univ_1,Universite univ_2){
        System.out.println("le Recteur de l'université "+univ_1.nom_institution+" est "+univ_1.nom_recteur);
        System.out.println("le Recteur de l'université "+univ_2.nom_institution+" est "+univ_2.nom_recteur);

    } 

// i think we done this so thanks God 
// you ate the Dj so this again 
}
/* i'm hard to love   Rosé blackpink (APT,toxic till the end ....) .
 * time doesn't hear if you ask it to wait 
 */
