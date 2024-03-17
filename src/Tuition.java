public class Tuition {
    public static void main(String[] args) throws Exception {
        int year;
        double initialTuition = 10000;
        double tuitionIncrease = 0.05;

        // calculate the tuition every year for 10 years
        for (year = 1; year < 11; year++) {
            double tuition = initialTuition * Math.pow(1 + tuitionIncrease, year);
            System.out.println("The tuition for year " + year + " is $" + tuition);

        }

        double costAfter10Years = initialTuition * Math.pow(1 + tuitionIncrease, 10);
        double totalCostAfter4Years = 0;
        
        // calculate the total cost of the tuition after the 10th year for 4 years
        for (year = 11; year < 15; year++) {
            totalCostAfter4Years += costAfter10Years * Math.pow(1 + tuitionIncrease, year - 10);
        }

        System.out.println("The total cost of the tuition for 4 years after the tenth year is $" + totalCostAfter4Years);

    }
}
