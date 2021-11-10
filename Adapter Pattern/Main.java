public class Main {
    public static void main(String[] args) {
        Kucing anabul = new KucingMeong();

        // bebek bersuara kucing
        Bebek meongAdapter = new MeongAdapter(anabul);
        System.out.println("Suara bebek ");
        meongAdapter.kwek();
        System.out.println();

    }
}
