public class Track extends Transport {
    public Track(String brand, String model, Double engineVol) {
        super(brand, model, engineVol);
    }

    @Override
    public void startMovie() {
        System.out.println("Трак "+getBrand()+"  начал движение");
    }

    @Override
    public void stopMovie() {
        System.out.println("Трак "+getBrand()+"  остановился");
    }
}
