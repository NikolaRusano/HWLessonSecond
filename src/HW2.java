import java.util.Scanner;

class ArithmCalc {
    private double fahrenheitTemperature;
    public double celsiusTemperature;
    public double kelvinTemperature;
    public double inches, kilometers, pounds, milesPerHour;
    public double meters, miles, kilograms, kilometersPerHour;
    public double totTest, testMark;
    int HusAge, WifeAge;
    double FamilyIncome;
    boolean correctAge;
    boolean ApplFirstGrade, ApplSecGrade;


    private double SetFahrenheit(double x) {
        fahrenheitTemperature = x;
        return fahrenheitTemperature;
    }

    public double CelsiusCalc(double fahrenheitTemperature) {
        celsiusTemperature = 5.0 / 9.0 * (fahrenheitTemperature - 32.0);
        return celsiusTemperature;
    }
    public double FahrenheitCalc(double celsiusTemperature) {
        fahrenheitTemperature = celsiusTemperature *(9.0/5.0) + 32.0;
        return fahrenheitTemperature;
    }

    public double KelvinCalc(double celsiusTemperature) {
        kelvinTemperature = celsiusTemperature + 273.16;
        return kelvinTemperature;
    }

    public double ConvertInchesToMeters(double inches) {
        meters = 39.37 * inches;
        return meters;
    }

    public double ConvertMetersToInches(double meters) {
        inches = meters / 39.37;
        return inches;
    }

    public double ConvertKilometersToMiles(double kilometers) {
        miles = kilometers * 1.609;
        return miles;
    }

    public double ConvertMilesToKilometers(double miles) {
        kilometers = miles * 1.609;
        return kilometers;
    }

    public double ConvertPoundsToKilogram(double pounds) {
        kilograms = pounds * 2.2046;
        return kilograms;
    }

    public double ConvertKilogramsToPounds(double kilograms) {
        pounds = kilograms * 2.2046;
        return pounds;
    }

    public double ConvertMilesPerHoursToKilometersPerHours(double MilesPerHours) {
        kilometersPerHour = MilesPerHours * 0.6214;
        return kilometersPerHour;
    }

    public double ConvertKilometersPerHoursToMilesPerHours(double kilometersPerHour) {
        milesPerHour = kilometersPerHour * 0.6214;
        return milesPerHour;
    }
    public void PercMarkTestRes(double totTest, double testMark){
        System.out.println("Total test = " + totTest + "\n" + "marked test = " + testMark + "\n" + "Results: " + testMark/totTest*100 + "%" );
    }

    public boolean GetMortgageFamilyAge(int HusAge, int WifeAge){

        return correctAge = (HusAge < 35) & (WifeAge < 35);
    }
    public boolean GetMortgageFamilyIncome(double FamilyIncome){

        return  (FamilyIncome < 50000) & (FamilyIncome > 20000);
    }
    public boolean BuyingApples(boolean ApplFirstGrade, boolean ApplSecGrade){
        return ApplFirstGrade | ApplSecGrade;
    }



