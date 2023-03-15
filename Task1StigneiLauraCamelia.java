
package com.mycompany.task1stigneilauracamelia;

import java.util.Calendar;
import java.util.Scanner;

public class Task1StigneiLauraCamelia {

    public static void main(String[] args) {
        
     
      String luni[] = {
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 1, count2 = 2, count3 = 2, count4 = 1;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Digitalizarea activitatilor in cadrul unei Policlinici ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Data: " + luni[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
     
       
       Programare[] p = new Programare[100];
       Specializare[] sp = new Specializare[100];
       Medic[] m = new Medic[100];
       Consultatie[] c = new Consultatie[100];
        int i;
        for (i = 0; i < 100; i++)
            p[i] = new Programare();
        for (i = 0; i < 100; i++)
            sp[i] = new Specializare();
        for (i = 0; i < 100; i++)
            m[i] = new Medic();
        for (i = 0; i < 100; i++)
            c[i] = new Consultatie();
//Programare
        p[0].IdProgramare = 1;
        p[0].NumePacient = "Stignei";
        p[0].PrenumePacient = "Laura-Camelia";
        p[0].Sex = "Feminin";
        p[0].Email = "Stigneil.camelia@yahoo.com";
        p[0].TipProgramare = "Analize";
        p[0].NrTelefon = 0756371;
        p[0].Varsta = 23;
        p[0].specializareId = 1 ;
        
 //Specializare
        sp[0].IdSpecializare = 1;
        sp[0].NumeSpecializare = "Andrologie";

        sp[1].IdSpecializare = 2;
        sp[1].NumeSpecializare = "Cardiologie";
        
   //Medic
        m[0].IdMedic = 1;
        m[0].NumeMedic = "Musat Andrei";
        m[0].IdSpecializare = 2;

        m[1].IdMedic = 2;
        m[1].NumeMedic = "Ivanov Alex";
        m[1].IdSpecializare = 1;

   //Consultatie
        c[0].idConsultatie = 1;
        c[0].numeConsultatie = "Consultatie1";
        c[0].diagnostic = "Bolnav";    
        c[0].medicament = "Aspirina"; 
        c[0].analize = "Rele"; 
        c[0].descriere = "Necesita odihna";
        c[0].IdMedic = 1; 
        
        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1,s3 = 1,s4=1;
        while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Programare 2.Specializare 3.Medici 4.Consultatie");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                      **PROGRAMARE**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 == 1)
                        {
                            System.out.println("1.Adauga programare\n2.Programari existente");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        p[count1].programare_noua();count1++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("Id  NumePacient \t PrenumePacient  Sex \t  Email \t \t   TipProgramare  NrTelefon  Varsta Specializare.");
                                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++)
                                        {
                                            p[j].info_programare();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }
               
                    
                       case 2:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **SPECIALIZARE**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s2 = 1;
                        while (s2 == 1)
                        {
                            System.out.println("1.Adauga o noua specializare\n2.Specializari existente");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        sp[count2].new_specializare();count2++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("IdSpecializare \t NumeSpecializare  ");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++) {
                                            sp[j].specializare_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        break;
                    } 
                    
                    
                     case 3:
                    {
                        s3 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **MEDICI**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s3 == 1)
                        {
                            System.out.println("1.Adauga un nou medic\n2. Medici in sistem");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        m[count3].medic_nou();count3++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("IdMedic NumeMedic  IdSpecializare");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count3; j++) {
                                            m[j].info_medic();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                        break;
                    }
                    
                    
                       case 4:
                    {
                        s4 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                    **LABORATORY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s4 == 1)
                        {
                            System.out.println("1.Adauga o noua consultatie \n2.Consultatii existente");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        c[count4].consultatie_noua();count4++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Id \t NumeConsulatie Diagnostic Medicament Analize Descriere \t IdMedic");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count4; j++) {
                                            c[j].info_consultatie();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s4 = input.nextInt();
                        }
                        break;
                    }
                    
            
                default:
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
    }

