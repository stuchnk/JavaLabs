package Lr11;

public class Main {
    public static void main(String[] args) {
        Instrument inst = new Instrument("Инструмент", "Общий", "звук");
        Guitar guitar = new Guitar("Fender", "Струнный", "дзынь", 6);
        Piano piano = new Piano("Yamaha", "Клавишный", "динь", 88);



        System.out.println(inst.play());
        System.out.println(inst.play(7));
        System.out.println(inst.play("Лунная соната"));
        System.out.println(guitar.tune());
        System.out.println(guitar.tune(3));
        System.out.println(piano.playChord());
        System.out.println(piano.playChord("До мажор"));



        Instrument[] items = new Instrument[3];
        items[0] = inst;
        items[1] = guitar;
        items[2] = piano;
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getName()  + items[i].getSoundType());
        }



        Instrument ref = new Guitar("Gibson", "Струнный", "дзынь", 7);

        System.out.println(ref.play(5));
        System.out.println(ref.play("Блюз"));

        System.out.println(ref.getSoundType());

    }
}
