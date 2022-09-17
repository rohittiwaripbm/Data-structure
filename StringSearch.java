public class StringSearch {
    public static void main(String[] args) {
        String str = "HELLO";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                System.out.println("FOund");
            }
        }
        if ("HEllo".equals("HdEllo")) {
            System.out.println("Hello");
        }
    }
}
