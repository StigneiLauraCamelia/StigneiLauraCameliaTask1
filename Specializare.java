
package com.mycompany.task1stigneilauracamelia;

import java.util.Scanner;

public class Specializare {
    String NumeSpecializare;
    int IdSpecializare;
    
    
    void new_specializare()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("IdSpecializare:-");
        IdSpecializare = input.nextInt();
        System.out.print("NumeSpecializare:-");
        NumeSpecializare = input.nextLine();
    
    }
    void specializare_info()
    {
        System.out.println(IdSpecializare + "\t" + NumeSpecializare );
    }
    public Specializare(){
          this.IdSpecializare = 0;
          this.NumeSpecializare = "";
     }
    
    public Specializare(int IdSpecializare,String NumeSpecializare){
          this.IdSpecializare = IdSpecializare;
          this.NumeSpecializare = NumeSpecializare;
    }
    

    public String getNumeSpecializare() {
        return NumeSpecializare;
    }

    public void setNumeSpecializare(String NumeSpecializare) {
        this.NumeSpecializare = NumeSpecializare;
    }

    public int getIdSpecializare() {
        return IdSpecializare;
    }

    public void setIdSpecializare(int IdSpecializare) {
        this.IdSpecializare = IdSpecializare;
    }

    @Override
    public String toString() {
        return "Specializare{" + "NumeSpecializare=" + NumeSpecializare + ", IdSpecializare=" + IdSpecializare + '}';
    }
    
}
