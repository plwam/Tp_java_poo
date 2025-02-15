public class Institution {
    // les attributs
    protected  String nom_institution;
    protected  String pays_instiution;
    protected  String type_institution;
    protected  int annee_creation;
    // les constructeurs
    //-------le constructeur par defaut  */
    public Institution(){
        nom_institution=" ********";
        pays_instiution=" ********";
        type_institution=" ********";
        annee_creation=0;
    }
        //-------le constructeur avec parametres---  */
    public Institution(String nom_i,String pays_i,String type_i,int year_i){
        nom_institution=nom_i;
        pays_instiution=pays_i;
        type_institution=type_i;
        annee_creation=year_i;
        }        
        // damn now we can configure getters and setters hahahaha
        //----getters ----- ju thu bi bane bien
        public String getNom_institution(){
            return nom_institution;
        }
        public String getPays_instiution(){
            return pays_instiution;
        }
        public String getType_institution(){
            return type_institution;
        }
        public int getAnnee_creation(){
            return annee_creation;
        }
        //----setters ----- you broke my heart then i can change you hahahahhhah goumin
        public void   setNom_institution(String nom_i){
             nom_institution=nom_i;
        }
        public void   setPays_instiution(String pays_i){
             pays_instiution=pays_i;
        }
        public void   setType_institution(String type_i){
             type_institution=type_i;
        }
        public void   setAnnee_creation(int year_i){
             annee_creation=year_i;
        }
        // end of getters and setters my bad brooooooooooo

        // asha tu create les methodes instances 
        //--- how olde are you dear institution ------------- uko na miaka mingapi hahahaha
        public int myAge (){
            int actu_year=2025;
            int age=actu_year-annee_creation;
            return age;
        }
        // who are you ? let create the description methodes
        public String description(){
            String i_am=" l'intitution "+nom_institution+"  ,localisée en "+pays_instiution+" est une institution "+
            type_institution+" qui a débuté "+annee_creation+" maintenant elle est agée de "+myAge()+" ans"  ;
            return i_am;
        }
        // find de la classe mere thanks for all your efforts arigato

}
/* my dear let continue cause goumin it's hard damn 
 * you must tell you , it hurts to much to love and after cryyyyyyyyyyyyyyyyyyy hahaha
 */
