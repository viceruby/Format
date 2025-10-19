import java.text.Normalizer;

public class Main {

    static void main() {

        // BASE FORMATTING
        System.out.println(Format.BOLD + "\n— " + Format.UNDERLINE + "FONT TYPE" + Format.RESET);
        String BOLD = Format.BOLD + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BOLD "); System.out.println(BOLD);
        String UNDERLINE = Format.UNDERLINE + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("UNDERLINE "); System.out.println(UNDERLINE + "\n");

        // BASE TEXT COLORS
        System.out.println(Format.BOLD + "\n— " + Format.UNDERLINE + "BASE FONT COLORS" + Format.RESET);
        String RED = Format.RED + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("RED "); System.out.println(RED);
        String YELLOW = Format.YELLOW + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("YELLOW "); System.out.println(YELLOW);
        String GREEN = Format.GREEN + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("GREEN "); System.out.println(GREEN);
        String CYAN = Format.CYAN + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("CYAN "); System.out.println(CYAN);
        String BLUE = Format.BLUE + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BLUE "); System.out.println(BLUE);
        String MAGENTA = Format.MAGENTA + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("MAGENTA "); System.out.println(MAGENTA);
        String WHITE = Format.WHITE + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("WHITE "); System.out.println(WHITE);
        String BLACK = Format.BLACK + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BLACK "); System.out.println(BLACK + "\n");

        // BRIGHT TEXT COLORS
        System.out.println(Format.BOLD + "\n— " + Format.UNDERLINE + "BRIGHT FONT COLORS" + Format.RESET);
        String BRIGHT_RED = Format.BRIGHT_RED + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BRIGHT RED "); System.out.println(BRIGHT_RED);
        String BRIGHT_YELLOW = Format.BRIGHT_YELLOW + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BRIGHT YELLOW "); System.out.println(BRIGHT_YELLOW);
        String BRIGHT_GREEN = Format.BRIGHT_GREEN + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BRIGHT GREEN "); System.out.println(BRIGHT_GREEN);
        String BRIGHT_CYAN = Format.BRIGHT_CYAN + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BRIGHT CYAN "); System.out.println(BRIGHT_CYAN);
        String BRIGHT_BLUE = Format.BRIGHT_BLUE + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BRIGHT BLUE "); System.out.println(BRIGHT_BLUE);
        String BRIGHT_MAGENTA = Format.BRIGHT_MAGENTA + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BRIGHT MAGENTA "); System.out.println(BRIGHT_MAGENTA);
        String BRIGHT_WHITE = Format.BRIGHT_WHITE + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BRIGHT WHITE "); System.out.println(BRIGHT_WHITE);
        String BRIGHT_BLACK = Format.BRIGHT_BLACK + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BRIGHT BLACK "); System.out.println(BRIGHT_BLACK + "\n");

        // BASE BACKGROUND COLORS
        System.out.println(Format.BOLD + "\n— " + Format.UNDERLINE + "BASE BACKGROUND FONT COLORS" + Format.RESET);
        String BACKGROUND_RED = Format.BACKGROUND_RED + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND RED "); System.out.println(BACKGROUND_RED);
        String BACKGROUND_YELLOW = Format.BACKGROUND_YELLOW + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND YELLOW "); System.out.println(BACKGROUND_YELLOW);
        String BACKGROUND_GREEN = Format.BACKGROUND_GREEN + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND GREEN "); System.out.println(BACKGROUND_GREEN);
        String BACKGROUND_CYAN = Format.BACKGROUND_CYAN + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND CYAN "); System.out.println(BACKGROUND_CYAN);
        String BACKGROUND_BLUE = Format.BACKGROUND_BLUE + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND BLUE "); System.out.println(BACKGROUND_BLUE);
        String BACKGROUND_MAGENTA = Format.BACKGROUND_MAGENTA + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND MAGENTA "); System.out.println(BACKGROUND_MAGENTA);
        String BACKGROUND_WHITE = Format.BACKGROUND_WHITE + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND WHITE "); System.out.println(BACKGROUND_WHITE);
        String BACKGROUND_BLACK = Format.BACKGROUND_BLACK + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND BLACK "); System.out.println(BACKGROUND_BLACK + "\n");

        // BRIGHT BACKGROUND COLORS
        System.out.println(Format.BOLD + "\n— " + Format.UNDERLINE + "BRIGHT BACKGROUND FONT COLORS" + Format.RESET);
        String BRIGHT_BACKGROUND_RED = Format.BRIGHT_BACKGROUND_RED + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND BRIGHT RED "); System.out.println(BRIGHT_BACKGROUND_RED);
        String BRIGHT_BACKGROUND_YELLOW = Format.BRIGHT_BACKGROUND_YELLOW + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND BRIGHT YELLOW "); System.out.println(BRIGHT_BACKGROUND_YELLOW);
        String BRIGHT_BACKGROUND_GREEN = Format.BRIGHT_BACKGROUND_GREEN + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND BRIGHT GREEN "); System.out.println(BRIGHT_BACKGROUND_GREEN);
        String BRIGHT_BACKGROUND_CYAN = Format.BRIGHT_BACKGROUND_CYAN + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND BRIGHT CYAN "); System.out.println(BRIGHT_BACKGROUND_CYAN);
        String BRIGHT_BACKGROUND_BLUE = Format.BRIGHT_BACKGROUND_BLUE + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND BRIGHT BLUE "); System.out.println(BRIGHT_BACKGROUND_BLUE);
        String BRIGHT_BACKGROUND_MAGENTA = Format.BRIGHT_BACKGROUND_MAGENTA + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND BRIGHT MAGENTA "); System.out.println(BRIGHT_BACKGROUND_MAGENTA);
        String BRIGHT_BACKGROUND_WHITE = Format.BRIGHT_BACKGROUND_WHITE + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND BRIGHT WHITE "); System.out.println(BRIGHT_BACKGROUND_WHITE);
        String BRIGHT_BACKGROUND_BLACK = Format.BRIGHT_BACKGROUND_BLACK + "Sphinx of black quartz, judge my vow." + Format.RESET; System.out.print("BACKGROUND BRIGHT BLACK "); System.out.println(BRIGHT_BACKGROUND_BLACK + "\n");

    }

}
