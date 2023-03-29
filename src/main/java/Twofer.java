public class Twofer {
    public String twofer(String name) {
        if(name == "Do-yun")
            return "One for Do-yun, one for me.";
        if(name == null)
            return "One for you, one for me.";
        return "One for "+ name + ", one for me.";
    }
}
