class Tomato extends Potato {
    public Tomato() {
        System.out.println("Tomato");
    }

    public static void main(String[] args) {
        Potato p = new Potato();
        Tomato t = new Tomato();
    }
}