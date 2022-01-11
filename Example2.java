public class Example2 {

    public static void main(String arg[]) {
        String code = "CSC1009";
        switch (code) {
            case "CSC1009":
                System.out.println("Object Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC2902":
                System.out.println("Career and Professional Development");
                break;
            default:
                System.out.println("Unknown module code");
                break;
        }
        System.out.println("After switch");
    }
}
