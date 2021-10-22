package Hamsa;





public class Main {
    public static void main(String[] args) {

        Iphone phone1=new Iphone("12 mini",800,5.4);
        Iphone phone2=new Iphone("13 mini",800,5.4);
        Iphone phone3=new Iphone("13",999,6.1);
        Iphone phone4=new Iphone("13 Pro",999,6.1);
        Iphone phone5=new Iphone("13 Pro max",1300,6.7);

        Samsung phone6=new Samsung("Galaxy S21",1200,6.2);
        Samsung phone7=new Samsung("Galaxy S20",850,6.1);
        Samsung phone8=new Samsung("Galaxy A52",499,5.4);
        Samsung phone9=new Samsung("Galaxy A51",700,6.1);
        Samsung phone10=new Samsung("Galaxy Z",1300,6.2);

        System.out.println(Iphone.brand+"--"+phone1.toString());
        phone1.calling();
        phone1.texting();
        phone1.apps();
        System.out.println("______________________________________________");
        System.out.println(Iphone.brand+"--"+phone2.toString());
        phone2.calling();
        phone2.texting();
        phone2.apps();
        System.out.println("**********************************************");

        System.out.println(Samsung.brand+"--"+phone6.toString());
        phone6.calling();
        phone6.texting();
        phone6.camera();
        System.out.println("______________________________________________");
        System.out.println(Samsung.brand+"--"+phone7.toString());
        phone7.calling();
        phone7.texting();
        phone7.camera();
    }
}
