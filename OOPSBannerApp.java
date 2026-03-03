import java.util.HashMap;
import java.util.Map;


public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();
        renderBanner("OOPS", patternMap);
    }

    static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        // O
        map.put('O', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        });

        map.put('S', new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        return map;
    }

    static void renderBanner(String word, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                line.append(patternMap.get(ch)[row]).append("  ");
            }

            System.out.println(line.toString());
        }
    }
}