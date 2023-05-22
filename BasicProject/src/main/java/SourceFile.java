public class SourceFile {
    public static int version() {
        return 3;
    }

    public static void main(String[] args){
        System.out.printf("Version: %d%n", version());
    }
}
