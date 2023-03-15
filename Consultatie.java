
package com.mycompany.task1stigneilauracamelia;

import java.util.ArrayList;
import java.util.Scanner;

public class Consultatie {
     String numeConsultatie, diagnostic, medicament, analize,descriere;
     int idConsultatie,IdMedic;
     ArrayList<Medic> medic;
     
     
     void consultatie_noua(){
            Scanner input = new Scanner(System.in);
            System.out.print("IdConsultatie:-");
            idConsultatie = input.nextInt();
            System.out.print("NumeConsulatie:-");
            numeConsultatie = input.nextLine();
            System.out.print("Diagnostic:-");
            diagnostic = input.nextLine();
            System.out.print("Medicament:-");
            medicament = input.nextLine();
            System.out.print("Analize:-");
            analize = input.nextLine();
            System.out.print("Descriere:-");
            descriere = input.nextLine();
            System.out.print("IdMedic[1.Musat Andrei;2.Ivanov Alex]:-");
            IdMedic = input.nextInt();
      }
       void info_consultatie()
    {
        System.out.println(idConsultatie + "\t" + numeConsultatie + "\t" + diagnostic+ "\t" + medicament + "\t" +analize + "\t" +descriere + "\t" + IdMedic);
    }
     
     
     
     
     
     
     
     public Consultatie(){
          this.idConsultatie = 0;
          this.numeConsultatie = "";
          this.diagnostic = "";
          this.medicament = "";
          this.analize = "";
          this.descriere = "";
          this.medic = new ArrayList<>();
     }
       public Consultatie(int idConsultatie,String numeConsultatie,String diagnostic,String medicament,String analize,String descriere, ArrayList<Medic> medic){
          this.idConsultatie = idConsultatie;
          this.numeConsultatie = numeConsultatie;
          this.diagnostic = diagnostic;
          this.medicament = medicament;
          this.analize = analize;
          this.descriere = descriere;
          this.medic = medic;
        
      }

    public String getNumeConsultatie() {
        return numeConsultatie;
    }

    public void setNumeConsultatie(String numeConsultatie) {
        this.numeConsultatie = numeConsultatie;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getMedicament() {
        return medicament;
    }

    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }

    public String getAnalize() {
        return analize;
    }

    public void setAnalize(String analize) {
        this.analize = analize;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getIdConsultatie() {
        return idConsultatie;
    }

    public void setIdConsultatie(int idConsultatie) {
        this.idConsultatie = idConsultatie;
    }

    public ArrayList<Medic> getMedic() {
        return medic;
    }

    public void setMedic(ArrayList<Medic> medic) {
        this.medic = medic;
    }

    @Override
    public String toString() {
        return "Consultatie{" + "numeConsultatie=" + numeConsultatie + ", diagnostic=" + diagnostic + ", medicament=" + medicament + ", analize=" + analize + ", descriere=" + descriere + ", idConsultatie=" + idConsultatie + ", medic=" + medic + '}';
    }
       
       
}
