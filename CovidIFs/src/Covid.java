public class Covid {
    public static String covid(float bodyTemperature, boolean difficultyBreathing,
                               boolean diabetes, boolean cancer, boolean isPregnant,
                               boolean isOver60yearsold, boolean hepatic,
                               boolean kidnevDisease, boolean respiratoryDisease, String provincia
    ){
        if (
                (bodyTemperature>= 38 && difficultyBreathing) ||
                        (bodyTemperature>= 38 && difficultyBreathing && diabetes) ||
                        (bodyTemperature>= 38 && difficultyBreathing && cancer) ||
                        (bodyTemperature>= 38 && difficultyBreathing && isPregnant)||
                        (bodyTemperature>= 38 && difficultyBreathing && isOver60yearsold) ||
                        (bodyTemperature>= 38 && difficultyBreathing && hepatic)||
                        (bodyTemperature>= 38 && difficultyBreathing && kidnevDisease)||
                        (bodyTemperature>= 38 && difficultyBreathing && respiratoryDisease)||
                        (bodyTemperature>= 38 && diabetes)||
                        (bodyTemperature>= 38 && cancer)||
                        (bodyTemperature>= 38 && isPregnant)||
                        (bodyTemperature>= 38 && isOver60yearsold)||
                        (bodyTemperature>= 38 && hepatic)||
                        (bodyTemperature>= 38 && kidnevDisease)||
                        (bodyTemperature>= 38 && respiratoryDisease)){
            return "/diagnostico/"+provincia;
        }
        else if(bodyTemperature>= 38){
            return "/cuarentena/";
        }
        else if (bodyTemperature < 38){
            return "/diagnostico_bueno/";
        }
        else{
            return "/diagnostico_bueno/";
        }
    }
}