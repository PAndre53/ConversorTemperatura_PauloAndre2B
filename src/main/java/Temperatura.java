public class Temperatura {
    //ATRIBUTO PRIVADO PARA ARMAZENAR TEMP - CELSIUS
    private double tempCelsius;
    
    //CONSTRUTOR - CRIA O OBJETO COM UMA TEMP INICIAL
    public Temperatura(double tempInicialCelsius){
        this.tempCelsius = tempInicialCelsius;
                }
    
        //GETTER - PARA LER A TEMP
        public double getTemperaturaCelsius(){
            return tempCelsius;
        }
        
        //SETTER - PARA MUDAR A TEMPERATURA
        public void setTemperaturaCelsius(double mudarTempCelsius){
            this.tempCelsius = mudarTempCelsius;               
    }
   
        //MÉTODO PARA CONVERTER CELSIUS PARA FAHRENHEITS
        public double converteParaFahrenheit(){
            return (tempCelsius*9/5) + 32;
        }
        
        //MÉTODO PARA CONVERTER CELSIUS PARA KELVIN
        public double converteParaKelvin(){
            return tempCelsius+273.15;
        }
}
