public class WizardAndWarriors {
    class Fighter {

        boolean isVulnerable() {
            return true;
        }
    
        int getDamagePoints(Fighter fighter) {
            return 1;
        }
    }
    
    // TODO: define the Warrior class
    class Warrior extends Fighter {
        public String toString() {
            return "Fighter is a Warrior";
        }
    
        public boolean isVulnerable() {
            return false;
        }
    
        public int getDamagePoints(Fighter wizard) {
            if(wizard.isVulnerable()) {
                return 10;
            }
            return 6;
        }
    }
    // TODO: define the Wizard class
    class Wizard extends Fighter {
        public boolean spell = true;
        
        public String toString() {
            return "Fighter is a Wizard";
        }
    
        public void prepareSpell() {
            this.spell = false;
        }
    
        public boolean isVulnerable() {
            return spell;
        }
    
        public int getDamagePoints(Fighter warrior) {
            if(spell) {
                return 3;
            }
            return 12;
        }
    }
}
