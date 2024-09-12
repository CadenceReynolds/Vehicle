public class Main {

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle("Ford", "Fusion");
        System.out.println("My cars make and model is a " + myCar.getMake() + ", " + myCar.getModel());

        myCar.setMake("Chevy");
        myCar.setModel("Hybrid");

        System.out.println("My new cars make and model is a " + myCar.getMake() + ", " + myCar.getModel());



    }
}
