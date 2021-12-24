public class Encapsulation_Tugas4 {
    public String Core = "Quad Core";
    public double Speed = 3.6 ;
    public String memory_type = "DDR4";
    
    public String getCore() {
        return Core;
    }

    public void setCore(String Core) {
        this.Core = Core;
    }

    public String getmemory_type() {
        return memory_type;
    }

    public void setmemory_type(String memory_type) {
        this.memory_type = memory_type;
    }   

    public void setSpeed(double x){
        this.Speed = x;
    }

    public double getSpeed(){
        return this.Speed;
    }
}
