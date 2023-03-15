
package com.mycompany.task1stigneilauracamelia;

import java.util.ArrayList;
import java.util.Scanner;

public class Programare {
      String NumePacient,PrenumePacient, Sex, Email, TipProgramare;
      int IdProgramare,NrTelefon, Varsta, specializareId;
      
     // ArrayList<Integer> specializareId;

void programare_noua(){
            Scanner input = new Scanner(System.in);
            System.out.print("IdProgramare:-");
            IdProgramare = input.nextInt();
            System.out.print("Nume Pacient:-");
            NumePacient = input.nextLine();
            System.out.print("Prenume Pacient:-");
            PrenumePacient = input.nextLine();
            System.out.print("Sex(M/F):-");
            Sex = input.nextLine();
            System.out.print("E-mail:-");
            Email = input.nextLine();
            System.out.print("Tip de programare(Analize/Consulatie):-");
            TipProgramare = input.nextLine();
            System.out.print("Numar de telefon:-");
            NrTelefon = input.nextInt();
            System.out.print("Varsta:-");
            Varsta = input.nextInt();
             System.out.print("Specializare[1.Andrologie;2.Cardiologie]:-");
            specializareId = input.nextInt();
      }
       void info_programare()
    {
        System.out.println(IdProgramare + "\t" + NumePacient + "\t" + PrenumePacient+ "\t" + Sex + "\t" + Email + "\t" + TipProgramare + "\t" + NrTelefon+ "\t" + Varsta+ "\t" + specializareId);
    }
      
      public Programare(){
          this.IdProgramare = 0;
          this.NumePacient = "";
          this.PrenumePacient = "";
          this.Sex = "";
          this.Email = "";
          this.TipProgramare = "";
          this.NrTelefon = 0;
          this.Varsta = 0;
          this.specializareId = 0;
       //   this.specializareId = new ArrayList<>();
      }
    /*   public Programare(int IdProgramare,String NumePacient,String PrenumePacient,String Sex, String Email, String TipProgramare, String IdSpecializare, int NrTelefon, int Varsta, ArrayList< Specializare> specializare){
          this.IdProgramare = IdProgramare;
          this.NumePacient = NumePacient;
          this.PrenumePacient = PrenumePacient;
          this.Sex = Sex;
          this.Email = Email;
          this.TipProgramare = TipProgramare;
          this.specializareId = specializare;
          this.NrTelefon = NrTelefon;
          this.Varsta = Varsta;
        
      }*/
     

    public String getNumePacient() {
        return NumePacient;
    }

    public void setNumePacient(String NumePacient) {
        this.NumePacient = NumePacient;
    }

    public String getPrenumePacient() {
        return PrenumePacient;
    }

    public void setPrenumePacient(String PrenumePacient) {
        this.PrenumePacient = PrenumePacient;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTipProgramare() {
        return TipProgramare;
    }

    public void setTipProgramare(String TipProgramare) {
        this.TipProgramare = TipProgramare;
    }


    public int getIdProgramare() {
        return IdProgramare;
    }

    public void setIdProgramare(int IdProgramare) {
        this.IdProgramare = IdProgramare;
    }

    public int getNrTelefon() {
        return NrTelefon;
    }

    public void setNrTelefon(int NrTelefon) {
        this.NrTelefon = NrTelefon;
    }

    public int getVarsta() {
        return Varsta;
    }

    public void setVarsta(int Varsta) {
        this.Varsta = Varsta;
    }

    public int getSpecializareId() {
        return specializareId;
    }

    public void setSpecializareId(int specializareId) {
        this.specializareId = specializareId;
    }

   
      

    @Override
    public String toString() {
        return "Programare{" + ", IdProgramare=" + IdProgramare + "NumePacient=" + NumePacient + ", PrenumePacient=" + PrenumePacient + ", Sex=" + Sex + ", Email=" + Email + ", TipProgramare=" + TipProgramare  + ", NrTelefon=" + NrTelefon + ", Varsta=" + Varsta + ", specializare=" + specializareId + '}';
    }
    
       /* void programare_noua(){
            Scanner input = new Scanner(System.in);
            System.out.print("IdProgramare:-");
            IdProgramare = input.nextLine();
            System.out.print("Nume Pacient:-");
            NumePacient = input.nextLine();
            System.out.print("Prenume Pacient:-");
            PrenumePacient = input.nextLine();
            System.out.print("Sex:-");
            Sex = input.nextLine();
            System.out.print("E-mail:-");
            Email = input.nextLine();
            System.out.print("Tip de programare:-");
            TipProgramare = input.nextLine();
            System.out.print("Specializare:-");
            IdSpecializare = input.nextLine();
            System.out.print("Numar de telefon:-");
            NrTelefon = input.nextInt();
            System.out.print("Varsta:-");
            Varsta = input.nextInt();
      }
       void info_programare()
    {
        System.out.println(IdProgramare + "\t" + NumePacient + " \t" + PrenumePacient+ "\t" + Sex + "\t" + Email + "\t" + TipProgramare + "\t" +IdSpecializare+ "\t" + NrTelefon+ "\t" + Varsta);
    }
  */


   
}
