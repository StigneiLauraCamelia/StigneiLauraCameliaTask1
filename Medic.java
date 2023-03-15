
package com.mycompany.task1stigneilauracamelia;

import java.util.ArrayList;
import java.util.Scanner;


public class Medic {
    String NumeMedic;
    int IdMedic, IdSpecializare;
    ArrayList< Specializare> specializare;
    
    
    
    void medic_nou(){
            Scanner input = new Scanner(System.in);
            System.out.print("IdMedic:-");
            IdMedic = input.nextInt();
            System.out.print("Nume Medic:-");
            NumeMedic = input.nextLine();
            System.out.print("IdSpecializare[1.Andrologie;2.Cardiologie]:-");
            IdSpecializare = input.nextInt();
      }
       void info_medic()
    {
        System.out.println(IdMedic + "\t" + NumeMedic + "\t" + IdSpecializare);
    }
    
    
    
    
     public Medic(){
          this.IdMedic = 0;
          this.NumeMedic = "";
          this.specializare = new ArrayList<>();
     }
       public Medic(int IdMedic,String NumeMedic, ArrayList< Specializare> specializare){
          this.IdMedic = IdMedic;
          this.NumeMedic = NumeMedic;
          this.specializare = specializare;
        
      }

    public String getNumeMedic() {
        return NumeMedic;
    }

    public void setNumeMedic(String NumeMedic) {
        this.NumeMedic = NumeMedic;
    }

    public int getIdMedic() {
        return IdMedic;
    }

    public void setIdMedic(int IdMedic) {
        this.IdMedic = IdMedic;
    }

    public ArrayList<Specializare> getSpecializare() {
        return specializare;
    }

    public void setSpecializare(ArrayList<Specializare> specializare) {
        this.specializare = specializare;
    }

    @Override
    public String toString() {
        return "Medic{" + "NumeMedic=" + NumeMedic + ", IdMedic=" + IdMedic + ", specializare=" + specializare + '}';
    }
       
}
