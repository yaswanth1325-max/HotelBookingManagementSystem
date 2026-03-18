import java.util.ArrayList;

public class HotelManager {

    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Booking> bookings = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void bookRoom(String customerName, int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber && !room.isBooked()) {

                Customer customer = new Customer(customerName);
                room.bookRoom();

                Booking booking = new Booking(customer, room);
                bookings.add(booking);

                System.out.println("Room " + roomNumber + " booked for " + customerName);
                return;
            }
        }

        System.out.println("Room not available!");
    }
    public void showBookings() {

        for (Booking booking : bookings) {
            System.out.println(
                    "Customer: " + booking.getCustomer().getName() +
                            " | Room No: " + booking.getRoom().getRoomNumber()
            );
        }
    }
}