public class ArithmCalc {
    private double fahrenheitTemperature = 77;
    private double celsiusTemperature;
    private double KelvinTemperature;
    private double inches, kilometers, pounds, milesPerHour;
    private double meters, miles, kilograms, kilometersPerHour;



    private double SetFahrenheit (x){
        fahrenheitTemperature = x;
        return fahrenheitTemperature;
    }

    public double CesiusCalc(fahrenheitTemperature){
        celsiusTemperature = 5/9 (fahrenheitTemperature - 32);
        return celsiusTemperature;
    }
    public double KelvinCalc(celsiusTemperature){
        KelvinTemperature =  celsiusTemperature + 273.16;
        return KelvinTemperature;
    }
    public double ConvertInchesToMeters(inches){
        meters = 39.37*inches;
        return meters;
    }
    public double ConvertMetetToInches(meters){
        inches = meters/39.37;
        return inches;
    }
    public double ConvertKilometersToMiles(kilometers){
        miles = kilometers * 1.609;
        return miles;
    }
    public double ConvertMilesToKilometers(miles){
        kilometers = miles * 1.609;
        return kilometers;
    }
    public double ConvertPoundsToKilogram(pounds){
        Kilogram = pounds * 2.2046;
        return miles;
    }
    public double ConvertKilogramsToPounds(Kilogram){
        pounds = Kilogram * 2.2046;
        return pounds;
    }
    public double ConvertMilesPerHoursToKilometersPerHours(MilesPerHours){
        KilometersPerHours = MilesPerHours * 0.6214;
        return KilometersPerHours;
    }
    public double ConvertKilometersPerHoursToMilesPerHours(KilometersPerHours){
        MilesPerHours = KilometersPerHours * 0.6214;
        return MilesPerHours;
    }






    public static void main(String[] args) {


    }
}