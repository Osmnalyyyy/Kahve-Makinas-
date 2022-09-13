public class Love {
    public static void main(String[] args) {

        String sevgi = "Seni cok seviyorum SEVGI";
        String ekle = "o";
        int index = sevgi.indexOf("o");

        System.out.println(sevgi);

        for (int i = 0; i < 1000; i++) {

            sevgi = sevgi.substring(0, index) + ekle + sevgi.substring(index);
            System.out.println(sevgi);
        }
        for (int i = 1000; i >0 ; i--) {
        sevgi=sevgi.substring(0,index)+sevgi.substring(index+1);
            System.out.println(sevgi);
        }
    }
}
