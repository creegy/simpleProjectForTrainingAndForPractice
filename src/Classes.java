public class Classes {
    static class Animal {
        String animalStr = "animal class String";
        public void animalSounds() {
            System.out.println("insert animal sound here");
        }
    }
    static class Fox extends Animal {
        String foxStr = "fox class String";
        public void animalSounds() {
            System.out.println("what does the fox say");
        }
    }
}
