package prak2;

public class Prak2_1 {
    public static void main(String[] args){
        Shape shape = new Shape("red", "square");
        System.out.println(shape);

        Ball ball = new Ball("blue", "basketball");
        ball.setType_ball("football");
        System.out.println(ball);

        Book book = new Book(248, 2009, "Просвещение");
        book.setNum_pages(578);
        System.out.println(book.getNum_pages());
        System.out.println(book);

        Dog dog = new Dog("Шарик", 7);
        System.out.println(dog);

        Dog_kennel dog_kennel = new Dog_kennel(new Dog[]{new Dog("Шарик", 3), new Dog("Мурзик", 5)});
        dog_kennel.addDog(new Dog("Мухтар", 7));
        dog_kennel.add_many_Dogs(new Dog[]{new Dog("Бима", 3), new Dog("Циля", 2)});
        System.out.println(dog_kennel);
        System.out.println(dog_kennel.how_many_Dogs());
        for(int i = 0; i < dog_kennel.how_many_Dogs(); i++) {
            System.out.println(dog_kennel.names_of_Dogs()[i]);
        }

        for(int i = 0; i < dog_kennel.how_many_Dogs(); i++) {
            System.out.println(dog_kennel.ages_of_Dogs()[i]);
        }
    }
}
