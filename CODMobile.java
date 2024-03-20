class CODMobileCharacter {
    void shoot() {
        System.out.println("Shooting in COD Mobile");
    }
}

class Sniper extends CODMobileCharacter {
    @Override
    void shoot() {
        System.out.println("Sniping in COD Mobile");
    }
}

public class CODMobile {
    public static void main(String[] args) {
        CODMobileCharacter character1 = new CODMobileCharacter();
        character1.shoot();
        
        CODMobileCharacter character2 = new Sniper();
        character2.shoot();
};
};