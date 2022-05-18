package advance.hw5.battel;

public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";
        if(fighter1.name.equals(firstAttacker)) {
            while (fighter1.health >= 0) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    winner = fighter1.name;
                    break;
                }
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    break;
                }
            }
        } else {
            while (fighter2.health >= 0) {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    break;
                }
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    winner = fighter1.name;
                    break;
                }
            }
        }
        return winner;
    }
}