public interface InterFaceCliend {

    void webdesign();  //public+abstract
    void webdeveloper();//public+abstract
}
class Payal impliments TnterFaceCleind{
    public void webdesign():
        System.out.println("Green,Top menu");
    }

class Payal extends Ruchi{
    public void webdeveloper()
    {
        System.out.println("HTML ,CSS,JS");
    }
}
class check{
    public static void main(String[] args){
        Payal p = new payal();
        p.webdesign();
        p.webdeveloper();
    }
}