    public static void main(String[] args) {
        int choise;
        Scanner console = new Scanner(System.in);
        do {
            System.out.printf("\n \n Choose correct function: \n");
            System.out.println("1 - Convert Fahrenheit to Celsius ");
            System.out.println("2 - Convert Celsius to Fahrenheit");
            System.out.println("3 - Convert Celsius to Kelvin");
            System.out.println("4 - Convert meters  to  inches");
            System.out.println("402 - Convert inches to  meters");
            System.out.println("5 - Convert miles to kilometres");
            System.out.println("502 - Convert kilometres to miles");
            System.out.println("6 - Convert kilograms to pounds");
            System.out.println("602 - Convert pounds to kilograms");
            System.out.println("7 - Convert speed km/hr to mi/hr");
            System.out.println("702 - Convert speed mi/hr to km/hr");
            System.out.println("8 -  Given a mark on a test and the test total, find the percentage");
            System.out.println("9 - Getting mortgage according to the Age family members");
            System.out.println("10 - Getting mortgage according to the Age family members");
            System.out.println("11 - Buying apples");
            choise = console.nextInt();

            if (choise == 1) {
                System.out.println("Input Fahrenheit Temperature:");
                ArithmCalc A1 = new ArithmCalc();
                double far = A1.SetFahrenheit(console.nextDouble());
                System.out.println("The Celsius Temperature will be: \n");
                System.out.println(A1.CelsiusCalc(far));
            } else if (choise == 2) {
                System.out.println("Input Celsium Temperature:");
                ArithmCalc A1 = new ArithmCalc();
                A1.celsiusTemperature = console.nextDouble();
                System.out.println("The Fahrenheit Temperature will be: \n");
                System.out.println(A1.FahrenheitCalc(A1.celsiusTemperature));
            } else if (choise == 3) {
                System.out.println("Input Celsium Temperature:");
                ArithmCalc A1 = new ArithmCalc();
                A1.celsiusTemperature = console.nextDouble();
                System.out.println("The Kelvin Temperature will be: \n");
                System.out.println(A1.KelvinCalc(A1.celsiusTemperature));
            }else if (choise == 4) {
                System.out.println("Input meters length:");
                ArithmCalc A1 = new ArithmCalc();
                A1.meters = console.nextDouble();
                System.out.println("The inches length will be: \n");
                System.out.println(A1.ConvertMetersToInches(A1.meters));
            }else if (choise == 402) {
                System.out.println("Input inches length:");
                ArithmCalc A1 = new ArithmCalc();
                A1.inches = console.nextDouble();
                System.out.println("The meters length will be: \n");
                System.out.println(A1.ConvertInchesToMeters(A1.inches));
            }else if (choise == 5) {
                System.out.println("Input miles length:");
                ArithmCalc A1 = new ArithmCalc();
                A1.miles = console.nextDouble();
                System.out.println("The kilometers length will be: \n");
                System.out.println(A1.ConvertMilesToKilometers(A1.miles));
            }else if (choise == 502) {
                System.out.println("Input kilometers length:");
                ArithmCalc A1 = new ArithmCalc();
                A1.kilometers = console.nextDouble();
                System.out.println("The miles length will be: \n");
                System.out.println(A1.ConvertKilometersToMiles(A1.kilometers));
            }else if (choise == 6) {
                System.out.println("Input kilogram weight:");
                ArithmCalc A1 = new ArithmCalc();
                A1.kilograms = console.nextDouble();
                System.out.println("The pounds weight will be: \n");
                System.out.println(A1.ConvertKilogramsToPounds(A1.kilograms));
            }else if (choise == 602) {
                System.out.println("Input pounds weight:");
                ArithmCalc A1 = new ArithmCalc();
                A1.pounds = console.nextDouble();
                System.out.println("The kilogram weight will be: \n");
                System.out.println(A1.ConvertPoundsToKilogram(A1.pounds));
            }else if (choise == 7) {
                System.out.println("Input km/hr speed:");
                ArithmCalc A1 = new ArithmCalc();
                A1.kilometersPerHour = console.nextDouble();
                System.out.println("The mi/hr speed will be: \n");
                System.out.println(A1.ConvertKilometersPerHoursToMilesPerHours(A1.kilometersPerHour));
            }else if (choise == 702) {
                System.out.println("Input mi/hr speed:");
                ArithmCalc A1 = new ArithmCalc();
                A1.milesPerHour = console.nextDouble();
                System.out.println("The km/hr speed will be: \n");
                System.out.println(A1.ConvertMilesPerHoursToKilometersPerHours(A1.milesPerHour));
            }else if (choise == 8) {
                System.out.println("Input mark on a test:");
                ArithmCalc A1 = new ArithmCalc();
                A1.testMark = console.nextDouble();
                System.out.println("Input test total on a test:");
                A1.totTest = console.nextDouble();
                A1.PercMarkTestRes(A1.totTest, A1.testMark);
            }else if (choise == 9) {
                System.out.println("Input husband age:");
                ArithmCalc A1 = new ArithmCalc();
                A1.HusAge = console.nextInt();
                System.out.println("Input wife age:");
                A1.WifeAge = console.nextInt();
                System.out.println("The family will get mortgage observing their age:");
                System.out.println(A1.GetMortgageFamilyAge(A1.HusAge,A1.WifeAge));
            }else if (choise == 10) {
                System.out.println("Input Family Income:");
                ArithmCalc A1 = new ArithmCalc();
                A1.FamilyIncome = console.nextDouble();
                System.out.println("The family will get mortgage observing their Income:");
                System.out.println(A1.GetMortgageFamilyIncome(A1.FamilyIncome));
            }else if (choise == 11) {
                System.out.println("Input Availability First Grade Apples:");
                ArithmCalc A1 = new ArithmCalc();
                A1.ApplFirstGrade = console.nextBoolean();
                System.out.println("Input Availability Second Grade Apples:");
                A1.ApplSecGrade = console.nextBoolean();
                System.out.println("Availability of any Grade Apples:");
                System.out.println(A1.BuyingApples(A1.ApplFirstGrade, A1.ApplSecGrade));
            }else if (choise == 0){
                System.out.println("End of programm");
                break;
            }else {
                System.out.println("Inncorrect input, try again");
                continue;
            }

        } while (choise != 0);
    }
}