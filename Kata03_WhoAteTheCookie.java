public class Kata03_WhoAteTheCookie {
    public static String cookie(Object x) {
        if (x instanceof String) {
            return "Who ate the last cookie? It was Zach!";
        } else if (x instanceof Integer || x instanceof Double) {
            return "Who ate the last cookie? It was Monica!";
        } else {
            return "Who ate the last cookie? It was the dog!";
        }
    }
}
