package oops;

abstract class animal {
    // abstract method doesnot have any body
    public abstract void animalsound();

    // absrstract method
    public void animalSound() {
        System.out.println("the animal is making the noise loudly");
    }
}

// making the interfaces classes

interface deepika {
    public void dhakal();

    public void chandan_();

}
interface dharmasala{
    public void dharma();
    public void arpan();
}

// accesing the interface method

class chandan_deepika implements deepika,dharmasala {
    public void dhakal() {
        System.out.println("the miss dhakal is beautiful lady ");
    }
    public void chandan_(){
        System.out.println("chandan sharma have the ability to become the billionaire");
    }

    public void dharma(){
        System.out.println("the dharma is always dharma");
    }

    public void arpan(){
        System.out.println("hello arpan sir");
    }
}

class chandansharma extends animal {
    public void animalsound() {
        System.out.println("the name is chandan and i love aimal ");
    }
}

public class abstraction {
    public static void main(String args[]) {
        chandansharma nw = new chandansharma();
        nw.animalsound();

        chandan_deepika news = new chandan_deepika();
        news.dhakal();

        news.arpan();
        news.dhakal();
    }

}
