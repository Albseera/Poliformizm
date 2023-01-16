public class Car extends Transport {
    public Car(String brand, String model, Double engineVol) {
        super(brand, model, engineVol);
    }

    @Override
    public void startMovie() {
        System.out.println("Авто "+getBrand()+"  начал движение");
    }

    @Override
    public void stopMovie() {
        System.out.println("Авто "+getBrand()+"  остановился");
    }
}
