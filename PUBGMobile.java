class PUBGMobileCharacter {
    void shoot() {
        System.out.println("Shooting in PUBG Mobile");
    }
    
    void shoot(String weapon) {
        System.out.println("Shooting with " + weapon + " in PUBG Mobile");
    }
}

class Assault extends PUBGMobileCharacter {
    @Override
    void shoot() {
        System.out.println("Shooting with assault rifle in PUBG Mobile");
    }
}

public class PUBGMobile {
    public static void main(String[] args) {
        PUBGMobileCharacter character = new PUBGMobileCharacter();
        character.shoot();
        character.shoot("AKM");
        
        Assault player = new Assault();
        player.shoot();
}
}