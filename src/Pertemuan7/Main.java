package Pertemuan7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Pertemuan7.module.Daftarintel;
import Pertemuan7.module.Daftaramd;

public class Main {
    public static void main(String[] args) { 
        Scanner myObj = new Scanner(System.in);       
        Main m = new Main();
        m.GenerateDaftarintel(myObj);
        m.GenerateDaftaramd(myObj);
    }
        
    private void GenerateDaftarintel(Scanner myObj){
        List<Daftarintel> listDaftarintel = new ArrayList<Daftarintel>(); 
        System.out.println("\n==Mengisi class Intel==");
        for (int i = 1; i < 3; i++) {
            System.out.println("------------------------------");
            System.out.println("Data isian ke-"+i);
            System.out.println("------------------------------");

            Daftarintel l = new Daftarintel();
            System.out.print("Masukan Core:");
            String Core = myObj.nextLine(); 
            l.setCore(Core);

            System.out.print("Masukan Speed:");
            String Speed = myObj.nextLine();
            l.setSpeed( Double.parseDouble(Speed) ); 

            System.out.print("Masukan memory_type:");
            String memory_type = myObj.nextLine();
            l.setmemory_type(memory_type);

            System.out.print("Masukan Socket:");
            String Socket = myObj.nextLine();
            l.setSocket(Socket); 

            System.out.print("Masukan Type_series:");
            String Type_series = myObj.nextLine();
            l.setType_series(Type_series);

            System.out.print("Apakah Mendukung IntegratedGraphics ? :");
            String IntegratedGraphics = myObj.nextLine();
            l.setIntegratedGraphics(IntegratedGraphics); 
            listDaftarintel.add(l); 
        }

         System.out.println("\n=Mencetak array List Intel=");
        int index = 1;
        for (Daftarintel l : listDaftarintel) {
            System.out.println("------------------------------");
            System.out.println("Data isian ke-"+index);
            System.out.println("------------------------------");
            System.out.println("Core : "+l.getCore() );
            System.out.println("Speed : "+l.getSpeed() +"Ghz" );
            System.out.println("memory_type : "+l.getmemory_type() );
            System.out.println("Socket : "+l.getSocket());
            System.out.println("Type_series : "+l.getType_series() );
            System.out.println("Mendukung IntegratedGraphics ? : "+l.getIntegratedGraphics() );
            System.out.println("------------------------------");
            index++;
        }
    }
        private void GenerateDaftaramd(Scanner myObj){
        List<Daftaramd> listDaftaramd = new ArrayList<Daftaramd>(); 
        System.out.println("\n==Mengisi class amd==");
        for (int i = 1; i < 3; i++) {
            System.out.println("------------------------------");
            System.out.println("Data isian ke-"+i);
            System.out.println("------------------------------");

            Daftaramd a = new Daftaramd();
            System.out.print("Masukan Core:");
            String Core = myObj.nextLine(); 
            a.setCore(Core);

            System.out.print("Masukan Speed:");
            String Speed = myObj.nextLine();
            a.setSpeed( Double.parseDouble(Speed) ); 

            System.out.print("Masukan memory_type:");
            String memory_type = myObj.nextLine();
            a.setmemory_type(memory_type);

            System.out.print("Masukan Socket:");
            String Socket = myObj.nextLine();
            a.setSocket(Socket); 

            System.out.print("Masukan Type_series:");
            String Type_series = myObj.nextLine();
            a.setType_series(Type_series);

            System.out.print("Apakah Mendukung IntegratedGraphics ? :");
            String IntegratedGraphics = myObj.nextLine();
            a.setIntegratedGraphics(IntegratedGraphics); 

            listDaftaramd.add(a); 
        }
            //listDaftaramd = [{"Dual","3.7","LGA2011","Core I3",ya}];
         System.out.println("\n=Mencetak array List amd=");
        int index = 1;
        for (Daftaramd a : listDaftaramd) {
            System.out.println("------------------------------");
            System.out.println("Data isian ke-"+index);
            System.out.println("------------------------------");
            System.out.println("Core : "+a.getCore() );
            System.out.println("Speed : "+a.getSpeed()+ "Ghz" );
            System.out.println("memory_type : "+a.getmemory_type() );
            System.out.println("Socket : "+a.getSocket());
            System.out.println("Type_series : "+a.getType_series() );
            System.out.println("Mendukung IntegratedGraphics : ? "+a.getIntegratedGraphics() );
            System.out.println("------------------------------");
            index++;
        }
    }
}

