import java.util.ArrayList;

public class TDDSong {

    private static final String VERSE1 =
            """
                    There was an old lady who swallowed a ANIMAL1.
                    I don't know why she swallowed a ANIMAL1 - perhaps she'll die!
                    """;


    private static final String VERSE2 =
            """

                    There was an old lady who swallowed a ANIMAL2;
                    That wriggled and wiggled and tickled inside her.
                    She swallowed the ANIMAL2 to catch the ANIMAL1;
                    I don't know why she swallowed a ANIMAL1 - perhaps she'll die!
                    """;

    private static final String VERSE3 =
            """

                    There was an old lady who swallowed a ANIMAL3;
                    How absurd to swallow a ANIMAL3.
                    She swallowed the ANIMAL3 to catch the ANIMAL2,
                    She swallowed the ANIMAL2 to catch the ANIMAL1;
                    I don't know why she swallowed a ANIMAL1 - perhaps she'll die!

                    """;
    
    public static String createSong(ArrayList<String> animalList) {

        String output = "";

        if (animalList.size() >= 1) {
            output += VERSE1;
            output = output.replaceAll("ANIMAL1", animalList.get(0));
        }
        if (animalList.size() >= 2) {
            output += VERSE2;
            output = output.replaceAll("ANIMAL1", animalList.get(0));
            output = output.replaceAll("ANIMAL2", animalList.get(1));
        }
        if (animalList.size() >= 3) {
            output += VERSE3;
            output = output.replaceAll("ANIMAL1", animalList.get(0));
            output = output.replaceAll("ANIMAL2", animalList.get(1));
            output = output.replaceAll("ANIMAL3", animalList.get(2));
        }

        return output;
    }
}
