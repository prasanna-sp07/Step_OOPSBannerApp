
public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPatternMap o = new CharacterPatternMap('O', buildO());
        CharacterPatternMap p = new CharacterPatternMap('P', buildP());
        CharacterPatternMap s = new CharacterPatternMap('S', buildS());

        String[] oPattern = o.getPattern();
        String[] pPattern = p.getPattern();
        String[] sPattern = s.getPattern();

        for (int i = 0; i < 7; i++) {
            System.out.println(
                oPattern[i] + "  " +
                oPattern[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );
        }
    }

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }


    static String[] buildO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    static String[] buildP() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    static String[] buildS() {
        return new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}