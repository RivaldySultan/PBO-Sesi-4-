class MobileLegendsHero {
    void useSkill() {
        System.out.println("Using a skill in Mobile Legends");
    }
    
    void useSkill(String skillName) {
        System.out.println("Using skill: " + skillName);
    }
}

class Marksman extends MobileLegendsHero {
    @Override
    void useSkill() {
        System.out.println("Using basic attack as a Marksman in Mobile Legends");
    }
    
    void useSkill(String skillName) {
        System.out.println("Using Marksman skill: " + skillName + " in Mobile Legends");
    }
}

public class MobileLegends {
    public static void main(String[] args) {
        MobileLegendsHero hero = new MobileLegendsHero();
        hero.useSkill();
        hero.useSkill("Retribution");
        
        Marksman layla = new Marksman();
        layla.useSkill();
        layla.useSkill("Malefic Bomb");
}
}