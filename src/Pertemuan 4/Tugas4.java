class Processor{ // main class
    public String Core = "Quad Core";
    public double Speed = 3.6 ;
    public String memory_type_type = "DDR4";
    
    public String Core(){
        return this.Core;
    }
    
    public double Kecepatan(){
        return this.Speed;
    }

    public String Tipe_memory_type(){
        return this.memory_type_type;
    }
}

class Intel extends Processor{ //sub class
    public String Type_Series = "Intel core i3-9100f";

    public void Socket(){
        System.out.println("Socket LGA1151");
    }

    public String IntegratedGraphics (String x){
        return x;
    }
}


class AMD extends Processor{ 
    public String Type_Series = "AMD Ryzen 3 3200g";

    public void Socket(){
        System.out.println("Socket AM4");
    }

    public String IntegratedGraphics(String x){
        return x;
    }
}

public class Tugas4 {
    public static void main(String[] args) {
        //inisialisasi object
        Processor p = new Processor();//init object
        System.out.println("Class Processor - main class");  
        System.out.println("Core Processor:"+p.Core);
        double Kecepatan = p.Kecepatan();
        System.out.println("Kecepatan Processor:"+Kecepatan+" GHz");
        String memory_type_type = p.Tipe_memory_type();        
        System.out.println("Tipe memory_type:"+memory_type_type);

        System.out.println("=====================================");
        System.out.println("Class INTEL - Subclass");
        Intel i = new Intel(); //init object
        System.out.println("Core Processor:"+p.Core);
        i.Socket();
        Kecepatan = i.Kecepatan();
        System.out.println("Kecepatan Processor:"+Kecepatan+" GHz");
        memory_type_type = p.Tipe_memory_type();        
        System.out.println("Tipe memory_type:"+memory_type_type+" GB");
        String IntegratedGraphics = i.IntegratedGraphics("Tidak Mendukung");
        System.out.println("Mendukung Integrated Graphics ? "+IntegratedGraphics);
        System.out.println("Tipe Series Processor :"+i.Type_Series);
        
        AMD a = new AMD();
        System.out.println("=====================================");
        System.out.println("Class AMD - Subclass");
        System.out.println("Core Processor:"+p.Core);
        a.Socket();
        Kecepatan = a.Kecepatan();
        System.out.println("Kecepatan Processor:"+Kecepatan+" GHz");
        memory_type_type = p.Tipe_memory_type();        
        System.out.println("Tipe memory_type:"+memory_type_type+" GB");
        IntegratedGraphics = a.IntegratedGraphics("Mendukung");
        System.out.println("Mendukung Integrated Graphics ? "+IntegratedGraphics);
        System.out.println("Tipe Series Processor :"+a.Type_Series);

        System.out.println("=====================================");
        System.out.println("Class Encapsulation_Tugas4");
        Encapsulation_Tugas4 e = new Encapsulation_Tugas4();
        e.setCore("Quad Core");
        e.setmemory_type("DDR4");
        e.setSpeed(3.6);

        System.out.println(e.getCore());
        System.out.println(e.getmemory_type());
        System.out.println(e.getSpeed()); 
    }
}
