public abstract class Transport {
    private final String brand;
    private final String model;
    private  Double engineVol;


    public Transport(String brand, String model, Double engineVol) {


        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "unknown";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "unknown";
        } else {
            this.model = model;
        }
       setEngineVol(engineVol) ;



    }
    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }



    public abstract void startMovie();

    public abstract void stopMovie();




    public void setEngineVol(Double engineVol) {

        if (engineVol <=0) {
            this.engineVol = 1.6;
        } else {
            this.engineVol = engineVol;
        }
    }

    @Override
    public String toString() {
        return "год производства:" + brand +
                ", страна сборки:" + model +
                ", марка:" + engineVol ;


    }
}
