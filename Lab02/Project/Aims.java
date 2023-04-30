public class Aims {
    public static void main(String[] args) 
        Cart anOrder = new Cart()
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1)
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Pearl", "Thriller", "Ti West", 14.56f);
        anOrder.addDigitalVideoDisc(dvd4);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("X", "Thriller", "Ti West", 30.25f);
        anOrder.addDigitalVideoDisc(dvd5);

        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
    
        anOrder.removeDigitalVideoDisc(dvd2);
        anOrder.removeDigitalVideoDisc(dvd5);
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());

        System.out.println(anOrder.getQtyOrdered(dvd1));
        System.out.println(anOrder.getQtyOrdered(dvd2));
        System.out.println(anOrder.getQtyOrdered(dvd3));
        System.out.println(anOrder.getQtyOrdered(dvd4));
        System.out.println(anOrder.getQtyOrdered(dvd5));
    }
}
