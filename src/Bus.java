public class Bus extends Transport{
    public Bus(String brand, String model, Double engineVol) {
        super(brand, model, engineVol);
    }


    @Override
    public void startMovie() {
        System.out.println("Автобус "+getBrand()+"  начал движение");
    }

    @Override
    public void stopMovie() {
        System.out.println("Автобус "+getBrand()+"  остановился");
    }
}
