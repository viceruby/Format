public class Format {

    // ----- PROGRAM COLORS ----- //
    // ALL FORMATTING (THIS CLASS) ARE 'public final string' TO BE ACCESSIBLE ACROSS THE PROGRAM

    // CAT PANGRAM (used by Adobe InDesign): Sphinx of black quartz, judge my vow.
    public static final String PANGRAM = "Sphinx of black quartz, judge my vow.";

    // BASE FORMATTING
    public static final String RESET = "\u001B[0m";

    public static final String HIGH_INTENSITY = "\u001B[1m";
    public static final String LOW_INTENSITY = "\u001B[2m";

    public static final String BOLD = "\u001B[1m";
    public static final String ITALICS = "\u001B[3m";
    public static final String UNDERLINE = "\u001B[4m";
    public static final String BLINK = "\u001B[5m";
    public static final String RAPID_BLINK = "\u001B[6m";
    public static final String REVERSE = "\u001B[7m";
    public static final String INVISIBLE = "\u001B[8m";

    // BASE TEXT COLORS
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK = "\u001B[30m";

    // BRIGHT TEXT COLORS
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_MAGENTA = "\u001B[95m";
    public static final String BRIGHT_WHITE = "\u001B[97m";
    public static final String BRIGHT_BLACK = "\u001B[90m";

    // BACKGROUND COLORS
    public static final String BACKGROUND_RED = "\u001B[41m";
    public static final String BACKGROUND_GREEN = "\u001B[42m";
    public static final String BACKGROUND_YELLOW = "\u001B[43m";
    public static final String BACKGROUND_CYAN = "\u001B[46m";
    public static final String BACKGROUND_BLUE = "\u001B[44m";
    public static final String BACKGROUND_MAGENTA = "\u001B[45m";
    public static final String BACKGROUND_WHITE = "\u001B[47m";
    public static final String BACKGROUND_BLACK = "\u001B[40m";

    // BACKGROUND BRIGHT COLORS
    public static final String BACKGROUND_BRIGHT_RED = "\u001B[101m";
    public static final String BACKGROUND_BRIGHT_YELLOW = "\u001B[103m";
    public static final String BACKGROUND_BRIGHT_GREEN = "\u001B[102m";
    public static final String BACKGROUND_BRIGHT_CYAN = "\u001B[106m";
    public static final String BACKGROUND_BRIGHT_BLUE = "\u001B[104m";
    public static final String BACKGROUND_BRIGHT_MAGENTA = "\u001B[105m";
    public static final String BACKGROUND_BRIGHT_WHITE = "\u001B[107m";
    public static final String BACKGROUND_BRIGHT_BLACK = "\u001B[100m";

    static void main() {

        // ***** 256-Color and True Color (RGB) Backgrounds *****
        // For a wider range of colors, you can use 256-color or true color (RGB) codes:
        // 256-Color: \u001b[48;5;COLOR_CODE_NUMBERm (where COLOR_CODE_NUMBER is between 0 and 255)
        // True Color (RGB): \u001b[48;2;R;G;Bm (where R, G, and B are values between 0 and 255)

        // ***** FORMATTING *****
        // BOLD
        String BOLD_TEST = Format.BOLD + PANGRAM + RESET;
        // ITALICS
        String ITALICS_TEST = Format.ITALICS + PANGRAM + RESET;
        // UNDERLINE
        String UNDERLINE_TEST = Format.UNDERLINE + PANGRAM + RESET;
        // BLINK
        String BLINK_TEST = Format.BLINK + PANGRAM + RESET;
        // RAPID BLINK
        String RAPID_BLINK_TEST = Format.RAPID_BLINK + PANGRAM + RESET;
        // REVERSE
        String REVERSE_TEST = Format.REVERSE + PANGRAM + RESET;
        // INVISIBLE
        String INVISIBLE_TEST = Format.INVISIBLE + PANGRAM + RESET;

        // ***** RED *****
        // Foreground
        String BRIGHT_RED = Format.BRIGHT_RED + PANGRAM + RESET;
        String BOLD_BRIGHT_RED = BOLD + Format.BRIGHT_RED + PANGRAM + RESET;
        String RED = Format.RED + PANGRAM + RESET;
        String BOLD_RED = BOLD + Format.RED + PANGRAM + RESET;
        // Background
        String BACKGROUND_BRIGHT_RED = Format.BACKGROUND_BRIGHT_RED + PANGRAM + RESET;
        String BACKGROUND_RED = Format.BACKGROUND_RED + PANGRAM + RESET;

        // ***** YELLOW *****
        // Foreground
        String BRIGHT_YELLOW = Format.BRIGHT_YELLOW + PANGRAM + RESET;
        String BOLD_BRIGHT_YELLOW = BOLD + Format.BRIGHT_YELLOW + PANGRAM + RESET;
        String YELLOW = Format.YELLOW + PANGRAM + RESET;
        String BOLD_YELLOW = BOLD + Format.YELLOW + PANGRAM + RESET;
        // Background
        String BACKGROUND_BRIGHT_YELLOW = Format.BACKGROUND_BRIGHT_YELLOW + PANGRAM + RESET;
        String BACKGROUND_YELLOW = Format.BACKGROUND_YELLOW + PANGRAM + RESET;

        // ***** GREEN *****
        // Foreground
        String BRIGHT_GREEN = Format.BRIGHT_GREEN + PANGRAM + RESET;
        String BOLD_BRIGHT_GREEN = BOLD + Format.BRIGHT_GREEN + PANGRAM + RESET;
        String GREEN = Format.GREEN + PANGRAM + RESET;
        String BOLD_GREEN = BOLD + Format.GREEN + PANGRAM + RESET;
        // Background
        String BACKGROUND_BRIGHT_GREEN = Format.BACKGROUND_BRIGHT_GREEN + PANGRAM + RESET;
        String BACKGROUND_GREEN = Format.BACKGROUND_GREEN + PANGRAM + RESET;

        // ***** CYAN *****
        // Foreground
        String BRIGHT_CYAN = Format.BRIGHT_CYAN + PANGRAM + RESET;
        String BOLD_BRIGHT_CYAN = BOLD + Format.BRIGHT_CYAN + PANGRAM + RESET;
        String CYAN = Format.CYAN + PANGRAM + RESET;
        String BOLD_CYAN = BOLD + Format.CYAN + PANGRAM + RESET;
        // Background
        String BACKGROUND_BRIGHT_CYAN = Format.BACKGROUND_BRIGHT_CYAN + PANGRAM + RESET;
        String BACKGROUND_CYAN = Format.BACKGROUND_CYAN + PANGRAM + RESET;

        // ***** BLUE *****
        // Foreground
        String BRIGHT_BLUE = Format.BRIGHT_BLUE + PANGRAM + RESET;
        String BOLD_BRIGHT_BLUE = BOLD + Format.BRIGHT_BLUE + PANGRAM + RESET;
        String BLUE = Format.BLUE + PANGRAM + RESET;
        String BOLD_BLUE = BOLD + Format.BLUE + PANGRAM + RESET;
        // Background
        String BACKGROUND_BRIGHT_BLUE = Format.BACKGROUND_BRIGHT_BLUE + PANGRAM + RESET;
        String BACKGROUND_BLUE = Format.BACKGROUND_BLUE + PANGRAM + RESET;

        // ***** MAGENTA *****
        // Foreground
        String BRIGHT_MAGENTA = Format.BRIGHT_MAGENTA + PANGRAM + RESET;
        String BOLD_BRIGHT_MAGENTA = BOLD + Format.BRIGHT_MAGENTA + PANGRAM + RESET;
        String MAGENTA = Format.MAGENTA + PANGRAM + RESET;
        String BOLD_MAGENTA = BOLD + Format.MAGENTA + PANGRAM + RESET;
        // Background
        String BACKGROUND_BRIGHT_MAGENTA = Format.BACKGROUND_BRIGHT_MAGENTA + PANGRAM + RESET;
        String BACKGROUND_MAGENTA = Format.BACKGROUND_MAGENTA + PANGRAM + RESET;

        // ***** WHITE *****
        // Foreground
        String BRIGHT_WHITE = Format.BRIGHT_WHITE + PANGRAM + RESET;
        String BOLD_BRIGHT_WHITE = BOLD + Format.BRIGHT_WHITE + PANGRAM + RESET;
        String WHITE = Format.WHITE + PANGRAM + RESET;
        String BOLD_WHITE = BOLD + Format.WHITE + PANGRAM + RESET;
        // Background
        String BACKGROUND_BRIGHT_WHITE = Format.BACKGROUND_BRIGHT_WHITE + PANGRAM + RESET;
        String BACKGROUND_WHITE = Format.BACKGROUND_WHITE + PANGRAM + RESET;

        // ***** BLACK *****
        // Foreground
        String BRIGHT_BLACK = Format.BRIGHT_BLACK + PANGRAM + RESET;
        String BOLD_BRIGHT_BLACK = BOLD + Format.BRIGHT_BLACK + PANGRAM + RESET;
        String BLACK = Format.BLACK + PANGRAM + RESET;
        String BOLD_BLACK = BOLD + Format.BLACK + PANGRAM + RESET;
        // Background
        String BACKGROUND_BRIGHT_BLACK = Format.BACKGROUND_BRIGHT_BLACK + PANGRAM + RESET;
        String BACKGROUND_BLACK = Format.BACKGROUND_BLACK + PANGRAM + RESET;

        System.out.println("\n" + "                                                                                   " + BOLD + UNDERLINE + "️🧁🌷🩷 FONT FORMATTING 🩷🌷🧁" + RESET + "\n");
        System.out.print(BOLD + "BOLD        " + RESET + BOLD_TEST); System.out.print(BOLD + "     BLINK         " + RESET + BLINK_TEST); System.out.println(BOLD + "     INVISIBLE   " + RESET + INVISIBLE_TEST);
        System.out.print(BOLD + "ITALICS     " + RESET + ITALICS_TEST); System.out.println(BOLD + "     RAPID BLINK   " + RESET + RAPID_BLINK_TEST);
        System.out.print(BOLD + "UNDERLINE   " + RESET + UNDERLINE_TEST); System.out.println(BOLD + "     REVERSE       " + RESET +  REVERSE_TEST);

        System.out.println("\n" + "                                                                                  " + BOLD + UNDERLINE + "💗💗💗 FOREGROUND COLORS 💗💗💗" + RESET + "\n");
        System.out.print(BOLD + "BRIGHT RED       " + RESET); System.out.print(Format.BRIGHT_RED + "FF3047   " + RESET); System.out.print(BRIGHT_RED + " "); System.out.print(BOLD_BRIGHT_RED); System.out.print(BOLD + "       RED       " + RESET); System.out.print(Format.RED + "DB0601   "  + RESET); System.out.print(RED + " "); System.out.println(BOLD_RED);
        System.out.print(BOLD + "BRIGHT YELLOW    " + RESET); System.out.print(Format.BRIGHT_YELLOW + "FFC54F   " + RESET); System.out.print(BRIGHT_YELLOW + " "); System.out.print(BOLD_BRIGHT_YELLOW); System.out.print(BOLD + "       YELLOW    " + RESET); System.out.print(Format.YELLOW + "FFFF49   " + RESET); System.out.print(YELLOW + " "); System.out.println(BOLD_YELLOW);
        System.out.print(BOLD + "BRIGHT GREEN     " + RESET); System.out.print(Format.BRIGHT_GREEN + "9EE84F   " + RESET); System.out.print(BRIGHT_GREEN + " "); System.out.print(BOLD_BRIGHT_GREEN); System.out.print(BOLD + "       GREEN     " + RESET); System.out.print(Format.GREEN + "3FAC00   " + RESET); System.out.print(GREEN + " "); System.out.println(BOLD_GREEN);
        System.out.print(BOLD + "BRIGHT CYAN      " + RESET); System.out.print(Format.BRIGHT_CYAN + "15D1FF   " + RESET); System.out.print(BRIGHT_CYAN + " "); System.out.print(BOLD_BRIGHT_CYAN); System.out.print(BOLD + "       CYAN      " + RESET); System.out.print(Format.CYAN + "5CFFEF   " + RESET); System.out.print(CYAN + " "); System.out.println(BOLD_CYAN);
        System.out.print(BOLD + "BRIGHT BLUE      " + RESET); System.out.print(Format.BRIGHT_BLUE + "1F8BFF   " + RESET); System.out.print(BRIGHT_BLUE + " "); System.out.print(BOLD_BRIGHT_BLUE); System.out.print(BOLD + "       BLUE      " + RESET); System.out.print(Format.BLUE + "3EBFFF   " + RESET); System.out.print(BLUE + " "); System.out.println(BOLD_BLUE);
        System.out.print(BOLD + "BRIGHT MAGENTA   " + RESET); System.out.print(Format.BRIGHT_MAGENTA + "FF4DB5   " + RESET); System.out.print(BRIGHT_MAGENTA + " "); System.out.print(BOLD_BRIGHT_MAGENTA); System.out.print(BOLD + "       MAGENTA   " + RESET); System.out.print(Format.MAGENTA + "DC83FF   " + RESET); System.out.print(MAGENTA + " "); System.out.println(BOLD_MAGENTA);
        System.out.print(BOLD + "BRIGHT WHITE     " + RESET); System.out.print(Format.BRIGHT_WHITE + "FFFFFF   " + RESET); System.out.print(BRIGHT_WHITE + " "); System.out.print(BOLD_BRIGHT_WHITE); System.out.print(BOLD + "       WHITE     " + RESET); System.out.print(Format.WHITE + "808080   " + RESET); System.out.print(WHITE + " "); System.out.println(BOLD_WHITE);
        System.out.print(BOLD + "BRIGHT BLACK     " + RESET); System.out.print(Format.BRIGHT_BLACK + "595959   " + RESET); System.out.print(BRIGHT_BLACK + " "); System.out.print(BOLD_BRIGHT_BLACK); System.out.print(BOLD + "       BLACK     " + RESET); System.out.print(Format.BLACK + "000000   " + RESET); System.out.print(BLACK + " "); System.out.println(BOLD_BLACK);

        System.out.println("\n" + "                                                                                  " + BOLD + UNDERLINE + "🌈🌈🌈 BACKGROUND COLORS 🌈🌈🌈" + RESET + "\n");
        System.out.print(BOLD + "BRIGHT RED       " + RESET); System.out.print(Format.BRIGHT_RED + "FF3047   " + RESET); System.out.print(BACKGROUND_BRIGHT_RED + " "); System.out.print(BOLD_BRIGHT_RED); System.out.print(BOLD + "       RED       " + RESET); System.out.print(Format.RED + "DB0601   "  + RESET); System.out.print(BACKGROUND_RED + " "); System.out.println(BOLD_RED);
        System.out.print(BOLD + "BRIGHT YELLOW    " + RESET); System.out.print(Format.BRIGHT_YELLOW + "FFC54F   " + RESET); System.out.print(BACKGROUND_BRIGHT_YELLOW + " "); System.out.print(BOLD_BRIGHT_YELLOW); System.out.print(BOLD + "       YELLOW    " + RESET); System.out.print(Format.YELLOW + "FFFF49   " + RESET); System.out.print(BACKGROUND_YELLOW + " "); System.out.println(BOLD_YELLOW);
        System.out.print(BOLD + "BRIGHT GREEN     " + RESET); System.out.print(Format.BRIGHT_GREEN + "9EE84F   " + RESET); System.out.print(BACKGROUND_BRIGHT_GREEN + " "); System.out.print(BOLD_BRIGHT_GREEN); System.out.print(BOLD + "       GREEN     " + RESET); System.out.print(Format.GREEN + "3FAC00   " + RESET); System.out.print(BACKGROUND_GREEN + " "); System.out.println(BOLD_GREEN);
        System.out.print(BOLD + "BRIGHT CYAN      " + RESET); System.out.print(Format.BRIGHT_CYAN + "15D1FF   " + RESET); System.out.print(BACKGROUND_BRIGHT_CYAN + " "); System.out.print(BOLD_BRIGHT_CYAN); System.out.print(BOLD + "       CYAN      " + RESET); System.out.print(Format.CYAN + "5CFFEF   " + RESET); System.out.print(BACKGROUND_CYAN + " "); System.out.println(BOLD_CYAN);
        System.out.print(BOLD + "BRIGHT BLUE      " + RESET); System.out.print(Format.BRIGHT_BLUE + "1F8BFF   " + RESET); System.out.print(BACKGROUND_BRIGHT_BLUE + " "); System.out.print(BOLD_BRIGHT_BLUE); System.out.print(BOLD + "       BLUE      " + RESET); System.out.print(Format.BLUE + "3EBFFF   " + RESET); System.out.print(BACKGROUND_BLUE + " "); System.out.println(BOLD_BLUE);
        System.out.print(BOLD + "BRIGHT MAGENTA   " + RESET); System.out.print(Format.BRIGHT_MAGENTA + "FF4DB5   " + RESET); System.out.print(BACKGROUND_BRIGHT_MAGENTA + " "); System.out.print(BOLD_BRIGHT_MAGENTA); System.out.print(BOLD + "       MAGENTA   " + RESET); System.out.print(Format.MAGENTA + "DC83FF   " + RESET); System.out.print(BACKGROUND_MAGENTA + " "); System.out.println(BOLD_MAGENTA);
        System.out.print(BOLD + "BRIGHT WHITE     " + RESET); System.out.print(Format.BRIGHT_WHITE + "FFFFFF   " + RESET); System.out.print(BACKGROUND_BRIGHT_WHITE + " "); System.out.print(BOLD_BRIGHT_WHITE); System.out.print(BOLD + "       WHITE     " + RESET); System.out.print(Format.WHITE + "808080   " + RESET); System.out.print(BACKGROUND_WHITE + " "); System.out.println(BOLD_WHITE);
        System.out.print(BOLD + "BRIGHT BLACK     " + RESET); System.out.print(Format.BRIGHT_BLACK + "595959   " + RESET); System.out.print(BACKGROUND_BRIGHT_BLACK + " "); System.out.print(BOLD_BRIGHT_BLACK); System.out.print(BOLD + "       BLACK     " + RESET); System.out.print(Format.BLACK + "000000   " + RESET); System.out.print(BACKGROUND_BLACK + " "); System.out.println(BOLD_BLACK);

    }

}
