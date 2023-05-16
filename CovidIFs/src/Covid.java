public class Covid {

    public static String covid(float bodyTemperature, boolean difficultyBreathing,
                               boolean diabetes, boolean cancer, boolean isPregnant,
                               boolean isOver60yearsold, boolean hepatic,
                               boolean kidnevDisease, boolean respiratoryDisease, String provincia) {

        boolean[] sintomasCovid = {difficultyBreathing, diabetes, cancer, isPregnant, isOver60yearsold, hepatic,
                kidnevDisease, respiratoryDisease};

        boolean peligroCovid = false;
        for (boolean sintoma : sintomasCovid) {
            if (sintoma) peligroCovid = true;
            break;
        }

        if (bodyTemperature >= 38) {
            if (peligroCovid) {
                return "/diagnostico/" + provincia;
            } else return "/cuarentena/";
        }
        return "/diagnostico_bueno/";
    }
}