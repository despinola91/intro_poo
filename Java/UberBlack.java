class UberBlack extends Car {
    Map<String, ArrayList<String, Integer>> typeCarAccepted;
    // Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver, String brand, String model, Map<String, ArrayList<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}