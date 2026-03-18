public class Main {

    public static void main(String[] args) {

        HotelManager manager = new HotelManager();

        manager.addRoom(new SingleRoom(101));
        manager.addRoom(new DoubleRoom(102));
        manager.addRoom(new SuiteRoom(103));

        manager.bookRoom("Akash", 101);
        manager.bookRoom("Samith", 102);
        manager.bookRoom("Adithya", 101); // already booked

        System.out.println("\nBooking List:");
        manager.showBookings();
    }
}