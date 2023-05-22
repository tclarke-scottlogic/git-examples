public class SourceFile {
    public static int getValue() {
        return 2;
    }

    public static void main(String[] args){
        System.out.printf("Version: %d%n", getValue());
    }
}
