package ioc.demo;
import java.util.Random;
public class HappyFortuneService implements FortuneService{
    private String[] fortuneArr = {"Bodes well", "Be prepared for a bad day", "Only good :("};

    @Override
    public String getFortune() {
        Random rng = new Random();
        int i = rng.nextInt(3);
        return fortuneArr[i];
    }
}
