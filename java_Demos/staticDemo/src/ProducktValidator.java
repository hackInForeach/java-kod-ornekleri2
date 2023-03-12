public class ProducktValidator {
    public static boolean isValidate(Produckt produckt){
        // manager de new yerine classın kendisini validatorda static yapıp direk kullandık
        if (produckt.price>0 && !produckt.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}