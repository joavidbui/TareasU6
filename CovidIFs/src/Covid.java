public class Covid {

    public static String covid(float bodyTemperature, boolean difficultyBreathing,
                               boolean diabetes, boolean cancer, boolean isPregnant,
                               boolean isOver60yearsold, boolean hepatic,
                               boolean kidnevDisease, boolean respiratoryDisease, String provincia
    ) {
        boolean[] aux = {diabetes, cancer, isPregnant, isOver60yearsold, hepatic, kidnevDisease, respiratoryDisease};
        boolean peligroCovid = false;
        for (boolean b : aux) {
            if (b) peligroCovid = true;
            break;
        }

        if (bodyTemperature >= 38) {
            if (difficultyBreathing || peligroCovid) {
                return "/diagnostico/" + provincia;
            }
            else return "/cuarentena/";
        }
        return "/diagnostico_bueno/";
    }
}