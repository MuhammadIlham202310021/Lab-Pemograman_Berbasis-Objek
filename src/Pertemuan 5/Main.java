//package pertemuan5;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import pertemuan5.Processor;

public class Main {
    public static void main(String[] args) { 
        Main m = new Main();
        System.out.println("Fetching Processor Intel");
        m.generateDaftarintel("H:/Lab-Pemograman_Berbasis-Objek/Pertemuan5/DaftarProcessorIntel.txt");

        System.out.println();
        System.out.println("=========================================");
        System.out.println();
        System.out.println("Fetching Processor Amd");
        m.generateDaftaramd("H:/Lab-Pemograman_Berbasis-Objek/Pertemuan5/DaftarProcessorAmd.txt");
        }

    public void generateDaftarintel(String path){

        File file = new File(path);
        FileInputStream fis = null; 
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<Daftarintel> listProcessor = new ArrayList<Daftarintel>();

        try {
            fis = new FileInputStream(file); 
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
            //System.out.println("File "+file.getName()+ "ditemukan");
            while(dis.available() != 0){               
                String line = dis.readLine();
				String[] data = line.split(",");
                
                Daftarintel i = new Daftarintel();
                i.setCore(data[0]);
                double Speed = Double.parseDouble(data[1]);
                i.setSpeed(Speed);
                i.setmemory_type(data[2]);
                i.setSocket(data[3]);
                i.setType_series(data[4]);
                i.setIntegratedGraphics(data[5]);

                listProcessor.add(i); 
             }

            } catch (IOException ex) {//error handling
            System.out.println("File "+file.getName()+" tidak ditemukan..!!");
            System.out.println("Error: "+ex.getMessage());
            }


        //memanggil keluaran array
        int Number = 1; 
        for(Daftarintel i : listProcessor){
            
            System.out.println("=======["+Number+"]=========");
            System.out.println("Core: "+i.getCore());
            System.out.println("Speed: "+i.getSpeed());
            System.out.println("memory_type: "+i.getmemory_type());
            System.out.println("Socket: "+i.getSocket());
            System.out.println("Tipe Series: "+i.getType_series());
            System.out.println("Mendukung IntegratedGraphics ?: "+i.getIntegratedGraphics());
            Number++;       
        }
    }

    public void generateDaftaramd(String path){

        File file = new File(path);
        FileInputStream fis = null; 
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<Daftaramd> listProcessor = new ArrayList<Daftaramd>();

        try {
            fis = new FileInputStream(file); 
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
            //System.out.println("File "+file.getName()+ "ditemukan");
            while(dis.available() != 0){               
                String line = dis.readLine();
				String[] data = line.split(",");
                
                
                Daftaramd a = new Daftaramd();
                a.setCore(data[0]);
                double Speed = Double.parseDouble(data[1]);
                a.setSpeed(Speed);
                a.setmemory_type(data[2]);
                a.setSocket(data[3]);
                a.setType_series(data[4]);
                a.setIntegratedGraphics(data[5]);
                

                listProcessor.add(a); 
            }      
        }catch (IOException ex) {//error handling
            System.out.println("File "+file.getName()+" tidak ditemukan..!!");
            System.out.println("Error: "+ex.getMessage());
        }

        //memanggil keluaran array
        int Number = 1; 
        for(Daftaramd a : listProcessor){
            
            System.out.println("=======["+Number+"]=========");
            System.out.println("Core: "+a.getCore());
            System.out.println("Speed: "+a.getSpeed());
            System.out.println("memory_type: "+a.getmemory_type());
            System.out.println("Socket: "+a.getSocket());
            System.out.println("Tipe Series: "+a.getType_series());
            System.out.println("Mendukung IntegratedGraphics ?: "+a.getIntegratedGraphics());
            Number++;       

 }
    }
}

