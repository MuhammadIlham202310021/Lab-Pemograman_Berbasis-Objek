//Package pertemuan3;

public class Person {

        public String name;
        public String birthdate;
        public String department;
        public String major;
        public String age;
        public String height;
        public String weight;
        public String distance;
        public String time;

        

        public static void main(String args[]){
            
        Person test = new Person(); 
        test.setname("Ilham"); 
        String name = test.getname();
        System.out.println("nama = " + name);
        
        Person test2 = new Person(); 
        test2.setbirthdate("20 februari 2003"); 
        String birthdate = test2.getbirthdate();
        System.out.println("birthdate = " + birthdate);

        Person test3 = new Person(); 
        test3.setdepartment("Teknologi Informasi"); 
        String department = test3.getdepartment();
        System.out.println("department = " + department);

        Person test4 = new Person(); 
        test4.setmajor("Teknologi Informasi"); 
        String major = test4.getmajor();
        System.out.println("major = " + major);

        Person test5 = new Person(); 
        test5.setage("18 tahun"); 
        String age = test5.getage();
        System.out.println("age = " + age);

        Person test6 = new Person(); 
        test6.setheight("165 Cm"); 
        String height = test6.getheight();
        System.out.println("height = " + height);

        Person test7 = new Person(); 
        test7.setweight("60 Kg"); 
        String weight = test7.getweight();
        System.out.println("weight = " + weight);

        Person test8 = new Person(); 
        test8.setdistance(" 160 Km "); 
        String distance = test8.getdistance();
        System.out.println("distance = " + distance);
        
        Person test9 = new Person(); 
        test9.settime(" 2 menit "); 
        String time = test9.gettime();
        System.out.println("time = " + time);

        int x = 80; 
        double y = 160;
        System.out.println("");
        System.out.println("Waktu yang ditempuh jika berangkat dari rumah menuju kampus IBIK jika menggunakan kendaraan bermotor dengan kecepatan "+ x +"km/menit adalah "+ time(x, y)+" menit");
    }

        public static double time(int x, double y){ 
            double distance = y;
            int kecepatan = x;
            return distance/kecepatan ; 
        }

    public void setname(String x){ 
        this.name = x;
    }

    public String getname(){  
        return this.name;
    }

    public void setbirthdate(String x){ 
        this.birthdate = x;
    }

    public String getbirthdate(){  
        return this.birthdate;
    }

    public void setdepartment(String x){ 
        this.department = x;
    }

    public String getdepartment(){  
        return this.department;
    }

    public void setmajor(String x){ 
        this.major = x;
    }

    public String getmajor(){  
        return this.major;
    }

    public void setage(String x){ 
        this.age = x;
    }

    public String getage(){  
        return this.age;
    }

    public void setheight(String x){ 
        this.height = x;
    }

    public String getheight(){  
        return this.height;
    }

    public void setweight(String x){ 
        this.weight = x;
    }

    public String getweight(){  
        return this.weight;
    }

    public void setdistance(String x){ 
        this.distance = x;
    }

    public String getdistance(){  
        return this.distance;
    }

    public void settime(String x){ 
        this.time = x;
    }

    public String gettime(){  
        return this.time;
    }
}






        
    