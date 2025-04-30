 public class Celsius extends Temperatura {
    //CONSTRUTOR
    public Celsius(double graus){
        super(graus);
    }
    
    //CONSTRUTOR PARA KELVIN
    public double paraKelvin(){
        return getGraus()+273.15;
    }
    
    //CONVERTER PARA FAHRENHEIT
    public double paraFahrenheit(){
        return (getGraus()*9/5)+32;
    }
        
}


