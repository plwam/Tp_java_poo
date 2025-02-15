public class Ecole extends  Institution  {
     // les attributs propres 
     private String type_ecole;
     private int nombre_classe;
     private String nom_promoteur;
     //constructeur par defaut . kijenga "par defaut jo nini en swahili hhaah"
     public Ecole(){
         super(); // tuna ita constructeur par defaut ya mama yake
         type_ecole="******";
         nombre_classe=0;
         nom_promoteur="*****";
     }
     //constructeur d'initialisation ----------------------------------
     public Ecole(String nom_i,String pays_i,String type_i,int year_i,String T_eco,int nbre_cla, String promoteur){
         super(nom_i,pays_i,type_i,year_i);
         type_ecole=T_eco;
         nombre_classe=nbre_cla;
         nom_promoteur=promoteur;
     }
     // damn now we can configure getters and setters hahahaha
         //----getters ----- ju thu bi bane bien
         public String getType_ecole(){
             return type_ecole;
         }
         public int getNombre_classe(){
             return nombre_classe;
         }
         public String getNom_promoteur(){
             return nom_promoteur;
         }
         //----setters--- damn i'm tired fohh uuooff still holdng on 
         public void setType_ecole(String T_eco){
                type_ecole=T_eco;
        }
         public void setNom_promoteur(int nbre_cla)   {
            nombre_classe=nbre_cla;
        }

         public void setNom_promoteur(String promoteur){
            nom_promoteur=promoteur;
        }
     //tena ma methodes hahaha  aseme methodes instances hahahahahaah:
         //methode description -- weye jo nani hhaahah ji tangaze
     public String decri_ecole(){
         String i_m_ecole=super.description()+". \n "+getNom_institution()+"est une Ecole "
         +type_ecole+"et comprend "+nombre_classe+"classes"+"elle est leadé par le promoteur "+nom_promoteur;
         return i_m_ecole;
     }
         //methode pour savoir les noms des promoteurs de 3 Ecole passées en parametre 
     public void  find_promoteurs(Ecole ecole_1,Ecole ecole_2,Ecole ecole_3){
         System.out.println("le promoteur de l'ecole "+ecole_1.nom_institution+" est "+ecole_1.nom_promoteur);
         System.out.println("le promoteur de l'ecole "+ecole_2.nom_institution+" est "+ecole_2.nom_promoteur);
         System.out.println("le promoteur de l'ecole "+ecole_3.nom_institution+" est "+ecole_3.nom_promoteur);
     } 
}
