public class Fahrenheit extends Temperatura {
    //CONSTRUTOR
    public Fahrenheit(double grausTemp) {
        super(grausTemp);
    }
    
    //MÉTODO PARA CONVERTER DE FAHRENHEIT PARA CELSIUS
    public double paraCelsius(){
        return (getGraus()-32)*5/9;
    }
    
    //MÉTODO PARA CONVERTER DE FAHRENHEIT PARA KELVIN
    public double paraKelvin(){
        return paraCelsius()+273.15;
    }
}
