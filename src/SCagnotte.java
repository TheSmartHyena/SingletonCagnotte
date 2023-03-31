public class SCagnotte {
    private static Cagnotte instanceCagnotte = new Cagnotte();

    private SCagnotte() {}

    public static Cagnotte getInstanceCagnotte(){
        return instanceCagnotte;
    }

}
