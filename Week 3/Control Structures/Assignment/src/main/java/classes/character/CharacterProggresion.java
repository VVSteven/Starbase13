//package classes.character;
//
//import classes.character.level.CharacterStats;
//import classes.character.level.CharacterLevelBonusStats;
//
//public class CharacterProggresion {
//    public static void levelUpCharacter(Character character){
//        CharacterStats stats = character.getStats();
//        CharacterLevelBonusStats bonusStats = stats.getBonus();
//
//        int currentLevel = stats.getLevel();
//        for(int i = 1; i <= currentLevel; i++){
//            bonusStats.levelUp();
//        }
//    }
//}
