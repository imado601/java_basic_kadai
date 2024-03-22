class CarExec_Chapter14 {
    public static void main(String[] args) {
        Car_Chapter14 car = new Car_Chapter14();
        System.out.println("ギア1から3に切り替えました");
        car.gearChange(3);
        car.run();
    }
}