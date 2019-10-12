import java.util.HashSet;
import java.util.Set;

public class Singleton {

    private static Singleton instance;
    private static Set<String> sessionIds;

    private Singleton() {
        sessionIds = new HashSet<>();
    }

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void addId(String id) {
        sessionIds.add(id);
    }

    public static boolean containsSessionId(String name){
        return sessionIds.contains(name);
    }

}
